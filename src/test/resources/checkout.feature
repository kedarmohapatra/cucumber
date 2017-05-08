Feature: Checkout
  Scenario Outline: Checkout bananas and apples
    Given the price of a "banana" is 40c
    And the price of a "apple" is 15c
    When I checkout <bcount> "banana"
    And I checkout <acount> "apple"
    Then the total price should be <total>c

    Examples:
      |acount|bcount|total|
      |1|2|95|
      |2|2|110|