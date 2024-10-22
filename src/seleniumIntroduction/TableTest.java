package seleniumIntroduction;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableTest {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.guru99.com/test/web-table-element.php#");
		
		List<WebElement> column= driver.findElements(By.xpath("//table/thread/tr/th"));
		System.out.println("Col size is " + column.size());
		List<WebElement> row= driver.findElements(By.xpath("//table/thread/tr/th"));
		System.out.println("row size is " + row.size());
	}

}
