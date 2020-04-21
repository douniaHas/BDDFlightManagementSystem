Feature: Points from merchandise on board Policy

  Scenario: Business flight, VIP passenger

    Points depend on the product. These rules are the result of marketing studies depending on the destination,
    the customer type and the company.

    Given there is an business flight
    And there are points for these products
      | Drink              | Category | Points |
      | Apple Juice        | Juice    | 15     |
      | Cappuccino         | Fancy    | 20     |
      | Earl Grey          | Tea      | 10     |
    When we have a VIP passenger
    And he buys a <product>
    |product    |
    |cappuccino |
    |Earl Grey  |
    Then he got points for these products

