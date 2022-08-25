package libreries;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public  WebDriver driver;
	
	public void initialization(){
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");	
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.imdb.com");
	}
	}


