package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {




    public class LoginPage {
        WebDriver driver;

        public LoginPage(WebDriver driver) {
            this.driver = driver;
        }

        public void enterEmail(String email) {
            driver.findElement(By.id("email")).sendKeys(email);
        }

        public void enterPassword(String password) {
            driver.findElement(By.id("password")).sendKeys(password);
        }

        public void clickLoginButton() {
            driver.findElement(By.cssSelector("button[type='submit']")).click();
        }
    }
}
