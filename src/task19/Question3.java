package task19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question3 {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		driver.findElement(By.name("search")).sendKeys("Artificial Intelligence");
		driver.findElement(
				
				By.xpath("//*[@class='search-container']//*[@class='pure-button pure-button-primary-progressive']"))
				.click();
		WebElement e = driver.findElement(By.id("toc-History"));
		e.click();
		System.out.println(e.getText());
		Thread.sleep(2000);

		driver.close();

	}

}
