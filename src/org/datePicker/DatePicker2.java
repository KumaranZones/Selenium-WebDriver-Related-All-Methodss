package org.datePicker;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		
		driver.get("https://letcode.in/calendar");
		
		String month = "August";
		String year = "2025";
		String date = "15";

		while(true) {
			String month1 = driver.findElement(By.xpath("(/html/body/app-root/app-calender/section/div/div/div/div/div/div/div/nwb-date-picker/div[2]/div[2]/div[2]/div/div[2]/div/div/div)[1]")).getText();
			String year1 = driver.findElement(By.xpath("(/html/body/app-root/app-calender/section/div/div/div/div/div/div/div/nwb-date-picker/div[2]/div[2]/div[2]/div/div[2]/div/div/div[2])[1]")).getText();
			if(month.equalsIgnoreCase(month1) && year1.equals(year)) {
				break;
			}else {
				driver.findElement(By.xpath("(//button[@class='datepicker-nav-next button is-small is-text'])[1]")).click();
			}
		}
		
		List<WebElement> allDate = driver.findElements(By.xpath("(//div[@class='datepicker-days'])[1]//div"));
		for(WebElement all : allDate) {
			if(all.getText().equals(date)) {
				all.click();
				break;
			}
		}
	}
}
