package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P01_RegistrationPage {
    WebDriver driver;
    private By Email= By.id("Email");
    private By Password =By.id("Password");
    private By FirstName=By.id("FirstName");
    private By LastName=By.id("LastName");
    private By ConfirmPassword=By.id("ConfirmPassword");
    private By registration_button=By.id("register-button");
    private By successfully_message=By.className("result");
    private By Company=By.cssSelector("input[id=\"Company\"]");
    public P01_RegistrationPage(WebDriver driver) {
        this.driver=driver;
    }
    public boolean successfullyMessage(){
        return driver.findElement(successfully_message).isDisplayed();
    }
    public void enter_valid_date(String email,String password,String firstName,String SecondName,String company){
        setText(Email,email);
        setText(Password,password);
        setText(FirstName,firstName);
        setText(LastName,SecondName);
        setText(ConfirmPassword,password);
        setText(Company, company);

    }
    public void setText(By element,String value){
        driver.findElement(element).sendKeys(value);
    }
    public void click_button(){
        driver.findElement(registration_button).click();
    }
}
