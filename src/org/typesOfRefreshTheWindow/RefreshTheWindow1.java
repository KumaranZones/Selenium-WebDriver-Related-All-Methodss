package org.typesOfRefreshTheWindow;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RefreshTheWindow1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		try {
			Thread.sleep(4000);
		}catch(InterruptedException e) {
			System.out.println("Throw the InternalThreadTimeOutException");
		}
		driver.navigate().refresh();
	}
}
