package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P06_ItemPage {
    WebDriver driver;
    public P06_ItemPage(WebDriver driver) {
        this.driver = driver;
    }
    private By addToWishlistButton=By.id("add-to-wishlist-button-4");
    private By wishListLink=By.cssSelector("a[class=\"ico-wishlist\"]");
    private By addShoppingCart=By.id("add-to-cart-button-4");
    private By shoppingCartLink=By.cssSelector("a[class=\"ico-cart\"]");

    public void clickOnWishlistButton() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(addToWishlistButton).click();
        Thread.sleep(2000);
    }
    public void ClickWishlistlink() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(wishListLink).click();
        Thread.sleep(3000);
    }
    public void click_on_ShoppingCart_Button() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(addShoppingCart).click();
        Thread.sleep(3000);
    }
    public void clickShoppingCartLink() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(shoppingCartLink).click();
        Thread.sleep(3000);
    }
}
