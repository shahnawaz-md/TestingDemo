package ejobIndia;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeTest6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Exercise
		//Launch Chrome browser
		//Open URL “http://toolsqa.wpengine.com/automation-practice-table/”
		//Get the value from cell ‘Dubai’ and print it on the console
		//Click on the link ‘Detail’ of the first row and last column
		
		WebDriver driver;
		
		String Url = "http://toolsqa.wpengine.com/automation-practice-table/";
		
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
				
		//Add Implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Launch the Url
		driver.get(Url);
		driver.manage().window().maximize();
		
		//Here we are storing the value from the cell in to the string variable
		String cValue = driver.findElement(By.xpath("//*[@id='content']/table/tbody/tr[1]/td[2]")).getText();
		System.out.println(cValue);
		Thread.sleep(2000);
		
		// Here we are clicking on the link of first row and the last column
		driver.findElement(By.xpath("//*[@id='content']/table/tbody/tr[1]/td[6]/a")).click();
		System.out.println("Link has been clicked otherwise an exception would have thrown");
		
		// Close Browser
		driver.close();
		
		System.out.println("Browser Closed");
		

	}

}
