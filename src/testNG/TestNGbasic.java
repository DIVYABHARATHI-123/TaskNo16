package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGbasic {

	
	@Test
		public void OpenBrowser() {
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.google.com/");
		}

	}