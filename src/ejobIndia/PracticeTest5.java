package ejobIndia;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticeTest5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Exercise
		//Launch Chrome Browser
		//Open “http://toolsqa.wpengine.com/automation-practice-form/”
		//Select ‘Selenium Commands’ Multiple selection box ( Use Name locator to identify the element )
		//Select option ‘Browser Commands’  and then deselect it (Use selectByIndex and deselectByIndex)
		//Select option ‘Navigation Commands’  and then deselect it (Use selectByVisibleText and deselectByVisibleText)
		//Print and select all the options for the selected Multiple selection list.
		//Deselect all options
		//Close the browser
		
		WebDriver driver;
		
		String Url = "http://toolsqa.wpengine.com/automation-practice-form/";
		
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
				
		//Add Implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Launch the Url
		driver.get(Url);
		driver.manage().window().maximize();
		
		// Step 3: Select 'Selenium Commands' Multiple select box ( Use Name locator to identify the element )
		WebElement seleniumCommands = driver.findElement(By.name("selenium_commands"));
		Select selectCommands = new Select(seleniumCommands);
		
		// Step 4: Select option 'Browser Commands' and then deselect it (Use selectByIndex and deselectByIndex)
		selectCommands.selectByIndex(0); 
		Thread.sleep(2000);
		selectCommands.deselectByIndex(0);
		Thread.sleep(2000);
		
		// Step 5: Select option 'Navigation Commands'  and then deselect it (Use selectByVisibleText and deselectByVisibleText)
		selectCommands.selectByVisibleText("Navigation Commands");
		Thread.sleep(2000);
		selectCommands.deselectByVisibleText("Navigation Commands");
		
		// Step 6: Print and select all the options for the selected Multiple selection list.
		List<WebElement> selectCommandSize = selectCommands.getOptions();
		int iListSize = selectCommandSize.size();
		
		System.out.println("No. of Selenium Commands are :" +iListSize);
		
		//Setting up the loop to print all the options
		for(int i =0; i < iListSize ; i++){
		// Storing the value of the option	
		String sValue = selectCommands.getOptions().get(i).getText();
 
		// Printing the stored value
		System.out.println(sValue);
			

		// Selecting all the elements one by one
		selectCommands.selectByIndex(i);
		Thread.sleep(2000);
			}
 
		// Step 7: Deselect all
		selectCommands.deselectAll();
		
		//Close Browser
		driver.close();
		System.out.println("Browser Closed");
		
		
		}
		 

	}


