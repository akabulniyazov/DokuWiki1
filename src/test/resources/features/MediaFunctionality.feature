@media @reg @smoke 
Feature: create and delete Media file

  Background: 
    Given User navigates DokuWiki
    When User log in as Admin username "admin" password "abc123"
@media 
  Scenario: Create media file
    Then user uploads text file
    Then user must be able to see that text file in media files
    And User log out

  Scenario: delete media file
    #Then user uploads text file
    #And user must be able to see that text file in media files
    Then user should be able to delete that file
    And that file must be deleted from media files
    And User log out
