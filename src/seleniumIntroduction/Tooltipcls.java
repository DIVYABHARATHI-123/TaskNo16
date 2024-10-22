package seleniumIntroduction;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tooltipcls {

	@Test
		public void tool() {
			
	        WebDriver driver=new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://jqueryui.com/tooltip/");
			driver.manage().window().maximize();
			
			WebElement element=driver.findElement(By.id("age"));
			String tooltip=element.getAttribute("title");
			String expectedToolTip="We ask for your age only for statistical purposes.";
			assertEquals(expectedToolTip, tooltip);
			
			
	}

}
