Feature: Cash Withdrawal
  Scenario: Attempt withdrawal using stolen card
    Given I have $100 in my account
    But my card is invalid
    When I request $50
    Then my card should not be returned
    And I should be told to contact the bank
