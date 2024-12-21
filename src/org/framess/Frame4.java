package org.framess;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		
		WebElement frame = driver.findElement(By.xpath("//frame[@src=\"frame_1.html\"]"));
		driver.switchTo().frame(frame);
		
		WebElement textField1 = driver.findElement(By.xpath("//input[@name='mytext1']"));
		textField1.sendKeys("Java");
		
		driver.switchTo().defaultContent();
		
		WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(frame2);
		
		WebElement textField2 = driver.findElement(By.xpath("//input[@name='mytext2']"));
		textField2.sendKeys("Maven");
		
		driver.switchTo().defaultContent();
		
		WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frame3);
		
		WebElement textField3 = driver.findElement(By.xpath("//input[@name='mytext3']"));
		textField3.sendKeys("TestNG");
		
		WebElement innerFrame1 = driver.findElement(By.xpath("//iframe[@src='https://docs.google.com/forms/d/1yfUq-GO9BEssafd6TvHhf0D6QLDVG3q5InwNE2FFFFQ/viewform?embedded=true']"));
		driver.switchTo().frame(innerFrame1);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,100)");
		
		WebElement textField4 = driver.findElement(By.xpath("//input[@jsname='YPqjbf']"));
		textField4.sendKeys("Cucumber");
		
		driver.switchTo().parentFrame();
		
		WebElement textField5 = driver.findElement(By.xpath("//input[@name='mytext3']"));
		textField5.sendKeys("TDD");
		
		driver.switchTo().defaultContent();
		
		WebElement frame4 = driver.findElement(By.xpath("//frame[@src='frame_4.html']"));
		driver.switchTo().frame(frame4);
		
		WebElement textField6 = driver.findElement(By.xpath("//input[@name='mytext4']"));
		textField6.sendKeys("API");
		
		driver.switchTo().defaultContent();
		
		WebElement frame5 = driver.findElement(By.xpath("//frame[@src='frame_5.html']"));
		driver.switchTo().frame(frame5);
		
		WebElement textField7 = driver.findElement(By.xpath("//input[@name='mytext5']"));
		textField7.sendKeys("postman");
		
		driver.switchTo().defaultContent();
		
		WebElement frame44 = driver.findElement(By.xpath("//frame[@src='frame_4.html']"));
		driver.switchTo().frame(frame44);
		WebElement textField8 = driver.findElement(By.xpath("//input[@name='mytext4']"));
		textField8.sendKeys("API-2");
		
		driver.switchTo().defaultContent();
		
		WebElement frame33 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frame33);
		WebElement textField33 = driver.findElement(By.xpath("//input[@name='mytext3']"));
		textField33.sendKeys("-JUnit");
		
		driver.switchTo().defaultContent();
		
		WebElement frame22 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(frame22);
		
		WebElement textField22 = driver.findElement(By.xpath("//input[@name='mytext2']"));
		textField22.sendKeys("-Build");
		
		driver.switchTo().defaultContent();
		
		WebElement frame1 = driver.findElement(By.xpath("//frame[@src=\"frame_1.html\"]"));
		driver.switchTo().frame(frame1);
		
		WebElement textField11 = driver.findElement(By.xpath("//input[@name='mytext1']"));
		textField11.sendKeys("Java");
		
		
	}
}
