Feature: Testing Facebbok Login
  Scenario: User should not be able to login with invalid credentials
    Given user is on the facebook Login page
    And user logs with username, password
    Then user should see message error
  