@oldRevision @reg
Feature: Old revision feature


Background:
Given User navigates DokuWiki
When User log in as Admin username "admin" password "abc123"



Scenario: Creating Hackers file
Then User creates "[[Hackers]]" file
And User edits "[[Hackers]]" file to "[[Hackers Cybertek]]" file and saves it
Then User validates the change by clicking start link
And User logs out 

Scenario: Old revision actions
When User navigates to tool bar and clicks Old Revision tool
Then User verifies "Old Revisions" text isDisplayed
And User cliks on sunglass image which is on the second line with a text created
Then User verifies created "[[Hackers]]" changed to "[[Hackers Cybertek]]" with valid dates
And User deletes the file
Then User logs out

