@textType
Feature: Text type 
Background: 
	Given User navigates DokuWiki
	When User log in as Admin username "admin" password "abc123"
Scenario:
	Then User writes "[[batch 7]]" bold text format inside Cybertek school link
	And User verify if link is bold
	And delete bold link
	And User log out
	
Scenario:
    Then User writes "[[batch 8]]" italic text format inside Cybertek school link
	And User verify if link is italic
	And delete italic link
	And User log out
