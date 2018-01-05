package ejobIndia;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.JXLException;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class DataDrivenPracticeTest {
	
	public static void main(String args[]) throws IOException, JXLException,BiffException,FileNotFoundException, InterruptedException{ 
		
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Sheet s;
		
		
		FileInputStream fi = new FileInputStream("C:\\Users\\Shahnawaz\\Desktop\\Login.xls");
		Workbook w = Workbook.getWorkbook(fi);
		s = w.getSheet(0);
		int z=s.getRows();
		System.out.println("no of rows:"+z);
		driver.get("http://surge.opensis.com/demo/Login/login");
		for(int row=0; row <s.getRows();row++)
		{
		String username = s.getCell(0, row).getContents();
		System.out.println("Username "+username);
		//driver.get("http://www.gmail.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("UserLogin_user_name")).clear();
		driver.findElement(By.id("UserLogin_user_name")).sendKeys(username);
		String password= s.getCell(1, row).getContents();
		System.out.println("Password "+password);
		driver.findElement(By.id("UserLogin_password")).clear();
		driver.findElement(By.id("UserLogin_password")).sendKeys(password);
		Thread.sleep(2000);
		
		 
	    driver.findElement(By.name("yt0")).click();
	    Thread.sleep(1000);
	    
	    driver.findElement(By.xpath("//*[@id='main_div2']/div/div/div/div/div[2]/a[2]")).click();
	    Thread.sleep(1000);
		
	    
	    		}
		
		driver.quit();
		
	}	

}
