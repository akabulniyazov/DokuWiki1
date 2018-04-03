@oldRevision
Feature: Old revision feature
Background:
 
Given User navigatse to DokuWiki
When User logs in as Admin username "admin" password "abc123"
 
Scenario: Editing Hackers file
Given "[[Hackers]]" file
When User edits exiting "[[Hackers]]" file to "[[Hackers Cybertek]]" file and saves it
Then User validates the change by clicking start link
 
Scenario: See changed actions
When User navigates to tool bar and clicks Old Revision tool
Then User verifies "Old Revisions" text isDisplayed
And User cliks on sunglass image which is on the second line with a text created
Then User verifies created "[[Hackers]]" changed to "[[Hackers Cybertek]]" with valid dates