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
 * Created by Inka on 16-Dec-18.
 */
public class HomePagesTests extends TestBase{
    @Test
    public void openHomePage() throws InterruptedException {

        waitUntilElementIsLoaded(driver,
                By.xpath("//span[contains(text(),'Login')]"),
                45);

        WebElement goToEventsButton = driver.findElement(
                By.className("mat-stroked-button"));
        Assert.assertTrue(goToEventsButton.getText()
                .equals("Go to Event list"));
    }
    @Test
    public void goToEventsTest() throws InterruptedException {
        waitUntilElementIsLoaded(driver,
                By.xpath("//span[contains(text(),'Login')]"),
                45);

        WebElement goToEventsButton = driver.findElement(
                By.className("mat-stroked-button"));

        goToEventsButton.click();
        waitUntilElementIsLoaded(driver,
                By.xpath("//span[contains(text(),'Filtes')])"),
                20);
        WebElement titlePage = driver.findElement(By
                .xpath("//h1[@class='gorisontal-center']"));
        Assert.assertTrue(titlePage.getText().equals("Find event"));
    }

}
