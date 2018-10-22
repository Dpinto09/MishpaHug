package com.telRan.mishpahug.manager;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


import java.util.concurrent.TimeUnit;


public class ApplicationManager {


    WebDriver wd;

    private NavigationHelper navigationHelper;

    private RegistrationHelper registrationHelper;

    private ProfileHelper profileHelper;


    public void start() {

        wd = new ChromeDriver();

        wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        wd.navigate().to("https://mish.sheygam.com");

        navigationHelper = new NavigationHelper(wd);

        profileHelper = new ProfileHelper(wd);

        registrationHelper = new RegistrationHelper(wd);

    }


    public void stop() {

        wd.quit();

    }


    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }


    public RegistrationHelper getRegistrationHelper() {

        return registrationHelper;

    }


    public ProfileHelper getProfileHelper() {

        return profileHelper;

    }

}