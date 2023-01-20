package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.DashboardPage;
import pages.LoginPage;
import utils.DriverManager;

public class DashboardPageSteps
{
    //Objects
    DriverManager manager = new DriverManager();
    WebDriver driver = manager.initializeDriver();
    LoginPage loginPage = new LoginPage(driver);
    DashboardPage dashboardPage = new DashboardPage(driver);

    @Given("user is present on login page {string}")
    public void user_is_present_on_login_page(String loginUrl) {

        manager.openPage(loginUrl);

    }
    @And("Logs in {string} and password {string} and routes to Dashboard page")
    public void logs_in_and_password_and_routes_to_dashboard_page(String username, String password) {

        dashboardPage = loginPage.loginUser(username, password);
    }

    @When("user click on logout button")
    public void user_click_on_logout_button()
    {
        dashboardPage.logoutUser();
    }

    @Then("user is logged-out")
    public void user_is_logged_out()
    {
        String url = manager.getCurrentPageUrl();
        Assert.assertEquals(url, "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        manager.tearDown();
    }
}
