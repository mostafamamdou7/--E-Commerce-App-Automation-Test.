@smokeTesting
Feature: add items to wishlist

  Background:
    Given user navigate to home page
    And user press login link
    When user enter valid Email and password
    And user click on login button
    Then user could login successfully and go to home page

  Scenario: user could add items to wishlist
    Given user press wishlist button on specific item
    When user click on wishlist link
    And user count numbers of quantities


