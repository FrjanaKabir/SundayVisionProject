@regression
Feature: Ebay Catogory Outline

     Scenario Outline: Search for ITems By Category

     Given Open Ebay Website
     When Search for "<Items">
     And  Select by "<Category>"
     Then  Validate Item list by "<Category>"
     
     Examples:
      |Items    |Category |
      |Shirt    |Men      |
      |Pants    |Women    |
      |Shoes    |Kids     |