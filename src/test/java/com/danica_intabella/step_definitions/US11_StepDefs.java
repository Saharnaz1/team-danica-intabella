package com.danica_intabella.step_definitions;

import com.danica_intabella.pages.VehicleOdometerPage_Mohamed;
import com.danica_intabella.utilities.BrowserUtils;
import com.danica_intabella.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class US11_StepDefs {

    VehicleOdometerPage_Mohamed vehicleOdometerPageMohamed = new VehicleOdometerPage_Mohamed();

    @When("the user hover on fleet menu")
    public void the_user_hover_on_fleet_menu() {
        Actions actions = new Actions(Driver.getDriver());
        BrowserUtils.sleep(2);
        actions.moveToElement(vehicleOdometerPageMohamed.fleetMenu).perform();

    }

    @When("the user clicks on Vehicle Odometer module")
    public void the_user_clicks_on_vehicle_odometer_module() {
        BrowserUtils.sleep(2);
        vehicleOdometerPageMohamed.vehicleOdometerButton.click();
    }

    @Then("the user should be able to see the error message")
    public void the_user_should_be_able_to_see_the_error_message() {

        Assert.assertEquals("You do not have permission to perform this action.", vehicleOdometerPageMohamed.errorMessage.getText());
        Assert.assertTrue(vehicleOdometerPageMohamed.errorMessage.isDisplayed());
    }

    @When("the driver hover on fleet menu")
    public void the_driver_hover_on_fleet_menu() {
        Actions actions = new Actions(Driver.getDriver());
        BrowserUtils.sleep(2);
        actions.moveToElement(vehicleOdometerPageMohamed.driverFleetMenu).perform();
    }

    @When("the driver clicks on Vehicle Odometer module")
    public void the_driver_clicks_on_vehicle_odometer_module() {
        BrowserUtils.sleep(2);
        vehicleOdometerPageMohamed.driverVehicleOdometerButton.click();
    }

    @Then("the driver should see the default page as {string} and view per page is {string} by default")
    public void the_driver_should_see_the_default_page_as_and_view_per_page_is_by_default(String string, String string2) {

        Assert.assertEquals(string, vehicleOdometerPageMohamed.defaultPage.getAttribute("value"));

        Assert.assertEquals(string2,vehicleOdometerPageMohamed.defaultViewPage.getText());
    }


}
