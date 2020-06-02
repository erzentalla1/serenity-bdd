Feature: Chef

  @debug
  Scenario: Create chef
  Given I create chef with name "Filan" and last name "Fisteku" and password "123456" and gender "Male" and birthdate "2020-07-22T11:00:00"
  Then chef should created