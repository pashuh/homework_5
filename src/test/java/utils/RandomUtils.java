package utils;

import org.apache.commons.lang3.StringUtils;

import java.sql.Timestamp;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomUtils {

    public static String monthRnd() {

        String[] month = {"January", "February", "March", "April",
                "May", "June", "July", "August", "September",
                "October", "November", "December"};
        String random = (month[new Random().nextInt(month.length)]);

        return random;
    }

    public static String genderRnd() {
        String[] gender = {"Male", "Female", "Other"};
        String random = (gender[new Random().nextInt(gender.length)]);
        return random;
    }
    public static String hobbiesRnd() {
        String[] hobbies = {"Sports", "Reading", "Music"};
        String random = (hobbies [new Random().nextInt(hobbies.length)]);
        return random;
    }
}
