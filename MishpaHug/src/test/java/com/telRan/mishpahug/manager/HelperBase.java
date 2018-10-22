package com.telRan.mishpahug.manager;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.interactions.Actions;



public class HelperBase {

    WebDriver wd;



    public HelperBase(WebDriver wd) {

        this.wd = wd;

    }



    public void type(By locator, String text){

        wd.findElement(locator).click();

        wd.findElement(locator).clear();

        wd.findElement(locator).sendKeys(text);

    }



    public void click(By locator){

        wd.findElement(locator).click();

    }



    public void escape(){

        Actions action = new Actions(wd);

        action.sendKeys(Keys.ESCAPE).build().perform();

    }

}