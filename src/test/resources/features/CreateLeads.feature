Feature: Create Lead Using Cucumber BDD Tests in LeafTaps Application

Background:

# Pre-conditions
Given Launch Browser chrome
And Login to application:
|DemoSalesManager|
|crmsfa|
And Click CRM

Scenario: Just Check
Given Click Logout

Scenario Outline: Create Lead (Mandatory Fields)

# Conditions (Test / Requirement)
When Click Create Lead
And Type Company Name <Company Name>
And Type First Name <First Name>
And Type Last Name <Last Name>
And Pass the Json <File Name>
When Click Create Lead

# Post-condition
Then Confirm the Lead is created
And Click Logout
And Close Browser

Examples:
|Company Name|First Name|Last Name|File Name|
|TestLeaf|Babu|Manickam|createlead.json|
|Facebook|Mark|Z|createlead1.json|