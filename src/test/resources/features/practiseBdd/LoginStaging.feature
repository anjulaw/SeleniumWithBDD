@staging
Feature: Login feature

  Background:
    Given user navigates to the facebook website
    When user validate the homepage title

  Scenario: Login to the Facebook Website as an valid user
    Then user enters "valid" username
    And user enters "valid" password
    And user clicks on the signIn button

  Scenario: Login to the Facebook Website as an invalid user
    Then user enters "invalid" username
    And user enters "invalid" password
    And user clicks on the signIn button