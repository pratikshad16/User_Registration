package com.bridgelabz;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class EmailValidationTest
{
    private final String emailForTest;
    private final boolean expectedResult;

    public EmailValidationTest(String emailForTest, boolean result)
    {
        this.emailForTest = emailForTest;
        this.expectedResult = result;

    }

    @Test
    public void givenValidAndInvalidEmailId_ShouldReturnAsPerResult()
    {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validateEmailId(this.emailForTest);
        Assert.assertEquals(this.expectedResult,result);
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]
                {
                        {"abc@yahoo.com", true},
                        {"abc-100@yahoo.com", true},
                        {"abc.100@yahoo.com", true},
                        {"abc111@abc.com", true},
                        {"abc-100@abc.net", true},
                        {"abc.100@abc.com.au", true},
                        {"abc@1.com", true},
                        {"abc@gmail.com.com", true},
                        {"abc+100@gmail.com", true},
                        {"abc", false},
                        {"abc123@gmail.a", false},
                        {"abc123@.com", false},
                        {"abc123@.com.com", false},
                        {".abc@abc.com", false},
                        {"abc()*@gmail.com", false},
                        {"abc@%*.com", false},
                        {"abc..2002@gmail.com", false},
                        {"abc.@gmail.com", false},
                        {"abc@abc@gmail.com", false},
                        {"abc@gmail.com.2a", false},
                        {"abc@gmail.com.aa.au", false}
                });
    }

}
