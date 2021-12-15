Feature: Login page Test
  User should be able to login successfully with valid credentials

  @Sanity @Smoke @Regression
  Scenario: user should navigate to login page successfully
    Given User is on Homepage
    When User clicks on login link
    Then User should navigate to login page

  @Smoke @Regression
  Scenario: verify the error message with invalid credentials
    Given User is on Homepage
    When User clicks on login link
    And User enters email
    And User enters password "Bob1234"
    And User clicks on login button
    Then User can see the error message

  @Smoke @Regression
  Scenario: User should login successfully with valid credentials
    Given User is on Homepage
    When User clicks on login link
    And User enters email
    And User enters password "Bob123"
    And User clicks on login button
    Then User can see the log out link is displayed

  @Regression
  Scenario: User should log out successfully
    Given User is on Homepage
    When User clicks on login link
    And User enters email
    And User enters password "Bob123"
    And User clicks on login button
    And User clicks on logout link
    Then User can see the login link displayed