Feature: DemoWebShop Application

Scenario: login should be success

Given user should navigate to the application
And user should click on login link
And user enter the username as Charles@gmail.com
And user enter the password as 123456
When user click the login button 
Then login should be success