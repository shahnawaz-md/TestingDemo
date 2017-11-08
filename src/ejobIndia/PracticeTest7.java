package ejobIndia;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeTest7 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Exercise
		//Launch Chrome Browser
		//Get the value from cell ‘Dubai’ with using dynamic xpath
		//Print all the column values of row ‘Clock Tower Hotel’
		
		WebDriver driver;
		
		String Url = "http://toolsqa.wpengine.com/automation-practice-table/";
		
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
				
		//Add Implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Launch the Url
		driver.get(Url);
		driver.manage().window().maximize();
		
		String sRow = "1";
		String sCol = "2";
		

		//Here we are locating the xpath by passing variables in the xpath
		String sCellValue = driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[" + sRow + "]/td[" + sCol + "]")).getText();
		System.out.println(sCellValue);
		Thread.sleep(2000);
		
		String sRowValue = "Clock Tower Hotel";
		
		//First loop will find the 'ClOCK TWER HOTEL' in the first column
		for (int i=1;i<=5;i++){
		String sValue = null;
		sValue = driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[" + i + "]/th")).getText();
		if(sValue.equalsIgnoreCase(sRowValue)){
			
		// If the sValue match with the description, it will initiate one more inner loop for all the columns of 'i' row 
			for (int j=1;j<=5;j++){
			String sColumnValue= driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[" + i + "]/td["+ j +"]")).getText();
			System.out.println(sColumnValue);
							}
					break;
				}
			}
		
		//Browser Closed
		
		driver.close();
		
		System.out.println("Browser Closed");

	}

}
