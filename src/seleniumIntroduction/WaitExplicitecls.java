package seleniumIntroduction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitExplicitecls {

	public static void main(String[] args) {
		
		// WebDriver driver=new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		
		//driver.findElement(By.xpath("//button[text()='Start']")).click();
		
		//WebElement content=driver.findElement(By.xpath("//h4[text()='Hello World!']"));
		
		//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		//Explicit wait -local to webelement
		
		//wait.until(ExpectedConditions.visibilityOf(content));
		
		//System.out.println(content.getText());
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/selenium/web/dynamic.html");
		WebElement revealed=driver.findElement(By.id("revealed"));
		
		driver.findElement(By.id("reveal")).click();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("revealed")));
		driver.findElement(By.id("revealed")).sendKeys("Divyabharathi");
		
		
		
	}

}
