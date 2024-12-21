package org.framess;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frame5 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		
		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@name='globalSqa']"));
		driver.switchTo().frame(frame);
		
		WebElement textField1 = driver.findElement(By.xpath("//span[@id='current_filter']"));
		Actions as = new Actions(driver);
		as.moveToElement(textField1);
		
		driver.switchTo().defaultContent();
		
		WebElement dropDownClick = driver.findElement(By.xpath("(//span[text()='DropDown Menu'])[2]"));
		dropDownClick.click();
		
		
		
	}
}
