package org.dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DropDown6 {

	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

		driver.get("https://formy-project.herokuapp.com/dropdown");

		WebElement singleDropdownClick = driver.findElement(By.xpath("//button[@id='dropdownMenuButton']"));
		singleDropdownClick.click();
		List<WebElement> singleDropdown1 = driver.findElements(By.xpath("//div[@class='dropdown-menu show']//a"));
		for(WebElement all : singleDropdown1) {
			if(all.getText().equals("Modal")) {
				all.click();
				break;
			}
		}
		
		List<WebElement> getTexts = driver.findElements(By.tagName("a"));
		for(WebElement all : getTexts) {
			System.out.println(all.getText()+"--"+all.getAttribute("href"));
		}
		System.out.println(getTexts.size());
		driver.close();
	}
}
