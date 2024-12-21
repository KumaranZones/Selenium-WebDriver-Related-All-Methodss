package org.chromeOptionsMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationDisabled {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\ChromeDriver\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("-disable-notifications");
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://www.facebook.com");
		List<WebElement> aTag = driver.findElements(By.tagName("a"));
		System.out.println(aTag.size());
	}
}
