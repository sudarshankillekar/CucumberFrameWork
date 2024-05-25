package stepdefinations;

import org.apache.xmlbeans.XmlFactoryHook.ThreadContext;
import org.junit.Assert;

import com.pages.LoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginPagesteps {
    private static String title;
	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
	    DriverFactory.getDriver().get("https://automationexercise.com/login");
	}

//	@When("user gets the title of the page")
//	public void user_gets_the_title_of_the_page() throws InterruptedException {
//		Thread.sleep(5000);
//		title  = loginPage.getLoginPageTitle();
//		System.out.println("login page title is"+ title);
//	}
//
//	@Then("page title should be {string}")
//	public void page_title_should_be(String expectedtitle) {
//	    // Write code here that turns the phrase above into concrete actions
//		String title  = loginPage.getLoginPageTitle();
//		System.out.println("login page title is"+ title);
//	    Assert.assertTrue(title.contains(expectedtitle));
//	}


	@Then("user enters username {string}")
	public void user_enters_username(String usersname) throws InterruptedException {
		
	   loginPage.enterUserName(usersname);
	}

	@Then("user enters password {string}")
	public void user_enters_password(String password) {
	  loginPage.enterPassword(password);
	}

	@Then("user clicks on login button")
	public void user_clicks_on_login_button() {
	   loginPage.clickonLoginButton();
	}

//	@Then("user gets the title of the Home page")
//	public void user_gets_the_title_of_the_home_page() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//	
}
