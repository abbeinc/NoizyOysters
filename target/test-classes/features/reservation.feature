@regression
Feature: User should be able to fill and submit reservation form

  Background:
    Given user at the online-reservation page

  Scenario: user enter correct data for 2 people and choosing time
    When user enter information in all fields and click submit button
    Then user will see reservation approved page


  Scenario: user enters  all information except Name
    When user enters all information except name
    Then user should see warning sign for name


  Scenario: user enters all information except email
    When user enter all information except email
    Then user should see warning sign for email


  Scenario: user enters all information except phone
    When user enter all information except phone
    Then user should see warning sing for phone


  Scenario Outline:
    When user enter all information and choose "<amount>" of people
    Then user should see correct quantity on the screen
    Examples:
      | amount |
      | 2      |
      | 3      |
      | 4      |
      | 5      |
      | 6      |
      | 7      |
      | 8      |
      | 9      |
      | 10     |
      | 11     |
      | 12     |