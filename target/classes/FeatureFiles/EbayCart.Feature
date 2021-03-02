@regression
Feature: Ebay Cart Functionality
   
   Scenario: Add product to the Cart
   Given Open Ebay Website
   When Search for shirts
   And Select first shirt product on item list
   And Select color on shirt
   And select size on shirt
   And select quantity of shirt
   Then Add to cart