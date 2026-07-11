Feature: 

Scenario:

Given User should open Chrome Browser
When User should enter URL in browser
Then Type username incorrectUser into username field
Then Type password Password123 into Password field
Then User should Push Submit button
Then User should Verify error message is displayed
Then User should Verify error message text is Your username is invalid!
