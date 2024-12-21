package org.datePicker;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		
		driver.get("https://jqueryui.com/datepicker/");
		
		String month = "August";
		String year = "2025";
		String date = "15";
		WebElement frame = driver.findElement(By.xpath("//iframe[@src='/resources/demos/datepicker/default.html']"));
		driver.switchTo().frame(frame);
		
		WebElement dateFieldClick = driver.findElement(By.xpath("//input[@id='datepicker']"));
		dateFieldClick.click();
		
		while(true) {
			String monthYear = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
			String[] arr = monthYear.split(" ");
			String month2 = arr[0];
			String year2 = arr[1];
			if(month.equalsIgnoreCase(month2) && year.equals(year2)) {
				break;
			}else { 
				driver.findElement(By.xpath("//span[text()='Next']")).click();
			}
		}
		List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td"));
		for(WebElement allDate : allDates) {
			if(allDate.getText().equals(date)) {
				allDate.click();
				break;
			}
		}
		
		

		
	}
}
