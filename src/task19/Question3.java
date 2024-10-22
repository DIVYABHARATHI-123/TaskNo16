package task19;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Question3 {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));   //implicitly waiting throughout the process
		//Thread.sleep(20000);
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		
		  driver.findElement(By.cssSelector("input#searchInput")).sendKeys("Artificial Inteligence");  
		  driver.findElement(By.cssSelector("a.suggestion-link")).click();                          //Enter the search keyword and inspect the suggention text on which i want to navigate
		 
           //Thread.sleep(20000);
		  //Searches for the query "Artificial Inteligence"--tell driver to locate search webelement and enter the text for search
		  
		 driver.findElement(By.xpath("//a[@href='#History']")).click();                             //clcik on History section
		 System.out.println(driver.findElement(By.cssSelector("a[href='#History']")).getText());    //Get the title of the section
	}

}
