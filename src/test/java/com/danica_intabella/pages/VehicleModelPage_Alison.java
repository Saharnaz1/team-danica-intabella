package com.danica_intabella.pages;

import com.danica_intabella.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class VehicleModelPage_Alison extends BasePage {

    public VehicleModelPage_Alison () {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//li[@class='dropdown dropdown-level-1'][1]")
    public WebElement fleetLabel;
//li[@class='dropdown dropdown-level-1'][1]
//span[@class='title title-level-1'][2]"


    @FindBy(xpath ="//span[.='Vehicles Model']"  )
    public WebElement vehicleModelButton;


    @FindBy(xpath="//a[@class='grid-header-cell__link']")
    public List<WebElement> webTable;


    @FindBy(xpath ="//div[.='You do not have permission to perform this action.']")
    public WebElement errorMessage;

}
