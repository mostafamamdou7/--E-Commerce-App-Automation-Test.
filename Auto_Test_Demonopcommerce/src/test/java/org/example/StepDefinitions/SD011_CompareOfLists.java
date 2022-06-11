package org.example.StepDefinitions;

import org.example.Pages.P09_CellPhonesPage;
import org.example.Pages.P012_CompareListPage;
import org.example.Pages.P03_HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;


public class SD011_CompareOfLists {
    P03_HomePage homePage=new P03_HomePage(Hooks.driver);
    P09_CellPhonesPage cellPhonesPage=new P09_CellPhonesPage(Hooks.driver);
    P012_CompareListPage compareListPage=new P012_CompareListPage(Hooks.driver);
    @Given("user could add items to compare list")
    public void add_items_compareList() throws InterruptedException {
        homePage.compareList_button();
        cellPhonesPage.ClickCompareButton();
    }
    @When("user go to compare list")
    public void go_to_comparelist() throws InterruptedException {
        cellPhonesPage.goToCompareList();
    }
    @Then("user found the chosen items in compare list")
    public void founditems(){
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(P09_CellPhonesPage.item1Number.contains(P012_CompareListPage.item1_Num_Name()));
        System.out.println(P09_CellPhonesPage.item1Number);
        System.out.println(P012_CompareListPage.item1_Num_Name());
        softAssert.assertAll();
    }
}
