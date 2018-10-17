package com.telRan.mishpahug.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class TestBase {


    WebDriver wd;

    @BeforeClass

    public void setUp() {
        start();
    }


    @AfterClass
    public void tearDown() {
        logOut();
       // stop();
    }

    public void start() {

        wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wd.get("https://mish.sheygam.com/#/wellcome");

    }

    public void stop() {
        wd.quit();
    }

    public void submitAccount() {

        click(By.xpath("//span[contains(text(),'Registration')]"));
    }

    public void fillFormAccount(String email, String pass, String repeatPass) {
        type(By.cssSelector("[formcontrolname=email]"), email);
        type(By.cssSelector("[formcontrolname=password"), pass);
        type(By.cssSelector("[formcontrolname=passwordRep"), repeatPass);

    }

    public void initByButtonCreate() {

        click(By.xpath("//span[contains(text(),'Create Account')]"));
    }

    public void initByButtonPlus() {

        click(By.xpath("//span[contains(text(),'Go to Event list')]"));
        click(By.xpath("//img[@height='24']"));


    }

    public void initByButtonLogin() throws InterruptedException {

        click(By.xpath("//span[contains(text(),'Login')]"));
        Thread.sleep(3000);
        click(By.xpath("//span[@class='link']"));
        Thread.sleep(3000);
    }

    public void submit() {

        click(By.xpath("//button[@type='submit']"));
    }

    public void fillLoginForm(String email, String pass) {
        type(By.cssSelector("[formcontrolname=email]"), email);
        type(By.cssSelector("[formcontrolname=password]"), pass);

    }

    public void buttonLogin() {
        click(By.xpath("//span[contains(text(),'Login')]"));
    }

    public void buttonCreateAccount() {

        click(By.xpath("//span[contains(text(),'Create Account')]"));
    }

    public void buttonPlus() {

        click(By.xpath("//span[contains(text(),'Go to Event list')]"));
        click(By.xpath("//img[@height='24']"));

    }

    public void logInWithButtonLogIn() {
        buttonLogin();
        fillLoginForm("dvd.bchrd09@gmail.com", "mishpahug09");
        submit();
    }

    public void logInWithButtonCreateAccount() {
        buttonCreateAccount();
        fillLoginForm("dvd.bchrd09@gmail.com", "mishpahug09");
        submit();
    }

    public void logInWithButtonPlus() {
        buttonPlus();
        fillLoginForm("dvd.bchrd09@gmail.com", "mishpahug09");
        submit();
    }

    public void createAccountWithButtonCreateAccount() {
        initByButtonCreate();
        fillFormAccount("dvd.bchrd09+" + System.currentTimeMillis() + "@gmail.com", "mishpahug09", "mishpahug09");
        submitAccount();
    }

    public void createAccountWithButtonPlus() {
        initByButtonPlus();
        fillFormAccount("dvd.bchrd09+" + System.currentTimeMillis() + "@gmail.com", "mishpahug09", "mishpahug09");
        submitAccount();
    }

    public void createAccountWithButtonLogIn() throws InterruptedException {
        initByButtonLogin();
        fillFormAccount("dvd.bchrd09+" + System.currentTimeMillis() + "@gmail.com", "mishpahug09", "mishpahug09");
        submitAccount();
    }

    public void logOut() {

        clickOnHamburgerButton();
        clickOnLogOut();
    }

    public void clickOnLogOut() {
        click(By.cssSelector("span.marginLeft"));
    }

    public void clickOnHamburgerButton() {

        click(By.cssSelector("mat-icon.but.mat-icon.material-icons"));
    }

    public void aboutMySelf(String languages, String gender, String maritalStatus, String foodPreference) {

        MaritalStatus(maritalStatus);
        FoodPreferences(foodPreference);
        ActionEscape();

        Gender(gender);
        ActionEscape();

        Languages(languages);
        ActionEscape();

        Description("Do not play with me");
    }

    public void FoodPreferences(String foodPreference) {
        click(By.cssSelector("[formcontrolname=foodPreferences]"));
        click(By.xpath("//span[contains(text(),'" + foodPreference + "')]"));
    }

    public void MaritalStatus(String maritalStatus) {
        click(By.cssSelector("[formcontrolname=maritalStatus]"));
        click(By.xpath("//span[contains(text(),'" + maritalStatus + "')]"));
    }

    public void Description(String text) {
        type(By.cssSelector("[formcontrolname=description]"), text);
    }

    public void Gender(String gender) {
        click(By.cssSelector("[formcontrolname=gender]"));
        click(By.xpath("//span[contains(text(),'" + gender + "')]"));
    }

    public void Languages(String languages) {
        click(By.cssSelector("[formcontrolname=languages]"));
        click(By.xpath("//span[@class='mat-option-text'][contains(text(),'" + languages + "')]"));

    }

    public void personalInformation(String firstName, String lastName, String phoneNumber, String confession, String year, String month, String day) {
        type(By.cssSelector("[formcontrolname=firstName]"), firstName);
        type(By.cssSelector("[formcontrolname=lastName]"), lastName);
        type(By.cssSelector("[formcontrolname=phoneNumber]"), phoneNumber);

        Confession(confession);

        calendarButton();
        selectYearPeriod();
        previousArrowCalendar();
        selectYear(year);
        selectMonth(month);
        selectDay(day);


    }

    public void selectYearPeriod() {
        click(By.xpath("//button[@class='mat-calendar-period-button mat-button']//span[@class='mat-button-wrapper']"));
    }

    public void previousArrowCalendar() {
        click(By.xpath("//button[@class='mat-calendar-previous-button mat-icon-button']"));
    }

    public void selectYear(String year) {
        click(By.xpath("//div[contains(text(),'" + year + "')]"));
    }

    public void selectMonth(String month) {
        click(By.xpath("//div[contains(text(),'" + month + "')]"));
    }

    public void selectDay(String day) {
        click(By.xpath("//div[contains(text(),'" + day + "')]"));
    }

    public void calendarButton() {
        click(By.xpath("//mat-datepicker-toggle[@class='mat-datepicker-toggle']//button[@type='button']"));
    }

    public void Confession(String confession) {
        click(By.cssSelector("[formcontrolname=confession"));
        click(By.xpath("//span[contains(text(),'" + confession + "')]"));
    }

    public void submitProfile() {

        click(By.xpath("//span[contains(text(),'Save')]"));
    }

    public void ActionEscape(){

        Actions action = new Actions(wd);
        action.sendKeys(Keys.ESCAPE).build().perform();
    }

    public void click(By locator) {
        wd.findElement(locator).click();
    }

    public void type(By locator, String text) {
        wd.findElement(locator).click();
        wd.findElement(locator).clear();
        wd.findElement(locator).sendKeys(text);
    }

    public boolean isLoggedIn() {

        return isElementPresent(By.xpath("//mat-icon[@class='but mat-icon material-icons']"));

    }

    public boolean isElementPresent(By locator) {
        try {
            wd.findElement(locator);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public boolean isFillFormPresent() {
        return isElementPresent(By.xpath("//div[@class='col-sm-11 col-lg-4 personalInfo']//h4[@class='classCentr']"));
    }
}
