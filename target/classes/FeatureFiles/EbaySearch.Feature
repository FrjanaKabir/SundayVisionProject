@regression
Feature: Ebay Search Functionality
	
	Scenario: Search For Shirts
		Given Open Ebay Website
		When Search for Shirts
		Then Item list should have only shirt related products		
		
		