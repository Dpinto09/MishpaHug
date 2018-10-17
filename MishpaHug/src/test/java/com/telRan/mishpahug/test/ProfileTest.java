package com.telRan.mishpahug.test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ProfileTest extends TestBase {


    @BeforeMethod
    public void ensurePreconditions() throws InterruptedException {

        if (!isFillFormPresent()) {

            createAccountWithButtonCreateAccount();
        }
        Thread.sleep(8000);
    }

    @Test
    public void testFillProfileForm() throws InterruptedException {

        Thread.sleep(4000);

        personalInformation("David ", "Pinto", "0538230743", "Religious", "1992", "FEB", "21");
        aboutMySelf("Hebrew", "Male", "Single", "Kosher");
        submitProfile();


    }


}