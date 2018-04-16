@siteMap @reg
Feature: SiteMap functionality

Background: 
	Given User navigates DokuWiki
	When User log in as Admin username "admin" password "abc123"
	
Scenario: SiteMap available pages
Then Verify that all pages are present in SiteMap section
And User log out

Scenario: Cybertek links
Then User open syntax page
And Verify each content is described
And User log out
