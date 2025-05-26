package may20;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Week2day3hw1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("guest");
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		driver.findElement(By.name("firstname")).sendKeys("Josh");
		driver.findElement(By.name("lastname")).sendKeys("Joe");
		WebElement dd = driver.findElement(By.id("day"));
		Select opt1 = new Select(dd);
		opt1.selectByVisibleText("24");
		WebElement dd1 = driver.findElement(By.id("month"));
		Select opt2 = new Select(dd1);
		opt2.selectByVisibleText("Dec");
		WebElement dd2 = driver.findElement(By.id("year"));
		Select opt3 = new Select(dd2);
		opt3.selectByVisibleText("1993");
		WebElement radio = driver.findElement(By.xpath("//label[text()='Female']"));
				radio.click();
		
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("7358532619");
		driver.findElement(By.id("password_step_input")).sendKeys("Test123");
		driver.findElement(By.name("websubmit")).click();
		driver.close();
		
		
		

	}

}
