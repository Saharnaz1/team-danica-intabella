package com.danica_intabella.step_definitions;

import com.danica_intabella.pages.US03_Page;
import com.danica_intabella.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US03_StepDefs {



    @When("click the “Learn how to use this space” link on the homepage,")
    public void clickTheLearnHowToUseThisSpaceLinkOnTheHomepage() {

        US03_Page.HowToUseThisSpace.click();
    }

    @When("see: “How To Use Pinbar”")
    public void see_how_to_use_pinbar(String expectedText) {
       String actualText = US03_Page.HowToUsePinbar.getText();
       Assert.assertEquals(expectedText, actualText);


    }
    @When("“Use the pin icon on the right top corner of the page to create fast access link in the pinbar.”")
    public void use_the_pin_icon_on_the_right_top_corner_of_the_page_to_create_fast_access_link_in_the_pinbar() {

        US03_Page.pinbar.click();

    }
    @Then("users should see an image on the page.")
    public void users_should_see_an_image_on_the_page() {

        US03_Page.Image.isDisplayed();

    }



}
