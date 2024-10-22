Feature: Login

Background: User Opened the browers
Given user is on the login page 

Scenario: Check login with valid credentials

When  user enters "testuser1" and "Test@124"
And user clicks on Rediff.com link
Then user is navigated to "Rediff.com: News | Rediffmail | Stock Quotes | Rediff Gurus"

Scenario: Check login with invalid credentials

When  user enters "testuser4" and "Test@1254"
And user clicks on Rediff.com link
Then user is navigated to "Rediff.com: News | Rediffmail | Stock Quotes | Rediff Gurus"