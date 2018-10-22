package com.telRan.mishpahug.test;

import org.testng.annotations.Test;



public class ProfileModifyTest extends TestBase{



    @Test

    public void ModificationProfileTest() throws InterruptedException {





        app.getNavigationHelper().logInMyAccount();

        Thread.sleep(3000);

        app.getNavigationHelper().Hamburger();

        app.getNavigationHelper().clickProfilButton();

        app.getProfileHelper().ModifProfilFields();







    }







}