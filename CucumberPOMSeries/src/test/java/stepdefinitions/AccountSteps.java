package stepdefinitions;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class AccountSteps {

	
	@Given("user has already logged in to application")
	public void user_has_already_logged_in_to_application(DataTable usercredentials) {
		
	//List<Map<String,String>> table	=dataTable.asMaps(String.class,String.class);
	
		usercredentials.asLists();
		
		//asMaps
		//asList
		
	
	
		/*
		 * for (Map<String, String> data : table) {
		 * 
		 * data.get("UserName"); data.get("Password");
		 * 
		 * 
		 * 
		 * }
		 */
	
	}

	@Given("user is on Accounts page")
	public void user_is_on_accounts_page() {;}



	@When("user gets accounts section")
	public void user_gets_accounts_section(DataTable dataTable) {
	 
	}

	@When("accounts section count should be {int}")
	public void accounts_section_count_should_be(Integer int1) {
	 
	}
	
	
	
	
	
}
