Feature: Validating Place API's

Scenario Outline: Verify if given place is added successfully by AddplaceAPI
Given Add place payload with "<name>" "<language>" "<address>"
When user calls "addPlaceAPI" with http request
Then API call got success with status code 200
And "status" in response body is "OK"
And "scope" in response body is "APP"

Examples:

|name    |language  |address   |
|vijay1  |kannada1  |mangalpet1|
|vijay2  |kannada2  |mangalpet2|
|vijay3  |kannada3  |mangalpet3|