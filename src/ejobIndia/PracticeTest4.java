package ejobIndia;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticeTest4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Exercise
		//Launch Chrome Browser
		//Open “http://toolsqa.wpengine.com/automation-practice-form/”
		//Select ‘Continents’ Drop down ( Use Id to identify the element )
		//Select option ‘Europe’ (Use selectByIndex)
		//Select option ‘Africa’ now (Use selectByVisibleText)
		//Print all the options for the selected drop down and select one option of your choice
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
		
		// Step 3: Select 'Continents' Drop down ( Use Id to identify the element )
		// Find Select element of "Single selection" using ID locator.
		
		WebElement continent = driver.findElement(By.id("continents"));
		Select selectContinent = new Select(continent);
		
		// Step 4:) Select option 'Europe' (Use selectByIndex)
		selectContinent.selectByIndex(1);
		Thread.sleep(2000);
		
		//Step 5: Select option 'Africa' now (Use selectByVisibleText)
		selectContinent.selectByVisibleText("Africa");
		
		
		// Step 6: Print all the options for the selected drop down and select one option of your choice
		// Get the size of the Select element
		List<WebElement> continentSize = selectContinent.getOptions();
		int iListSize = continentSize.size();
		
		
		// Setting up the loop to print all the options
		for(int i=0 ; i <iListSize ; i++ ) {
			
			// Storing the value of the option	
			String sValue = selectContinent.getOptions().get(i).getText();
			
			// Printing the stored value
			System.out.println(sValue);
						
			
			// Putting a check on each option that if any of the option is equal to 'Africa" then select it 
				if(sValue.equals("Africa")){
				selectContinent.selectByIndex(i);
					break;
					
						}
				}	   
			
		//Close Browser
		driver.close();
		System.out.println("Browser Closed");
		
		}		
	}	
		
		
		
		

	


