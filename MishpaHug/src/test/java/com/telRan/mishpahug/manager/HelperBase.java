package com.telRan.Mishpahug.manager;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;

import org.openqa.selenium.NoSuchElementException;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.interactions.Actions;

public class HelperBase {
    WebDriver wd;



    public HelperBase(WebDriver wd) {

        this.wd = wd;

    }



    public boolean isElementPresent(By locator) {

        try {

            wd.findElement(locator);

            return true;

        } catch (NoSuchElementException e) {

            return false;

        }

    }



    public void type(By locator, String text) {

        click(locator);

        wd.findElement(locator).clear();

        wd.findElement(locator).sendKeys(text);

    }



    public void waitAndClick(int millis, By locator) throws InterruptedException {

        Thread.sleep(millis);

        click(locator);

    }



    public void click(By locator) {

        wd.findElement(locator).click();

    }



    public void escape() {

        Actions action = new Actions(wd);

        action.sendKeys(Keys.ESCAPE).build().perform();

    }



    public void chooseOption(String field, String myChoice) throws InterruptedException {

        waitAndClick(3000, By.cssSelector("[placeholder='"+field+"']"));

        waitAndClick(3000, By.xpath("//*[contains(text(), '" + myChoice + "')]"));

    }



    public void clickOnTheSaveButton() throws InterruptedException {

        waitAndClick(2000, By.cssSelector("[type=submit]"));



    }
}
