@OrangeHRMdashboard @smoke
  Feature: Validate dashboard is working as expected

    Scenario: Validate as a user I am able to logout
      Given user is present on login page "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
      And Logs in "Admin" and password "admin123" and routes to Dashboard page
      When user click on logout button
      Then user is logged-out