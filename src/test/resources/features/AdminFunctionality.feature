Feature: Creating new user
	
Scenario Outline: new user
Given User navigates DokuWiki
When User log in as Admin username "admin" password "abc123"

And User creates new user with credentials "<username>" "<password>" "<password2>" "<realName>" "<Email>" "<Groups>"
Then User validates that "<username>" is displayed on table

And User log out
Examples:
|username|password|password2|realName |Email           |Groups |
|altyn   |abc123  |abc123   |Altyn    |altyn@gmail.com |Hackers|
|aslan   |abc123  |abc123   |Aslan    |aslan@gmail.com |Hackers|
|mira    |abc123  |abc123   |Mira     |mira@gmail.com  |Hackers|
|arslan  |abc123  |abc123   |Arslan   |arslan@gmail.com|Hackers|


@admin
Scenario: making changes as new user
Given User navigates DokuWiki
When User log in as User username "mira" password "abc123"
Then User writes "[[batch 7]]" inside "[[cybertek]]" link
And User verify in Old revisions that change made by "mira"
And User log out





