Feature: Bar

  Scenario: CreateBartender
    Given I create bartender with name "Erzen" and last name "Talla" and password "11111" and email "et40211@ubt-uni.net" and gender "Male" and birthdate "1999-07-22T11:00:00"
    Then bartender should created