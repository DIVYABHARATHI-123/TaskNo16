package task19;

import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		 Webdriver driver = new FirefoxDriver();
	
		driver.navigate().to("https://www.google.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		driver.navigate().refresh();
		driver.close();

	 
	}


}
