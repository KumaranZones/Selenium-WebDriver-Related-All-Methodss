package org.windowHandling;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHandling2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.get("https://demo.automationtesting.in/Windows.html");

		WebElement windowClick = driver.findElement(By.xpath("//button[contains(text(),'click  ')]"));
		windowClick.click();
		
		WebElement window2 = driver.findElement(By.xpath("//a[text()='Open New Seperate Windows']"));
		window2.click();

		WebElement windowClick2 = driver.findElement(By.xpath("//button[text()='click']"));
		windowClick2.click();
		
		WebElement window3 = driver.findElement(By.xpath("//a[text()='Open Seperate Multiple Windows']"));
		window3.click();
		
		WebElement windowClick3 = driver.findElement(By.xpath("//button[text()='click ']"));
		windowClick3.click();
		
		Set<String> allWindows = driver.getWindowHandles();
		System.out.println(allWindows.size());
		
		List list = new ArrayList(allWindows);
		driver.switchTo().window((String) list.get(4));
		Thread.sleep(4000);
		
		driver.close();
		
		driver.switchTo().window((String) list.get(0));
		Thread.sleep(4000);
		driver.close();
		driver.switchTo().window((String) list.get(3));
		Thread.sleep(4000);
		driver.close();
		driver.switchTo().window((String) list.get(2));
		Thread.sleep(4000);
		driver.close();
		driver.switchTo().window((String) list.get(1));
		Thread.sleep(4000);
		driver.close();
}
}
