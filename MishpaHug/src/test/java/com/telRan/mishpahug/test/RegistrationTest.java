package com.telRan.mishpahug.test;



import org.testng.annotations.Test;



public class RegistrationTest extends TestBase {



    @Test

    public void RegistrationFromHeaderTest(){

        app.getRegistrationHelper().initiateCreate();

        app.getRegistrationHelper().fillRegistration("micamike@hotmail.com", "mickael55", "mickael55");

        app.getRegistrationHelper().comfirmCreation();

        app.getRegistrationHelper().fillProfilFields();

    }



    @Test

    public void RegistrationFromPlusButton() throws InterruptedException {

        app.getRegistrationHelper().initiatePlusButton();

        app.getRegistrationHelper().fillRegistration("micamike+"+System.currentTimeMillis()+"@hotmail.com", "mickael55", "mickael55");

        app.getRegistrationHelper().comfirmCreation();

        app.getRegistrationHelper().fillProfilFields();

    }



    @Test

    public void RegistrationByLogin() throws InterruptedException {

        app.getRegistrationHelper().initiateByLogin();

        app.getRegistrationHelper().fillRegistration("micamike+"+System.currentTimeMillis()+"@hotmail.com", "mickael55", "mickael55");

        app.getRegistrationHelper().comfirmCreation();

        app.getRegistrationHelper().fillProfilFields();

    }



}