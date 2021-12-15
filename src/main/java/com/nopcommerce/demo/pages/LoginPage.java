package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Random;


public class LoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement welcomeText;

    @CacheLookup
    @FindBy(id = "Email")
    WebElement emailField;

    @CacheLookup
    @FindBy(name = "Password")
    WebElement passwordField;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    WebElement loginButton;

    @CacheLookup
    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    WebElement errorMessage;

    public static String email = getRandomString(5) + "@gmail.com";

    public String getWelcomeText() {
        String message =  getTextFromElement(welcomeText);
        log.info("Getting text from : " + welcomeText.toString());
        return message;
    }

    public void enterRandomEmailId() {
        emailField.click();
        Random randomEmail = new Random();
        int randomInt = randomEmail.nextInt(1000);
        emailField.sendKeys("username" + randomInt + "@gmail.com");
        log.info("Enter Email : "  + emailField.toString());
    }
    public void enterEmailId(String email) {
        sendTextToElement(emailField, email);
        log.info("Enter Email : " + email + emailField.toString());
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
        log.info("Enter Password : " + password + passwordField.toString());
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
        log.info("Click on Login Button : " + loginButton.toString());
    }

    public String getErrorMessage() {
        log.info("Getting error message : " + errorMessage.toString());
        return getTextFromElement(errorMessage);
    }

    public void loginToApplication(String email, String password) {
        enterRandomEmailId();
        enterPassword(password);
        log.info("Enter email and password : " + emailField.toString());
        clickOnLoginButton();
        log.info("Click on Login Button : " + loginButton.toString());
    }
}
