package ejobIndia;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeTest1 {
	//Excercise
	//Launch a new Chrome browser.
	//Open Store.DemoQA.com
	//Get Page Title name and Title length
	//Print Page Title and Title length on the Eclipse Console.
	//Get Page URL and verify if the it is a correct page opened
	//Get Page Source (HTML Source code) and Page Source length
	//Print Page Length on Eclipse Console.
	//Close the Browser.
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		// Storing the Application Url in the String Variable
		String Url = "http://www.store.demoqa.com";
		driver.get(Url);
		
		// Maximize the window
		driver.manage().window().maximize();
		
		// Storing the Application Title in the String Variable
		String pageTitle = driver.getTitle();
		
		// Storing the Title Length in the integer Variable
		int pageTitleLength = driver.getTitle().length();
		
		System.out.println("The Title of the Page is: " +pageTitle);
		
		System.out.println("Length of the Title is: " +pageTitleLength);
		
		
		//Storing the Current Url in the String Variable
		String actualUrl = driver.getCurrentUrl();
		
		if(actualUrl.equals(Url)) {
			System.out.println("Verification Successful - The correct Url is opened.");
		}
		else {
			System.out.println("Verification Failed - An incorrect Url is opened.");
		}
	
		
		//In case of Fail, you like to print the actual and expected URL for the record purpose
		System.out.println("Actual Url is: " +actualUrl);
		
		System.out.println("Expected Url is: " +Url);
		
		//Storing the Page Source Code in the String Variable
		//String pageSource = driver.getPageSource();
		
		//Storing the Page Source Code Length in the Integer Variable 
		int pageSourceLength = driver.getPageSource().length();
		
		// Printing length of the Page Source on console
		System.out.println("Total length of the Pgae Source is : " + pageSourceLength);
		
		Thread.sleep(5000);
		
		
		//Close Browser
		driver.quit();
		driver.close();
		
		
		
		
		
		
		
		
		
		
		

	}

}
