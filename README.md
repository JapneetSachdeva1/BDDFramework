Top-Level Directories

- testng.xml

TestNG configuration file that specifies which test classes or groups to run and configurations like listeners or parallel execution.
pom.xml

- Maven's Project Object Model file that manages project dependencies, build plugins, and project information.
test-output/

- Directory automatically generated after test execution, containing:
SparkReport/Spark.html: ExtentReports' HTML report for detailed test results.
README.md

![napkin-selection (3)](https://github.com/user-attachments/assets/bdbf486b-73e7-42cd-8e7c-15b40f915f68)


- Documentation file typically used to describe the project purpose, setup instructions, and usage guidelines.
Source Code Structure
src/main/java/
pages/

- LoginPage.java: Likely contains locators and methods for interactions on the Login page.
- DashboardPage.java: Contains locators and methods for the Dashboard page.
- Represents the Page Object Model (POM) design pattern.
utils/

- DriverManager.java: Handles WebDriver setup, teardown, and browser configuration, ensuring reusability across tests.
src/test/
resources/

- extent.properties: Configuration file for ExtentReports, specifying properties like report title and location.
- spark-config.xml: Defines configurations for SparkReport, such as theme, timestamp settings, or logo inclusion.
java/

runner/
- RunCuke.java: Entry point for executing Cucumber tests using the Cucumber TestNG runner.
steps/
- DashboardPageSteps.java: Step definition file containing Cucumber steps for Dashboard-related features.
- OrangeHRMloginSteps.java: Step definition file for Login-related features.
features/
- dashboard.feature: Cucumber feature file describing Dashboard page scenarios in Gherkin syntax.
- orangeHRMLogin.feature: Feature file for Login scenarios.

  ![napkin-selection (4)](https://github.com/user-attachments/assets/7aeefc17-f359-4230-b318-0249f8c3c007)

  
Key Points of This Structure
- Maintainability:

Clear segregation of page objects, utilities, step definitions, and feature files.

- Reusability:

Centralized utilities (e.g., DriverManager) and separate page classes ensure reusable components.

- BDD Best Practices:


Using Gherkin for feature files and keeping step definitions tied to logical feature areas.

- Reporting:

Integration of ExtentReports/SparkReport for comprehensive and visually appealing test reporting.

- Modularity:

Adding new features or pages is simple due to this structured approach.

![napkin-selection (5)](https://github.com/user-attachments/assets/ebe3e543-0d6e-4490-9cc0-24136f54bb1b)

