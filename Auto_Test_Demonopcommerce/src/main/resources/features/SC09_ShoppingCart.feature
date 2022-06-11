@smokeTesting
Feature: add different products to Shopping cart

  Background:
    Given user navigate to home page
    And user press login link
    When user enter valid Email and password
    And user click on login button

  Scenario: user could add different products to Shopping cart
    Given user could add items to shoppingCart
    When user go to Shopping cart
    Then user found the chosen items in shoppingCart

