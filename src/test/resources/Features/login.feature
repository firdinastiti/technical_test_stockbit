Feature: feature to test login functionality

  Scenario: Check login is successful with valid credentials
    Given User is on landing page
    When User click menu login
    And User enters username and password
    And User click  login button
    Then User is on homepage
    