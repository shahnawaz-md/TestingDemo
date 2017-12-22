package ejobIndia;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeTest15 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver;
		
		String Url = "http://toolsqa.wpengine.com/iframe-practice-page/";
		
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		 
		// Step 1: Navigate to the page with multiple iframes
		driver.get(Url);
		
		driver.manage().window().maximize();
		
		
		//Scroll Down
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,500)", "");
 
		// Step 2: Switch to first frame and then find First Name and Last name
		// element
 
		/* Switch to the first frame, remember frame index starts from 0 */
		driver.switchTo().frame(0);
 
		/* now find the First name field */
		WebElement firstName = driver.findElement(By.xpath("//*[@id='content']/div[1]/div/div/div/div[2]/div/form/fieldset/div[8]/input"));
 
		/* now find the Last name field */
		WebElement lastName = driver.findElement(By.xpath("//*[@id='content']/div[1]/div/div/div/div[2]/div/form/fieldset/div[11]/input"));
 
		// Step 3: Fill some value in the first name and last name files
		firstName.sendKeys("Virender");
		lastName.sendKeys("Singh");
 
		// Step 4: Switching to the 2nd frame, frame index 1
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		Thread.sleep(2000);
 
		//Step 5: Find image element and click on that
		WebElement imageElement = driver.findElement(By.xpath("//*[@id='post-9']/div/div[1]/div/p[1]/a/img"));
 
		imageElement.click();
		System.out.println("Switching successfull");
		
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(2000);
		 
		// Close the Browser
		driver.close();
		System.out.println("Browser Closed!!");
		

	}

}
