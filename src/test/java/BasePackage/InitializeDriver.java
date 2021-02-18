package BasePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class InitializeDriver {
	
	 public WebDriver driver=new ChromeDriver();
	
	public WebDriver initdriver() {
		
		System.setProperty("WebDriver.chrome.driver", "/usr/local/bin/chromedriver");
		driver.manage().window().maximize();		
       driver.get("https://www.google.com");
	return driver;		

	}

}
