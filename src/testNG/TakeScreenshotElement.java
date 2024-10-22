package testNG;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class TakeScreenshotElement {

	public static void main(String[] args) throws IOException {
		

		WebDriver driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.testim.io/");
		driver.manage().window().maximize();
		WebElement elementLogo=driver.findElement((By.className("h-logo")));
		
		File src=elementLogo.getScreenshotAs((OutputType.FILE));
		
		File dest=new File("./Seleniumscreenst/screen2.png");
		
        FileUtils.copyFile(src, dest); 
		
		System.out.println("Screenshot is captured");
		driver.quit();
	}

}
