package org.actionsUsingMoveToElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementOrMouseHover1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		
		driver.get("https://stqatools.com/404.html");
		
		Actions as = new Actions(driver);
		WebElement mouseHover = driver.findElement(By.xpath("//a[contains(text(),'How to f')]"));
		as.moveToElement(mouseHover).perform();
		as.contextClick(mouseHover).perform();
	}
}
