package may20;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Week2day3HW {

	public static void main(String[] args) {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("guest");
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElement(By.xpath("//p[@class ='top']/input[@id = 'username']")).sendKeys("democsr");
		driver.findElement(By.xpath("//label[text() = 'Password']/following-sibling::input[@id ='password']")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[text() ='Create Lead']/following ::a[text() ='Create Account']")).click();
		driver.findElement(By.id("accountName")).sendKeys("Josh3");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		WebElement dd = driver.findElement(By.name("industryEnumId"));
		Select option = new Select(dd);
		option.selectByIndex(3);
		WebElement dd1 = driver.findElement(By.name("ownershipEnumId"));
		Select opt1 = new Select(dd1);
		opt1.selectByVisibleText("S-Corporation");
		WebElement dd2 = driver.findElement(By.id("dataSourceId"));
		Select opt2=new Select(dd2);
		opt2.selectByValue("LEAD_EMPLOYEE");
		WebElement dd3 = driver.findElement(By.id("marketingCampaignId"));
		Select opt3 = new Select(dd3);
		opt3.selectByIndex(6);
		WebElement dd4 = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select opt4 = new Select(dd4);
		opt4.selectByValue("TX");
		driver.findElement(By.className("smallSubmit")).click();
		
	}

}

//Select "S-Corporation" as ownership using SelectByVisibleText.
//- Select "Employee" as the source using SelectByValue.
//- Select "eCommerce Site Internal Campaign" as the marketing campaign using SelectByIndex.
//- Select "Texas" as the state/province using SelectByValue.
//- Click the "Create Account" button.
//- Verify that the account name is displayed correctly.
//- Close the browser window.
