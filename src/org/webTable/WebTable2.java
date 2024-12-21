package org.webTable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		
		driver.get("https://qavbox.github.io/demo/webtable/");
		
		List<WebElement> tableHeaderRow = driver.findElements(By.xpath("/html/body/form/fieldset/div/table/thead/tr"));
		int tableHeaderRowSize = tableHeaderRow.size();
		
		for(int i=1; i<=tableHeaderRowSize; i++) {
			List<WebElement> tableHeaderColumn = driver.findElements(By.xpath("/html/body/form/fieldset/div/table/thead/tr["+i+"]/th"));
			int tableHeaderColumnSize = tableHeaderColumn.size();
			for(int j=1; j<=tableHeaderColumnSize; j++) {
				String value = driver.findElement(By.xpath("/html/body/form/fieldset/div/table/thead/tr["+i+"]/th["+j+"]")).getText();
				System.out.print(value+"|");
			}
			System.out.println();
		}
		
		System.out.println("================================================");
		
		List<WebElement> tableBodyRow = driver.findElements(By.xpath("/html/body/form/fieldset/div/table/tbody/tr"));
		int tableBodyRowSize = tableBodyRow.size();
		
		for(int i=1; i<=tableBodyRowSize; i++) {
			List<WebElement> tableBodyColumn = driver.findElements(By.xpath("/html/body/form/fieldset/div/table/tbody/tr["+i+"]/td"));
			int tableBodyColumnSize = tableBodyColumn.size();
			for(int j=1; j<=tableBodyColumnSize; j++) {
				String value = driver.findElement(By.xpath("/html/body/form/fieldset/div/table/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.print(value+"|");
			}
			System.out.println();
		}
		}
}
