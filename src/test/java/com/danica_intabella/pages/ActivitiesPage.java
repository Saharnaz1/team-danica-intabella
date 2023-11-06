package com.danica_intabella.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ActivitiesPage extends BasePage{
@FindBy(xpath ="//i[@class='fa-puzzle-piece menu-icon']")
    public WebElement activitiesButton;

@FindBy(xpath = "(//span[@class='title title-level-2'])[9]")
    public WebElement calendarEventsButton;

@FindBy(xpath = "//a[@class='btn main-group btn-primary pull-right ']")
    public WebElement createCalendarEventButton;

@FindBy(xpath = "//body[@id='tinymce']")
    public WebElement descriptionField;


}
