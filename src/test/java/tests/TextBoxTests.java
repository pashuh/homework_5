package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class TextBoxTests {

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
        Configuration.browserPosition = "00x00";
    }

    @Test
    void successfulTest() {
        String firstName = "Pol";
        String lastName = "Vood";

        open("/automation-practice-form");
        executeJavaScript("$('footer').remove()");
        executeJavaScript("$('#fixedban').remove()");

        $("#firstName").setValue(firstName);
        $("#lastName").setValue(lastName);
        $("#userEmail").setValue("PV@gm.com");
        $(byText("Male")).click();
        $("#userNumber").setValue("9990001122");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__year-select").selectOption("1986");
        $(".react-datepicker__month-select").selectOption("September");
        $("[aria-label= 'Choose Tuesday, September 30th, 1986']").click();
        $("#subjectsInput").setValue("Chemistry").pressEnter();
        $("#currentAddress").setValue("Moscow");
        $(byText("Music")).click();
        $("#uploadPicture").uploadFromClasspath("Screen.jpg");
        $("#currentAddress").setValue("Zvereva 22");
        $("#react-select-3-input").setValue("Rajasthan").pressEnter();
        $("#react-select-4-input").setValue("Jaipur").pressEnter();
        $("#submit").click();
        $(".modal-body").shouldHave(text("Pol Vood"), text("PV@gm.com"), text("Male"),
                text("9990001122"), text("30 September,1986"), text("Chemistry"), text("Music"),
                text("Screen.jpg"), text("Zvereva 22"), text("Rajasthan Jaipur")
        );
    }

}
