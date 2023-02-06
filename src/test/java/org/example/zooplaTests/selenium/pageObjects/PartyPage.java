package org.example.zooplaTests.selenium.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PartyPage {

    private WebDriver driver;

    public PartyPage(WebDriver driver) {
        this.driver = driver;
    }

    public void dismissBanner() {
        driver.findElement(By.id("uk_site")).click();
    }

    public void goToEntertainerParty() {
        driver.findElement(By.xpath("//a[@href='https://www.froggleparties.com/parties/entertainers-magicians']")).click();
    }


}
