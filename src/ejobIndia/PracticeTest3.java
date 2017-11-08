package ejobIndia;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeTest3 {

	//private static final String WebElement = null;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Exercise
		//Launch new browser
		//Open "http://toolsqa.wpengine.com/automation-practice-form/"
		//Challenge One – Select the deselected Radio button (female) for category Sex (Use IsSelected method)
		//Challenge Two – Select the Third radio button for category ‘Years of Exp’ (Use Id attribute to select Radio button)
		//Challenge Three – Check the Check Box ‘Automation Tester’ for category ‘Profession'( Use Value attribute to match the selection)
		//Challenge Four – Check the Check Box ‘Selenium IDE’ for category ‘Automation Tool’ (Use cssSelector)
		
		
		WebDriver driver;
		
		String Url = "http://toolsqa.wpengine.com/automation-practice-form/";
		
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
				
		//Add Implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Launch the Url
		driver.get(Url);
		driver.manage().window().maximize();
		
		// Step 3 : Select the deselected Radio button (female) for category Sex (Use IsSelected method)
		// Storing all the elements under category 'Sex' in the list of WebLements
		
		List<WebElement> radioButton_Sex = driver.findElements(By.name("sex"));
		
		int ssize = radioButton_Sex.size();
		Thread.sleep(2000);
		System.out.println("Total No of Gender are : " +ssize);
		
		for(int j=0; j < ssize ; j++ ){
			// Store the Radio button name to the string variable, using 'Value' attribute
			String sValue = radioButton_Sex.get(j).getAttribute("value");
			
			
			System.out.println("Types of Gender are: " +sValue);
		
		}	
		// Create a boolean variable which will hold the value (True/False)
		boolean bValue = false;
		
		// This statement will return True, in case of first Radio button is selected
		bValue = radioButton_Sex.get(0).isSelected();
		
		// This will check that if the bValue is True means if the first radio button is selected
		if(bValue == true){
		// This will select Second radio button, if the first radio button is selected by default
			radioButton_Sex.get(0).click();
		}else{
		// If the first radio button is not selected by default, the first will be selected
			radioButton_Sex.get(1).click();
			}
		Thread.sleep(2000);
		//Step 4: Select the Third radio button for category 'Years of Exp' (Use Id attribute to select Radio button)
		WebElement radioButton_Experience = driver.findElement(By.id("exp-2"));
		radioButton_Experience.click();
		Thread.sleep(2000);
		
		//Scroll down
		JavascriptExecutor jse = (JavascriptExecutor) driver;
	    jse.executeScript("window.scrollBy(0,250)", "");
		
		// STep 5: Check the Check Box 'Automation Tester' for category 'Profession'( Use Value attribute to match the selection)
		// Find the Check Box or radio button element by Name
		List<WebElement> checkBox_Profession = driver.findElements(By.name("profession"));
		
		// This will tell you the number of Check Boxes are present
		int iSize = checkBox_Profession.size();
		
		System.out.println("Numbers of Profession: " +iSize);
		
		// Start the loop from first Check Box to last Check Box
		for(int i=0; i < iSize ; i++ ){
		// Store the Check Box name to the string variable, using 'Value' attribute
		String sValue = checkBox_Profession.get(i).getAttribute("value");
		
		System.out.println("Types of Professions are: " +sValue);
		
		// Select the Check Box it the value of the Check Box is same what you are looking for
		if (sValue.equalsIgnoreCase("Automation Tester")){
			checkBox_Profession.get(i).click();
		// This will take the execution out of for loop
				break;
				}
			}
		
		Thread.sleep(2000);
		// Step 6: Check the Check Box 'Selenium IDE' for category 'Automation Tool' (Use cssSelector)
		WebElement checkBox_AutomationTool = driver.findElement(By.cssSelector("input[value='Selenium IDE']"));
		checkBox_AutomationTool.click();
		Thread.sleep(2000);
				
		// Kill the browser
		driver.close();
		//driver.quit();
		System.out.println("Browser Closed");
		
		
	}
		
		

	}


