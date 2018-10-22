package com.telRan.mishpahug.manager;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;



public class ProfileHelper extends HelperBase {



    public ProfileHelper(WebDriver wd) {

        super(wd);

    }



    public void ModifProfilFields(){



        click(By.xpath("//span[contains(text(),'Change')]"));



        type(By.cssSelector("[formcontrolname=firstName]"),"JC");

        type(By.cssSelector("[formcontrolname=lastName]"),"VD");

        type(By.cssSelector("[formcontrolname=phoneNumber]"),"045823");



        click(By.cssSelector("[formcontrolname=confession]"));

        click(By.xpath("//span[contains(text(),'Religious')]"));



        click(By.xpath("//*[@class='mat-datepicker-toggle-default-icon ng-star-inserted']"));

        click(By.xpath("//button[@class='mat-calendar-period-button mat-button']"));

        //click(By.xpath("//button[@class='mat-calendar-previous-button mat-icon-button']"));

        click(By.xpath("//div[contains(text(),'1950')]"));

        click(By.xpath("//div[contains(text(),'AUG')]"));

        click(By.xpath("//div[contains(text(),'13')]"));



        click(By.cssSelector("[formcontrolname=maritalStatus]"));

        click(By.xpath("//span[contains(text(),'Widowed')]"));



        click(By.cssSelector("[formcontrolname=foodPreferences]"));

        click(By.xpath("//span[@class='mat-option-text'][contains(text(),'Any')]"));

        click(By.xpath("//span[@class='mat-option-text'][contains(text(),'Kosher')]"));

        escape();



        click(By.cssSelector("[formcontrolname=gender]"));

        click(By.xpath("//span[@class='mat-option-text'][contains(text(),'Male')]"));



        click(By.cssSelector("[formcontrolname=languages]"));

        click(By.xpath("//span[@class='mat-option-text'][contains(text(),'English')]"));

        click(By.xpath("//span[@class='mat-option-text'][contains(text(),'French')]"));

        click(By.xpath("//span[@class='mat-option-text'][contains(text(),'Spain')]"));

        click(By.xpath("//span[@class='mat-option-text'][contains(text(),'Hebrew')]"));

        escape();



        click(By.cssSelector("[formcontrolname=description]"));

        type(By.id("description"),"I AM AWARE");



        click(By.xpath("//span[contains(text(),'Save')]"));

    }

}