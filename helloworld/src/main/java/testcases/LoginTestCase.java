package testcases;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import verificationpoints.LoginVerificationPoints;

public class LoginTestCase {
	private WebDriver driver;
	private LoginVerificationPoints verificationPoint;
	
	@Before
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		this.driver = new ChromeDriver();
		this.driver.get("https://demo.virtuemart.net/");
		
		this.verificationPoint = new LoginVerificationPoints(driver);
	}
	
	@Test
	public void testMain() { 
		
		WebElement usernameTextField = this.driver.findElement(By.id("modlgn-username"));
		usernameTextField.sendKeys("demo");
		
		WebElement passwordTextField = this.driver.findElement(By.id("modlgn-passwd"));
		passwordTextField.sendKeys("demo");
		
		WebElement loginButton = this.driver.findElement(By.name("Submit"));
		loginButton.click();
	
		try {
			verificationPoint.checkHelloMessage();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	
	
	@After
	public void tearDown() {
		this.driver.quit();
		
	}

}
