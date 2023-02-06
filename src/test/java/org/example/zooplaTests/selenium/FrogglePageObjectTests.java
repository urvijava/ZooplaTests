package org.example.zooplaTests.selenium;

import org.example.zooplaTests.selenium.pageObjects.EntertainerMagicianPage;
import org.example.zooplaTests.selenium.pageObjects.HomePage;
import org.example.zooplaTests.selenium.pageObjects.PartyPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrogglePageObjectTests {
    private WebDriver driver;

    @Before
    public void setUp() {
        String driverPath = "src/test/resources/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
    }

    @After
    public void cleanUp() {
        driver.quit();
    }

    @org.junit.Test
    public void froggleBrowseTest() {
        HomePage homePage = new HomePage(driver);
        homePage.navigate();
        String actualTitle = homePage.getTitle();
        String expectedTitle = "Froggle Parties | Children’s Party Entertainers | Kids Parties";
        Assert.assertEquals(expectedTitle,actualTitle);
    }

    @org.junit.Test
    public void frogglePartyTabTest() {
        HomePage homePage = new HomePage(driver);
        homePage.navigate();
        homePage.goToPartyPage();
        PartyPage partyPage = new PartyPage(driver);
        partyPage.dismissBanner();
        partyPage.goToEntertainerParty();
        EntertainerMagicianPage entertainerMagicianPage = new EntertainerMagicianPage(driver);
        String actualTitle = entertainerMagicianPage.getContentTitle();
        String expectedTitle = "Children's party entertainers and magicians";
        Assert.assertEquals(expectedTitle,actualTitle);
    }
}
