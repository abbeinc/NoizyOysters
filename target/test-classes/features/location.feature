@regression
Feature: As a user I should be able to see page location
  use its feature
  Background:
    Given user at the location page

  Scenario: if user click Get Directions user should see the google map page
    When user click Get Direction link
    Then user should see google map page

  Scenario: user should see following information
    When  user at the location page
    Then user should see address
    And phone number
    And store hours

    Scenario: user should be able to go to reservation page by clicking
      Online Booking button
      When user at the location page click ONLINE BOOKING
      Then user should see reservation page
