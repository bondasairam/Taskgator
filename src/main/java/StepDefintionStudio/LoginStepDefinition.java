package StepDefintionStudio;


import PageObject.Loginpage;
import io.cucumber.java.en.*;



public class LoginStepDefinition extends Loginpage {
	
	
	
	@Given("^User is in login page$")
    public void user_is_in_login_page() {
		launchApplication();
    }

    @When("^User enters email id \"([^\"]*)\"$")
    public void user_enters_email_id_something(String strArg1) {
    	EnterEmailId(strArg1);
    }

    @Then("^User should be logged in successfully$")
    public void user_should_be_logged_in_successfully() {
    	

    }

    @And("^User enters password  \"([^\"]*)\"$")
    public void user_enters_password_something(String strArg1) {
    	EnterPasswordID(strArg1);

    }
    @When("User clicks the remember me")
    public void user_clicks_the_remember_me() {
    	remember();
    }

    @And("^User clicks the signin button$")
    public void user_clicks_the_signin_button() {
    	clickSigninButton();
    }
    
    @When("User clicks the profile button")
    public void user_clicks_the_profile_button() {
        profileButton();
    }

    @When("User clicks the logout button")
    public void user_clicks_the_logout_button() {
    	logoutButton();
    }

    @Then("User should be logged out successfully")
    public void user_should_be_logged_out_successfully() {
        
    }

}
