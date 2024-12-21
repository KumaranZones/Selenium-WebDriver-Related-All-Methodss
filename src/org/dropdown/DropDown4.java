package org.dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

		driver.get("https://semantic-ui.com/modules/dropdown.html#/examples");

		WebElement singleDropdownClick1 = driver.findElement(By.xpath("//span[text()='3 Themes']"));
		singleDropdownClick1.click();
		
		Thread.sleep(2000);
		
		List<WebElement> singleDropdown4 = driver.findElements(By.xpath("//div[@class='ui floating dropdown theme basic button active visible']//div//div"));
		for(WebElement all : singleDropdown4) {
			if(all.getText().equals("GitHub")) {
				all.click();
				break;
			}
		}
		
		for(WebElement all : singleDropdown4) {
			System.out.println(all.getText());
		}
		
		
		
		
		WebElement singleDropdownClick2 = driver.findElement(By.xpath("//div[text()='Select Tag']"));
		singleDropdownClick2.click();
		
		Thread.sleep(2000);
		
		List<WebElement> singleDropdown2 = driver.findElements(By.xpath("//div[@class='menu transition visible']//div"));
		for(WebElement all : singleDropdown2) {
			if(all.getText().equals("10011110")) {
				all.click();
				break;
			}
		}
		for(WebElement all : singleDropdown2) {
			if(all.getText().equals("11001110")) {
				all.click();
				break;
			}
		}
		for(WebElement all : singleDropdown2) {
			if(all.getText().equals("10001011")) {
				all.click();
				break;
			}
		}
		for(WebElement all : singleDropdown2) {
			if(all.getText().equals("10001010")) {
				all.click();
				break;
			}
		}
		
		for(WebElement all : singleDropdown2) {
			System.out.println(all.getText());
		}
	
		driver.close();
	}
}
