package testNG;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportscls {
	
	
	   //Classes :  ExtentSparkReporter class - Customize the report, sets the path , 
		//ExtentReports ( Generates HTML reports)
		ExtentSparkReporter reporter;
		ExtentReports extent;
		ExtentTest test;
		
		@BeforeTest
		public void config() {
			String path=System.getProperty("user.dir")+"\\reports\\index.html";
			reporter=new ExtentSparkReporter(path);
			reporter.config().setReportName("SauceDemo Test Results");
			reporter.config().setDocumentTitle("Login Test Results");
			
			extent=new ExtentReports();
			extent.attachReporter(reporter); // Association between ExtentSparkReporter n ExtentReports
		    extent.setSystemInfo("Tester", "Mrudul");
		}
			
		@Test
		public void FirstTest() {
			 test=extent.createTest("FirstTest");  // creating test section inside report
			WebDriver driver=new EdgeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.saucedemo.com/");
			driver.manage().window().maximize();
			driver.findElement(By.id("user-name")).sendKeys("standard_user");		
			driver.findElement(By.id("password")).sendKeys("secret_sauce");	
			driver.findElement(By.id("login-button")).click();
			String ExpectedT="Swag Labs";
			String ActualT=driver.getTitle();
			Assert.assertEquals(ExpectedT, ActualT);
			
				
		}
		
		@Test
		public void SecondTest() {
			test=extent.createTest("SecondTest");  // creating test section inside report
		   
			WebDriver driver=new EdgeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.saucedemo.com/");		
			driver.findElement(By.id("password")).sendKeys("secret_sauce");	
			driver.findElement(By.id("login-button")).click();
			String ExpectedT="Swag Labss";
			String ActualT=driver.getTitle();
			Assert.assertEquals(ExpectedT, ActualT);
			
			
				
		}
		@AfterTest
		public void aftertest() {
			extent.flush();
		}
			
		
		// ITestListener is interface used to log all kind of test results into extent report
		//ITestResult logs all test results into extent report
		
		@AfterMethod
		public void getResult(ITestResult result) {
			if(result.getStatus()==ITestResult.FAILURE)
				test.log(Status.FAIL,result.getThrowable());
		}
		}
