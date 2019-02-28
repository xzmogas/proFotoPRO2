package com.example.moksleivis.profoto;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {

    private static final String VALID_CREDENTIALS_REGEX = "^[A-Za-z0-9.-]{5,13}$";
    private static final String VALID_EMAIL_REGEX = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$";

    //private static final String VALID_USERNAME_PATTERN = "^[A-Za-z]{5,30}$";
    // private static final String VALID_PASSWORD_PATTERN = "^[A-Za-z]{5,30}$";
    private static final String VALID_ENTRYNAME_PATTERN = "^[A-Za-z]{5,30}$";
    private static final String VALID_ENTRYWEIGT_PATTERN = "^[0-9]{1,4}$";


    public static boolean isValidCredentials(String credentials)

    {
        Pattern credentialsPattern = Pattern.compile(VALID_CREDENTIALS_REGEX);
        Matcher credentialsMatcher = credentialsPattern.matcher(credentials);
        return credentialsMatcher.find();
    }

    public static boolean isValidEmail(String email)

    {
        Pattern credentialsPattern = Pattern.compile(VALID_EMAIL_REGEX);
        Matcher credentialsMatcher = credentialsPattern.matcher(email);
        return credentialsMatcher.find();

    }
    public static boolean isValidEntryName(String entryName)

    {

        Pattern  credentialsPattern = Pattern.compile(VALID_ENTRYNAME_PATTERN);
        Matcher credentialsMatcher = credentialsPattern.matcher(entryName);
        return credentialsMatcher.find();

    }

    public static boolean isValidEntryWeight(String entryWeight)

    {
        Pattern  credentialsPattern = Pattern.compile(VALID_ENTRYWEIGT_PATTERN);
        Matcher credentialsMatcher = credentialsPattern.matcher(entryWeight);
        return credentialsMatcher.find();
    }

}


