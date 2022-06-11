package org.example.StepDefinitions;

import org.example.Pages.P03_HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;

public class SD05_SwitchCurrencies {
    P03_HomePage homePage=new P03_HomePage(Hooks.driver);
    @When("user click on the currency list")
    public void clickCurrencyList() throws InterruptedException {
        homePage.ClickCurrencyList();
        Thread.sleep(3000);
    }
    @And("user change currency to Euro")
    public void changeToEuro() throws InterruptedException {
        homePage.changeCurrencyTo_Euro();
        Thread.sleep(3000);
    }
    @Then("user found all items prices in Euro")
    public void itemsPricesInEuro() throws InterruptedException {
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(true,homePage.itemsInEuro().contains("€"));
        Thread.sleep(3000);
        System.out.println(homePage.itemsInEuro());
    }
    @And("user change currency to us-dollar")
    public void changeToUS_Dollar() throws InterruptedException {
        homePage.changeCurrencyTo_Dollar();
        Thread.sleep(3000);
    }
    @Then("user found all items prices in us-dollar")
    public void itemsPricesInDollar() throws InterruptedException {
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(true,homePage.itemsInDollar().contains("$"));
        Thread.sleep(3000);
        System.out.println(homePage.itemsInEuro());
        softAssert.assertAll();
    }
}
