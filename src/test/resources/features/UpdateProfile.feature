@profile @reg
Feature: Update profile

Background: 
	Given User navigates DokuWiki
	When User log in as Admin username "admin" password "abc123"
	
Scenario: Updating password
Then user update password to "abc12345"
And User log out
When User log in as Admin username "admin" password "abc12345"
And User log out
