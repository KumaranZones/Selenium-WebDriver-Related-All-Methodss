package org.oneWebPageAllTagsCount;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebPageAllTagNames {

	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver",".\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/r.php");
		
		List<WebElement> aTag = driver.findElements(By.tagName("a"));
		List<WebElement> headTag = driver.findElements(By.tagName("head"));
		List<WebElement> bodyTag = driver.findElements(By.tagName("body"));
		List<WebElement> divTag = driver.findElements(By.tagName("div"));
		List<WebElement> selectTag = driver.findElements(By.tagName("select"));
		List<WebElement> liTag = driver.findElements(By.tagName("li"));
		List<WebElement> optionTag = driver.findElements(By.tagName("option"));
		List<WebElement> spanTag = driver.findElements(By.tagName("span"));
		List<WebElement> tableTag = driver.findElements(By.tagName("table"));
		List<WebElement> iframeTag = driver.findElements(By.tagName("iframe"));
		List<WebElement> buttonTag = driver.findElements(By.tagName("button"));
		List<WebElement> inputTag = driver.findElements(By.tagName("input"));
		List<WebElement> pTag = driver.findElements(By.tagName("p"));
		List<WebElement> ulTag = driver.findElements(By.tagName("ul"));
		List<WebElement> linkTag = driver.findElements(By.tagName("link"));

		System.out.println(aTag.size());
		System.out.println(headTag.size());
		System.out.println(bodyTag.size());
		System.out.println(divTag.size());
		System.out.println(selectTag.size());
		System.out.println(liTag.size());
		System.out.println(optionTag.size());
		System.out.println(spanTag.size());
		System.out.println(tableTag.size());
		System.out.println(iframeTag.size());
		System.out.println(buttonTag.size());
		System.out.println(inputTag.size());
		System.out.println(pTag.size());
		System.out.println(ulTag.size());
		System.out.println(linkTag.size());

		driver.close();
	}



}
