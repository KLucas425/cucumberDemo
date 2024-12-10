Feature: User Registration


	@regression
  Scenario: successful registration
    Given user navigates to registration page
    When user enters the details
    	| firstname | John       |
    	| lastname  | Doe        |
    	| telephone | 1231231234 |
    	| password  | test@123   |
    And user checks on the terms checkbox
    And the userclicks continue
    Then Account should be on My Account page
