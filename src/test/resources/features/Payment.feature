Feature: Payment
  Scenario: Create Payment
    Given I create payment with paymentType "MasterCard" and paymentAmount 300 and UID 111  and paymentDate "1999-07-22T11:00:00"
    Then payment should created