package org.example.StepDefinitions;

import org.example.Pages.P010_ApparelShoesPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SD07_ColorsFilter {
    P010_ApparelShoesPage apparelShoesPage=new P010_ApparelShoesPage(Hooks.driver);
    @When("user choose the filteration color")
    public void selectColor() throws InterruptedException {
        apparelShoesPage.select_Gray_Color();

    }
    @Then("user found all items in the choosen color")
    public void item_Color() throws InterruptedException {
        apparelShoesPage.itemsColor();
    }
}
