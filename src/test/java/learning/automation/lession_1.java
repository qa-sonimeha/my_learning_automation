package learning.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

public class lession_1 
{
	@Test
	public void function_1()
	{
		WebDriverManager.chromedriver().setup();

        // Initializing the WebDriver (ChromeDriver)
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
       /* 
        FE: Selenium, Appium
        BE: REST Assured for running API using the GET/POST/PUT/PATCH
        */
	
        
        
        
	}
	
	

}
