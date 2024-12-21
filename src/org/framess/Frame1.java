package org.framess;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frame1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		
		driver.get("https://practice-automation.com/iframes/");
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@id='iframe-1']"));
		driver.switchTo().frame(frame);
		
		
		WebElement mouseHover = driver.findElement(By.xpath("(//a[text()='Node.js'])[1]"));
		Actions as = new Actions(driver);
		as.moveToElement(mouseHover).build().perform();
		
		Thread.sleep(5000);
		
		driver.switchTo().defaultContent();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1500)");
		
		WebElement frame2 = driver.findElement(By.xpath("//iframe[@id='iframe-2']"));
		driver.switchTo().frame(frame2);
		
		WebElement aboutClick = driver.findElement(By.xpath("//a[@id='navbarDropdown']"));
		aboutClick.click();
		
		List<WebElement> allOptions = driver.findElements(By.xpath("//div[@class='dropdown-menu show']//a"));
		for(WebElement all : allOptions) {
			if(all.getText().equals("History")) {
				all.click();
				break;
			}
		}
		driver.switchTo().defaultContent();
		
		WebElement aboutClick2= driver.findElement(By.xpath("//a[@href='https://automatenow.io/about/']"));
		as.moveToElement(aboutClick2).perform();
		aboutClick2.click();
		
		driver.quit();
	}
}
