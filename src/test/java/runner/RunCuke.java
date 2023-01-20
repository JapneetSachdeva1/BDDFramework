package runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/features",
                 glue = {"steps"},
        tags = "@OrangeHRMlogin",
                plugin = {"html:target/cucumber-reports/cucumber-html-report.html",
                        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class RunCuke extends AbstractTestNGCucumberTests
{

}
