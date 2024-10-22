package seleniumIntroduction;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutoIT2 {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
		
		WebElement el = driver.findElement(By.name("file"));
		Actions builder = new Actions(driver);
		builder.moveToElement( el ).click( el );
		builder.perform();
		
		
		Thread.sleep(500);
		Runtime.getRuntime().exec("C:\\AutoIt\\UploadFile.exe");
		System.out.println("AutoIT script run");

	}

}
