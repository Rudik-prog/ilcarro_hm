package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Map;

public class AddCarPage {
    WebDriver driver;

    public AddCarPage(WebDriver driver) {
        this.driver = driver;
    }

    public void fillCarForm(Map<String, String> data) {
        driver.findElement(By.id("country")).sendKeys(data.get("country"));
        driver.findElement(By.id("address")).sendKeys(data.get("address"));
        driver.findElement(By.id("distance")).sendKeys(data.get("distance"));
        driver.findElement(By.id("serialNumber")).sendKeys(data.get("serial number"));
        driver.findElement(By.id("model")).sendKeys(data.get("model"));
        driver.findElement(By.id("year")).sendKeys(data.get("year"));
        driver.findElement(By.id("fuel")).sendKeys(data.get("fuel"));


        driver.findElement(By.id("class")).sendKeys(data.get("class"));
        driver.findElement(By.id("price")).sendKeys(data.get("price"));
        driver.findElement(By.id("about")).sendKeys(data.get("about"));
    }

    public void uploadPhoto(String absoluteFilePath) {
        driver.findElement(By.id("photos")).sendKeys(absoluteFilePath);
    }

    public void submitCarForm() {
        driver.findElement(By.cssSelector("button[type='submit']")).click();
    }


}
