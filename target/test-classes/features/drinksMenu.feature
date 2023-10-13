@regression
Feature: User should be able to see drinks menu

  Background:
    Given user at the drinks menu page

  Scenario: user should see following products in Noizy Favorites section
    When user scroll down to the Noizy Favorites
    Then user should see
      | Oyster Shooter             | $4.99  |
      | Noizy Margarita            | $10.99 |
      | Paloma                     | $12.99 |
      | Martini                    | $10.99 |
      | Mimosa                     | $10.99 |
      | Moscow Mule                | $12.99 |
      | Bloody Mary                | $12.99 |
      | Aperol Spritz              | $12.99 |
      | Seabreeze                  | $10.99 |
      | Fresh Strawberry Margarita | $10.99 |
      | Pineapple Margarita        | $10.99 |
      | Hibiscus Margarita         | $12.99 |
      | Appletini                  | $10.99 |
      | Mojito                     | $12.99 |
      | Long Island Iced Tea       | $12.99 |
      | Cosmopolitan               | $12.99 |
      | Noizy Sweet Tea Vodka      | $10.99 |
      | Pina Colada                | $12.99 |

