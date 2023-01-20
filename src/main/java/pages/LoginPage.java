package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage
{
    //locators
    public final By userName = By.name("username");
    public final By pswd = By.name("password");
    public final By loginBtn = By.xpath("//button");

    //constants
    WebDriver driver;

    //Constructors

    public LoginPage(WebDriver driver)
    {
        this.driver = driver;
    }

    //getters and setters
    public DashboardPage loginUser(String username, String password)
    {
        driver.findElement(userName).sendKeys(username);
        driver.findElement(pswd).sendKeys(password);
        driver.findElement(loginBtn).click();
        return new DashboardPage(driver);
    }
}

