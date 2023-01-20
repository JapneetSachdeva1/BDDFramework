package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage
{
    //locators
    private By dashBoardText = By.xpath("//h6[text()='Dashboard']");
    private By profileBtn = By.xpath("//span/img");
    private By logoutBtn = By.xpath("//a[text()='Logout']");

    //constants
    WebDriver driver;

    //Constructors
    public DashboardPage(WebDriver driver)
    {
        this.driver = driver;
    }


    //Getters and Setters
    public String validateIfUserRoutedToDashBoardPage()
    {
        return driver.findElement(dashBoardText).getText();
    }

    public void logoutUser()
    {
        driver.findElement(profileBtn).click();
        driver.findElement(logoutBtn).click();
    }




}
