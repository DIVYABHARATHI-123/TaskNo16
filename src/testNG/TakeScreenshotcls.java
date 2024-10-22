package testNG;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;



public class TakeScreenshotcls {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.testim.io/");
		driver.manage().window().maximize();
		
		// Use TakesScreenshot class to capture screenshot
		TakesScreenshot screenshot=(TakesScreenshot) driver;
		//Taking the screenshot and Setting the file format 
		File source=screenshot.getScreenshotAs(OutputType.FILE);
		//copying the screenshot to the location
		FileUtils.copyFile(source, new File("./Seleniumscreenst/screen.png"));
		
		System.out.println("Screenshot is captured");
		driver.quit();
		
		
	}

}
