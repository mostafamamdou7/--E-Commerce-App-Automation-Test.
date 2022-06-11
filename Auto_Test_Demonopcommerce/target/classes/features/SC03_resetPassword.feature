@smokeTesting
Feature: change his/her password successfully

  Scenario: user can change his/her password successfully
    Given user navigate to home page
    And user press login link
    When user click on forget password link
    And user fills Email correctly
    Then user click on recover button
    And user will see successfully message Email with instructions has been sent to you
