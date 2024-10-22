package testNG;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TakeScreenshotFullPage {

	public static void main(String[] args) throws IOException {
		

		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
        File src=((FirefoxDriver)driver).getFullPageScreenshotAs((OutputType.FILE));
		
		File dest=new File("./Seleniumscreenst/screen3.png");
		
        FileUtils.copyFile(src, dest); 
		
		System.out.println("Screenshot is captured");
		driver.quit();
	}

}
