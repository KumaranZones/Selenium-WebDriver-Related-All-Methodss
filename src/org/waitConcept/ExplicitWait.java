package org.waitConcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		
		WebElement element = driver.findElement(By.xpath("//a[text()='Create new account']"));
		WebDriverWait wait = new WebDriverWait(driver,25);
		wait.until(ExpectedConditions.visibilityOf(element));
		
		WebDriverWait wait1 = new WebDriverWait(driver,10);
		wait1.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("tagName[@attName='attValue']"))));
		
		WebElement element2 = driver.findElement(By.xpath("xpath"));
		WebDriverWait wait2 = new WebDriverWait(driver,10);
		wait2.until(ExpectedConditions.elementToBeSelected(element2));
		
		WebDriverWait wait3 = new WebDriverWait(driver,10);
		wait3.until(ExpectedConditions.elementToBeSelected(driver.findElement(By.xpath("tagName[@attName='attValue']"))));
		
		WebElement element3 = driver.findElement(By.xpath("xpath"));
		WebDriverWait wait4 = new WebDriverWait(driver,10);
		wait4.until(ExpectedConditions.elementToBeClickable(element3));
		
		WebDriverWait wait5 = new WebDriverWait(driver,10);
		wait5.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("tagName[@attName='attValue']"))));
	}
}
