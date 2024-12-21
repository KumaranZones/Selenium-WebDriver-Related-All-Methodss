package org.javascriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutors {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
		
		try{
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			System.out.println("Throw the InterruptedException");
		}
		js.executeScript("window.scrollBy(0,-1000)");
		
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		
		Thread.sleep(2000);
		
		WebElement scrollIntoView = driver.findElement(By.xpath("//h2[contains(text(),'Se')]"));
		js.executeScript("arguments[0].scrollIntoView();",scrollIntoView);
		
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		
		Thread.sleep(2000);
		
		WebElement sendKey = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		js.executeScript("arguments[0].value='Headphones'",sendKey);
		
		Thread.sleep(2000);
		
		WebElement click = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		js.executeScript("arguments[0].click();",click);
		
		Thread.sleep(2000);
		
		js.executeScript("history.go(0);");
		
		driver.close();
	}
}
