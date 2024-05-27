package stepdefinations;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.pages.HomePage;
import com.pages.LoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class HomePageSteps {
    
	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
	private HomePage homepage ; 
	
	@Given("user has already Logged in to the application")
	public void user_has_already_logged_in_to_the_application(io.cucumber.datatable.DataTable dataTable) {
	   List<Map<String, String>> credlist = dataTable.asMaps();
	   String userName = credlist.get(0).get("Username");
	   String password = credlist.get(0).get("Password");
	   
	   DriverFactory.getDriver().get("https://automationexercise.com/login");
	   homepage=  loginPage.DoLoginWith(userName, password);
	}

	@Given("user is on account page")
	public void user_is_on_account_page() {
	   homepage.getHomePageTitle();
	}

	@Then("User gets category section")
	public void user_gets_category_section(io.cucumber.datatable.DataTable CatTable) {
	   List<String> expCatSectList = CatTable.asList();
	   System.out.println("Expected cat section list "+ expCatSectList);
	   
	   List<String> ActCatSectList = homepage.getCategorySectionList();
	   System.out.println("Expected cat section list "+ ActCatSectList);
	   
	   Assert.assertTrue(expCatSectList.containsAll(ActCatSectList));
	}

	@Then("Category section count should be = {int}")
	public void category_section_count_should_be(Integer expectedCount) {
		Assert.assertTrue(homepage.getCategorySectionCount() == expectedCount);    
	}
	
}
