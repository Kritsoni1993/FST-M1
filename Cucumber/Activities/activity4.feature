@activity4
Feature: Data driven test without Example

  Scenario: Testing with Data from Scenario
    Given User at present is on Login page
    When User enters username and password correctly
    Then Read the page title and confirmation message with assertion
    And Close the browser once done