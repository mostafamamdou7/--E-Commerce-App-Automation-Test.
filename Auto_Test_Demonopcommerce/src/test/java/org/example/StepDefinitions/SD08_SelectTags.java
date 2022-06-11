package org.example.StepDefinitions;

import org.example.Pages.P010_ApparelShoesPage;
import org.example.Pages.P08_TagPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SD08_SelectTags {
    P08_TagPage tagPage=new P08_TagPage(Hooks.driver);
    P010_ApparelShoesPage apparelShoesPage=new P010_ApparelShoesPage(Hooks.driver);
    @When("user could select item with Tag")
    public void selectTag(){
        apparelShoesPage.selectTag();
    }
    @Then("user navigate to Tag page")
    public void navigateToTagPage() throws InterruptedException {
        tagPage.PageTitle();
    }

}
