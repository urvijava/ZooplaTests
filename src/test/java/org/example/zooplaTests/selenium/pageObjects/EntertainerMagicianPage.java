package org.example.zooplaTests.selenium.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EntertainerMagicianPage {

    private WebDriver driver;

    public EntertainerMagicianPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getContentTitle() {
        return driver.findElement(By.xpath("//div[@data-id='de24b5e']")).getText();
    }
}
