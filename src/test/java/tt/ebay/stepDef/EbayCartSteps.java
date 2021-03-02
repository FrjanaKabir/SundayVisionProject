package tt.ebay.stepDef;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import tt.ebay.pageAction.EbayCartActions;
import tt.ebay.pageAction.EbaySearchResultActions;

public class EbayCartSteps {
	
	EbayCartActions EbayCartLocatorsObj = new EbayCartActions();
	EbaySearchResultActions EbaySerchResultActionsobj = new EbaySearchResultActions();
	
	
	@When("^Select first shirt product on item list$")
	public void select_first_shirt_product_on_item_list() throws Throwable {
		EbaySerchResultActionsobj.selectItem();
		
	    
	}

	@When("^Select color on shirt$")
	public void select_color_on_shirt() throws Throwable {
		EbayCartLocatorsObj.selectColor();
	    
	}

	@When("^select size on shirt$")
	public void select_size_on_shirt() throws Throwable {
		EbayCartLocatorsObj.selectSize();
	    
	}

	@When("^select quantity of shirt$")
	public void select_quantity_of_shirt() throws Throwable {
		EbayCartLocatorsObj.selectQuantity();
	    
	}

	@Then("^Add to cart$")
	public void add_to_cart() throws Throwable {
		EbayCartLocatorsObj.addToCart();
	}



}
