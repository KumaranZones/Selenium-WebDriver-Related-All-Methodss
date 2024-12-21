package org.actionsUsingContextClick;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsUsingContextClick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement sendKey = driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions as = new Actions(driver);
		as.contextClick(sendKey).perform();
		Thread.sleep(3000);
		List<WebElement> allOptions = driver.findElements(By.xpath("//ul[@class='context-menu-list context-menu-root']//li"));
		for(WebElement all : allOptions) {
			if(all.getText().equals("Copy")) {
				all.click();
				break;
			}
		}
		
		driver.switchTo().alert().accept();
		
		List<WebElement> allOptions1 = driver.findElements(By.xpath("//ul[@class='context-menu-list context-menu-root']//li"));
		for(WebElement all : allOptions1) {
			System.out.println(all.getText());
		}
		
	}
}
