@createPage @reg
Feature: Creating new file
Background: 
	Given User navigates DokuWiki
	When User log in as Admin username "admin" password "abc123"
	
Scenario: Create Hackers file
And User creates new file
And User posts "[[Hackers]]"
Then User clicks on start link
And User validates the post
Then User edits "[[Hackers]]" file to "[[Hackers Cybertek]]" file and saves it
And User validates the change by clicking start link

Scenario: See changed actions
When User navigates to tool bar and clicks Old Revision tool
Then User verifies "Old Revisions" text isDisplayed
And User cliks on sunglass image which is on the second line with a text created 
Then User verifies created "[[Hackers]]" changed to "[[Hackers Cybertek]]" with valid dates
And User deletes "[[Hackers Cybertek]]"
And User logs out


