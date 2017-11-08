package ejobIndia;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeTest11 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// Example Simple Alerts
		//Example Confirmation Alert
		//Example Prompt Alert
		
		WebDriver driver;
		
		String Url = "http://toolsqa.wpengine.com/handling-alerts-using-selenium-webdriver/";
		
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
				
		//Add Implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Launch the Url
		driver.get(Url);
		driver.manage().window().maximize();
		
		//Scroll Down
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,450)", "");
		
		//Simple Alert
		
		driver.findElement(By.xpath("//*[@id='content']/p[4]/button")).click();
		Thread.sleep(2000);
		
		Alert simpleAlert = driver.switchTo().alert();
		String alertText = simpleAlert.getText();
		System.out.println("Alert text is " + alertText);
		simpleAlert.accept();
		
		Thread.sleep(1000);
		
		//Confirmation Alert
		
		/*WebElement element = */driver.findElement(By.xpath("//*[@id='content']/p[8]/button")).click();
		
		//((JavascriptExecutor) driver).executeScript("arguments[0].click()", element);
		Thread.sleep(2000);
		
		Alert confirmationAlert = driver.switchTo().alert();
		String alertText1 = simpleAlert.getText();
		System.out.println("Alert text is " + alertText1);
		confirmationAlert.dismiss();
		
		Thread.sleep(3000);
		
		//Prompt Alert
		
		driver.findElement(By.xpath("//*[@id='content']/p[11]/button")).click();
		Thread.sleep(2000);
		
		Alert promptAlert = driver.switchTo().alert();
		String alertText2 = simpleAlert.getText();
		System.out.println("Alert text is " + alertText2);
		
		promptAlert.sendKeys("Accepting the Alert");
		Thread.sleep(2000);
		promptAlert.accept();
		
		
		
		// Close Browser
		driver.close();
		System.out.println("Browser Closed");
		
		

	}

}
