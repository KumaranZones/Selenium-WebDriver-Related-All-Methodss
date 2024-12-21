package org.actionsUsingSlider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		
		driver.get("https://www.globalsqa.com/demo-site/sliders/#Color%20Picker");
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(frame);
		
		Actions as =new Actions(driver);
		WebElement slider = driver.findElement(By.xpath("//div[@id='red']//span"));
		as.dragAndDropBy(slider, -30, 0).build().perform();
		
		WebElement slider1 = driver.findElement(By.xpath("//div[@id='green']//span"));
		as.dragAndDropBy(slider1, -40, 0).build().perform();
		
		WebElement slider2 = driver.findElement(By.xpath("//div[@id='blue']//span"));
		as.dragAndDropBy(slider2, 40, 0).build().perform();
	}
}
