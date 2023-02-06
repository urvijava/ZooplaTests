package org.example.zooplaTests.selenium.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void navigate() {
        driver.get("https://www.froggleparties.com/");
    }

    public String getTitle() {
       return driver.getTitle();

    }

    public void goToPartyPage() {
        driver.findElement(By.id("menu-item-2321")).click();
    }




}
