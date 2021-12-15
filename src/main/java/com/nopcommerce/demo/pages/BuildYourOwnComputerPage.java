package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuildYourOwnComputerPage extends Utility {
    private static final Logger log = LogManager.getLogger(BuildYourOwnComputerPage.class.getName());

    public BuildYourOwnComputerPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Build your own computer']")
    WebElement buildYourOwnComputerText;

    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_1']")
    WebElement processorSelect;

    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_2']")
    WebElement ramSelect;

    @CacheLookup
    @FindBy(xpath = "//input[@name='product_attribute_3']")
    WebElement hddSelect;

    @CacheLookup
    @FindBy(xpath = "//input[@name= 'product_attribute_4']")
    WebElement operatingSystemSelect;

    @CacheLookup
    @FindBy(xpath = "//input[@name= 'product_attribute_5']")
    WebElement softwareSelect;

    @CacheLookup
    @FindBy(xpath = "//button[@id='add-to-cart-button-1']")
    WebElement addToCartSelect;

    @CacheLookup
    @FindBy(xpath = "//p[contains(.,'The product has been added to your shopping cart')]")
    WebElement productAddToCartText;


    public void verifyBuildYourOwnComputerText() {
        verifyThatTextIsDisplayed(buildYourOwnComputerText, "Build your own computer");
        log.info("Build your own computer text displayed : " + buildYourOwnComputerText.toString());
    }

    public void selectProcessorFromDropDown(String text) {
        selectByVisibleTextFromDropDown(processorSelect, text);
        log.info("Select Processor : "+text + processorSelect.toString());
    }

    public void selectRAMFromDropDown(String text) {
        selectByVisibleTextFromDropDown(ramSelect, text);
        log.info("Select RAM  : " +text + ramSelect.toString());
    }

    public void selectHDDRadioButton(String text) {
        clickOnElement(hddSelect, text);
        log.info("Select Harddisk : "+text + hddSelect.toString());
    }

    public void selectOSRadioButton(String text) {
        clickOnElement(operatingSystemSelect, text);
        log.info("Select Operating system : "+text + operatingSystemSelect.toString());
    }

    public void selectSoftwareCheckBox(String text) {
        clickOnElement(softwareSelect, text);
        log.info("Select Software : "+text + softwareSelect.toString());
    }

    public void clickAddToCart() {
        clickOnElement(addToCartSelect);
        log.info("Clicking Add to cart : "+ addToCartSelect.toString());
    }

    public void verifyAddToCartText() {
        verifyThatTextIsDisplayed(productAddToCartText, "The product has been added to your shopping cart");
        log.info("Verify Add to cart : "+ productAddToCartText.toString());
    }

    public void selectParts(String processor, String ram, String hdd, String os, String software) {
        selectProcessorFromDropDown(processor);
        selectRAMFromDropDown(ram);
        selectHDDRadioButton(hdd);
        selectOSRadioButton(os);
        selectSoftwareCheckBox(software);
    }


}
