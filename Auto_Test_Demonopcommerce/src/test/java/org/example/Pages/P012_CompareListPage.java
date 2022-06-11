package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P012_CompareListPage {
    static WebDriver driver;
    public P012_CompareListPage(WebDriver driver) {
        this.driver = driver;
    }
    private static By item1NumName= By.xpath("/html/body/div[6]/div[3]/div/div[2]/" +
            "div/div[2]/div/table/tbody/tr[3]/td[3]/a");
    public static String item1_Num_Name(){
        return driver.findElement(item1NumName).getText();
    }
}
