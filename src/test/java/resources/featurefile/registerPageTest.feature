Feature: Register Test
  As a user I should register successfully

  Background: I am on homepage
  @Sanity @Smoke @Regression
  Scenario: Verify user should navigate to register page successfully
    Given   User is on Homepage
    When    I click on register link
    Then    I am on register page

  @Smoke @Regression
  Scenario: verify That First Name Last Name Email Password And Confirm Password Fields Are Mandatory
    Given   User is on Homepage
    When    I click on register link
    And     I click on register button
    And     I get error message 'First name is required'
    And     I get error message 'Last name is required'
    And     I get error message 'Email is required'
    And     I get error message 'Password is required'
    And     I get error message 'Confirm Password is required'
    Then    I am not able to register successfully

  @Regression
  Scenario: Verify that user should create account successfully
    Given   User is on Homepage
    When    I click on register link
    And     I click on Gender "Male"
    And     I enter First Name "Bob" into 'First name' field
    And     I enter Last Name "Alexa" into 'Last name' field
    And     I select day "11" for 'Date of birth' field
    And     I select month "November" for 'Date of birth' field
    And     I select year "2011" for 'Date of birth' field
    And     I enter email "Bob@gmail.com" into 'Email' field
    And     I enter password "Bob123" in 'Password' field
    And     I enter confirm password "Bob123" into 'Confirm password' field
    And     I click on register button
    Then    I am able to register successfully