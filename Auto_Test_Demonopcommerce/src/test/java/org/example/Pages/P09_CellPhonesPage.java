package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P09_CellPhonesPage {
    WebDriver driver;

    public P09_CellPhonesPage(WebDriver driver) {
        this.driver = driver;
    }

    public static String item1Number;
    private By clickCompareButton1 = By.xpath("(//button[@class=\"button-2 add-to-compare-list-button\"])[1]");
    private By clickCompareButton2 = By.xpath("(//button[@class=\"button-2 add-to-compare-list-button\"])[2]");
    private By goToCOMparelistLink = By.xpath("/html/body/div[6]/div[4]/div[1]/div[2]/ul/li[5]/a");
    private By itemNum1Name = By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/" +
            "div[2]/div/div/div[1]/div/div[2]/h2/a");

    public void ClickCompareButton() throws InterruptedException {
        item1Number = driver.findElement(itemNum1Name).getText();
        driver.findElement(clickCompareButton1).click();
        Thread.sleep(2000);
        driver.findElement(clickCompareButton2).click();
        Thread.sleep(2000);
    }

    public void goToCompareList() throws InterruptedException {
        driver.findElement(goToCOMparelistLink).click();
        Thread.sleep(3000);

    }
}