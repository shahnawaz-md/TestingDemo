package ejobIndia;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MyFirstSeleniumScriptUsingTestNG {
	
	WebDriver driver;
	 String expectedTitle = "Welcome: Mercury Tours";
	 String actualTitle = "";
	 
	 @BeforeClass
		
		public void setup() throws InterruptedException {
			
			
			System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			
			driver.get("http://demo.guru99.com/selenium/newtours/");
			driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
			Thread.sleep(2000);
			driver.manage().window().maximize();
			Thread.sleep(2000);
			
			
		}
		
		@AfterClass
		
		public void teardown() {
			 
			driver.close();
			driver.quit();
		}
		
		@Test
		
		public void sample() throws InterruptedException {
			
				actualTitle = driver.getTitle();
		        
		        /*
		         * compare the actual title of the page with the expected one and print
		         * the result as "Passed" or "Failed"
		         */
		        if (actualTitle.contentEquals(expectedTitle)){
		            System.out.println("Test Passed!");
		        } else {
		            System.out.println("Test Failed");
		        }
		        
		}
		
	
	
		
		
		
	
	
	
	
	

}
