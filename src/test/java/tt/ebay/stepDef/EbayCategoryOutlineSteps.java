package tt.ebay.stepDef;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EbayCategoryOutlineSteps {
	
	

	@When("^Search for \"([^\"]*)\">$")
	public void search_for(String item) throws Throwable {
	    
	}

	@When("^Select by \"([^\"]*)\"$")
	public void select_by(String category) throws Throwable {
	   
	}

	@Then("^Validate Item list by \"([^\"]*)\"$")
	public void validate_Item_list_by(String category) throws Throwable {
	}



}
