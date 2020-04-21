Feature: Companies available policy

  The company defines a policy of companies available depending on the destination of the flight
  and the passenger type.

  Scenario: A usual customer wants to buy a ticket for a flight to a destination
    Given we have a VIP passenger
    When there is a business flight to :
        | Luxembourg |
        | Paris      |
        | Berlin     |

    Then He can choose a company


