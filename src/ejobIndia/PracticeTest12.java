package ejobIndia;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeTest12 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Handle Frames
		// Frames using Index
		//Frames using Name
		//Frame using Id
		//Frame using WebElement
		
		WebDriver driver;
		
		String Url = "http://toolsqa.wpengine.com/iframe-practice-page/";
		
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
				
		//Add Implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Launch the Url
		driver.get(Url);
		driver.manage().window().maximize();
		
		//Finding total no. of iFrame in the page
		JavascriptExecutor exe = (JavascriptExecutor) driver;
		Integer numberOfFrames = Integer.parseInt(exe.executeScript("return window.length").toString());
		System.out.println("Number of iframes on the page are " + numberOfFrames);
		
		//By finding all the web elements using iframe tag
		List<WebElement> iframeElements = driver.findElements(By.tagName("iframe"));
		System.out.println("The total number of iframes are " + iframeElements.size());
		
		//Switching on Frames using Index
		driver.switchTo().frame(0);
		
		System.out.println("Frames has been switched otherwise an exception would have thrown");
		Thread.sleep(2000);
		
		
		/*//Switch by frame name
		driver.switchTo().frame("iframe1");
		
		
		//Switch by frame ID
		driver.switchTo().frame("IF1");
		
		
		//Switch by Webelement
		WebElement iframeElement = driver.findElement(By.id("IF1"));
		 
		//now use the switch command
		driver.switchTo().frame(iframeElement);*/
		
		//Close Browser
		driver.close();
		System.out.println("Browser Closed");
		
		
		
		
		
		
		
		
		

	}

}
