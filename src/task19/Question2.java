package task19;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));   //implicitly waiting throughout the process
        driver.get("https://demoblaze.com/");                               //telling driver to find the website-navigates to the website
        driver.manage().window().maximize();                                //maximize the browser window
        System.out.println(driver.getTitle());                              //verifies title of the page
        if(driver.getTitle().equals("STORE"))                               //case sensitive text
        {
        	System.out.println("Page Landed on the correct website");
        }

        else
        {
        	System.out.println("page not landed on the correct website");
        }
        driver.close();
}}