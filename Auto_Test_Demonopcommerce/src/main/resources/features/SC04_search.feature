@smokeTesting
Feature: search for any item by item's name

  Background:
    Given user navigate to home page
    And user press login link
    When user enter valid Email and password
    And user click on login button
    Then user could login successfully and go to home page

  Scenario: user can search for any item by item's name
    Given user navigate to home page
    When user press on search field
    And user search with Item name"book"
    And user press on search button
    Then user could find relative result

