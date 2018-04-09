@createPage
Feature: Creating new file
Background: 
	Given User navigates DokuWiki
	When User log in as Admin username "admin" password "abc123"
	
Scenario: Create Cybertek file
And User open new file and post "[[Cybertek]]"
Then User click on start link and validate the post
And User log out

Scenario: Make change on file
And User navigate to start link
Then User changing the current post to "[[Cybertel School]]"
And User verify the last change in Old revisions 
And User deletes all posts
And User log out
