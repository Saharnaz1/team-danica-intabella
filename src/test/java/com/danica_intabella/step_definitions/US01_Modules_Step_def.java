package com.danica_intabella.step_definitions;


import com.danica_intabella.pages.US01_Module_Page;
import com.danica_intabella.utilities.BrowserUtils;
import com.google.common.collect.Table;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class US01_Modules_Step_def {

    US01_Module_Page us01ModulePage=  new US01_Module_Page();

    @Then("user should view eight following modules")
    public void user_should_view_eight_following_modules(List<String> expectedModules) {


      //  List<String> actualModules=  new ArrayList<>();

       // for (WebElement eacTopModule : us01ModulePage.AllTopModules) {

       //     actualModules.add(eacTopModule.getText());

       // }
        BrowserUtils.sleep(3);
        List<String> actualModules = BrowserUtils.getElementsText(us01ModulePage.AllTopModules);
        System.out.println("actualModules = " + actualModules);
        System.out.println("expectedModules = " + expectedModules);
        Assert.assertEquals(expectedModules,actualModules);



        }


    @Then("user should view four following modules")
    public void userShouldViewFourFollowingModules(List<String> expectedModules) {

     //   List<String> actualModules=  new ArrayList<>();

     //   for (WebElement eacTopModule : us01ModulePage.AllTopModules) {

       //     actualModules.add(eacTopModule.getText());

    //    }

    //    Assert.assertEquals(expectedModules,actualModules);
        BrowserUtils.sleep(3);
        List<String> actuelModules = BrowserUtils.getElementsText(us01ModulePage.AllTopModules);
        System.out.println("actuelModules = " + actuelModules);
        System.out.println("expectedModules = " + expectedModules);

        Assert.assertEquals(expectedModules,actuelModules);
    }
}










