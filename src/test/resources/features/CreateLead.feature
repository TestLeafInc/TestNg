Feature: Create Lead Using Cucumber BDD Tests in LeafTaps Application

#@smoke
Background:

# Pre-conditions
Given Launch Browser <Chrome>
And Login using username as <username>
And Click CRM

# Conditions (Test / Requirement)
When Click Create Lead
And Type Company Name <Company Name>
And Type First Name <First Name>
And Type Last Name <Last Name>

@smoke @Babu
Scenario: Create Lead (Mandatory Fields)

When Click Create Lead

# Post-condition
Then Confirm the Lead is created
And Click Logout
And Close Browser

@smoke @Gopi
Scenario: Create Lead (Mandatory+Optional Fields)

# Conditions (Test / Requirement)
When Choose Source <Cold Call>
And Click Create Lead

# Post-condition
Then Confirm the Lead is created
And Click Logout
And Close Browser