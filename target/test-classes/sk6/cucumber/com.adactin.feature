Feature: Hotel  Booking In Adactin Application

Scenario:User Login In The Web Aplication
Given user Launch The Web Application
When user Enter The Username In The Username Field
And user Enter The Password In The Password Field
Then user Cliclk The Login Button And It Navigates TO Search Hotel

Scenario: User Search And Select The Location
When user Select The Hotel In The Hotel Field
And user Select The Room In The Room Field
And user Enter The NUmber Of Rooms In The Number Of Rooms Field
And user Enter The Date In The Check In Date Field 
And user Enter The Date IN The Check Out Date Field
And user Enter The Adults In The Adults Per Room Field
And user Enter The Chikdrens In The Childrens Per Field
Then user Click In The Search Button And It Navigates To Select Hotel

Scenario: User Select The Hotel
When user Select The Hotel Creek
Then user Click The Continue Button And It Navigates To Book a Hotel

Scenario:User Book The Hotel
When user Enter The First Name
And user Enter The Last Name
And user Enter The Billing Address
And user Enter The Credit Card Number In The Credit Card Field
And user Enter The Credit Card Type In The Credit Card Field
And user Enter The Expiry Date In The Expiry Field
And user Enter The Cvv Number In The Cvv Number Field
Then user Click The Book Now Button 


Scenario: User Confirm The Booking
Then user Click The Logout Button














