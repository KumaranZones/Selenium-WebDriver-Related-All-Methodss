package org.webDriverMethods;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver","");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		driver.get("");

		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);

		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

		String pageSource = driver.getPageSource();
		System.out.println(pageSource);

		String windowId = driver.getWindowHandle();
		System.out.println(windowId);

		Set<String> windowsId = driver.getWindowHandles();
		System.out.println(windowsId);

		WebElement element = driver.findElement(By.xpath(""));
		element.click();

		List<WebElement> elements = driver.findElements(By.xpath(""));
		for(WebElement all : elements){
			System.out.println(all.getText());
		}

		TargetLocator switchTo = driver.switchTo();

		Navigation navigate = driver.navigate();
		
		Options manage = driver.manage();

		driver.close();

		driver.quit();
	}
	
}
