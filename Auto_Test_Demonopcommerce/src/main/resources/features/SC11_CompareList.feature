@smokeTesting
Feature: items to compare list

  Background:
    Given user navigate to home page
    And user press login link
    When user enter valid Email and password
    And user click on login button

  Scenario: user add items to compare list
    Given user could add items to compare list
    When user go to compare list
    Then user found the chosen items in compare list