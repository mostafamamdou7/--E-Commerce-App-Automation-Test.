package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

public class P010_ApparelShoesPage {
    WebDriver driver;
    private By GreyCheckBox=By.id("attribute-option-14");
    private By RedCheckBox=By.id("attribute-option-15");
    private By BlueCheckBox=By.id("attribute-option-16");
    private By itemColor=By.cssSelector("h2[class=\"product-title\"] a");
    private By tagAwesome=By.cssSelector("div[class=\"tags\"] a[href=\"/awesome\"]");
    public P010_ApparelShoesPage(WebDriver driver) {
        this.driver = driver;}
    public void select_Gray_Color() throws InterruptedException {
        SoftAssert softAssert=new SoftAssert();
        driver.findElement(GreyCheckBox).click();
        softAssert.assertEquals(true,driver.findElement(GreyCheckBox).isSelected());
        Thread.sleep(2000);
        driver.findElement(GreyCheckBox).click();
        softAssert.assertEquals(false,driver.findElement(GreyCheckBox).isSelected());
        Thread.sleep(1000);
        driver.findElement(BlueCheckBox).click();
        softAssert.assertEquals(true,driver.findElement(BlueCheckBox).isSelected());
        Thread.sleep(2000);
        driver.findElement(BlueCheckBox).click();
        softAssert.assertEquals(false,driver.findElement(BlueCheckBox).isSelected());
        Thread.sleep(1000);
        driver.findElement(RedCheckBox).click();
        softAssert.assertEquals(true,driver.findElement(RedCheckBox).isSelected());
        Thread.sleep(2000);
        softAssert.assertAll();
    }
    public void selectTag(){
        driver.findElement(tagAwesome).click();
    }
    public void itemsColor() throws InterruptedException {
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(true,driver.findElement(itemColor).getText().contains("Running "));
        System.out.println(driver.findElement(itemColor).getText());
        Thread.sleep(2000);
        softAssert.assertAll();
    }
}
