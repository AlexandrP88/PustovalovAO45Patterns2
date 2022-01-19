package ru.netology;

import com.github.javafaker.Faker;
import lombok.experimental.UtilityClass;

import java.util.Locale;

@UtilityClass
public class DataGenerator {

    @UtilityClass
    public static class postUser {
        public static RegistrationDto validUser(String status) {
            Faker faker = new Faker(new Locale("en"));
            return new RegistrationDto(faker.name().username(),
                    faker.internet().password(),
                    status);
        }

        public static RegistrationDto blockedUser(String status) {
            Faker faker = new Faker(new Locale("en"));
            return new RegistrationDto(faker.name().username(),
                    faker.internet().password(),
                    status);
        }

        public static RegistrationDto userPresence(String status) {
            Faker faker = new Faker(new Locale("en"));
            return new RegistrationDto(faker.name().username(),
                    faker.internet().password(),
                    status);
        }

        public static RegistrationDto notValidLogin(String login) {
            Faker faker = new Faker(new Locale("en"));
            return new RegistrationDto(login,
                    faker.internet().password(),
                    "active");
        }

        public static RegistrationDto notValidPassword(String password) {
            Faker faker = new Faker(new Locale("en"));
            return new RegistrationDto(faker.name().username(),
                    password,
                    "active");
        }
    }
}
