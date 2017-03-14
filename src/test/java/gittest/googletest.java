package gittest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class googletest {

	
	public void sample(){

		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vignesh\\workspace\\Practice\\browser\\chromedriver.exe");
		
		WebDriver wd = new ChromeDriver();

		wd.manage().window().maximize();
		wd.get("https://www.google.co.in/");
	}
}
