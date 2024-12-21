package org.actionsUsingMoveToElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementOrMouseHover4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		
		driver.get("https://www.browserstack.com/guide/mouse-hover-in-selenium");
	
		Actions as = new Actions(driver);
		
		WebElement produts = driver.findElement(By.xpath("//button[text()='Products']"));
		as.moveToElement(produts).perform();
		
		Thread.sleep(2000);
		WebElement developers = driver.findElement(By.xpath("//button[text()='Developers']"));
		as.moveToElement(developers).perform();
		
		Thread.sleep(2000);
		driver.close();
	}
}
