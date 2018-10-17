package com.telRan.mishpahug.test;

import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    @Test
    public void testButtonLogin() {
        logInWithButtonLogIn();
    }

    @Test
    public void testButtonCreateAccount() {
        logInWithButtonCreateAccount();
    }

    @Test
    public void testButtonPlus() {
        logInWithButtonPlus();
    }

}
