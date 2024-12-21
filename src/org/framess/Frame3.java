package org.framess;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		
		driver.get("https://demoqa.com/frames");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,550)");
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@id='frame1']"));
		driver.switchTo().frame(frame);
		
		WebElement getText = driver.findElement(By.xpath("//h1[text()='This is a sample page']"));
		System.out.println(getText.getText());
		
		driver.switchTo().defaultContent();
		
		WebElement frame2 = driver.findElement(By.xpath("//iframe[@id='frame2']"));
		driver.switchTo().frame(frame2);
		
		WebElement getText2 = driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
		System.out.println(getText2.getText());
		
		driver.switchTo().defaultContent();
		
		WebElement modelDialogsClick = driver.findElement(By.xpath("//span[text()='Modal Dialogs']"));
		modelDialogsClick.click();
		
		Thread.sleep(2000);
}
}
