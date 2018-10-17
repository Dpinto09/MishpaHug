package com.telRan.mishpahug.test;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateEvent extends TestBase {

    @BeforeMethod
    public void ensurePreconditions() {

        if (!isLoggedIn()) {

            logInWithButtonLogIn();
        }
    }

    @Test
    public void testCreationEvent() throws InterruptedException {

        initCreateEvent();
        Thread.sleep(3000);
        fillEventForm("FIFA", "Shabat", "Bar Kokhva 209,Ashkelon,Israel");
        //submitEvent();

    }

    public void fillEventForm(String title, String holiday, String address) {

        type(By.cssSelector("[formcontrolname=title]"), title);

        click(By.cssSelector("[formcontrolname=holiday]"));
        click(By.xpath("//span[contains(text(),'" + holiday + "')]"));

        type(By.cssSelector("[formcontrolname=address]"), address);



    }


    public void initCreateEvent() {

        click(By.xpath("//img[@height='24']"));
    }

}
