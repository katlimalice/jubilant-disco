package verificationpoints;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class LoginVerificationPoints {
	private WebDriver driver;
	
	public LoginVerificationPoints (WebDriver driver) {
		this.driver = driver;
		
	}

	public void checkHelloMessage() throws Throwable {
		
		if((this.driver.getPageSource().contains("Hi demo"))) {
			TimeUnit.SECONDS.sleep(5);
			System.out.println("Entrou");
		} else {
			System.out.println("Não Entrou");
		}

	}
}