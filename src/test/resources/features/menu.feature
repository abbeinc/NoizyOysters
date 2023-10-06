
Feature: menu
  As a user, I should be able to see menu with description and prices

  Background:
    Given user at the menu page

  Scenario: Checking NOIZY STARTERS menu and prices

    When user scroll down
    Then menu Noizy Starters has following

      | Shrimp Cocktail       | $10.99 |
      | Golden Fried Calamari | $13.99 |
      | Ahi Tuna              | $13.99 |
      | Crab Nachos           | $18.99 |
      | Butterfly Shrimp      | $12.99 |
      | Noizy Crab Cakes      | $22.99 |

  Scenario: Checking Flatbreads menue and prices
    When user see section Flatbreads
    Then menu Flatbreads contains following
      | Veggie Flatbread                | $13.99 |
      | BBQ Chicken Flatbread           | $13.99 |
      | Grilled Shrimp Scampi Flatbread | $14.99 |
      | Margarita Flatbread             | $13.99 |
      | Chicken Caprese Flatbread       | $14.99 |



    Scenario: Checking SidesAndSoup menu
      When user see Sides and Soup menu
      Then menu contain items and prices