package com.danica_intabella.step_definitions;


import com.danica_intabella.pages.US01_Module_Page;
import com.google.common.collect.Table;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class US01_Modules_Step_def {

    US01_Module_Page us01ModulePage=  new US01_Module_Page();

    @Then("user should view eight following modules")
    public void user_should_view_eight_following_modules(List<String> ExpectedModules) {


        List<String> actualModules=  new ArrayList<>();

        for (WebElement eacTopModule : us01ModulePage.AllTopModules) {

            actualModules.add(eacTopModule.getText());

        }

        Assert.assertEquals(ExpectedModules,actualModules);



        }


    @Then("user should view four following modules")
    public void userShouldViewFourFollowingModules(List<String> expectedModules) {

        List<String> actualModules=  new ArrayList<>();

        for (WebElement eacTopModule : us01ModulePage.AllTopModules) {

            actualModules.add(eacTopModule.getText());

        }

        Assert.assertEquals(expectedModules,actualModules);

    }
}










