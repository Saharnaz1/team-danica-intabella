package com.danica_intabella.pages;

import com.danica_intabella.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US12_accounts_page{


    public US12_accounts_page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//a[@class='unclickable'])[3]")
    public WebElement hoverOverCustomer;

    @FindBy(xpath ="(//span[.='Accounts'])[1]")
    public WebElement accounts;

   @FindBy(xpath ="//tr[@class='grid-header-row']//th/a")
    public List<WebElement> itemsList;

    ////tr[@class='grid-header-row']//th/a

/*
    @FindBy(xpath = "//span[text()='Account name']")
    public WebElement AccountName;

    @FindBy(xpath = "//span[text()='Contact name']")
    public WebElement ContactName;

    @FindBy(xpath = "//span[text()='Contact email']")
    public WebElement ContactEmail;

    @FindBy(xpath = "//span[text()='Contact phone']")
    public WebElement ContactPhone;

    @FindBy(xpath = "//span[text()='Owner']")
    public WebElement Owner;

    @FindBy(xpath = "//span[text()='Created At']")
    public WebElement CreatedAt;

    @FindBy(xpath = "//span[text()='Updated At']")
    public WebElement UpdatedAt;


 */



}

