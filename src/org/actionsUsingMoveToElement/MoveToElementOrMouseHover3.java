package org.actionsUsingMoveToElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementOrMouseHover3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		
		driver.get("https://econsultancy.com/10-useful-examples-of-mouseover-effects-for-ecommerce-sites/");
	
		Actions as = new Actions(driver);
		
		WebElement learning = driver.findElement(By.xpath("//span[text()='Learning Solutions']"));
		as.moveToElement(learning).perform();
		
		Thread.sleep(2000);
		WebElement whoItsFor = driver.findElement(By.xpath("//span[text()='Who It’s For']"));
		as.moveToElement(whoItsFor).perform();
		
		Thread.sleep(2000);
		WebElement econsultancy = driver.findElement(By.xpath("//span[text()='Why Econsultancy']"));
		as.moveToElement(econsultancy).perform();
		
		Thread.sleep(2000);
		WebElement resources = driver.findElement(By.xpath("//span[text()='Resources']"));
		as.moveToElement(resources).perform();
		
		Thread.sleep(2000);
		driver.close();
	}
}
