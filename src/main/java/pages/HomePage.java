package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickLoginLink() {
        driver.findElement(By.xpath("//a[text()='Log in']")).click();
    }

    public void verifyUserLoggedIn() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[contains(text(),'Find your car')]")));
    }

    public void navigateToAddCarPage() {
        driver.findElement(By.xpath("//a[contains(text(),'Let')]")).click();
    }
}
