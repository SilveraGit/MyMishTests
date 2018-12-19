import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

/**
 * Created by Inka on 16-Dec-18.
 */
public class HomePage {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://mish.sheygam.com/#/wellcome");
        driver.manage().window().maximize();
        Thread.sleep(10000);
        List<WebElement> topLinksList = driver.findElements(By.cssSelector(".mat-button-wrapper .mat-button-wrapper"));
        System.out.println("Login:" + topLinksList.get(0).getText());
        System.out.println("Create Account:" + topLinksList.get(1).getText());
        WebElement goToEventsButton = driver.findElement(
                By.className("mat-stroked-button"));
        System.out.println("Text of button: " + goToEventsButton.getText());
        Thread.sleep(5000);
        driver.quit();
    }
}
