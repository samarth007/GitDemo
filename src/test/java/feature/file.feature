Feature: App login

Scenario Outline: HomePage login

Given initialise driver with chrome browser
And navigate to "http://qaclickacademy.com" site
And navigate to loginportalpage
When when user enters <username> and <password> logs on
Then successful login 


Examples:
|username     |password|
|test99       |123457  |
|demo9090     |2345    |




