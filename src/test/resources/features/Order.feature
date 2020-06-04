Feature: Order
  Scenario: Create Order
    Given I create order with orderName "sendwich" and orderType "me pershut"  and orderdate "1999-07-22T11:00:00" and WID 2 and BID 3 and CHID 4
    Then order should created
