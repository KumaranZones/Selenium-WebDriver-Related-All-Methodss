package org.actionsUsingClick;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsUsingClick1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

		driver.get("https://rahulshettyacademy.com/blog/index.php/2023/10/31/action-class-mouse-hover-operation-in-selenium-and-keypress-events/");

		Actions as = new Actions(driver);
		WebElement qaInterview = driver.findElement(By.xpath("//span[text()='QA Interviews']"));
		as.moveToElement(qaInterview).perform();
		as.click(qaInterview).perform();
	}
}
