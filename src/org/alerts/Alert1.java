package org.alerts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		WebElement simpleAlert = driver.findElement(By.xpath("//button[contains(text(),'click the button to display an')]"));
		simpleAlert.click();
		driver.switchTo().alert().accept();
		
		WebElement confirmAlert = driver.findElement(By.xpath("//a[contains(text(),'Alert with OK &')]"));
		confirmAlert.click();
		WebElement confirmAlert1 = driver.findElement(By.xpath("//button[contains(text(),'click the button to display a ')]"));
		confirmAlert1.click();
		driver.switchTo().alert().accept();
		
		WebElement promptAlert = driver.findElement(By.xpath("//a[contains(text(),'Alert with T')]"));
		promptAlert.click();
		WebElement promptAlert1 = driver.findElement(By.xpath("//button[contains(text(),'click the button to de')]"));
		promptAlert1.click();
		driver.switchTo().alert().sendKeys("Hi Kumara!...");
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		driver.switchTo().alert().accept();
		
	}
}
