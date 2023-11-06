package com.danica_intabella.pages;

import com.danica_intabella.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;

public class US03_Page extends BasePage {


 public US03_Page(){
     PageFactory.initElements(Driver.getDriver(),this);
 }

    @FindBy(xpath = "//div[@class = 'pin-bar-empty']")
    public static WebElement HowToUseThisSpace;

    @FindBy(xpath = "//h3[text()='How To Use Pinbar']")
    public static WebElement HowToUsePinbar;

    @FindBy(xpath = "//i[@class = 'fa-thumb-tack hide-text']")
    public static WebElement pinbar;

    @FindBy(xpath = "//img[@src = '/bundles/oronavigation/images/pinbar-location.jpg']")
    public static WebElement Image;
}
