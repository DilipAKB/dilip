package BasePackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class InitializeDriver {
	
	 public WebDriver driver=new ChromeDriver();
	
	public WebDriver initdriver() throws IOException {
		
		FileInputStream fis = new FileInputStream("/Users/dilipreddy/Downloads/Automation/CucumberTest/src/test/java/input.properties");

		Properties prop = new Properties();
		prop.load(fis);
		
		System.setProperty("WebDriver.chrome.driver", "/usr/local/bin/chromedriver");
		driver.manage().window().maximize();		
       driver.get(prop.getProperty("url"));
	return driver;		

	}

}
