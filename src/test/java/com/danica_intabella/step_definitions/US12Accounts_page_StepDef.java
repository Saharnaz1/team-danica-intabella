package com.danica_intabella.step_definitions;

import com.danica_intabella.pages.US12_accounts_page;
import com.danica_intabella.utilities.BrowserUtils;
import com.danica_intabella.utilities.ConfigurationReader;
import com.danica_intabella.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class US12Accounts_page_StepDef {

    US12_accounts_page US12AccountsPage = new US12_accounts_page();


    @When("the user hover over customer")
    public void theUserHoverOverCustomer() {

        Actions actions = new Actions(Driver.getDriver());
        BrowserUtils.sleep(5);
         WebElement element = Driver.getDriver().findElement(By.xpath("(//a[@class='unclickable'])[3]"));
         BrowserUtils.sleep(2);
actions.moveToElement(element).build().perform();

    }

    @And("the user clicks on accounts")
    public void theUserClicksOnAccounts() {
            US12AccountsPage.accounts.click();
            BrowserUtils.sleep(3);
    }

    @Then("the user should see seven items on the account page")
    public void theUserShouldSeeSevenItemsOnTheAccountPage(List<String> expectedoption) {

         List<String> actualoption = BrowserUtils.getElementsText(US12AccountsPage.itemsList);
         actualoption.removeIf(k-> k.isEmpty()|| Collections.frequency(actualoption,k)>1);
    Assert.assertEquals(expectedoption,actualoption);
        System.out.println("expectedoption = " + expectedoption);
        System.out.println("actualoption = " + actualoption);








        /*
        actions.moveToElement(US12AccountsPage.AccountName);
        Assert.assertTrue(US12AccountsPage.AccountName.isDisplayed());

        BrowserUtils.sleep(3);
        actions.moveToElement(US12AccountsPage.ContactName);
        Assert.assertTrue(US12AccountsPage.ContactName.isDisplayed());

        BrowserUtils.sleep(3);
        actions.moveToElement(US12AccountsPage.ContactEmail);
        Assert.assertTrue(US12AccountsPage.ContactEmail.isDisplayed());

        BrowserUtils.sleep(3);
        actions.moveToElement(US12AccountsPage.ContactPhone);
        Assert.assertTrue(US12AccountsPage.ContactPhone.isDisplayed());

        BrowserUtils.sleep(3);
        actions.moveToElement(US12AccountsPage.Owner);
        Assert.assertTrue(US12AccountsPage.Owner.isDisplayed());

        BrowserUtils.sleep(3);
        actions.moveToElement(US12AccountsPage.UpdatedAt);
        Assert.assertTrue(US12AccountsPage.UpdatedAt.isDisplayed());

        BrowserUtils.sleep(3);
        actions.moveToElement(US12AccountsPage.CreatedAt);
        Assert.assertTrue(US12AccountsPage.CreatedAt.isDisplayed());



         */


    }


}
