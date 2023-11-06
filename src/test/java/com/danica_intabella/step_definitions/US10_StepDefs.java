package com.danica_intabella.step_definitions;

import com.danica_intabella.pages.ActivitiesPage;
import com.danica_intabella.utilities.BrowserUtils;
import com.danica_intabella.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class US10_StepDefs {

    ActivitiesPage activitiesPage = new ActivitiesPage();

    @When("the user click on the Activities")
    public void the_user_click_on_the_activities() throws InterruptedException {
        Thread.sleep(5000);
        Actions action = new Actions(Driver.getDriver());
        WebElement webElement = Driver.getDriver().findElement(By.xpath("(//a[@class='unclickable'])[3]"));
        action.moveToElement(webElement).build().perform();
    }

    @When("user clicks on the Calendar Events button")
    public void user_clicks_on_the_calendar_events_button() {
        BrowserUtils.sleep(3);
        activitiesPage.calendarEventsButton.click();

    }

    @When("user clicks on the Create Calendar Event button")
    public void user_clicks_on_the_create_calendar_event_button() {
        BrowserUtils.sleep(3);
        activitiesPage.createCalendarEventButton.click();

    }

    @When("user writes the message in the Description field")
    public void user_writes_the_message_in_the_description_field() {
        BrowserUtils.sleep(3);
        Driver.getDriver().switchTo().frame(0);
        activitiesPage.descriptionField.click();
        activitiesPage.descriptionField.sendKeys("Hello World!");

    }

    @Then("user verifies the written message is displayed")
    public void user_verifies_the_written_message_is_displayed() {
        Assert.assertEquals("Hello World!", activitiesPage.descriptionField.getText());

    }
}
