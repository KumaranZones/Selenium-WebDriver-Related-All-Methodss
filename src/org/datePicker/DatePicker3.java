package org.datePicker;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePicker3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		String month = "August";
		String year = "2025";
		String date = "15";
		
		WebElement dateFieldClick = driver.findElement(By.xpath("//input[@id='datepicker']"));
		dateFieldClick.click();
		
		while(true) {
			String monthYear = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
			String[] arr = monthYear.split(" ");
			String mon = arr[0];
			String ye = arr[1];
			if(mon.equals(month) && ye.equals(year)) {
				break;
			}else {
				driver.findElement(By.xpath("//span[text()='Next']")).click();
			}
		}
		
		List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td"));
		for(WebElement all : allDates) {
			if(all.getText().equals(date)) {
				all.click();
				break;
			}
		}
		
		WebElement dateFieldClick2 = driver.findElement(By.xpath("//input[@id='txtDate']"));
		dateFieldClick2.click();
		
		WebElement dropdown1 = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select s = new Select(dropdown1);
		s.selectByVisibleText("Aug");
		
		WebElement dropdown2 = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select s1 = new Select(dropdown2);
		s1.selectByVisibleText("2025");
		
		String date2 = "15";
		List<WebElement> allDates2 = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td"));
		for(WebElement all2 : allDates2) {
			if(all2.getText().equals(date2)) {
				all2.click();
				break;
			}
		}
		
		WebElement dateFieldClick3 = driver.findElement(By.xpath("//input[@id='start-date']"));
		dateFieldClick3.click();
		
		
	}
}
