package Stepdefination;

import Objectrepository.LoginObjectrepository;
import io.cucumber.java.en.*;

public class LOginstepcases {
	LoginObjectrepository obj = new LoginObjectrepository();
	
	@Given("user should be in login page")
	public void user_should_be_in_login_page() throws InterruptedException {
		obj.launchApplication();
	}

	@When("user enter valid username and valid password")
	public void user_enter_valid_username_and_valid_password() {
		obj.enterUserName("kirandabhade12");
		obj.enterPassword("Akola@1234");

	}

	@When("click on login button")
	public void click_on_login_button() {
		obj.clickButton();

	}

	
	@Then("close the browser")
	public void close_the_browser() {
		obj.closeBrowser();
	}

	@When("user enter valid username and invalid password")
	public void user_enter_valid_username_and_invalid_password() {
		obj.enterUserName("kirandabhade12");
		obj.enterPassword("kiran1234");
	}

	
	@Then("New user button should be display in login page")
	public void New_user_button_should_be_display_in_login_page() {
		obj.isnewuserDisplayed();
	

}

}
