package org.dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DropDown5 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\ChromeDriver\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

		driver.get("https://www.hdfcbank.com/wholesale");

		WebElement singleDropdownClick = driver.findElement(By.xpath("//a[text()='Select Product Type']"));
		singleDropdownClick.click();
		List<WebElement> singleDropdown1 = driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']//li"));
		for(WebElement all : singleDropdown1) {
			if(all.getText().equals("Cards")) {
				all.click();
				break;
			}
		}
		
		Thread.sleep(2000);
		
		List<WebElement> getText = driver.findElements(By.xpath("//ul[@class='dropdown2 dropdown-menu']//li"));

		for(WebElement all : getText) {
			System.out.println(all.getText());
		}
		
		Thread.sleep(2000);
		
		
		WebElement singleDropdownClick1 = driver.findElement(By.xpath("//a[text()='Select Product']"));
		singleDropdownClick1.click();
		List<WebElement> singleDropdown4 = driver.findElements(By.xpath("//ul[@class='dropdown2 dropdown-menu']//li"));
		for(WebElement all : singleDropdown4) {
			if(all.getText().equals("FASTag")) {
				all.click();
				break;
			}
		}
		Thread.sleep(2000);
		List<WebElement> getText1 = driver.findElements(By.xpath("//ul[@class='dropdown2 dropdown-menu']//li"));
		for(WebElement all : getText1) {
			System.out.println(all.getText());
		}
		
		driver.close();
	}
}
