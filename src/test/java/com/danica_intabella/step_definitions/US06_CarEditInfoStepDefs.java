package com.danica_intabella.step_definitions;

import com.danica_intabella.pages.VehiclesPage_Sahar;
import com.danica_intabella.utilities.BrowserUtils;
import com.danica_intabella.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;

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
        BrowserUtils.sleep(3);
        actions.moveToElement(vehiclesPageSahar.threeDotsLocator).perform();
      //  BrowserUtils.waitForVisibility(vehiclesPageSahar.threeDotsLocator,10);
      //  vehiclesPageSahar.threeDotsLocator.click();
      //  BrowserUtils.sleep(4);

    }

    @Then("the user sees view, edit, delete buttons")
    public void the_user_sees_view_edit_delete_buttons() {
        BrowserUtils.getElementsText(vehiclesPageSahar.hoverOptions);



    }


}
