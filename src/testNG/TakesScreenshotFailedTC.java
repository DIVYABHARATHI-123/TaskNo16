package testNG;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TakesScreenshotFailedTC {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		try {
		driver.get("https://www.google.com/");
		driver.findElement(By.id("APjFqbbbb")).sendKeys("Selenium");
		} catch(Exception e) {
			TakesScreenshot screenshot1=(TakesScreenshot)driver;
			
			File src=screenshot1.getScreenshotAs((OutputType.FILE));
			File dest=new File("./Seleniumscreenst/screenFailedTC.png");
			FileUtils.copyFile(src, dest);		
			

	}
		
	}
	
}
