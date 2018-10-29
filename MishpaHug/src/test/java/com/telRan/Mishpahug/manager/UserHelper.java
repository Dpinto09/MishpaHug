package com.telRan.Mishpahug.manager;
import com.telRan.Mishpahug.model.ProfileAboutMySelfData;
import com.telRan.Mishpahug.model.ProfilePersonalInformationData;
import com.telRan.Mishpahug.model.NotRegisteredUserData;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
public class UserHelper extends HelperBase {

    public UserHelper(WebDriver wd) {

        super(wd);

    }

    public void clickOnRegistrationButton() {

        click(By.xpath("//span[contains(.,'Registration')]"));

    }



    public void fillCreateAccountForm(NotRegisteredUserData notRegUser) {

        type(By.cssSelector("[formcontrolname=email]"), notRegUser.getMyEmail());

        type(By.cssSelector("[formcontrolname=password]"), notRegUser.getPassword());

        type(By.cssSelector("[formcontrolname=passwordRep]"), notRegUser.getPasswordRep());

    }



    public void clickOnCreateAccountButtonOnHeader() {

        click(By.cssSelector("a.paddingLeft.hover.but.mat-button:last-child"));

    }



    public void openCreateAccountForm() {

        click(By.xpath("//span[contains(text(), 'Registration')]"));



    }



    public void fillLogInForm(String email, String password) {

        type(By.cssSelector("input[formcontrolname=email]"), email);

        type(By.cssSelector("input[formcontrolname=password]"), password);

    }



    public boolean isOnRegistrationPage() {

        return isElementPresent(By.cssSelector(".avatar"));

    }



    public void fillPersonalInformationForm(ProfilePersonalInformationData profilePersonalInformationData) throws InterruptedException {

        type(By.id("inputFirstName"), profilePersonalInformationData.getfName());

        type(By.id("inputLastName"), profilePersonalInformationData.getlName());

        type(By.id("inputPhoneNumber"), profilePersonalInformationData.getPhone());



        click(By.cssSelector("[placeholder = Confession]"));

        click(By.xpath("//*[contains(text(), '" + profilePersonalInformationData.getReligious() + "')]"));



        enterDate(profilePersonalInformationData.getYear(), profilePersonalInformationData.getMonth(), profilePersonalInformationData.getDay());



    }



    public void enterDate(String year, String month, String day) throws InterruptedException {

        click(By.xpath("//*[@aria-label='Open calendar']"));

        click(By.xpath("//*[@aria-label='Choose month and year']"));

        while (!isYearPresent(year)) {

            click(By.xpath("//*[@aria-label='Previous 20 years']"));

        }

        click(By.xpath("//*[contains(text(), '" + year + "')]"));

        waitAndClick(3000, By.xpath("//*[contains(text(), '" + month + "')]"));

        waitAndClick(3000, By.xpath("//div[contains(text(), '" + day + "')]"));

    }



    private boolean isYearPresent(String year) {

        return isElementPresent(By.xpath("//*[contains(text(), '" + year + "')]"));

    }





    public void fillAboutMyselfForm(ProfileAboutMySelfData profileAboutMySelfData) throws InterruptedException {

        chooseOption("Marital Status", profileAboutMySelfData.getStatus());

        chooseOption("Food Preferences", profileAboutMySelfData.getFoodPref());

        escape();

        chooseOption("Gender", profileAboutMySelfData.getGender());

        chooseOption("Languages", profileAboutMySelfData.getLanguage());

        escape();

        type(By.cssSelector("textarea"), profileAboutMySelfData.getText());

    }







    public void chooseTwoOptions(String field, String myChoice, String myChoice2) throws InterruptedException {

        waitAndClick(3000, By.cssSelector("[placeholder='" + field + "']"));

        waitAndClick(3000, By.xpath("//*[contains(text(), '" + myChoice + "')]"));

        waitAndClick(3000, By.xpath("//*[contains(text(), '" + myChoice2 + "')]"));

    }

    public void chooseThreeOptions(String field, String myChoice, String myChoice2, String myChoice3) throws InterruptedException {

        waitAndClick(3000, By.cssSelector("[placeholder='" + field + "']"));

        waitAndClick(3000, By.xpath("//*[contains(text(), '" + myChoice + "')]"));

        waitAndClick(3000, By.xpath("//*[contains(text(), '" + myChoice2 + "')]"));

        waitAndClick(3000, By.xpath("//*[contains(text(), '" + myChoice3 + "')]"));



    }





    public boolean waitForElementPresent(int millis, By locator) throws InterruptedException {

        Thread.sleep(millis);

        return isElementPresent(locator);

    }
}
