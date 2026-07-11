Feature: Checking logging test for Practice Test Automation

Scenario:
Given User should open chrome browser
When User should Enter url in browser
Then Type Username student into Username in Edit field
Then Type password Password123 into Password field
Then User should click Push Submit button
Then User should Verify new page URL contains https://practicetestautomation.com/logged-in-successfully/
Then User should Verify new page contains expected text ('Congratulations' or 'successfully logged in')
Then User should Verify button Log out is displayed on the new page