package org.datePicker;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		
		driver.get("https://mui.com/x/react-date-pickers/date-picker/");
		
		String month = "August";
		String year = "2025";
		String date = "15";
		
		WebElement datePicker = driver.findElement(By.xpath("(//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeEnd MuiIconButton-sizeMedium css-slyssw'])[1]"));
		datePicker.click();
		
		
		while(true) {
			Thread.sleep(2000);
			String monthYear = driver.findElement(By.xpath("//div[@id=':r1n:-grid-label']")).getText();
			String[] arr = monthYear.split(" ");
			String mo = arr[0];
			String ye = arr[1];
			
			if(mo.equalsIgnoreCase(month) && ye.equals(year)) {
				break;
			}else {
				driver.findElement(By.xpath("(//div[@class='MuiPickersArrowSwitcher-root css-k008qs']//descendant::button)[8]")).click();
			}
		}
		
		List<WebElement> allDates = driver.findElements(By.xpath("(//div[@class='MuiDayCalendar-monthContainer css-i6bazn'])[4]//div//button"));
		for(WebElement all : allDates) {
			if(all.getText().equals(date)) {
				all.click();
				break;
			}
		}
	}
}
