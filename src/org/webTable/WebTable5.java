package org.webTable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		
		List<WebElement> tableHeaderRows =  driver.findElements(By.xpath("/html/body/div[2]/div/div/main/article/div/div/table/tbody/tr"));
		int tableHeaderRowsSize = tableHeaderRows.size();
		
		for(int i=1; i<=tableHeaderRowsSize; i++) {
			List<WebElement> tableHeaderColumn = driver.findElements(By.xpath("/html/body/div[2]/div/div/main/article/div/div/table/tbody/tr["+i+"]/td"));
			int tableHeaderColumnSize = tableHeaderColumn.size();
			for(int j=1; j<=tableHeaderColumnSize; j++) {
				String value = driver.findElement(By.xpath("/html/body/div[2]/div/div/main/article/div/div/table/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.print(value+"|");
			}
			System.out.println();
		}
	}
}
