package com.telRan.mishpahug.test;

import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;



public class LogoutTest extends TestBase {



    @BeforeTest

    public void EnsurePrecondition(){

        if(app.getNavigationHelper().isLoggedIn()){

            app.getNavigationHelper().ClickLogOut();}

    }







    @Test

    public void LogoutTest(){



        app.getNavigationHelper().logInMyAccount();

        app.getNavigationHelper().ClickLogOut();



    }



}