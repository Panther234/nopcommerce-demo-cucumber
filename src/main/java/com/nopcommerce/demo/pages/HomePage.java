package com.nopcommerce.demo.pages;


import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(linkText = "Log in")
    WebElement loginLink;

    @CacheLookup
    @FindBy(linkText = "Register")
    WebElement registerLink;

    @CacheLookup
    @FindBy(xpath = "//div[@class='header-menu']/child::ul[1]/li/a")
    List<WebElement> topMenuList;

    @CacheLookup
    @FindBy(xpath = "//img[@alt='nopCommerce demo store']")
    WebElement nopCommerceLogo;

    @CacheLookup
    @FindBy(linkText = "My account")
    WebElement myAccountMenuLink;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Log out']")
    WebElement logoutLink;

    @CacheLookup
    @FindBy(xpath = "//div[@class='header-menu']//li")
    WebElement allMenuList;

    public void selectMenu(String menu) {
        List<WebElement> topMenuNames = driver.findElements(By.xpath("//div[@class='header-menu']//li"));
        for (WebElement names : topMenuNames) {
            if (names.getText().equalsIgnoreCase(menu)) {
                names.click();
                break;
            }
        }
    }

    public void clickOnLoginLink() {
        clickOnElement(loginLink);
        log.info("Clicking on login link : " + loginLink.toString());
    }

    public void loginLinkDisplayed(){
        verifyThatElementIsDisplayed(loginLink);
        log.info("Verifying displayed link : " + loginLink.toString());
    }

    public void clickOnRegisterLink() {
        clickOnElement(registerLink);
        log.info("Clicking on Register link : " + registerLink.toString());
    }

    public void clickOnMyAccountLink() {
        clickOnElement(myAccountMenuLink);
        log.info("Clicking on MyAccount Link : " + myAccountMenuLink.toString());
    }

    public void clickOnLogoutLink() {
        clickOnElement(logoutLink);
        log.info("Clicking on Logout Link : " + logoutLink.toString());
    }

    public void logoutLinkDisplayed(){
        verifyThatElementIsDisplayed(logoutLink);
        log.info("Verify displayed Link : " + logoutLink.toString());
    }

    public void verifyNopCommerceLogo() {
        verifyLogoDisplayed(nopCommerceLogo);
        log.info("Verifying Logo : " + loginLink.toString());
    }

    public void clickOnMenuTab(String tab) {
        for (WebElement menu : topMenuList) {
            if (menu.getText().contains(tab)) {
                clickOnElement(menu);
                break;
            }
        }
    }

}
