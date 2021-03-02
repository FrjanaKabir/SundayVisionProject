@regression
Feature: Ebay Brand Outline
        Scenario Outline: Search For Items with Brand
		 Given Open Ebay Website
		  When Search for "<Items>"
		  And Filter by "<Brand>"
		  Then Item list should have product of "<Brand>"
		
		Examples:
		|Items   |Brand  |
		|Shirt   |Adidas |
		|Pants   |Nike   |
		|Shoes   |Unbranded|