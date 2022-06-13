package tests;
import com.github.javafaker.Faker;
import utils.RandomUtils;

import java.util.Locale;

public class TestData {
    Faker fakerRus = new Faker(new Locale("ru"));
    Faker fakerEng = new Faker(new Locale("en"));
    String firstNameRandom = fakerRus.address().firstName();
    String lastNameRandom = fakerRus.address().lastName();
    String mailRandom = fakerEng.internet().emailAddress();
    String numberRandom = String.valueOf(fakerEng.number().randomNumber(10, true));
    String monthRandom = RandomUtils.monthRnd();
    String yearRandom = String.valueOf(fakerEng.number().numberBetween(1990,2011));
    String dayRandom = String.valueOf(fakerEng.number().numberBetween(10,28));
    String genderRandom = RandomUtils.genderRnd();
    String hobbiesRandom = RandomUtils.hobbiesRnd();
    String addressRandom = fakerRus.address().fullAddress();

}
