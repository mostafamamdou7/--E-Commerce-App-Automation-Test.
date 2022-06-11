package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P05_ShoppingPage {
    WebDriver driver;
    private By SelectedItem1=By.xpath("(//a[@class=\"product-name\"])[1]");
    private By SelectedItem2=By.xpath("(//a[@class=\"product-name\"])[2]");
    private By termsCheckBox=By.id("termsofservice");
    private By CheckoutButton=By.id("checkout");
    private By CheckoutButton1=By.id("checkout");

    public P05_ShoppingPage(WebDriver driver) {
        this.driver = driver;
    }
    public String findItemsNum3Choosen(){
        return driver.findElement(SelectedItem1).getText();
    }
    public String findItemsNum2Choosen(){
        return driver.findElement(SelectedItem2).getText();
    }
    public void clickCheckoutButton() throws InterruptedException {
        driver.findElement(CheckoutButton1).click();
        Thread.sleep(2000);
    }
    public void clickCheckBox() throws InterruptedException {
        driver.findElement(termsCheckBox).click();
        Thread.sleep(1000);
    }
}
