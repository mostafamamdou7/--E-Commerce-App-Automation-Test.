@smokeTesting
Feature: filter with color

  Background:
    Given user navigate to home page
    And user press login link
    When user enter valid Email and password
    And user click on login button
    Then user could login successfully and go to home page

  Scenario: user could filter with color
    Given user navigate to home page
    And user hover in categories
    And user hover in subcategories and click in one
    And user navigate to subcategory page
    When user choose the filteration color
    Then user found all items in the choosen color

