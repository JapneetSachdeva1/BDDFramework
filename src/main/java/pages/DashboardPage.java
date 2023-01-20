package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage
{
    //locators
    protected By dashBoardText = By.xpath("//h6[text()='Dashboard']");

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

}
