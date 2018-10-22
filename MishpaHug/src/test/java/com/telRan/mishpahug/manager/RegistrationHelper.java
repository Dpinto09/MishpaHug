package com.telRan.mishpahug.manager;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;



public class RegistrationHelper extends HelperBase {





    public RegistrationHelper(WebDriver wd) {

        super(wd);

    }



    public void comfirmCreation() {

        click(By.xpath("//span[contains(text(),'Registration')]"));

    }



    public void fillRegistration(String email, String password, String password2) {

        type(By.cssSelector("[formcontrolname=email]"), email);

        type(By.cssSelector("[formcontrolname=password]"), password);

        type(By.cssSelector("[formcontrolname=passwordRep]"), password2);



    }



    public void fillProfilFields(){



        type(By.cssSelector("[formcontrolname=firstName]"),"Mickael");

        type(By.cssSelector("[formcontrolname=lastName]"),"Aboulkheir");

        type(By.cssSelector("[formcontrolname=phoneNumber]"),"0533381248");



        click(By.cssSelector("[formcontrolname=confession]"));

        click(By.xpath("//span[@class='mat-option-text'][contains(text(),'Religious')]"));



        click(By.xpath("//*[@class='mat-datepicker-toggle-default-icon ng-star-inserted']"));

        click(By.xpath("//button[@class='mat-calendar-period-button mat-button']"));

        click(By.xpath("//button[@class='mat-calendar-previous-button mat-icon-button']"));



        click(By.xpath("//div[contains(text(),'1992')]"));

        click(By.xpath("//div[contains(text(),'DEC')]"));

        click(By.xpath("//div[contains(text(),'15')]"));



        click(By.cssSelector("[formcontrolname=maritalStatus]"));

        click(By.xpath("//span[contains(text(),'Married')]"));



        click(By.cssSelector("[formcontrolname=foodPreferences]"));

        click(By.xpath("//span[contains(text(),'Kosher')]"));

        escape();



        click(By.cssSelector("[formcontrolname=gender]"));

        click(By.xpath("//span[contains(text(),'Male')]"));



        click(By.cssSelector("[formcontrolname=languages]"));

        click(By.xpath("//span[contains(text(),'Hebrew')]"));

        click(By.xpath("//span[contains(text(),'English')]"));

        click(By.xpath("//span[contains(text(),'French')]"));

        escape();



        click(By.id("description"));

        type(By.id("description"),"Test QA Ashkelon");



        click(By.xpath("//span[contains(text(),'Save')]"));

    }



    public void initiateCreate() {

        click(By.cssSelector("a.paddingLeft.hover.but.mat-button:last-child"));

    }



    public void initiatePlusButton() throws InterruptedException {

        click(By.xpath("//span[contains(text(),'Go to Event list')]"));

        click(By.xpath("//img[@height='24']"));

        Thread.sleep(2000);

        click(By.xpath("//span[contains(text(),'Registration')]"));

        Thread.sleep(3000);

    }



    public void initiateByLogin() throws InterruptedException {

        click(By.cssSelector("a.paddingLeft.hover.but.mat-button"));

        Thread.sleep(2000);

        click(By.xpath("//span[contains(text(),'Registration')]"));

        Thread.sleep(3000);



    }

}