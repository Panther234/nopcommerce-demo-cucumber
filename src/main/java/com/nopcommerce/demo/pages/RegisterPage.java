package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends Utility {
    private static final Logger log = LogManager.getLogger(RegisterPage.class.getName());

    public RegisterPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Register']")
    WebElement registerPageText;

    @CacheLookup
    @FindBy(xpath = "//input[@name='Gender']")
    WebElement genderSelector;

    @CacheLookup
    @FindBy(xpath = "//input[@id='FirstName']")
    WebElement firstNameBox;

    @CacheLookup
    @FindBy(xpath = "//input[@id='LastName']")
    WebElement lastNameBox;

    @CacheLookup
    @FindBy(xpath = "//input[@id='Email']")
    WebElement emailBox;

    @CacheLookup
    @FindBy(xpath = "//input[@id='Password']")
    WebElement passwordBox;

    @CacheLookup
    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    WebElement confirmPasswordBox;

    @CacheLookup
    @FindBy(xpath = "//button[@id='register-button']")
    WebElement clickRegisterButton;

    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'Your registration completed')]")
    WebElement registrationCompletedText;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement continueButton;

    @CacheLookup
    @FindBy(xpath = "//span[@id='FirstName-error']")
    WebElement firstNameRequiredError;

    @CacheLookup
    @FindBy(xpath = "//span[@id='LastName-error']")
    WebElement lastNameRequiredError;

    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthDay']")
    WebElement dateOfBirthDay;

    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthMonth']")
    WebElement monthOfBirthMonth;

    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthYear']")
    WebElement yearOfBirthYear;

    @CacheLookup
    @FindBy(xpath = "//span[@id='Email-error']")
    WebElement emailRequiredError;

    @CacheLookup
    @FindBy(xpath = "//span[@id='Password-error']")
    WebElement passwordRequiredError;

    @CacheLookup
    @FindBy(xpath = "//span[@id='ConfirmPassword-error']")
    WebElement confirmPasswordRequiredError;

    public void verifyRegisterPageText(String text) {
        verifyThatTextIsDisplayed(registerPageText, text);
        log.info("Verify Register Page Text : " + text + registerPageText.toString());
    }

    public void selectGender(String text) {
        clickOnElement(genderSelector, text);
        log.info("Select Gender : " + text + genderSelector.toString());
    }

    public void firstNameClick(String text) {
        sendTextToElement(firstNameBox, text);
        log.info("First name : " + text + firstNameBox.toString());
    }

    public void lastNameClick(String text) {
        sendTextToElement(lastNameBox, text);
        log.info("Last name : " + text + lastNameBox.toString());
    }

    public void selectDateOfBirth(String dayDOB) {
        selectByVisibleTextFromDropDown(dateOfBirthDay, dayDOB);
        log.info("Birth details  : " + dayDOB + dateOfBirthDay.toString());
    }
    public void selectMonthOfBirth(String monthDOB) {
        selectByVisibleTextFromDropDown(monthOfBirthMonth, monthDOB);
        log.info("Birth details  : " + monthDOB + monthOfBirthMonth.toString());
    }
    public void selectYearOfBirth(String yeaDOB) {
        selectByVisibleTextFromDropDown(yearOfBirthYear, yeaDOB);
        log.info("Birth details  : " + yeaDOB + yearOfBirthYear.toString());
    }

    public void enterEmailId(String email) {
        sendTextToElement(emailBox, email);
        log.info("Enter Email : " + email + emailBox.toString());
      }

    public void passwordClick(String text) {
        sendTextToElement(passwordBox, text);
        log.info("Enter password : " + text + passwordBox.toString());
    }

    public void confirmPasswordClick(String text) {
        sendTextToElement(confirmPasswordBox, text);
        log.info("Enter confirmPassword : " + text + confirmPasswordBox.toString());
    }

    public void registerButtonClick() {
        clickOnElement(clickRegisterButton);
        log.info("Click Register Button : "  + clickRegisterButton.toString());
    }

    public void verifyRegisterText(String text) {
        verifyThatTextIsDisplayed(registrationCompletedText, text);
        log.info("Registration text verify: " + text + registrationCompletedText.toString());
    }

    public void clickContinueButton() {
        clickOnElement(continueButton);
        log.info("Click Continue Button : "  + continueButton.toString());
    }

    public void verifyFirstNameErrorMessage(String text) {
        verifyThatTextIsDisplayed(firstNameRequiredError, text);
        log.info("First name error : " + text + firstNameRequiredError.toString());
    }

    public void verifyLastNameErrorMessage(String text) {
        verifyThatTextIsDisplayed(lastNameRequiredError, text);
        log.info("Last name error : " + text + lastNameRequiredError.toString());
    }

    public void verifyEmailErrorMessage(String text) {
        verifyThatTextIsDisplayed(emailRequiredError, text);
        log.info("Email error : " + text + emailRequiredError.toString());
    }

    public void verifyPasswordErrorMessage(String text) {
        verifyThatTextIsDisplayed(passwordRequiredError, text);
        log.info("Password error : " + text + passwordRequiredError.toString());
    }

    public void verifyConfirmPasswordErrorMessage(String text) {
        verifyThatTextIsDisplayed(confirmPasswordRequiredError, text);
        log.info("Confirm password error  : " + text + confirmPasswordRequiredError.toString());
    }


}
