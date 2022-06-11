package org.example.StepDefinitions;

import org.example.Pages.P02_LoginPage;
import org.example.Pages.P07_RecoverPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;

public class SD03_ResetPassword {
    P02_LoginPage loginPage=new P02_LoginPage(Hooks.driver);
    P07_RecoverPage recoverPage=new P07_RecoverPage(Hooks.driver);
    @When("user click on forget password link")
    public void click_forget_password(){
        loginPage.click_forgetPassword_link();
    }
    @And("user fills Email correctly")
    public void enter_email(){
        recoverPage.enter_email();
    }
    @Then("user click on recover button")
    public void clickRecoverButton(){
        recoverPage.click_recover_button();
    }
    @And("user will see successfully message Email with instructions has been sent to you")
    public void successfullyMessage(){
        String acutalResult="Email with instructions has been sent to you.";
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(true,recoverPage.SuccessfullyMessage().contains(acutalResult));
        softAssert.assertAll();
    }
}
