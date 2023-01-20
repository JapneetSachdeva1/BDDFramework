package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.DashboardPage;
import pages.LoginPage;
import utils.DriverManager;


public class OrangeHRMloginSteps
{
    //Objects
    DriverManager manager = new DriverManager();
    WebDriver driver = manager.initializeDriver();
    LoginPage loginPage = new LoginPage(driver);
    DashboardPage dashboardPage = new DashboardPage(driver);


    @Given("User is present on login page {string}")
    public void user_is_present_on_login_page(String loginUrl)
    {
        manager.openPage(loginUrl);
    }

    @When("User logs in with username {string} and password {string}")
    public void user_logs_in_with_username_and_password(String username, String password)
    {
       dashboardPage = loginPage.loginUser(username, password);
    }


    @Then("User is routed to Dashboard page with heading {string}")
    public void userIsRoutedToDashboardPageWithHeading(String headingText)
    {
       String text = dashboardPage.validateIfUserRoutedToDashBoardPage();
        Assert.assertEquals(text,headingText);
        manager.tearDown();
    }
}
