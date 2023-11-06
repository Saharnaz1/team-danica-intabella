package com.danica_intabella.step_definitions;

import com.danica_intabella.pages.VehiclesPage_Sahar;
import com.danica_intabella.utilities.BrowserUtils;
import com.danica_intabella.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

public class US06_CarEditInfoStepDefs{

    VehiclesPage_Sahar vehiclesPageSahar = new VehiclesPage_Sahar();




    @When("the user hovers on Fleet module")
    public void the_user_hovers_on_fleet_module() {
        BrowserUtils.sleep(3);
        BrowserUtils.hover(vehiclesPageSahar.hoverFleet);
        BrowserUtils.sleep(1);


    }

    @When("clicks on Vehicles in the dropdown")
    public void clicks_on_vehicles_in_the_dropdown() {
      //  BrowserUtils.sleep(3);
        BrowserUtils.waitForVisibility(vehiclesPageSahar.vehicleDropdown, 10);
        vehiclesPageSahar.vehicleDropdown.click();
       // BrowserUtils.sleep(2);
    }



    @When("the user hovers over three dots on vehicles line")
    public void the_user_hovers_over_three_dots_on_vehicles_line() {
        Actions actions = new Actions(Driver.getDriver());
        BrowserUtils.sleep(5);
        actions.moveToElement(vehiclesPageSahar.threeDotsLocator).perform();
       // vehiclesPageSahar.threeDotsLocator.click();

    }



//    @Then("the user {string} buttons")
//    public void theUserButtons(String hoverOptions) {
//        BrowserUtils.getElementsText(vehiclesPageSahar.hoverOptions);
//        System.out.println("vehiclesPageSahar.hoverOptions = " + vehiclesPageSahar.hoverOptions);
//    }


//    @Then("the user sees view edit delete buttons")
//    public void theUserSeesViewEditDeleteButtons(List<String> hoverOptions) {

//        List<String> hoverOptions = vehiclesPageSahar.hoverOptions; // Assuming getHoverOptions() returns the list.
//
//        for (String option : hoverOptions) {
//            String xpathExpression = "//*[contains(text(), '" + option + "')]";
//          vehiclesPageSahar.hoverOptions.isDisplayed
//
//            // Check if the element is displayed
//            boolean isDisplayed = element.isDisplayed();
//
//            // Assert that the element is displayed
//            Assert.assertTrue("Element '" + option + "' is not displayed.", isDisplayed);
//        }
//            List<String> actualModules = new ArrayList<>();
//            for (WebElement eachModule : vehiclesPageSahar.hoverOptions) {
//                actualModules.add(eachModule.getText());
//            }
      //  System.out.println("vehiclesPageSahar.hoverOptions = " + vehiclesPageSahar.hoverOptions);

         //   Assert.assertEquals(vehiclesPageSahar.hoverOptions, actualModules);
       // }



    @Then("the user sees the below options")
    public void theUserSeesTheBelowOptions(List<String> expectedOptionText) {

        Actions actions = new Actions(Driver.getDriver());
        List<String> actualOptionText = new ArrayList<>();
        BrowserUtils.sleep(3);
        actions.moveToElement(vehiclesPageSahar.threeDot).perform();
        BrowserUtils.sleep(3);

        for (int i = 0; i < vehiclesPageSahar.actualOptions_Element.size(); i++) {
            actions.moveToElement(vehiclesPageSahar.actualOptions_Element.get(i)).perform();
            BrowserUtils.sleep(8);
            actualOptionText.add(vehiclesPageSahar.actual_Option.get(i).getAttribute("title"));
        }

        Assert.assertEquals(expectedOptionText,actualOptionText);

    }

    }



//        List<String> actualOptions = new ArrayList<>();
//        for (WebElement each : vehiclesPageSahar.hoverOptions) {
//            actualOptions.add(each.getText());
//        }
//
//        Assert.assertEquals(expectedOptions, actualOptions);
//        System.out.println("expectedOptions = " + expectedOptions);
//        System.out.println("actualOptions = " + actualOptions);


//        BrowserUtils.sleep(8);
//        List<String> actualOptions = BrowserUtils.getElementsText(vehiclesPageSahar.hoverOptions);
//        System.out.println( vehiclesPageSahar.hoverOptions);
//
//        Assert.assertEquals(expectedOptions, actualOptions);
//        System.out.println("expectedOptions = " + expectedOptions);
//        System.out.println("actualOptions = " + actualOptions);



//
//                List<String> actualOptions = new ArrayList<>();
//        Actions actions = new Actions(Driver.getDriver());
//        for (WebElement each : vehiclesPageSahar.hoverOptions) {
//            BrowserUtils.sleep(5);
//            actions.moveToElement(each);
//            actualOptions.add(each.getText());
//        }
//        Assert.assertEquals(expectedOptions, actualOptions);



//    @And("the user sees the below options")
//    public void theUserSeesTheBelowOptions(List<WebElement> expectedButtons) {
//
//        List<WebElement> elems = vehiclesPageSahar.hoverOptions;
//        List<String> elemTexts = new ArrayList<>();
//
//        for (WebElement el : elems) {
//            elemTexts.add(el.getText());
//        }
//        List<WebElement> actualButtons = vehiclesPageSahar.hoverOptions;
//        Assert.assertEquals(expectedButtons,actualButtons);












//
//    @Then("the user sees {string} {string} and {string} buttons")
//    public void theUserSeesAndButtons(String view, String edit, String delete) {
//       // BrowserUtils.waitForVisibility(vehiclesPageSahar.hoverView, 5);
//        String expected = view;
//        String actual = vehiclesPageSahar.hoverView.getText();
//        System.out.println("vehiclesPageSahar.hoverView = " + vehiclesPageSahar.hoverView);
//        Assert.assertEquals(expected,actual);
//
//        String expected2 = edit;
//        String actual2 = vehiclesPageSahar.hoverEdit.getText();
//        System.out.println("vehiclesPageSahar.hoverEdit = " + vehiclesPageSahar.hoverEdit);
//        Assert.assertEquals(expected2,actual2);
//
//        String expected3 = delete;
//        String actual3 = vehiclesPageSahar.hoverDelete.getText();
//        System.out.println("vehiclesPageSahar.hoverDelete = " + vehiclesPageSahar.hoverDelete);
//        Assert.assertEquals(expected3,actual3);

       // Assert.assertTrue(vehiclesPageSahar.hoverView.isDisplayed());
       // BrowserUtils.waitForVisibility(vehiclesPageSahar.hoverEdit, 5);
       // Assert.assertTrue(vehiclesPageSahar.hoverEdit.isDisplayed());
      //  BrowserUtils.waitForVisibility(vehiclesPageSahar.hoverDelete, 5);
     //   Assert.assertTrue(vehiclesPageSahar.hoverDelete.isDisplayed());
    //}




