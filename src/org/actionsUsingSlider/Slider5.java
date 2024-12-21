package org.actionsUsingSlider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		
		driver.get("https://www.tutorialspoint.com/selenium/practice/slider.php");
		
		Actions as =new Actions(driver);
		WebElement slider = driver.findElement(By.xpath("//input[@id='ageInputId']"));
		as.dragAndDropBy(slider, 50, 0).build().perform();
		
		
	}
}
