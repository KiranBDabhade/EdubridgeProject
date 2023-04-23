Feature: Verify below features for DEMOQA book store login
Login feature, verify new user 

	
	Scenario: Verify login with valid username and valid password
		Given user should be in login page
		When user enter valid username and valid password
		Then  click on login button
			And close the browser
		
	

	Scenario: Verify login with valid username and invalid password
		Given user should be in login page
		When user enter valid username and invalid password
		Then click on login button
		And close the browser
		

	Scenario: Verify new user on login page
		Given user should be in login page
		Then New user button should be display in login page
		And close the browser
	