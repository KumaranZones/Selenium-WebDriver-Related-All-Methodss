package org.xpathAccess;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAccess1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		
		WebElement username = driver.findElement(By.xpath("//div[@class='_8ice']/parent::div/following-sibling::div/descendant::form/child::div/child::div/following-sibling::div/child::div/child::input/parent::div/parent::div/preceding-sibling::div/child::input"));
		username.sendKeys("Kumaran");
		WebElement password = driver.findElement(By.xpath("//div[@class='_8ice']/parent::div/following-sibling::div/descendant::form/child::div/child::div/following-sibling::div/child::div/child::input"));
		password.sendKeys("Kumaran");
		
		WebElement loginClick = driver.findElement(By.xpath("//h2[@class='_8eso']/parent::div/following-sibling::div/descendant::form/child::div/following-sibling::div[4]/child::a"));
		loginClick.click();
	}
}
