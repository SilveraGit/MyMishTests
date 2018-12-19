package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created by Inka on 17-Dec-18.
 */
public class HomePageTestsWebinar extends TestBase {
    @Test
    public void openHomePageTest() throws InterruptedException {

        waitUntilElementIsLoaded(driver, By.className("mat-stroked-button"),20);
        waitUntilElementIsLoaded(driver, By.xpath("//span[contains(text(),'Create Account')]"),20);
        List<WebElement> topLinksList = driver.findElements(By.cssSelector(".mat-button-wrapper .mat-button-wrapper"));
        WebElement createAccountButton = topLinksList.get(1);
        WebElement goToEventsButton = driver.findElement(
            By.className("mat-stroked-button"));
        System.out.println("Text of button: " + goToEventsButton.getText());
        Assert.assertTrue(createAccountButton.getText().equals("Create Account"));
    }

    @Test
    public void goToEventButtonTest() throws InterruptedException {

        waitUntilElementIsLoaded(driver, By.xpath("//span[contains(text(),'Create Account')]"),30);
        WebElement goToEventsButton = driver.findElement(
                By.className("mat-stroked-button"));
        goToEventsButton.click();
        waitUntilElementIsLoaded(driver, By.xpath("//button[@class='mat-raised-button']"),20);
        List<WebElement> topLinksList = driver.findElements(By.cssSelector(".mat-button-wrapper .mat-button-wrapper"));
        WebElement loginButton = topLinksList.get(0);
        WebElement titleEventsPage = driver.findElement(By.xpath("//h1[@class='gorisontal-center']"));
        Assert.assertTrue(titleEventsPage.getText().equals("Find event"));
        Assert.assertTrue(loginButton.getText().equals("Login"));
    }



}
