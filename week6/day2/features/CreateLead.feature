Feature: Create Lead  with Multiple Set of Data

Scenario Outline: To Pass Multiple data
#Given Launch the Browser and Load the Url
When Enter the userName as 'DemoSalesManager'
And Enter the password as 'crmsfa'
And Click on Login Button
Then Verify Login is successful
When Click on Crmsfa button
And Click on Leads button
And Click on CreateLead button
And Enter the CompanyName as <companyName>
And Enter the FirstName as <firstName>
And Enter the LastName as <lastName>
And Click on Sumbit Button
Then Verify the CreateLeadPage

Examples:
|companyName|firstName|lastName|
|'Qeagle'|'Dilip'|'Kumar'|
|'Qeagle'|'Vinoth'|'S'|