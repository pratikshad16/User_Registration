package com.bridgelabz;

import java.util.regex.Pattern;

public class UserRegistration {
    private static final String NAME_PATTERN = "^[A-Z][a-z]{3,}$";
    private static final String EMAIL_ID_PATTERN = "^[0-9a-zA-Z]+([+_.-][0-9a-zA-Z]+)*@[a-zA-Z0-9]+([.][a-zA-Z]{2,3}){1,2}$";
    private static final String MOBILE_NUMBER_PATTERN = "^[0-9]{2}[ ][0-9]{10}";
    private static final String PASSWORD_PATTERN = "(?=.*[a-z])(?=.*[0-9])(?=.*[A-Z])(?=.*[@#$%+!]{1}).{8,}";


    public boolean validateFirstName(String firstName)
    {
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        return pattern.matcher(firstName).matches();

    }
    public boolean validateLastName(String lastName)
    {
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        return pattern.matcher(lastName).matches();

    }
    public boolean validateEmailId(String email)
    {
        Pattern pattern = Pattern.compile(EMAIL_ID_PATTERN);
        return pattern.matcher(email).matches();
    }

    public boolean validateMobileNumber(String mobileNumber) {
        Pattern pattern = Pattern.compile(MOBILE_NUMBER_PATTERN);
        return pattern.matcher(mobileNumber).matches();
    }
    public boolean validatePassword(String password) {
        Pattern pattern=Pattern.compile(PASSWORD_PATTERN);
        return pattern.matcher(password).matches();
    }
}
