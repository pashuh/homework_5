package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pages.RegistrationFormPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationFormWithPageObjectsTests extends TestBase{

    @Test
    void successfulTest() {
        String firstName = "Pol";
        String lastName = "Vood";

        registrationFormPage.openPage()
            .setFirstName(firstName)
            .setlastName(lastName)
            .setuserEmail("PV@gm.com")
            .setGender("Male");

        $("#userNumber").setValue("9990001122");
        registrationFormPage.setDateOfBirth("30", "July", "1997");
        $("#subjectsInput").setValue("Chemistry").pressEnter();
        $("#currentAddress").setValue("Moscow");
        $(byText("Music")).click();
        $("#uploadPicture").uploadFromClasspath("Screen.jpg");
        $("#currentAddress").setValue("Zvereva 22");
        $("#react-select-3-input").setValue("Rajasthan").pressEnter();
        $("#react-select-4-input").setValue("Jaipur").pressEnter();
        $("#submit").click();
        $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));
        registrationFormPage
                .checkResult("Student Name", firstName + " " + lastName)
                .checkResult("Student Email", "PV@gm.com")
                .checkResult("Date of Birth", "30 July,1997");
    }

}
