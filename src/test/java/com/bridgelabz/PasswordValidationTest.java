package com.bridgelabz;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class PasswordValidationTest {
    private final String passwordForTest;
    private final boolean expectedResult;


    public PasswordValidationTest(String passwordForTest, boolean result) {
        this.passwordForTest = passwordForTest;
        this.expectedResult = result;
    }

    @Test
    public void givenValidOrInvalidPassword_ShouldReturnAsPerResult() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validatePassword(this.passwordForTest);
        Assert.assertEquals(this.expectedResult, result);
    }


    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]
                {
                        {"Pratiksha", true},
                        {"pratiksha", true},
                        {"abcdefgd", true},
                        {"pratik", false},
                        {"pratikh234", false},
                        {"prati@khf",false}
                });
    }
}
