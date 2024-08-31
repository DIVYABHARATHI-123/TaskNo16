package task19;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver", "C:\Users\USER\Downloads\chromedriver-win32.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.demoblaze.com/"); 
		driver.manage().window().maximize();
		if (driver.getTitle().equals("STORE")) {
			System.out.println("Page landed on correct website");

		} else {
			System.out.println("Page not landed on correct website");

		}
		Thread.sleep(2000);

		driver.close();

	}

}
