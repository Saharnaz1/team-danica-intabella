package com.danica_intabella.pages;

import com.danica_intabella.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehiclesPage_Sahar {

    public VehiclesPage_Sahar() {
        PageFactory.initElements(Driver.getDriver(), this);

    }


    @FindBy(xpath = "//span[.='Vehicles']")
    public WebElement fleetDropdown;

    @FindBy(xpath = "//a[.='...']")
    public WebElement threeDotsLocator;

    @FindBy(xpath = "//a[@title='View']")
    public WebElement hoverView;

    @FindBy(xpath = "//a[@title='Edit']")
    public WebElement hoverEdit;

    @FindBy(xpath = "//a[@title='Delete']")
    public WebElement hoverDelete;















    }





