package com.danica_intabella.pages;

import com.danica_intabella.utilities.Driver;
import org.junit.runner.manipulation.Ordering;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US01_Module_Page {


    public US01_Module_Page(){

        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "//span[@class='title title-level-1']")

    public List<WebElement> AllTopModules;


}
