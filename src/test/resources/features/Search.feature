@search @fff @reg
Feature: Search functionality
Background: 
	Given User navigates DokuWiki
	When User log in as Admin username "admin" password "abc123"
	@fff
Scenario: Search for pages with valid credentials
Then user search for "Cybertek"
Then user verifies all "Cybertek" related pages are displayed
And User log out

Scenario: Search for pages with invalid credentials
Then user search for "NoPage"
Then user verifies "Nothing was found" message
And User log out