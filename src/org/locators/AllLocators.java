package org.locators;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLocators {

	
	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver","");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);

		driver.get("https://www.facebook.com");
		//id
		WebElement element1 = driver.findElement(By.id(""));
		//name
		WebElement element2 = driver.findElement(By.name(""));
		//className
		WebElement element3 = driver.findElement(By.className(""));
		//tagName
		List<WebElement> element4 = driver.findElements(By.tagName(""));
		for(WebElement all : element4) {
			System.out.println(all.getTagName());
		}
		//cssSelector
		WebElement element5 = driver.findElement(By.cssSelector(""));
		//AbsoluteXpath
		WebElement element6 = driver.findElement(By.xpath(""));
		//RelativeXpath
		WebElement element7 = driver.findElement(By.xpath(""));
		//DynamicXpath
		WebElement element8 = driver.findElement(By.xpath(""));
		//linkText
		WebElement element9 = driver.findElement(By.linkText(""));
		//partialLinkText
		WebElement element10 = driver.findElement(By.partialLinkText(""));
		element10.click();


		

		
	}
}
