package stepDefinitions;



import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.loginPage;

import java.util.Map;

public class AddCarSteps {

    WebDriver driver = DriverFactory.getDriver();
    pages.loginPage.LoginPage loginPage = new LoginPage(driver);
    HomePage homePage = new HomePage(driver);
    AddCarPage addCarPage = new AddCarPage(driver);

    @Given("User is on the login page")
    public void userIsOnLoginPage() {
        driver.get("https://ilcarro.web.app");
        homePage.clickLoginLink();
    }

    @When("User enters valid email {string} and password {string}")
    public void userEntersCredentials(String email, String password) {
        loginPage.enterEmail(email);
        loginPage.enterPassword(password);
    }

    @And("User clicks on the Login button")
    public void userClicksLogin() {
        loginPage.clickLoginButton();
    }

    @Then("User should be redirected to the home page")
    public void verifyUserRedirected() {
        homePage.verifyUserLoggedIn();
    }

    @When("User navigates to {string} page")
    public void userNavigatesToAddCarPage(String sectionName) {
        homePage.navigateToAddCarPage();
    }

    @And("User fills in the car form with valid data")
    public void userFillsCarForm(Map<String, String> carData) {
        addCarPage.fillCarForm(carData);
    }

    @And("User uploads a car photo {string}")
    public void userUploadsCarPhoto(String filename) {
        String filePath = System.getProperty("user.dir") + "/src/test/resources/images/" + filename;
        addCarPage.uploadPhoto(filePath);
    }

    @And("User clicks on the Submit button")
    public void userClicksSubmit() {
        addCarPage.submitCarForm();
    }

    @Then("Success message should be displayed {string}")
    public void successMessageDisplayed(String expectedMessage) {
        addCarPage.verifySuccessMessage(expectedMessage);
    }
}
