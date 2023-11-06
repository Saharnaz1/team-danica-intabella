package com.danica_intabella.step_definitions;

import com.danica_intabella.pages.VehicleModelPage_Alison;
import com.danica_intabella.utilities.BrowserUtils;
import com.danica_intabella.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

public class US05_StepDefs {
    VehicleModelPage_Alison vehicleModelPageAlison = new VehicleModelPage_Alison();


    @When("user hovers over fleet label")
    public void user_hovers_over_fleet_label() {
        BrowserUtils.sleep(4);
        BrowserUtils.hover(vehicleModelPageAlison.fleetLabel);
        BrowserUtils.sleep(2);
    }

    @When("user clicks vehicle model button")
    public void user_clicks_vehicle_model_button() throws InterruptedException {
        BrowserUtils.waitForVisibility(vehicleModelPageAlison.vehicleModelButton, 10);
        BrowserUtils.sleep(2);
        vehicleModelPageAlison.vehicleModelButton.click();
    }

    // @Then("user should see main module is displayed")
    //public void user_should_see_main_module_is_displayed() {
    //  List<String> mainModule = BrowserUtils.getElementsText(vehicleModelPageAlison.webTable);
    //Assert.assertTrue(mainModule.contains(vehicleModelPageAlison.webTable));
//}

  //  @Then("user  sees ten main module columns")
    //public void userSeesTenMainModuleColumns() {
      //  List<String> mainModule = BrowserUtils.getElementsText(vehicleModelPageAlison.webTable);
        //Assert.assertTrue(mainModule.contains(vehicleModelPageAlison.webTable));
    //}

   // @Then("user should be able to see following modules")
    //public void user_should_be_able_to_see_following_modules(List<String> expectedModules){
      //  List<String> actualModules = new ArrayList<>();
        //for (WebElement eachModule : vehicleModelPageAlison.webTable) {
          //  actualModules.add(eachModule.getText());
       // }

      //  Assert.assertEquals(expectedModules, actualModules);
   // }



     @Then("user should see the error message")
        public void userShouldSeeTheErrorMessage() {
       String expectedText ="You do not have permission to perform this action.";
        String actualText = vehicleModelPageAlison.errorMessage.getText();
         System.out.println("expected text = "+ expectedText);
        System.out.println("actualText = " + actualText);
        BrowserUtils.waitForVisibility(vehicleModelPageAlison.errorMessage,10);
        Assert.assertEquals(expectedText,actualText);
       Assert.assertTrue(vehicleModelPageAlison.errorMessage.isDisplayed());
    }


    @Then("user should be able to see ten main module columns")
    public void userShouldBeAbleToSeeTenMainModuleColumns(List<String> expectedModules) {

        List<String> actualModules = new ArrayList<>();
        for (WebElement eachModule : vehicleModelPageAlison.webTable) {
            actualModules.add(eachModule.getText());
            System.out.println("expectedModules = " + expectedModules);
            System.out.println("actualModules = " + actualModules);
        }
        BrowserUtils.sleep(3);
        Assert.assertEquals(expectedModules, actualModules);
    }




    }

