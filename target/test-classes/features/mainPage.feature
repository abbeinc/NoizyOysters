@regression
Feature: User at the main page should be able to see content and
  be able to use buttons and links

  Background:
    Given user at the main page

  Scenario: User click  HOME button, next he must see main page
    When user click Home button
    Then title of the page must be Noizy Oysters Bar & Grill – Seafood restaurant

  Scenario: User click MENU button, next he must see menu page
    When user click MENU button
    Then user must see the page menu

  Scenario: User click Drinks button, next he must see drinks page
    When user click DRINKS button
    Then user must see the page drinks

  Scenario: User click reservations button, next he must see reservation page
    When user click RESERVATIONS button
    Then user must see the page reservations


  Scenario: User must see img of the menu on the first page
    When user goes down on the main page
    Then user must see menu img

  Scenario: User must see three links with See our Menu, Check our Bar, Our Location
    When  user scroll main page down
    Then user must see three links
      | See our Menu  |
      | Check our Bar |
      | Our Location  |

