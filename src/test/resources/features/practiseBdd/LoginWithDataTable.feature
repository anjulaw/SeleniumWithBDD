@datatable
Feature: Login feature

  Background:
    Given user navigates to the facebook website
    When user validate the homepage title

  Scenario: Login to the Facebook Website as an valid user
    Then user enters "valid" username
    And user enters "valid" password
    And user validates captcha image
    And user enters firstname and lastname
        |firstname|lastname|
        | Rahul | Arora |
        | Coray | Paul  |
    And user clicks on the signIn button