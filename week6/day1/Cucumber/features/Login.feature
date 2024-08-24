Feature: Login Functionality of LeafTap Application

Scenario: Login with Positive Credentials
Given Launch the Browser and Load the Url
When Enter the userName as 'DemoSalesManager'
And Enter the password as 'crmsfa'
And Click on Login Button
Then Verify Login is successful


Scenario: Login with Negative Credentials
Given Launch the Browser and Load the Url
When Enter the userName as 'Demo'
And Enter the password as 'crmsf'
And Click on Login Button
But Verify Login is  not successful