package task19;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\USER\\Downloads\\geckodriver-v0.35.0-win64.exe");
		WebDriver driver = new FirefoxDriver();
	

		driver.navigate().to("https://www.google.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		driver.navigate().refresh();
		driver.close();

	  //  FirefoxOptions options = new FirefoxOptions();
	  //  driver = new FirefoxDriver(options);
	}


}
