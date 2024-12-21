package org.webTable2;

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
		
		System.out.println("Table Headers  :" );
		List<WebElement> tableHeaders = driver.findElements(By.xpath("//table[@id='table01']//thead//th"));
		for(WebElement all : tableHeaders) {
			System.out.println(all.getText());
		}
		System.out.println("================================");
		System.out.println("Table Total Column Count  :"+tableHeaders.size());
		
		System.out.println("================================");
		
		WebElement particularData = driver.findElement(By.xpath("//table[@id='table01']//tbody//tr[2]//td[3]"));
		System.out.println("Table Particular Data  : "+particularData.getText() );
		
		System.out.println("================================");
		
		System.out.println("Table Particular Row  : ");
		List<WebElement> particularRow = driver.findElements(By.xpath("//table[@id='table01']//tbody//tr[2]//td"));
		for(WebElement all : particularRow) {
			System.out.println(all.getText());
		}
		
		System.out.println("================================");
		
		System.out.println("Table All Data  : ");
		List<WebElement> allData = driver.findElements(By.xpath("//table[@id='table01']//tbody//tr//td"));
		for(WebElement all : allData) {
			System.out.println(all.getText());
		}
		
		System.out.println("================================");
		
		WebElement allRowCount = driver.findElement(By.xpath("//table[@id='table01']//tbody//tr"));
		System.out.println("Table  Row Count  : "+allRowCount.getText() );
		
		System.out.println("================================");
		
		System.out.println("Table Particular Column  : ");
		List<WebElement> particularColumn = driver.findElements(By.cssSelector("#table01>tbody>tr>td:nth-child(2)"));
		for(WebElement all : particularColumn) {
			System.out.println(all.getText());
		}
		
		System.out.println("================================");
		//InvalidSelectorException
		System.out.println("Table Particular Column2  : ");
		List<WebElement> particularColumn2 = driver.findElements(By.xpath("//table[@id='table01']//tbody//tr"));
		for(WebElement all : particularColumn2) {
			List<WebElement> column = all.findElements(By.tagName("td"));
			WebElement colum3 = column.get(2);
			System.out.println(colum3.getText());
		}
		
		
		}
}
