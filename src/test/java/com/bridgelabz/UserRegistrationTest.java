package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validateFirstName("Pratiksha");
        Assert.assertTrue(result);
    }

    @Test
    public void givenFirstName_WhenShort_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validateFirstName("Pi");
        Assert.assertFalse(result);
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validateLastName("Dhage");
        Assert.assertTrue(result);
    }

    @Test
    public void givenLastName_WhenShort_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validateLastName("Dh");
        Assert.assertFalse(result);
    }

    @Test
    public void givenEmailId_WhenProper_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validateEmailId("dhagepratiksha16@gmail.com");
        Assert.assertTrue(result);
    }
}
