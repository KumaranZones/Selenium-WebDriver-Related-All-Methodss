package org.webTable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable6 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		
		driver.get("https://www.tutorialspoint.com/selenium/practice/webtables.php");
		
		List<WebElement> tableHeaderRows = driver.findElements(By.xpath("/html/body/main/div/div/div[2]/form/div[2]/table/tbody/tr"));
		int tableHeaderRowsSize = tableHeaderRows.size();
		
		for(int i=1; i<=tableHeaderRowsSize; i++) {
			List<WebElement> tableColumn = driver.findElements(By.xpath("/html/body/main/div/div/div[2]/form/div[2]/table/tbody/tr["+i+"]/td"));
			int tableColumnSize = tableColumn.size();
			for(int j=1; j<=tableColumnSize; j++) {
				String value = driver.findElement(By.xpath("/html/body/main/div/div/div[2]/form/div[2]/table/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.print(value+"|");
			}
			System.out.println();
		}
		
	
	}
}
