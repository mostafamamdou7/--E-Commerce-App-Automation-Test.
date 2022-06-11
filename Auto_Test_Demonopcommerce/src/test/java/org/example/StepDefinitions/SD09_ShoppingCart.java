package org.example.StepDefinitions;

import org.example.Pages.P03_HomePage;
import org.example.Pages.P05_ShoppingPage;
import org.example.Pages.P06_ItemPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;

public class SD09_ShoppingCart {
    P03_HomePage homePage=new P03_HomePage(Hooks.driver);
    P06_ItemPage itemPage=new P06_ItemPage(Hooks.driver);
    P05_ShoppingPage shoppingPage=new P05_ShoppingPage(Hooks.driver);
    @Given("user could add items to shoppingCart")
    public void add_items_shoppingCart() throws InterruptedException {
        homePage.ClickAddShoppingButtonButton();

        itemPage.click_on_ShoppingCart_Button();
    }
    @When("user go to Shopping cart")
    public void go_to_shoppingCart() throws InterruptedException {
        itemPage.clickShoppingCartLink();
    }
    @Then("user found the chosen items in shoppingCart")
    public void count_choosen_items() throws InterruptedException {
        SoftAssert softAssert=new SoftAssert();
        System.out.println(P03_HomePage.item1Number);
        System.out.println(P03_HomePage.item2Number);
        softAssert.assertTrue(P03_HomePage.item1Number.contains(shoppingPage.findItemsNum3Choosen()));
        softAssert.assertTrue(P03_HomePage.item2Number.contains(shoppingPage.findItemsNum2Choosen()));
        softAssert.assertAll();
        Thread.sleep(3000);
    }
}
