@OrangeHRMlogin @smoke
Feature: Validate login page is working as expected

  Scenario: Validate as a user I am able to login
    Given User is present on login page "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    When User logs in with username "Admin" and password "admin123"
    Then User is routed to Dashboard page with heading "Dashboard"
