package tests;

import org.junit.jupiter.api.Test;

public class RegistrationFormWithRandomUtilsTests extends TestBase{


    @Test
    void successfulTest() {

        TestData testData = new TestData();



        registrationFormPage.openPage()
            .setFirstName(testData.firstNameRandom)
            .setLastName(testData.lastNameRandom)
            .setuserEmail(testData.mailRandom)
            .setGender(testData.genderRandom)
            .setNumber(testData.numberRandom)
            .setDateOfBirth(testData.dayRandom, testData.monthRandom, testData.yearRandom)
            .setSubjects("Chemistry")
            .setHobby(testData.hobbiesRandom)
            .setLoad("Screen.jpg")
            .setAddress(testData.addressRandom)
            .setState("Rajasthan")
            .setCity("Jaipur")
            .pressSub()
            .checkResult("Student Name", testData.firstNameRandom + " " + testData.lastNameRandom)
            .checkResult("Student Email", testData.mailRandom)
            .checkResult("Gender", testData.genderRandom)
            .checkResult("Mobile", testData.numberRandom)
            .checkResult("Date of Birth", testData.dayRandom + " " +
                    testData.monthRandom  + "," + testData.yearRandom)
            .checkResult("Subjects", "Chemistry")
            .checkResult("Hobbies", testData.hobbiesRandom)
            .checkResult("Picture", "Screen.jpg")
            .checkResult("Address", testData.addressRandom)
            .checkResult("State and City", "Rajasthan Jaipur");
    }

}
