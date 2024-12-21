package org.dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		
		driver.get("https://demoqa.com/select-menu");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,400)");
		
		WebElement singleDropdown = driver.findElement(By.xpath("//select[@id='oldSelectMenu']"));
		Select s = new Select(singleDropdown);
		s.selectByValue("2");
		
		Thread.sleep(3000);
		
		List<WebElement> all = s.getOptions();
		for(WebElement allText : all) {
			if(allText.getText().equals("Magenta")) {
				allText.click();
				break;
			}
		}
		
		Thread.sleep(3000);
		
		singleDropdown.click();
		List<WebElement> allOptions = driver.findElements(By.xpath("//select[@id='oldSelectMenu']//option"));
		for(WebElement allOptions1 : allOptions) {
			if(allOptions1.equals("Purple")) {
				allOptions1.click();
				break;
			}
		}
		for(WebElement allText1 : all) {
			System.out.println(allText1.getText());
		}
		
		WebElement multipleDropdown = driver.findElement(By.xpath("//select[@id='cars']"));
		Select s1 = new Select(multipleDropdown);
		s1.selectByValue("saab");
		
		List<WebElement> all1 = s1.getOptions();
		for(WebElement allText2 : all1) {
			if(allText2.getText().equals("Audi")) {
				allText2.click();
				break;
			}
		}
		for(WebElement allText2 : all1) {
			System.out.println(allText2.getText());
		}
		List<WebElement> allOptions3 = driver.findElements(By.xpath("//select[@id='cars']//option"));
		for(WebElement allOptions4 : allOptions3) {
			if(allOptions4.getText().equals("Volvo")) {
				allOptions4.click();
				break;
			}
		}
		//driver.close();
	}
}
