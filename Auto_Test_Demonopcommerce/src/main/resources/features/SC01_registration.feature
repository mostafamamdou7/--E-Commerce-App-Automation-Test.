@smokeTesting
Feature: registration user should be able to sign up with new accounts

  Scenario: user could sign up with valid data
    Given user navigate to home page
    And user press registration link
    When user fills Personal Details with valid data and password
    And user press on register button
    Then user register successfully