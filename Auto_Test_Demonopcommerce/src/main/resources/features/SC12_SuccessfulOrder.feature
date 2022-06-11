@smokeTesting
Feature: make successful Order

  Scenario: user make successful Order
    Given user navigate to home page
    And user press login link
    When user enter valid Email and password
    And user click on login button
    Given user could add items to shoppingCart
    When user go to Shopping cart
    Then user found the chosen items in shoppingCart
    When user click on Terms and condition checkbox
    And user click on checkout button
    Then user complete order confirmation process
    And user finally complete order and see "Your order has been successfully processed!"
