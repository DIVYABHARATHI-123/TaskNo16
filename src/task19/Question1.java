package task19;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    WebDriver driver = null;
        try {
            // Setup WebDriverManager to manage the WebDriver binaries
            WebDriverManager.firefoxdriver().setup();
            
            // Initialize FirefoxDriver
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
            
            // Navigate to Google
            driver.get("https://www.google.com");
           System.out.println(driver.getTitle());
            
            // Refresh the page
            driver.navigate().refresh();
            
            // Wait for a while to observe the refreshed page (optional)
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            if (driver != null) {
               // driver.quit();
            }
        }
    }	}
