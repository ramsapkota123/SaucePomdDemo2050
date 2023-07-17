package sauce;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import sauce.page.SaucePage;

public class SauceTest {
	private WebDriver driver;
	private SaucePage saucepage;

	@BeforeTest
	public void displaySetUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rbsap\\Downloads\\wdriver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		saucepage = new SaucePage(driver);
	}

	@Test(priority = 0)
	public void testRightUserNameAndRightPassword() {
		saucepage.setUserbame("standard_user");
		saucepage.setPassword("secret_sauce");
		saucepage.clickButton();
		
	}
		@Test(priority=1)
	public void clickOnBackPack() {
		saucepage.clickBackpack();
		
	}
		
	

	@Test(priority = 2)
	public void clickCartOnSauceDemo() {
		saucepage.clickCart();

	}

	@Test(priority = 3)
	public void dispalyPaymentGateWay() {

		saucepage.clickCheckOut();
		saucepage.FillText("Ram", "Sapkota", "76137");
		saucepage.displayContinue();
		saucepage.displayContinue();
	}
	@Test(priority=4)
	public void displayFinish() {
		saucepage.displayFinish();
		

	}

}
