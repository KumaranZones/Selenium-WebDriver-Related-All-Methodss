package org.screenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUtilsWithCurrentTimeMillis {
	public static WebDriver driver;

	public static void screenshot() {
		try {
			Thread.sleep(2000);

			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			File destination = new File(
					"C:\\Users\\kumar\\eclipse-workspaces4\\SeleniumRelatedAllComponents\\Screenshot\\Facebook2"
							+ System.currentTimeMillis() + ".png");
			FileUtils.copyFile(source, destination);
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
