package tt.utilities;

import cucumber.api.Scenario;
import cucumber.api.java.Before;

public class BeforeActions {
	
	@Before
	public void beforeActions(Scenario scen){  // parameter=senario
		System.out.println(">>>>>> Initializing Chrome Driver>>>>>");
		SetupDrivers.setupDriver(); //connect set up driver to beforeactions class
		System.out.println(scen.getName()); // printing which scenario iam working on
	}
}

//before running any test call the set up driver.


