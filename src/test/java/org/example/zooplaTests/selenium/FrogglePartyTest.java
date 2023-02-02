package org.example.zooplaTests.selenium;

import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrogglePartyTest {

    @Before
    public void setUp() {
        String driverPath = "src/test/resources/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
    }

    @org.junit.Test
    public void froggleBrowseTest() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.froggleparties.com/");
        String title = "Froggle Parties | Children’s Party Entertainers | Kids Parties";
        Assert.assertEquals(title,driver.getTitle());

        driver.quit();

    }

}
