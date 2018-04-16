@smoker
Feature: Logging in application and posting text 

Scenario: smoke test
Given User navigates DokuWiki
When User log in as Admin username "admin" password "abc123"
And User open new file and post "Smoke test is done!"
Then User verify if text is posted
Then User deletes the post
And User log out