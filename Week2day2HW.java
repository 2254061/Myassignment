package may20;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Week2day2HW {

	public static void main(String[] args) throws InterruptedException {
	
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("guest");
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(opt);
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("democsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		Thread.sleep(5000);
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Jothi24");
	Thread.sleep(2000);
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.id("numberEmployees")).sendKeys("1");
		driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		driver.findElement(By.className("smallSubmit")).click();
		Thread.sleep(5000);
		String title = driver.getTitle();
		System.out.println("Title"+title);
		driver.close();
		
		
		//Enter an account name.
		// Enter a description as "Selenium Automation Tester."
		//Enter a Number Of Employees.
		//Enter a Site Name as “LeafTaps”
		//Click the "Create Account" button.
		//Verify that the Title is displayed correctly.
		//Close the browser window.

			
		
		
	}

}
