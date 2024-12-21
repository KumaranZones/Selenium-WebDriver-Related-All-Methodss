package org.autoSuggestionDropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionDropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		
		driver.get("https://www.google.co.in/");
		
		WebElement sendKey = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
		sendKey.sendKeys("Kumaran");
		
		List<WebElement> allOptions = driver.findElements(By.xpath("//ul[@jsname='bw4e9b']//li"));
		for(WebElement all : allOptions) {
			if(all.getText().equalsIgnoreCase("kumaran network")) {
				all.click();
				break;
			}
		}
	}
}
