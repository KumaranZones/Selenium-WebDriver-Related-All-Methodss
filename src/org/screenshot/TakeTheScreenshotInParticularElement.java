package org.screenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeTheScreenshotInParticularElement {

	public static WebDriver driver;
	public static WebElement element;

	public static void screenshot() {
		try {
			Thread.sleep(2000);
			element =driver.findElement(By.xpath("//img[@alt='Facebook']"));
			File source = element.getScreenshotAs(OutputType.FILE);
			File destination = new File(
					"C:\\Users\\kumar\\eclipse-workspaces4\\SeleniumRelatedAllComponents\\Screenshot\\Facebook4"
							+ System.currentTimeMillis() + ".png");
			FileHandler.copy(source, destination);

		} catch (InterruptedException e) {
			System.out.println("Throw the InterruptedException");
		} catch (IOException e) {
			System.out.println("Throw the IOException");
		}
	}

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

		driver.get("https://www.facebook.com");
		screenshot();
	}
}
