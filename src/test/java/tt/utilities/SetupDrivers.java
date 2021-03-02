package tt.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SetupDrivers {

			public static WebDriver driver; 
			
			public static void setupDriver(){ // set up driver for our framework 
			WebDriverManager.chromedriver().browserVersion("88.0.4324.104").setup();
			//System.setProperty("webdriver.chrome.driver",  "C:/TTsoftware/chromedriver.exe"); 
			
			ChromeOptions options = new ChromeOptions();    //argument: don't show me any notification from chrome.
				options.addArguments("--disable-notifications");
				options.addArguments("----start-maximized");
				driver = new ChromeDriver(options);
				
			}
			public static WebDriver getDrive(){   //encapsulation
				return driver;
			}
			public static void tearDownDriver(){
				driver.quit();   //quit the driver
				
			}
		
	}
