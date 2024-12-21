package org.dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

		driver.get("https://formstone.it/components/dropdown/demo/");

		WebElement singleDropdown = driver.findElement(By.xpath("(//select[starts-with(@id,'demo_basic')])[1]"));
		Select s = new Select(singleDropdown);
		s.selectByValue("2");
		
		Thread.sleep(2000);
		
		WebElement singleDropdownClick = driver.findElement(By.xpath("//button[@id='demo_basic-dropdown-selected']"));
		singleDropdownClick.click();
		List<WebElement> singleDropdown1 = driver.findElements(By.xpath("(//div[@class=\"fs-dropdown-options fs-scrollbar-element fs-scrollbar fs-light\"]//div[@class=\"fs-scrollbar-content\"])[1]//button"));
		for(WebElement all : singleDropdown1) {
			if(all.getText().equals("One")) {
				all.click();
				break;
			}
		}
		
		for(WebElement all : singleDropdown1) {
			System.out.println(all.getText());
		}
		
		Thread.sleep(2000);
		
		WebElement singleDropdown2 = driver.findElement(By.xpath("(//select[starts-with(@id,'demo_basic')])[1]"));
		Select s2 = new Select(singleDropdown2);
		List<WebElement> allText = s2.getOptions();
		for(WebElement all : allText) {
			if(all.getText().equals("Two")) {
				all.click();
				break;
			}
		}
		
		WebElement singleDropdown3 = driver.findElement(By.xpath("//select[@id='demo_native']"));
		Select s3 = new Select(singleDropdown3);
		s3.selectByValue("4");
		
		Thread.sleep(2000);
		
		WebElement singleDropdownClick1 = driver.findElement(By.xpath("//select[@id='demo_native']"));
		singleDropdownClick1.click();
		List<WebElement> singleDropdown4 = driver.findElements(By.xpath("//select[@id='demo_native']//option"));
		for(WebElement all : singleDropdown4) {
			if(all.getText().equals("One")) {
				all.click();
				break;
			}
		}
		
		for(WebElement all : singleDropdown4) {
			System.out.println(all.getText());
		}
		
		Thread.sleep(2000);
		
		WebElement singleDropdown5 = driver.findElement(By.xpath("//select[@id='demo_native']"));
		Select s4 = new Select(singleDropdown5);
		List<WebElement> allText1 = s4.getOptions();
		for(WebElement all : allText1) {
			if(all.getText().equals("Five")) {
				all.click();
				break;
			}
		}
	}
}
