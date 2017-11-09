package ejobIndia;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PracticeTest14 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Exercise
		//Launch Chrome Browser
		// Mouse hover
		
		WebDriver driver;
		
		String Url = "http://www.store.demoqa.com/";
		
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
				
		//Add Implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Launch the Url
		driver.get(Url);
		driver.manage().window().maximize();
		
		// Mouse Hover to an element
		WebElement menu = driver.findElement(By.xpath("//*[@id='menu-item-33']/a"));
		
		Actions action = new Actions(driver);
		action.moveToElement(menu).perform();
		
		Thread.sleep(2000);
		
		WebElement subMenu = driver.findElement(By.xpath("//*[@id='menu-item-39']/a"));
		subMenu.click();
		
		Thread.sleep(2000);
		System.out.println("Mouse Hover Actions performed successfully");
		
		
		//Close Browser
		driver.close();
		System.out.println("Broser Closed");
		
		
		
		
		

	}

}
