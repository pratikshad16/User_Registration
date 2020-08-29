package com.bridgelabz;

import java.util.regex.Pattern;

public class UserRegistration {
    private static final String NAME_PATTERN = "^[A-Z][a-z]{3,}$";
    private static final String EMAIL_ID_PATTERN = "^[0-9a-zA-Z]+([+_.-][0-9a-zA-Z]+)*@[a-zA-Z0-9]+([.][a-zA-Z]{2,3}){1,2}$";
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
}
