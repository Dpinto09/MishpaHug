package com.telRan.mishpahug.test;

import org.testng.Assert;

import org.testng.annotations.AfterMethod;

import org.testng.annotations.Test;



public class LoginTest extends TestBase{





    @Test

    public void LoginByHeader() throws InterruptedException {



        app.getNavigationHelper().clickLoginButton();

        app.getNavigationHelper().fillLoginForm("micamike@hotmail.com", "mickael55");



        Assert.assertTrue(app.getNavigationHelper().isLoggedIn());

    }



    @AfterMethod

    public void logout(){

        app.getNavigationHelper().ClickLogOut();

    }



}