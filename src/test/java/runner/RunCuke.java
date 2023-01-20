package runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(features = "src/test/java/features",
                 glue = {"steps"},
                tags = "@smoke and not @OrangeHRMlogin,@OrangeHRMdashboard",
                plugin = {"html:target/cucumber-reports/cucumber-html-report.html",
                        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})

public class RunCuke extends AbstractTestNGCucumberTests
{
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
