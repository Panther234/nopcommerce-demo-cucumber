package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComputerPage extends Utility {
    private static final Logger log = LogManager.getLogger(ComputerPage.class.getName());

    public ComputerPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Computers')]")
    WebElement computersPage;

    @CacheLookup
    @FindBy(xpath = "//li[@class='inactive']//a[normalize-space()='Desktops']")
    WebElement desktopPageLink;

    @CacheLookup
    @FindBy(xpath = "//li[@class='inactive']//a[normalize-space()='Notebooks']")
    WebElement notebooksPageLink;

    @CacheLookup
    @FindBy(xpath = "//li[@class='inactive']//a[normalize-space()='Software']")
    WebElement softwarePageLink;


    public void verifyComputersText(String text) {
        verifyThatTextIsDisplayed(computersPage, text);
        log.info("Computer text displayed : " + computersPage.toString());
    }

    public void clickOnDesktopLink() {
        clickOnElement(desktopPageLink);
        log.info("Clicking on Desktop link : " + desktopPageLink.toString());
    }

    public void clickOnNotebookLink() {
        clickOnElement(notebooksPageLink);
        log.info("Click Notebook Link : " + notebooksPageLink.toString());
    }

    public void clickOnSoftwareLink() {
        clickOnElement(softwarePageLink);
        log.info("Click Software Link : " + softwarePageLink.toString());
    }
}
