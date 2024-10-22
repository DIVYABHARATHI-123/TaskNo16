package seleniumIntroduction;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookiescls {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.guru99.com/test/cookie/selenium_aut.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("username")).sendKeys("abcd");
		driver.findElement(By.name("password")).sendKeys("1234");
	    driver.findElement(By.name("submit")).click();
	     
	     // create file to store login info - cookies file 
	  
	     File file=new File("Cookies.data");
	     
	     try {
	     //delete old file 
	        file.delete();
	   		file.createNewFile();
		    FileWriter fileWrite=new FileWriter(file);
	     BufferedWriter BWrite=new BufferedWriter(fileWrite);
	     
	     for (Cookie ck:driver.manage().getCookies()) {
	    	 BWrite.write((ck.getName() + ";" +ck.getValue() +";" +ck.getDomain()+";"+ck.getPath()
	    	 +";" +ck.getExpiry() +";" +ck.isSecure()));
	    	 
	    	 BWrite.newLine();
	    	 
	     }

BWrite.close();	
fileWrite.close();
	     
}catch(	IOException e)
{
	
	e.printStackTrace();
}

	}

}
