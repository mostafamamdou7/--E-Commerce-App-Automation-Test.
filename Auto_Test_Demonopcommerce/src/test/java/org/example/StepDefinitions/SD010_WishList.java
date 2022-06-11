package org.example.StepDefinitions;

import org.example.Pages.P011_WishListPage;
import org.example.Pages.P03_HomePage;
import org.example.Pages.P06_ItemPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class SD010_WishList {
    P03_HomePage homePage=new P03_HomePage(Hooks.driver);
    P06_ItemPage itemPage=new P06_ItemPage(Hooks.driver);
    P011_WishListPage wishListPage=new P011_WishListPage(Hooks.driver);
    @Given("user press wishlist button on specific item")
    public void pressWishlistButton() throws InterruptedException {
        homePage.ClickWishlistButton();
        itemPage.clickOnWishlistButton();
    }
    @When("user click on wishlist link")
    public void pressWishlistLink() throws InterruptedException {
        itemPage.ClickWishlistlink();
    }
    @And("user count numbers of quantities")
    public void theCountOFQuantities() throws InterruptedException {
        wishListPage.findQuantities();
    }
}
