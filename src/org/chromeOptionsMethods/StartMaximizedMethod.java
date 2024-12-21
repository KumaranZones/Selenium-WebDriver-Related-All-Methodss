package org.chromeOptionsMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class StartMaximizedMethod {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",".\\ChromeDriver\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--start-maximized");
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://www.facebook.com");
	}
}
