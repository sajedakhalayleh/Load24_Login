package Load24Package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;

public class LoginPageTestCases {

	WebDriver driver = new ChromeDriver();
	String URL = "https://load24_qa.nafithit.com/";

	@BeforeTest

	public void Setup() {
		driver.get(URL);
		driver.manage().window().maximize();
	}

	@Test

	public void LoginPage() throws InterruptedException {
		Thread.sleep(2000);
		WebElement login1 = driver.findElement(By.cssSelector("[data-test-id='Button-zphle']"));
		Thread.sleep(2000);
		login1.click();
		Thread.sleep(2000);
		WebElement username = driver.findElement(By.name("userName"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement login2 = driver.findElement(By.cssSelector("[data-test-id='Button-zphle']"));

		username.sendKeys("omaradmin");
		password.sendKeys("Aa@123456");
		Thread.sleep(1000);
		login2.click();
		Thread.sleep(3000);

		List<WebElement> tabs = driver.findElements(By.className("justify-between"));

		System.out.println(tabs.size());
		for (int i = 0; i < 4; i++) {
			
			tabs.get(i).click();
			Thread.sleep(3000);

		}

	}

	@AfterTest

	public void CloseWebsite()

	{
		driver.close();

	}
}
