package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import pages.components.CalenderComponent;
import pages.components.ResultsTableComponent;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public class RegistrationFormPage {

    CalenderComponent calenderComponent = new CalenderComponent();
    ResultsTableComponent resultsTableComponent = new ResultsTableComponent();
    SelenideElement firstNameUnput = $("#firstName"),
    lastNameInput = $("#lastName");

    public RegistrationFormPage openPage() {
        open("/automation-practice-form");
        $(".practice-form-wrapper").shouldHave(text("Student Registration Form"));
        executeJavaScript("$('footer').remove()");
        executeJavaScript("$('#fixedban').remove()");
        return this;
    }

    public RegistrationFormPage setFirstName(String value) {
        firstNameUnput.setValue(value);
        return this;
    }


    public RegistrationFormPage setLastName(String value) {
        lastNameInput.setValue(value);
        return this;
    }


    public RegistrationFormPage setuserEmail(String value) {
        $("#userEmail").setValue(value);
        return this;
    }

    public RegistrationFormPage setGender(String value) {
        $("#genterWrapper").$(byText(value)).click();
        return this;
    }

    public RegistrationFormPage setDateOfBirth(String day, String month, String year) {
        $("#dateOfBirthInput").click();
        calenderComponent.setDate(day, month, year);
        return this;
    }


    public RegistrationFormPage checkResult (String key, String value) {
        resultsTableComponent.checkResult(key, value);
        return this;
    }

    public RegistrationFormPage setNumber(String value) {
        $("#userNumber").setValue(value);
        return this;
    }
    public RegistrationFormPage setSubjects (String value) {
        $("#subjectsInput").setValue(value).pressEnter();
        return this;
    }
    public RegistrationFormPage setAddress (String value) {
        $("#currentAddress").setValue(value);
        return this;
    }
    public RegistrationFormPage setHobby (String value) {
        $(byText(value)).click();
        return this;
    }
    public RegistrationFormPage setLoad (String value) {
        $("#uploadPicture").uploadFromClasspath(value);
        return this;
    }
    public RegistrationFormPage setState (String value) {
        $("#react-select-3-input").setValue(value).pressEnter();
        return this;
    }
    public RegistrationFormPage setCity (String value) {
        $("#react-select-4-input").setValue(value).pressEnter();
        return this;
    }
    public RegistrationFormPage pressSub () {
        $("#submit").click();
        return this;
    }

}
