package com.danica_intabella.pages;

import com.danica_intabella.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OroiDocPage extends BasePage {

    @FindBy(xpath = "//i[@class='fa-question-circle']")
    public WebElement questionIcon;

}
