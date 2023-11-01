package com.danica_intabella.pages;

import com.danica_intabella.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehicleOdometerPage_Mohamed {

    public VehicleOdometerPage_Mohamed() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@id='main-menu']/ul/li[2]/a/span")
    public WebElement fleetMenu;

    @FindBy(xpath = "//span[.='Vehicle Odometer']")
    public WebElement vehicleOdometerButton;

    @FindBy(xpath = "//div[.='You do not have permission to perform this action.']")
    public WebElement errorMessage;

    @FindBy(xpath = "//div[@id='main-menu']/ul/li")
    public WebElement driverFleetMenu;

    @FindBy(xpath = "//span[.='Vehicle Odometer']")
    public WebElement driverVehicleOdometerButton;

    @FindBy(xpath = "//input[@type='number']")
    public WebElement defaultPage;

    @FindBy(xpath = "//button[@data-toggle]")
    public WebElement defaultViewPage;

}
