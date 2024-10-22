package task23;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		
		
		WebDriver driver = new FirefoxDriver();
		String URL = "https://jqueryui.com/droppable/";
		driver.get(URL);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Actions class method to drag and drop 
		Actions builder = new Actions(driver);
		WebElement from = driver.findElement(By.id("container"));
		WebElement to = driver.findElement(By.id("content-wrapper")); 
		//Perform drag and drop
		builder.dragAndDrop(from, to).perform();
		//verify text changed in to 'Drop here' box 
		String textTo = to.getText();
		if(textTo.equals("Dropped!")) {
		System.out.println("PASS: File is dropped to target as expected");
		}else {
		System.out.println("FAIL: File couldn't be dropped to target as expected");
		}
		driver.close();
	}

}
