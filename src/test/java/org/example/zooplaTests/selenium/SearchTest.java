package org.example.zooplaTests.selenium;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SearchTest {

    @Before
    public void setUp() {
        String driverpath = "src/test/resources/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverpath);
    }

    @org.junit.Test
    public void simpleSearch() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.zoopla.co.uk/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.switchTo().frame("gdpr-consent-notice");
        driver.findElement(By.id("save")).click();
        driver.switchTo().parentFrame();
        driver.quit();

    }



}
