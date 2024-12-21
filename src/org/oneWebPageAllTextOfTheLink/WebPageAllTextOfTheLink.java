package org.oneWebPageAllTextOfTheLink;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebPageAllTextOfTheLink {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/r.php");
		
		List<WebElement> aTag = driver.findElements(By.tagName("a"));
		
		for(WebElement aTags : aTag){
			System.out.println(aTags.getText()+"<------>"+aTags.getAttribute("href"));
		}

		System.out.println(aTag.size());

		driver.close();
	}
}
