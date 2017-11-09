package ejobIndia;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class PracticeTest13 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Exercise 
		//Launch Chrome Browser
		//Open the Url("http://www.dhtmlx.com/docs/products/dhtmlxTree/index.shtml")
		//Drag and Drop
		
		
		WebDriver driver;
		
		String Url = "http://www.dhtmlx.com/docs/products/dhtmlxTree/index.shtml";
		
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
				
		//Add Implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Launch the Url
		driver.get(Url);
		driver.manage().window().maximize();
		
		//Scroll Down
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,1050)", "");
		
		Thread.sleep(2000);
		
		//Location of an element which is going to drag
		WebElement From = driver.findElement(By.xpath(".//*[@id='treebox1']/div/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[1]/td[4]/span"));
		
		//Location of an element where is going to drop
		WebElement To = driver.findElement(By.xpath(".//*[@id='treebox2']/div/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[1]/td[4]/span"));
		
		Actions builder = new Actions(driver);
		 
		Action dragAndDrop = builder.clickAndHold(From)
		 
		.moveToElement(To)
		 
		.release(To)
		 
		.build();
		 
		dragAndDrop.perform();
		Thread.sleep(5000);
		
		System.out.println("Drag and Drop actions performed successfully");
		
		//Close Browser
		
		driver.close();
		System.out.println("Browser Closed");
		
		
	}

}
