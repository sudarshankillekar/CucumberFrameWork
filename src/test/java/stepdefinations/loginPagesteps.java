package stepdefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;

import com.pages.LoginPage;
import com.qa.factory.DriverFactory;
public class LoginPageSteps {

	private static String title;
	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
	
	
	@Given("user is on Login Page")
	public void user_is_on_login_page() {
		DriverFactory.getDriver().get("https://automationexercise.com/login");
	   
	}

	@When("user gets the title of the page")
	public void user_gets_the_title_of_the_page() {
		 title = loginPage.getTitleOfThePage();
		  System.out.println("Login Page title is "+title);
	   
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String Expectedtitle) {
		   Assert.assertTrue(title.contains(Expectedtitle));
	   
	}

	@Then("Login to your account should be displayed")
	public void login_to_your_account_should_be_displayed() {
		Assert.assertTrue(loginPage.VerifyLoginToyourAcount());
	   
	}

	@When("user enters Username {string}")
	public void user_enters_username(String username) {
		 loginPage.enterUserName(username);
	   
	}

	@When("user enters Password {string}")
	public void user_enters_password(String password) {
		 loginPage.enterPassword(password);
	   
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
		loginPage.clickonLoginButton();
	   
	}

	
}
