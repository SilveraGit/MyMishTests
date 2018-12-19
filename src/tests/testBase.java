package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;


public class testBase {
    WebDriver driver = new ChromeDriver();
    @BeforeMethod                       //Start before every method
    public void initWebDriver(){

        driver.get("https://mish.sheygam.com/#/wellcome");
        driver.manage().window().maximize();
    }
    @AfterSuite
    public void tearDown() {
        driver.quit();
    }
}
