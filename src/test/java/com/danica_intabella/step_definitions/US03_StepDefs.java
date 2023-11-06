package com.danica_intabella.step_definitions;

import com.danica_intabella.pages.US03_Page;
import com.danica_intabella.utilities.BrowserUtils;
import com.danica_intabella.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

public class US03_StepDefs {

    US03_Page us03_page = new US03_Page();
    @When("click the Learn how to use this space link on the homepage,")
    public void clickTheLearnHowToUseThisSpaceLinkOnTheHomepage() {
        BrowserUtils.sleep(5);
        JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
        executor.executeScript("arguments[0].click();", us03_page.HowToUseThisSpace);

      //  us03_page.HowToUseThisSpace.click();
    }

    @And("see {string}")
    public void see(String expectedText) {
        BrowserUtils.sleep(3);
        String actualText = us03_page.HowToUsePinbar.getText();
        Assert.assertEquals(expectedText, actualText);
    }

    @And("Use the pin icon on the right top corner of the page to create fast access link in the pinbar.")
    public void useThePinIconOnTheRightTopCornerOfThePageToCreateFastAccessLinkInThePinbar() {
        BrowserUtils.sleep(3);
        us03_page.pinbar.click();
    }





    @Then("users should see an image on the page.")
    public void users_should_see_an_image_on_the_page() {
        BrowserUtils.sleep(3);
        Assert.assertTrue(us03_page.Image.isDisplayed());


    }



}
