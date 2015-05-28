/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Vladimir Tomic
 */
public class RegExValidator {

    private static Pattern emailPattern;
    private static Pattern passwordPattern;
    private static Pattern usernamePattern;
    private static Matcher matcher;

    private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    // Password = at least 1 digit, 1 upper-case, 1 lower-case, 1 special character, no white spaces; at least 8 characters in length;
    private static final String PASSWORD_PATTERN = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%_^&+=])(?=\\S+$).{8,}$";
    private static final String USERNAME_PATTERN = "[a-zA-Z0-9\\._\\-]{3,}";

    public RegExValidator() {
        emailPattern = Pattern.compile(EMAIL_PATTERN);
        passwordPattern = Pattern.compile(PASSWORD_PATTERN);
        usernamePattern = Pattern.compile(USERNAME_PATTERN);
    }

    // Generic validator
    public static boolean validateGeneric(final String test, final Pattern pattern) {
        matcher = pattern.matcher(test);
        return matcher.matches();
    }

    // E-mail validator
    public static boolean validateEmail(final String email) {
        return validateGeneric(email, emailPattern);
    }

    // Password validator
    public static boolean validatePassword(final String password) {
        return validateGeneric(password, passwordPattern);
    }

    // Username validator
    public static boolean validateUsername(final String username) {
        return validateGeneric(username, usernamePattern);
    }
}
