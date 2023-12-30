package com.carshop.app.utils;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class PasswordUtil {

    public static boolean isValidPassword(final String password) {
        // Regex to check valid password.
        final String regex = "^(?=.*[0-9])"
                + "(?=.*[a-z])(?=.*[A-Z])"
                + "(?=.*[@#$%^&+=])"
                + "(?=\\S+$).{8,20}$";

        // Compile the Regex
        Pattern pattern = Pattern.compile(regex);

        // If the password is empty return false
        if (Objects.isNull(password)) {
            return false;
        }

        // Pattern class contains matcher() method to find matching between given password and regular expression.
        Matcher matcher = pattern.matcher(password);

        // Return if the password matched the Regex
        return matcher.matches();
    }

}
