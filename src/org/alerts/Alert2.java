package org.alerts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		driver.get(" http://uitestingplayground.com/alerts");
		
		WebElement simpleAlert = driver.findElement(By.xpath("//button[text()='Alert']"));
		simpleAlert.click();
		driver.switchTo().alert().accept();
		
		WebElement confirmAlert = driver.findElement(By.xpath("//button[text()='Confirm  ']"));
		confirmAlert.click();
		driver.switchTo().alert().accept();

		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			System.out.println("Throw the InterruptedException");
		}
		driver.switchTo().alert().accept();
		
		WebElement promptAlert = driver.findElement(By.xpath("//button[text()='Prompt']"));
		promptAlert.click();
		driver.switchTo().alert().sendKeys("Hi Kumara!...");
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		driver.switchTo().alert().accept();
		
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			System.out.println("Throw the InterruptedException");
		}
		
		String text1 = driver.switchTo().alert().getText();
		System.out.println(text1);
		driver.switchTo().alert().accept();
		
		driver.close();
		
	}
}
