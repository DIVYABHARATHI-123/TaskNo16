package task23;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@class='_42ft_4jy0_6lti_4jy_4jy2 selected _51sy']")).click();
		driver.findElement(By.xpath("//div[@class='_8ien']"));
		driver.findElement(By.name("Phone no")).sendKeys("8124394266");
		driver.findElement(By.name("password")).sendKeys("1234");
	    driver.findElement(By.name("submit")).click();
	}

}
