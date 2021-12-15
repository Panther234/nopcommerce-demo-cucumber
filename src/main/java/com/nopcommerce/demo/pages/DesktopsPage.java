package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DesktopsPage extends Utility {
    private static final Logger log = LogManager.getLogger(DesktopsPage.class.getName());

    public DesktopsPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Desktops']")
    WebElement desktopText;

    @CacheLookup
    @FindBy(xpath = "//select[@id='products-orderby']")
    WebElement sortBy;

    @CacheLookup
    @FindBy(xpath = "//select[@id='products-pagesize']")
    WebElement displayBy;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='List']")
    WebElement selectProductList;

    @CacheLookup
    @FindBy(xpath = "//div[@class='picture']")
    WebElement selectProductFromDesktopPage;

    public void verifyDesktopText(String text) {
        verifyThatTextIsDisplayed(desktopText, text);
        log.info("Desktop text : " + text + desktopText.toString());
    }

    public void sortByProduct() {
        clickOnElement(sortBy);
        log.info("Sortby Product : " + sortBy.toString());
    }

    public void displayByProduct() {
        clickOnElement(displayBy);
        log.info("Display by product : " + displayBy.toString());
    }

    public void selectProductFromList() {
        clickOnElement(selectProductList);
        log.info("Select product from List  : " + selectProductList.toString());
    }

    public void productFromDesktopPage(String text) {
        clickOnElement(selectProductFromDesktopPage, text);
        log.info("Select product from Desktop : " + text + selectProductFromDesktopPage.toString());
    }
}
