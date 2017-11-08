package ejobIndia;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstSeleniumScript {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// declaration and instantiation of objects/variables
		
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		
		String expectedTitle = "Welcome: Mercury Tours";
		String actualTitle = "";
		
		// launch Chrome and direct it to the given URL
		driver.get("http://demo.guru99.com/selenium/newtours/");
		
		// maximize the window
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		// get the actual value of the title
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
        
        
        driver.quit();
        driver.close();

		
		
		
		
		
		
		

		
		

	}

}
