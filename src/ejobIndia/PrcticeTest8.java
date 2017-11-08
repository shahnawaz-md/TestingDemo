package ejobIndia;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PrcticeTest8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Excercise
		//Launch Chrome Browser
		//Open URL “http://toolsqa.wpengine.com/automation-practice-switch-windows/”
		//Click on the Button “Timing Alert”
		//Accept the Alert (Alert will take 3 second to get displayed, Use WebDriverWait to wait for it)
		

		WebDriver driver;
		
		String Url = "http://toolsqa.wpengine.com/automation-practice-switch-windows/";
		
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
				
		//Add Implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Launch the Url
		driver.get(Url);
		driver.manage().window().maximize();
		
		//Scroll down
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,450)", "");
		
		// Click on Timing Alert button
		
		driver.findElement(By.id("timingAlert")).click();
		Thread.sleep(5000);
		
		System.out.println("Timer JavaScript Alert is triggered but it is not yet opened");
		 
        // Create new WebDriver wait
 
        WebDriverWait wait = new WebDriverWait(driver, 10);
 
        // Wait for Alert to be present
 
        Alert myAlert = wait.until(ExpectedConditions.alertIsPresent());
 
        System.out.println("Either Pop Up is displayed or it is Timed Out");
 
        // Accept the Alert
 
        myAlert.accept();
 
        System.out.println("Alert Accepted");
        
        
        //Browser Closed
        driver.close();
        
        System.out.println("Browser Closed");

	}

}
