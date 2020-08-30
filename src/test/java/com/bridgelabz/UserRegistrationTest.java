package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    @Test
    public void givenFirstName_WhenStartsWithCapAndMinThreeChar_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validateFirstName("Pratiksha");
        Assert.assertTrue(result);
    }

    @Test
    public void givenFirstName_WhenLessThanThreeChar_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validateFirstName("Pi");
        Assert.assertFalse(result);
    }

    @Test
    public void givenFirstName_WhenContainsSpecialChar_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validateFirstName("Prat@h");
        Assert.assertFalse(result);
    }

    @Test
    public void givenFirstName_WhenContainsNumberValues_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validateFirstName("Prat4hj");
        Assert.assertFalse(result);
    }

    @Test
    public void givenFirstName_WhenStartsWithLowercase_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validateFirstName("pratiksha");
        Assert.assertFalse(result);
    }

    @Test
    public void givenLastName_WhenStartsWithCapAndMinThreeChar_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validateLastName("Dhage");
        Assert.assertTrue(result);
    }

    @Test
    public void givenLastName_WhenLessThanThreeChar_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validateLastName("Dh");
        Assert.assertFalse(result);
    }

    @Test
    public void givenLastName_WhenContainsSpecialChar_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validateFirstName("Dha#ge");
        Assert.assertFalse(result);
    }

    @Test
    public void givenLastName_WhenContainsNumberValues_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validateFirstName("Dha4hj");
        Assert.assertFalse(result);
    }

    @Test
    public void givenLastName_WhenStartsWithLowercase_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validateFirstName("dhage");
        Assert.assertFalse(result);
    }

    @Test
    public void givenEmailId_WhenProper_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validateEmailId("dhagepratiksha16@gmail.com");
        Assert.assertTrue(result);
    }

    @Test
    public void givenEmailId_WhenNotProper_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validateEmailId("dhagepratiksha16@gmail");
        Assert.assertFalse(result);
    }

    @Test
    public void givenMobileNumber_WhenStartsWithTwoDigitCountryCodeFollowBySpaceAndTenDigitMobileNumber_ReturnsTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validateMobileNumber("91 8652831978");
        Assert.assertTrue(result);
    }

    @Test
    public void givenMobileNumber_WhenNoSpaceAfterCountryCode_ReturnsFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validateMobileNumber("918652831978");
        Assert.assertFalse(result);
    }

    @Test
    public void givenMobileNumber_WhenLessThanTenDigit_ReturnsFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validateMobileNumber("91 865283197");
        Assert.assertFalse(result);
    }

    @Test
    public void givenPassword_WithMinimumEightCharacter_ReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validatePassword("prat1234");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPassword_WithLessThanEightCharacter_ReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validatePassword("prat123");
        Assert.assertFalse(result);
    }

}
