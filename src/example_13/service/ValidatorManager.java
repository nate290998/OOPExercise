package example_13.service;

import java.time.LocalDate;
import java.time.Period;
import java.util.regex.Pattern;

import example_13.exception.BirthdayException;
import example_13.exception.EmailException;
import example_13.exception.FullNameException;
import example_13.exception.PhoneException;

public class ValidatorManager {
    // ^: find a match as beginning
    // static: same value every instance -> point to the same memory area
    // final: variable can't be changed
    // $: find a match as the end
    static final String EMAIL_REGEX = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

    public static void birthdayCheck(LocalDate birthday) throws BirthdayException {
        LocalDate today = LocalDate.now();
        if (birthday == null) {
            throw new BirthdayException("Birthday cannot be null.");
        }
        if (Period.between(birthday, today).getYears() < 18) {
            throw new BirthdayException("Person must be at least 18 years old.");
        }
    }

    // require 10 digits (number)
    public static void phoneCheck(String phone) throws PhoneException {
        if (phone == null || !phone.matches("\\d{10}")) {
            throw new PhoneException("Phone number must be 10 digits long.");
        }
    }

    public static void emailCheck(String email) throws EmailException {
        if (email == null || !Pattern.matches(EMAIL_REGEX, email)) {
            throw new EmailException("Invalid email format. ()");
        }
    }

    public static void nameCheck(String name) throws FullNameException {
        if (name == null || name.trim().isEmpty() || !name.matches("[a-zA-Z\\s]+")) {
            throw new FullNameException("Name must contain only alphabetic characters and cannot be empty.");
        }
    }
}
