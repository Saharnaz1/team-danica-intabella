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


  // Sahar locator
  // @FindBy(xpath = "//table[@class='grid table-hover table table-bordered table-condensed']//th")
  @FindBy(xpath = "//a//span[@class='grid-header-cell__label']")
     public List<WebElement> webTable;
  // @FindBy(xpath="//span[@class='grid-header-cell__label']")
  //  public List<WebElement> webTable;
//Alison //a[@class='grid-header-cell__link']

    @FindBy(xpath ="//div[.='You do not have permission to perform this action.']")
    public WebElement errorMessage;

}
