@regression
Feature:  Ebay Filter Functionality

        Scenario:  Filter Shirts by Sleeve Lenth
        Given Open Ebay Website
        When Search for Shirts
        And Select Long Sleeve Shirt
        Then Validate by displaying only Long Sleev Shirts