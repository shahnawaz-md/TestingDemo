package ejobIndia;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultipleBrowserPracticeTest {
	
	public WebDriver driver;
	 
	  @Parameters("browser")
	 
	  @BeforeClass
	 
	  // Passing Browser parameter from TestNG xml
	 
	  public void beforeTest(String browser) {
	 
	  // If the browser is Firefox, then do this
	 
	  if(browser.equalsIgnoreCase("firefox")) {
		  
		  
		  System.setProperty("webdriver.gecko.driver", "D:\\Drivers\\geckodriver.exe");
		  driver = new FirefoxDriver();
	 
	  // If browser is IE, then do this	  
	 
	  }else if (browser.equalsIgnoreCase("chrome")) { 
	 
		  // Here I am setting up the path for my ChromeDriver
	 
		  System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
	 
		  driver = new ChromeDriver();
		  
		  driver.manage().window().maximize();
	 
	  } 
	 
	  // Doesn't the browser type, lauch the Website
	 
	  driver.get("http://surge.opensis.com/demo/Login/login"); 
	 
	  }
	 
	  // Once Before method is completed, Test method will start
	 
	  @Test public void login() throws InterruptedException {
	 
		/*driver.findElement(By.xpath(".//*[@id='account']/a")).click();
		Thread.sleep(1000);*/
	 
	    driver.findElement(By.id("UserLogin_user_name")).sendKeys("admin");
	    Thread.sleep(1000);
	    
	    driver.findElement(By.id("UserLogin_password")).sendKeys("admin@123");
	    Thread.sleep(1000);
	    
	    driver.findElement(By.name("yt0")).click();
	    Thread.sleep(1000);
	    
	    driver.findElement(By.xpath("//*[@id='main_div2']/div/div/div/div/div[2]/a[2]")).click();
	    Thread.sleep(1000);
	    
		}  
	 
	  @AfterClass public void afterTest() {
	 
			driver.quit();
	 
		}

}
