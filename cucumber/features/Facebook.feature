

Feature: Test facebook login credientials
  as a user i want to login on facebook, so i can communicate with friends

 
  Scenario: Test login with valid credential
    Given open firefox and start application
    When I enter valid username and valid password
    Then user should be login seccessfully
    Then application should be closed

 
      










