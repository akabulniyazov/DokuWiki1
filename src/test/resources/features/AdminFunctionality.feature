@admin
Feature: Creating new user
	
Scenario Outline: new user
Given User navigates DokuWiki
When User log in as Admin username "admin" password "abc123"
And User creates new user with credentials <username> <password> <password2> <Real Name> <Email> <Groups>
Then User validates that "hacker user is created"
And User log out
Examples:
|username|password|password2|Real Name|Email|Groups|
|altyn|abc123|abc123|Altyn|altyn@gmail.com|Hackers|
|aslan|abc123|abc123|Aslan|aslan@gmail.com|Hackers|
|mira|abc123|abc123|Mira|mira@gmail.com|Hackers|
|arslan|abc123|abc123|Arslan|arslan@gmail.com|Hackers|

Scenario: making changes as new user
Given User navigates DokuWiki
When User log in as User username "hacker" password "abc123"
Then User writes "[[batch 7]]" inside "[[Cybertek school]]" link
And User verify in Old revisions that change made by "hacker"
And User log out
