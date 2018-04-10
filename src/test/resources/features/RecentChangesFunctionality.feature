@recentChanges @reg
Feature: Tracking recent changes
Background: 
	Given User navigates DokuWiki
	When User log in as Admin username "admin" password "abc123"
	And user goes to Recent changes menu
	
Scenario: Recent changes on Pages
Then user choose Pages option from dropdown
Then user verifies sorted list has glasses button before each file 

Scenario: Recent changes on Media
Then user choose Media option from dropdown
Then user verifies all files have extention