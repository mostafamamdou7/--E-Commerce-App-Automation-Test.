package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

public class P013_ConfirmOrder {
    WebDriver driver;
    private By country= By.xpath("//*[@id=\"BillingNewAddress_CountryId\"]/option[66]");
    private By city=By.id("BillingNewAddress_City");
    private By address=By.id("BillingNewAddress_Address1");
    private By postalCode=By.id("BillingNewAddress_ZipPostalCode");
    private By phoneNumber=By.id("BillingNewAddress_PhoneNumber");
    private By continueButton1=By.xpath("//*[@id=\"billing-buttons-container\"]/button[4]");
    private By continueButton2=By.xpath("//*[@id=\"shipping-method-buttons-container\"]/button");
    private By ContinueButton3=By.xpath("//*[@id=\"payment-method-buttons-container\"]/button");
    private By ContinueButton4=By.xpath("//*[@id=\"payment-info-buttons-container\"]/button");
    private By ConfirmButton=By.xpath("//*[@id=\"confirm-order-buttons-container\"]/button");
    private By ConfirmationMessaga=By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div/div[1]/strong");
    public P013_ConfirmOrder(WebDriver driver) {
        this.driver = driver;
    }
    public void confirmationProcess() throws InterruptedException {
        driver.findElement(country).click();
        Thread.sleep(1000);
        driver.findElement(city).sendKeys("test");
        Thread.sleep(1000);
        driver.findElement(address).sendKeys("test");
        Thread.sleep(1000);
        driver.findElement(postalCode).sendKeys("0000");
        Thread.sleep(1000);
        driver.findElement(phoneNumber).sendKeys("0000");
        Thread.sleep(1000);
        driver.findElement(continueButton1).click();
        Thread.sleep(2000);
        driver.findElement(continueButton2).click();
        Thread.sleep(2000);
        driver.findElement(ContinueButton3).click();
        Thread.sleep(2000);
        driver.findElement(ContinueButton4).click();
        Thread.sleep(2000);
        driver.findElement(ConfirmButton).click();
        Thread.sleep(2000);

    }
    public void ConfirmMessage(){
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(true,driver.findElement(ConfirmationMessaga).getText().
                contains("Your order has been successfully processed!"));
        softAssert.assertAll();
    }
}
