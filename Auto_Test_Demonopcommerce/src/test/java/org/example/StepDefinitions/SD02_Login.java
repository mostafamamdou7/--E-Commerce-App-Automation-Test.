package org.example.StepDefinitions;

import org.example.Pages.P02_LoginPage;
import org.example.Pages.P03_HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

public class SD02_Login {  P03_HomePage homePage=new P03_HomePage(Hooks.driver);
    P02_LoginPage loginPage=new P02_LoginPage(Hooks.driver);
    @And("user press login link")
    public void click_login_link(){
        homePage.click_login_link();
    }
    @When("user enter valid Email and password")
    public void enter_valid_data(){
        loginPage.enter_valid_Email_Password(SD01_registration.email,
                SD01_registration.password);
    }
    @And("user click on login button")
    public void click_button(){
        loginPage.click_login_button();
    }

    @Then("user could login successfully and go to home page")
    public void userCouldLoginSuccessfullyAndGoToHomePage() {
        SoftAssert softAssert=new SoftAssert();

        softAssert.assertEquals(Hooks.driver.findElement
                        (By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[2]/div[1]/h2"))
                .getText(),"Welcome to our store");
        softAssert.assertAll();
    }
}
