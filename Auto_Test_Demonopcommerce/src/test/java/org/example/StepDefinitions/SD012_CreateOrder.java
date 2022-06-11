package org.example.StepDefinitions;

import org.example.Pages.P013_ConfirmOrder;
import org.example.Pages.P05_ShoppingPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SD012_CreateOrder {
    P05_ShoppingPage shoppingPage=new P05_ShoppingPage(Hooks.driver);
    P013_ConfirmOrder confirmOrder=new P013_ConfirmOrder(Hooks.driver);
    @When("user click on Terms and condition checkbox")
    public void psfknsk() throws InterruptedException {
        shoppingPage.clickCheckBox();
    }

    @And("user click on checkout button")
    public void ajdk() throws InterruptedException {
        shoppingPage.clickCheckoutButton();


    }
    @Then("user complete order confirmation process")
    public void confirm_order() throws InterruptedException {
        confirmOrder.confirmationProcess();
    }
    @And("user finally complete order and see \"Your order has been successfully processed!\"")
    public void successfulMessage(){
        confirmOrder.ConfirmMessage();
    }

}
