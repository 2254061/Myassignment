package may20;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class week2Day2hw1 {

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
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Jothi24");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Uday");
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("testleaf");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Test");
		driver.findElement(By.name("submitButton")).click();
		Thread.sleep(5000);
		String title = driver.getTitle();
		System.out.println("Title"+title);
		driver.close();

	}

}




