package testNG;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;
import org.testng.annotations.Test;




public class TestNGPractical {
	
	WebDriver driver;  // Define in class scope to make it available for all methods 
	/*
	@BeforeMethod
	public void beforeMethod() {
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com");
		driver.manage().window().maximize();	
		System.out.println("I am in before Method");
	}
	@Test
	public void test1() {
		String ExpectedT="Google";
		String ActualT=driver.getTitle();
		Assert.assertEquals(ExpectedT, ActualT);
		System.out.println("I am in Test1 Method");
		}
	
	@Test
	public void test2() {
		String ExpectedT="Googlee";
		String ActualT=driver.getTitle();
		Assert.assertEquals(ExpectedT, ActualT);
		System.out.println("I am in Test2 Method");
	}
	
	@AfterMethod
	public void AfterMethod() {
		driver.close();
		System.out.println("I am in After Method");
	}
	*/
	
	
	@BeforeClass
	public void beforecls() {
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com");
		driver.manage().window().maximize();	
		System.out.println("I am in before clASS");
	}
	
	
	@Test
	public void test1() {
		String ExpectedT="Google";
		String ActualT=driver.getTitle();
		Assert.assertEquals(ExpectedT, ActualT);
		System.out.println("I am in Test1 Method");
		}
	
	@Test
	public void test2() {
        WebElement element=driver.findElement(By.id("APjFqb"));
		Actions objAct=new Actions(driver);
		objAct.sendKeys(element,"iphone").sendKeys(Keys.ENTER)
		.build() // Asking actions class to work with webdriver to perform the actions
		.perform(); 
		
		System.out.println("I am in test2");
		
	}
	
	@AfterClass
	public void Aftercls() {
		driver.close();
		System.out.println("I am in After class");
	}
}


