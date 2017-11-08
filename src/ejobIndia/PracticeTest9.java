package ejobIndia;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeTest9 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// Excercise
		// Launch Chrome Browser
		// Open URL “http://toolsqa.wpengine.com/automation-practice-switch-windows/”
		// Get Window name (Use GetWindowHandle command)
		// Click on Button “New Message Window”, it will open a Pop Up Window
		// Get all the Windows name ( Use GetWindowHandles command)
		// Close the Pop Up Window (Use Switch Command to shift window)
		
		WebDriver driver;
		
		String Url = "http://toolsqa.wpengine.com/automation-practice-switch-windows/";
		
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
				
		//Add Implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Launch the Url
		driver.get(Url);
		driver.manage().window().maximize();
		
		// Store and Print the name of the First window on the console
		String handle = driver.getWindowHandle();
		System.out.println(handle);
		
		// Click on the Button "New Message Window"
		driver.findElement(By.xpath("//*[@id='content']/p[3]/button")).click();
		Thread.sleep(2000);
		
		 // Store and Print the name of all the windows open
		Set<String> handles = driver.getWindowHandles();
        System.out.println(handles);
		
     // Pass a window handle to the other window

        for (String handle1 : driver.getWindowHandles()) {
        	System.out.println(handle1);
        	driver.switchTo().window(handle1);

        	}
        
     // Close popup window
        driver.close();
        System.out.println("Popup window closed");
        Thread.sleep(1000);
        
     // Clsoe all the window open by webdriver
        driver.quit();
        System.out.println("Main browser window closed");
        Thread.sleep(1000);
	}

}
