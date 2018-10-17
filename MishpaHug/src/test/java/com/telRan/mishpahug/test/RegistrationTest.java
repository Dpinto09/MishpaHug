package com.telRan.mishpahug.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class RegistrationTest extends TestBase {

    @AfterMethod
    public void postConditions() {
        logOut();
    }


    @Test
    public void testButtonCreate() {
        createAccountWithButtonCreateAccount();
    }

    @Test
    public void testButtonPlus() {

        createAccountWithButtonPlus();
    }

    @Test
    public void testButtonLogin() throws InterruptedException {
        createAccountWithButtonLogIn();
    }

}
