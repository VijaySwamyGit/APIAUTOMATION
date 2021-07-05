Feature: data table

Background: common steps
Given background given
When background When

@Smoke
Scenario: data usuage
Given when in login page
When data table to be read
|user id |password|
|vijay1  |pwd1    |
|vijay2  |pwd2    |
Then pass

Scenario Outline: data usuage
Given when in login page
When read "<user id>" and "<password>"
Then pass

Examples:
|user id |password|
|vijay1  |pwd1    |
|vijay2  |pwd2    |
