package com.telRan.mishpahug.manager;

import org.openqa.selenium.By;

import org.openqa.selenium.NoSuchElementException;

import org.openqa.selenium.WebDriver;


public class NavigationHelper extends HelperBase {


    public NavigationHelper(WebDriver wd) {

        super(wd);

    }


    public void clickPlusButton() {
        click(By.xpath("//img[@height='24']"));
    }


    public void Hamburger() {

        click(By.xpath("//mat-icon[@class='but mat-icon material-icons']"));

    }


    public void clickProfilButton() {
        click(By.xpath("//span[contains(text(),'Profile')]"));
    }


    public void clickLoginButton() {
        click(By.cssSelector("a.paddingLeft.hover.but.mat-button"));
    }


    public void logInMyAccount() {

        clickLoginButton();

        fillLoginForm("micamike@hotmail.com", "mickael55'");

    }


    public void ClickLogOut() {

        click(By.xpath("//span[@class='ng-star-inserted']//span[@class='mat-button-wrapper']"));

        click(By.xpath("//span[@class='marginLeft']"));

    }


    public void fillLoginForm(String email, String password) {

        type(By.cssSelector("[formcontrolname=email]"), email);

        type(By.cssSelector("[formcontrolname=password]"), password);

        click(By.xpath("//span[contains(text(),'Log in')]"));

    }


    public boolean isLoggedIn() {

        try {

            wd.findElement(By.xpath("//mat-icon[@class='but mat-icon material-icons'])"));

            return true;

        } catch (NoSuchElementException e) {

            return false;
        }

    }

}