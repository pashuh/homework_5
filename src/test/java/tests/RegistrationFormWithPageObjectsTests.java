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
            .setLastName(lastName)
            .setuserEmail("PV@gm.com")
            .setGender("Male")
            .setNumber("9990001122")
            .setDateOfBirth("30", "July", "1997")
            .setSubjects("Chemistry")
            .setHobby("Music")
            .setLoad("Screen.jpg")
            .setAddress("Revaz 22")
            .setState("Rajasthan")
            .setCity("Jaipur")
            .pressSub()
            .checkResult("Student Name", firstName + " " + lastName)
            .checkResult("Student Email", "PV@gm.com")
            .checkResult("Gender", "Male")
            .checkResult("Mobile", "9990001122")
            .checkResult("Date of Birth", "30 July,1997")
            .checkResult("Subjects", "Chemistry")
            .checkResult("Hobbies", "Music")
            .checkResult("Picture", "Screen.jpg")
            .checkResult("Address", "Revaz 22")
            .checkResult("State and City", "Rajasthan Jaipur");
    }

}
