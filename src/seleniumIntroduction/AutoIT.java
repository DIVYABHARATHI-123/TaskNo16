package seleniumIntroduction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoIT {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.guru99.com/test/autoit.html");
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,800)");

		

		driver.switchTo().frame("JotFormIFrame-72320244964454");

		driver.findElement(By.name("q3_name")).sendKeys("ABCD");

		driver.findElement(By.id("input_4")).sendKeys("ABCD@gmail.com");
		

	}

}
