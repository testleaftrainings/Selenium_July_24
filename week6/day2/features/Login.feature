Feature: Login Functionality of LeafTap Application

#Background:
#Given Launch the Browser and Load the Url

@smoke
Scenario: Login with Positive Credentials

When Enter the userName as DemoSalesManager
And Enter the password as crmsfa
And Click on Login Button
Then Verify Login is successful

@dilip
Scenario: Login with Negative Credentials

When Enter the userName as Demo
And Enter the password as crmsf
And Click on Login Button
But Verify Login is  not successful


@sanity @smoke
Scenario Outline: Login with Positive 1Credentials

When Enter the userName as <username>
And Enter the password as <password>
And Click on Login Button
Then Verify Login is successful

Examples: 
|username|password|
|demoCsr|crmsfa|
|DemoCsr2|crmsfa|

#(.*)$- string ,number, -no need to add '' for the value