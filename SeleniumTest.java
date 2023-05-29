package seleniumtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumTest {
   
	@Test
  public void f() throws InterruptedException {
	 //    1. Launch the chrome browser
	 		//Way1
	 		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\username\\eclipse-workspace\\01_SeleniumProject_9May23\\drivers\\chromedriver.exe");
	        
	 		//Way2
	 		
	 		String projectPath = System.getProperty("user.dir");
	 		System.setProperty("webdriver.chrome.driver", projectPath + "\\drivers\\chromedriver.exe");
	 		
	 		WebDriver driver = new ChromeDriver();
	 		Thread.sleep(2000);
	 		
	 		//    2. Launch the parabank app
	 		
	 		driver.get("https://parabank.parasoft.com/parabank/index.htm");
	 		Thread.sleep(2000);
	 		
	 		//    3. Verify the page title
	 		
	 		String expectedResult = "ParaBank | Welcome | Online Banking";
	 		String actualResult = driver.getTitle();
	 		
	 		if(expectedResult.equals(actualResult))
	 		{
	 			System.out.println("Test is passed");
	 		}
	 		else
	 		{
	 			System.out.println("Test is failed");
	 		}
	 		Thread.sleep(2000);
	 		
	 		//    4. Close the chrome browser
	 		//    driver.close();
	 		
	 		driver.quit();
  }
}
