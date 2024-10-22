package stepdefinition;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionWithBackground {
	
	WebDriver driver;
	
	/*
	@Before //- runs before each scenario in feature file 
	public void Setup() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		System.out.println("Browser is opened");
	}
	@After //- runs after each scenario in the feature file 
	public void teardown() {
		System.out.println("Closing browser");
		driver.close();
	}
	
	//@BeforeSteps - runs before each step
	//@AfterSteps  - runs after each step
	 * 
	 */
	
	@Given("user is on the login page")
	public void user_is_on_the_login_page() {
	  	
		driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	}
	
	@When("user enters {string} and {string}")
	public void user_enters_username_and_password(String uname, String psw) {
	    driver.findElement(By.name("login")).sendKeys(uname);
	    driver.findElement(By.name("passwd")).sendKeys(psw);
	}
	

	@And("^user clicks on Rediff.com link$")
	public void user_clicks_on_rediff_com_link() throws InterruptedException {
	    driver.findElement(By.linkText("rediff.com")).click();
	    Thread.sleep(100);
		
	}

	@Then("user is navigated to {string}") // Then keywords should be containing the asserts always  
	public void user_is_navigated_to (String expectedTitle) throws InterruptedException {
	 
		String ActualTitle=driver.getTitle();
		 Thread.sleep(100);
		assertEquals(expectedTitle,ActualTitle);
		
	}

}
