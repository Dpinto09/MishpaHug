package com.telRan.Mishpahug.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class EventCreationTests extends TestBase {

    @BeforeMethod

    public void preconditions() throws InterruptedException {

        if (!app.getSessionHelper().isLoggedIn()) {

            app.getSessionHelper().login();

        }

    }

    @Test

    public void testCreationEventFromEventsList() throws InterruptedException {

        app.getEventHelper().clickOnAddEventButton();

        app.getEventHelper().fillEventForm("txt", "Shabat", "Exodus 5, Ashkelon, Israel","DEC 2018","24", "Irreligious", "Any", "vvv");

        app.getEventHelper().clickOnTheSaveButton();


    }

}