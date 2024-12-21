package org.webElementMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethods {

	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver",".\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		WebElement elementClick = driver.findElement(By.xpath("//a[text()='Create new account']"));
		elementClick.click();

		WebElement sendKey = driver.findElement(By.xpath("//input[@name='firstname']"));
		sendKey.sendKeys("Kumaran");

		WebElement elementClear = driver.findElement(By.xpath("//input[@name='firstname']"));
		elementClear.clear();

		WebElement sendKey1 = driver.findElement(By.xpath("//input[@name='firstname']"));
		sendKey1.sendKeys("Kumaran");
		
		WebElement getTheElement = driver.findElement(By.xpath("//div[text()='Create a new account']"));
		System.out.println(getTheElement.getText());

		System.out.println(sendKey1.getAttribute("value"));

		System.out.println(sendKey1.getTagName());

		WebElement isDisplayed = driver.findElement(By.xpath("(//input[@id='sex'])[2]"));
		System.out.println(isDisplayed.isDisplayed());	

		WebElement isEnabled = driver.findElement(By.xpath("(//input[@id='sex'])[2]"));
		System.out.println(isEnabled.isEnabled());

		WebElement isSelected = driver.findElement(By.xpath("(//input[@id='sex'])[2]"));
		System.out.println(isSelected.isSelected());
		


		

	}
}
