package org.absoluteXpath;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.myntra.com/?utm_source=dms_google&utm_medium=searchbrand_cpc&utm_campaign=dms_google_searchbrand_cpc_Search_Brand_Myntra_Brand_India_BM_TROAS_SOK_New&gad_source=1&gclid=CjwKCAiAmfq6BhAsEiwAX1jsZ6JXpx6ksRi_5Uf11fmbWs9-TrbIB2r4jtdirl9j-RUUZxuTZbuAsRoCLUQQAvD_BwE");
		
		Thread.sleep(5000);
		List<WebElement> text = driver.findElements(By.xpath("/html/body/div[4]/div/div/footer/div/div/div/a"));
		for(WebElement all : text) {
			System.out.println(all.getText());
		}
		
		driver.close();
	}
}
