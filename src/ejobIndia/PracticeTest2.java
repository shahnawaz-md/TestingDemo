package ejobIndia;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeTest2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Excercise
		//Launch new Browser
		//Open DemoQA.com website
		//Click on Registration link
		//Come back to Home page (Use ‘Back’ command)
		//Again go back to Registration page (This time use ‘Forward’ command)
		//Again come back to Home page (This time use ‘To’ command)
		//Refresh the Browser (Use ‘Refresh’ command)
		//Close the Browser
		
		WebDriver driver;
		
		// Open the Chrome Browser
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Store the Url in String variable
		
		String Url = "http://www.DemoQA.com";
		
		driver.get(Url);
		
		//Click on Registration link
		driver.findElement(By.id("menu-item-374")).click();
		Thread.sleep(2000);
		
		//Back to Home page using back command
		driver.navigate().back();
		Thread.sleep(2000);
		
		//Back to Registration page forward command
		driver.navigate().forward();
		Thread.sleep(2000);
		
		//back to Home page using to command
		driver.navigate().to(Url);
		Thread.sleep(2000);
		
		//Refresh the browser
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		
		//close the browser
		driver.quit();
		driver.close();
		
		
		
		
		
		

	}

}
