package task18;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://Google.com");
		// driver.close();

		// driver.getTitle(); //get the title of the current page,title of the browser
		String s = driver.getTitle();
		System.out.println(s);

	    //wait function instead of that thread.sleep
		Thread.sleep(15000); //generally in selenium its not used
		driver.close();// to close the driver automatically,current browser will be closed

	}


}

	
