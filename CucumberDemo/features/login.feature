Feature: User Login

  Scenario: Successful Login
    Given the user is on the nopCommerce login page
    When the user enters the valid login credentials (username: "testcba1@gmail.com", password: "test@123")
    And the user clicks on the Login button
    Then the user should be directed to the My Account Page

  Scenario Outline: Login datadriven
    Given the user is on the nopCommerce login page
    When the user enters email as "<email>" and password as "<password>"
    And the user clicks on the Login button
    Then the user should be directed to the My Account Page

    Examples: 
      | email                     | password |
      | testcba3@gmail.com        | test1234  |
      | testcba4@gmail.com        | test@123 |
