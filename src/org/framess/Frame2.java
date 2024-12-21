package org.framess;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@id='singleframe']"));
		driver.switchTo().frame(frame);
		
		WebElement textField = driver.findElement(By.xpath("(//div[@class='col-xs-6 col-xs-offset-5']//input)[1]"));
		textField.sendKeys("Kumaran");
		
		driver.switchTo().defaultContent();
		
		WebElement frameClick2 = driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']"));
		frameClick2.click();
		
		WebElement frame2 = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(frame2);
		
		WebElement frame3 = driver.findElement(By.xpath("(//iframe[@src='SingleFrame.html'])[1]"));
		driver.switchTo().frame(frame3);
		
		WebElement textField2 = driver.findElement(By.xpath("//input[@type='text']"));
		textField2.sendKeys("Karuppannan");
		driver.switchTo().defaultContent();
		
		WebElement singleFrameClick = driver.findElement(By.xpath("//a[text()='Single Iframe ']"));
		singleFrameClick.click();
		
		driver.close();
}
}
