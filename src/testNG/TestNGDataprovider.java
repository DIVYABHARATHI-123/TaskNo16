package testNG;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDataprovider {
		WebDriver driver;
		
		@BeforeMethod
		public void beforeMethod() {
			driver=new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.saucedemo.com/");
			driver.manage().window().maximize();
		}
		
		
		
		@Test(dataProvider="LoginDataProvider")
		public void TestLogin(String username,String password) {
			
			driver.findElement(By.id("user-name")).sendKeys(username);		
			driver.findElement(By.id("password")).sendKeys(password);	
			driver.findElement(By.id("login-button")).click();
			String ExpectedT="Swag Labs";
			String ActualT=driver.getTitle();
			Assert.assertEquals(ExpectedT, ActualT);
			
		}
		
		
		
		
		@DataProvider(name="LoginDataProvider")
		public Object[][] LoginData(){
			return new Object[][]
			{
				{"standard_user", "secret_sauce"},
				{"locked_out_user", "secret_sauce"},
				{"problem_user", "secret_sauce"},
				{"performance_glitch_user", "secret_sauce"}
			};
					
			}
			
		@AfterMethod
		public void AfterM() {
			driver.close();
		
		
			
		}
		
		
		
		
	}

