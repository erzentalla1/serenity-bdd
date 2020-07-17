Feature: Waiter
  Scenario: Create Waiter
    Given I create waiter with name "Endrit" and last name "asdasdad" and password "11111" and email "et40211@ubt-uni.net" and gender "Male" and birthdate "1999-07-22T11:00:00"
    Then waiter should created

    Scenario: Create Waiter UI Test
      Given I create waiter by filling fields with name "Test" and last name "Test" and password "testingpw" and email "test@test.test" and gender "Male" and birthdate "1999-07-22T11:00:00"
      Then Waiter should be created