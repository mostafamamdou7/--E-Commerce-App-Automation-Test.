package org.example.StepDefinitions;

import org.example.Pages.P01_RegistrationPage;
import org.example.Pages.P03_HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;

public class SD01_registration {
    P01_RegistrationPage registrationPage=new P01_RegistrationPage(Hooks.driver);;
    P03_HomePage homePage=new P03_HomePage(Hooks.driver);
    public static String email="testing@example.com ";
    String firstName ="username";
    String lastName ="test";
    public static String password="P@ssw0rd";
    public static String company="Automation Company";


    @Given("user navigate to home page")
    public void navigate_home() {
        homePage.navigateToHomePage();
    }
    @And("user press registration link")
    public void clickRegis_link(){
        homePage.click_regis_link();
    }
    @When("user fills Personal Details with valid data and password")
    public void personal_info(){

        registrationPage.enter_valid_date(email,password, firstName, lastName,company);

    }
    @And("user press on register button")
    public void press_register_button(){
        registrationPage.click_button();
    }
    @Then("user register successfully")
    public void register_successfully()  {
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(registrationPage.successfullyMessage());
        softAssert.assertAll();
    }
}
