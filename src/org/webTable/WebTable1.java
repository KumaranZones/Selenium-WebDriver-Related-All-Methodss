package org.webTable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		
		driver.get("https://practice.expandtesting.com/tables");
		
		List<WebElement> tablHeaderRows = driver.findElements(By.xpath("/html/body/main/div[2]/div/div/div/div/table[@id='table1']/thead/tr"));
		int tablHeaderRowsSize = tablHeaderRows.size();
		System.out.println(tablHeaderRowsSize);
		
		for(int i=1; i<=tablHeaderRowsSize; i++) {
			List<WebElement> tablHeaderColumn = driver.findElements(By.xpath("/html/body/main/div[2]/div/div/div/div/table[@id='table1']/thead/tr["+i+"]/th"));
			int tablHeaderColumnSize = tablHeaderColumn.size();
			for(int j=1; j<=tablHeaderColumnSize; j++) {
				String value = driver.findElement(By.xpath("/html/body/main/div[2]/div/div/div/div/table[@id='table1']/thead/tr["+i+"]/th["+j+"]")).getText();
				System.out.println(value);
			}
		}

		
		List<WebElement> tablBodyRows = driver.findElements(By.xpath("/html/body/main/div[2]/div/div/div/div/table[@id='table1']/tbody/tr"));
		int tablBodyRowsSize = tablBodyRows.size();
		
		for(int i=1; i<=tablBodyRowsSize; i++) {
			List<WebElement> tablBodyColumn = driver.findElements(By.xpath("/html/body/main/div[2]/div/div/div/div/table[@id='table1']/tbody/tr["+i+"]/td"));
			int tablBodyColumnSize = tablBodyColumn.size();
			for(int j=1; j<=tablBodyColumnSize; j++) {
				String value = driver.findElement(By.xpath("/html/body/main/div[2]/div/div/div/div/table[@id='table1']/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.print(value+"|");
			}
			System.out.println();
		}
	}
}
