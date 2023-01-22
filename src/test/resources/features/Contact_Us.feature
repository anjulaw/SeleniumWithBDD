Feature: Webdriver University - Contact us page

  Scenario: Validate Successful Submission
    Given I access the webdriver univesity contact us page
    When I enter a first name
    And I enter a lst name
    And I enter a email address
    And I enter a comment
    And I click on the submit button
    Then I should be presented with a successful contact us submission message