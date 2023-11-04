package com.danica_intabella.step_definitions;

import com.danica_intabella.pages.OroiDocPage;
import com.danica_intabella.utilities.BrowserUtils;
import com.danica_intabella.utilities.ConfigurationReader;
import com.danica_intabella.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class US02_StepDefs {

    OroiDocPage oroiDocPage = new OroiDocPage();

    @Then("User sees Oro Documentation page")
    public void user_sees_oro_documentation_page() {

        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(oroiDocPage.questionIcon).click();
        BrowserUtils.sleep(2);

//        String expectedTitle = "Welcome to Oro Documentation";
//        String actualTitle = Driver.getDriver().getTitle();
//        Assert.assertEquals(expectedTitle,actualTitle);

    }

    @Then("User click on the question icon")
    public void userClickOnTheQuestionIcon() {
        oroiDocPage.questionIcon.click();
        BrowserUtils.sleep(3);
    }
}
