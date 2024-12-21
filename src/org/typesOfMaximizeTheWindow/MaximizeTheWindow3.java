package org.typesOfMaximizeTheWindow;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeTheWindow3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Dimension  dimen = new Dimension(500,500);
		driver.manage().window().setSize(dimen);
		driver.get("https://www.facebook.com");
	}
}
