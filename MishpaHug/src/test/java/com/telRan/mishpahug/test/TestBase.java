package com.telRan.mishpahug.test;



import com.telRan.mishpahug.manager.ApplicationManager;

import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;



public class TestBase {



    public ApplicationManager app = new ApplicationManager();





    @BeforeClass

    public void setUp(){

        app.start();

    }





    @AfterClass

    public void tearDown(){

        app.stop();

    }



}