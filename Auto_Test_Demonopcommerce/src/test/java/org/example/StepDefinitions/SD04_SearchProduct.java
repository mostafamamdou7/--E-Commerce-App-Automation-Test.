package org.example.StepDefinitions;

import org.example.Pages.P03_HomePage;
import org.example.Pages.P04_SearchPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SD04_SearchProduct {
    P04_SearchPage searchPage=new P04_SearchPage(Hooks.driver);
    P03_HomePage homePage=new P03_HomePage(Hooks.driver);
    @When("user press on search field")
    public void clickSearchField(){
        homePage.click_Search_field();
    }
    @And("^user search with Item name\"(.*?)\"")
    public void searchWithItemName(String itemName){

        homePage.Enter_item_Name(itemName);
    }
    @And("user press on search button")
    public void clickSearchButton(){
        homePage.clickSearchButton();
    }
    @Then("user could find relative result")
    public void find_results(){
        searchPage.results();



    }
}
