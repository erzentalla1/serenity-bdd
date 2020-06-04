Feature: Report

  Scenario: Create Report
    Given I create report with reportType "Menagjerial" and  ReportDate "1999-07-22T11:00:00"
    Then report should created