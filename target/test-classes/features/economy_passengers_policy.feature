Feature: Economy Flight Passengers Policy
  The company follows a policy of adding and removing passengers, depending on the passenger type
  and on the flight type

  Background:
    Given there is an economy flight

  Scenario: Economy flight, usual passenger
    When we have a usual passenger
    Then you can add and remove him from an economy flight

  Scenario: Economy flight, VIP passenger
    When we have a VIP passenger
    Then you can add him but cannot remove him from an economy flight