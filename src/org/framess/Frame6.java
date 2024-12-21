package org.framess;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame6 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		
		driver.get("https://the-internet.herokuapp.com/iframe");
		
		WebElement cancelClick = driver.findElement(By.xpath("//button[@type='button'][@tabindex='-1']//div[@aria-label='Close']"));
		cancelClick.click();
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']"));
		driver.switchTo().frame(frame);
		
		WebElement getTheText = driver.findElement(By.xpath("//p[text()='Your content goes here.']"));
		String value = getTheText.getText();
		System.out.println(value);
		
		driver.switchTo().defaultContent();
		
		WebElement seleniumClick = driver.findElement(By.xpath("//a[text()='Elemental Selenium']"));
		seleniumClick.click();
		
		driver.quit();
}
}
