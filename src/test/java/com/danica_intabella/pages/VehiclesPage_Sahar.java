package com.danica_intabella.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class VehiclesPage_Sahar extends BasePage{






        @FindBy(xpath = "//li[@class='dropdown dropdown-level-1'][1]")
        public WebElement hoverFleet;


        @FindBy(xpath = "//span[.='Vehicles']")
        public WebElement vehicleDropdown;


        @FindBy(xpath = "//td[@class='action-cell grid-cell grid-body-cell'][1]")
        public WebElement threeDotsLocator;

        @FindBy(xpath = "//ul[@class='nav nav-pills icons-holder launchers-list']//*[@class='launcher-item']//a")
        public List<WebElement> hoverOptions;


        @FindBy(xpath = "(//a[@class='dropdown-toggle'])[4]")
        public WebElement threeDot;


        @FindBy(xpath = "//ul[@class='nav nav-pills icons-holder launchers-list']/li")
        public List<WebElement> actualOptions_Element;

        @FindBy(xpath = "(//ul[@class='nav nav-pills icons-holder launchers-list'])[1]/li/a")
        public List<WebElement> actual_Option;

//        @FindBy(name = "_username")
//        public WebElement username;
//
//        @FindBy(name = "_password")
//        public WebElement password;
//
//        @FindBy(name = "_submit")
//        public WebElement logInButton;

//        @FindBy(xpath = "(//span[@class='title title-level-1'])[2]")
//        public WebElement fleet;
//
//        @FindBy(xpath = "(//span[@class='title title-level-2'])[3]")
//        public WebElement vehicle;

//        @FindBy(xpath = "//a[@title='View']")
//        public WebElement hoverView;
//
//        @FindBy(xpath = "//a[@title='Edit']")
//        public WebElement hoverEdit;
//
//        @FindBy(xpath = "//a[@title='Delete']")
//        public WebElement hoverDelete;












    }





