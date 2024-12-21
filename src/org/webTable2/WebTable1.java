package org.webTable2;

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
		
		System.out.println("Table Headers  :" );
		List<WebElement> tableHeaders = driver.findElements(By.xpath("//table[@id='table1']//thead//th"));
		for(WebElement all : tableHeaders) {
			System.out.println(all.getText());
		}
		System.out.println("================================");
		System.out.println("Table Total Column Count  :"+tableHeaders.size());
		
		System.out.println("================================");
		
		WebElement particularData = driver.findElement(By.xpath("//table[@id='table1']//tbody/tr[2]/td[2]"));
		System.out.println("Table Particular Data  : "+particularData.getText() );
		
		System.out.println("================================");
		
		System.out.println("Table Particular Row  : ");
		List<WebElement> particularRow = driver.findElements(By.xpath("//table[@id='table1']//tbody/tr[2]/td"));
		for(WebElement all : particularRow) {
			System.out.println(all.getText());
		}
		
		System.out.println("================================");
		
		System.out.println("Table All Data  : ");
		List<WebElement> allData = driver.findElements(By.xpath("//table[@id='table1']//tbody/tr/td"));
		for(WebElement all : allData) {
			System.out.println(all.getText());
		}
		
		System.out.println("================================");
		
		WebElement allRowCount = driver.findElement(By.xpath("//table[@id='table1']//tbody/tr"));
		System.out.println("Table  Row Count  : "+allRowCount.getText() );
		
		System.out.println("================================");
		
		System.out.println("Table Particular Column  : ");
		List<WebElement> particularColumn = driver.findElements(By.cssSelector("#table1>tbody>tr>td:nth-child(2)"));
		for(WebElement all : particularColumn) {
			System.out.println(all.getText());
		}
		
		System.out.println("================================");
		
		System.out.println("Table Particular Column2  : ");
		List<WebElement> particularColumn2 = driver.findElements(By.xpath("//table[@id='table1']//tbody//tr"));
		for(WebElement particularColum : particularColumn2) {
			List<WebElement> allDatas = particularColum.findElements(By.tagName("td"));
			WebElement column = allDatas.get(2);
			System.out.println(column.getText());
		}
	}
}
