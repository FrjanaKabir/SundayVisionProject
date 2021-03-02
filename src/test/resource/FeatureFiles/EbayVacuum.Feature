@regression
Feature: Ebay Cart Funtionality

       Scenario: View Product in the Cart
       
       Given Open Ebay Website
       When Serch for Vacuum
       And Select Robotic from Type
       And Select Robotic Vacuum
       And clic View Cart button
       Then Robotic Vacuum should be in the Cart
       
       
       
       