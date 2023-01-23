@prod
Feature: Login feature

  Scenario Outline: Login to the Facebook Website as an user
    Given user navigates to the facebook website
    When user validate the homepage title
    Then user enters "<username>" username
    And user enters "<password>" password
    And user clicks on the signIn button
    Examples:
      | username | password |
      | valid    | valid    |
      |invalid   |invalid   |
      |valid     |invalid   |

