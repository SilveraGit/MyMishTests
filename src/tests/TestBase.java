package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;

/**
 * Created by Inka on 16-Dec-18.
 */
public class TestBase {
    WebDriver driver = new ChromeDriver();

    @BeforeMethod
    public void initWebDriver() {
        driver.get("https://mish.sheygam.com/#/wellcome");
        driver.manage().window().maximize();
    }

    @AfterSuite
    public void tearDown() {
        driver.quit();
    }


    public void waitUntilElementIsLoaded(WebDriver driver,
                                         By locator, int time) {
        try {
            new WebDriverWait(driver, time).until(ExpectedConditions
                    .presenceOfElementLocated(locator));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}