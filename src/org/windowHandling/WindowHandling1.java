package org.windowHandling;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHandling1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.get("https://www.rediff.com/");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

		WebElement privacyClick = driver.findElement(By.xpath("//a[text()='Privacy']"));
		Actions as = new Actions(driver);
		as.moveToElement(privacyClick).perform();
		privacyClick.click();

		WebElement linkClick = driver.findElement(By.xpath("(//a[text()='http://support.rediff.com/'])[1]"));
		js.executeScript("arguments[0].scrollIntoView()", linkClick);
		linkClick.click();

		Set<String> allWindows = driver.getWindowHandles();
		List list = new ArrayList(allWindows);
		driver.switchTo().window((String) list.get(1));

		WebElement becomeResellerClick = driver.findElement(By.xpath("//a[text()='Become a reseller']"));
		js.executeScript("arguments[0].scrollIntoView()", becomeResellerClick);
		becomeResellerClick.click();

		WebElement webMailLoginClick = driver.findElement(By.xpath("//a[text()='Webmail login']"));
		webMailLoginClick.click();

		Set<String> allWindows1 = driver.getWindowHandles();
		List list1 = new ArrayList(allWindows1);
		driver.switchTo().window((String) list1.get(2));

		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

		WebElement privacyClick1 = driver.findElement(By.xpath("//a[text()='Privacy']"));
		as.moveToElement(privacyClick1).perform();
		privacyClick1.click();

		WebElement linkClick1 = driver.findElement(By.xpath("(//a[text()='http://support.rediff.com/'])[1]"));
		js.executeScript("arguments[0].scrollIntoView()", linkClick1);
		linkClick1.click();

		Set<String> allWindows2 = driver.getWindowHandles();
		List list2 = new ArrayList(allWindows2);
		driver.switchTo().window((String) list2.get(3));

		WebElement becomeResellerClick1 = driver.findElement(By.xpath("//a[text()='Become a reseller']"));
		js.executeScript("arguments[0].scrollIntoView()", becomeResellerClick1);
		becomeResellerClick1.click();

		WebElement webMailLoginClick1 = driver.findElement(By.xpath("//a[text()='Webmail login']"));
		webMailLoginClick1.click();

		Set<String> allWindows3 = driver.getWindowHandles();
		List list3 = new ArrayList(allWindows3);
		driver.switchTo().window((String) list3.get(4));

		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

		WebElement privacyClick2 = driver.findElement(By.xpath("//a[text()='Privacy']"));
		as.moveToElement(privacyClick2).perform();
		privacyClick2.click();

		WebElement linkClick2 = driver.findElement(By.xpath("(//a[text()='http://support.rediff.com/'])[1]"));
		js.executeScript("arguments[0].scrollIntoView()", linkClick2);
		linkClick2.click();

		Set<String> allWindows4 = driver.getWindowHandles();
		List list4 = new ArrayList(allWindows4);
		driver.switchTo().window((String) list4.get(5));

		WebElement becomeResellerClick2 = driver.findElement(By.xpath("//a[text()='Become a reseller']"));
		js.executeScript("arguments[0].scrollIntoView()", becomeResellerClick2);
		becomeResellerClick2.click();

		WebElement webMailLoginClick2 = driver.findElement(By.xpath("//a[text()='Webmail login']"));
		webMailLoginClick2.click();

		Set<String> allWindows5 = driver.getWindowHandles();
		List list5 = new ArrayList(allWindows5);
		driver.switchTo().window((String) list5.get(6));

		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

		WebElement privacyClick3 = driver.findElement(By.xpath("//a[text()='Privacy']"));
		as.moveToElement(privacyClick3).perform();
		privacyClick3.click();

		WebElement linkClick3 = driver.findElement(By.xpath("(//a[text()='http://support.rediff.com/'])[1]"));
		js.executeScript("arguments[0].scrollIntoView()", linkClick3);
		linkClick3.click();

		Set<String> allWindows6 = driver.getWindowHandles();
		List list6 = new ArrayList(allWindows6);
		driver.switchTo().window((String) list6.get(7));

		WebElement becomeResellerClick3 = driver.findElement(By.xpath("//a[text()='Become a reseller']"));
		js.executeScript("arguments[0].scrollIntoView()", becomeResellerClick3);
		becomeResellerClick3.click();

		WebElement webMailLoginClick3 = driver.findElement(By.xpath("//a[text()='Webmail login']"));
		webMailLoginClick3.click();

		Set<String> allWindows7 = driver.getWindowHandles();
		List list7 = new ArrayList(allWindows7);
		driver.switchTo().window((String) list7.get(8));

		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

		WebElement privacyClick4 = driver.findElement(By.xpath("//a[text()='Privacy']"));
		as.moveToElement(privacyClick4).perform();
		privacyClick4.click();

		WebElement linkClick4 = driver.findElement(By.xpath("(//a[text()='http://support.rediff.com/'])[1]"));
		js.executeScript("arguments[0].scrollIntoView()", linkClick4);
		linkClick4.click();

		Set<String> allWindows8 = driver.getWindowHandles();
		List list8 = new ArrayList(allWindows8);
		driver.switchTo().window((String) list8.get(9));

		WebElement becomeResellerClick4 = driver.findElement(By.xpath("//a[text()='Become a reseller']"));
		js.executeScript("arguments[0].scrollIntoView()", becomeResellerClick4);
		becomeResellerClick4.click();
		Thread.sleep(4000);
		driver.close();

		driver.switchTo().window((String) list8.get(8));
		Thread.sleep(4000);
		driver.close();

		driver.switchTo().window((String) list8.get(7));
		Thread.sleep(4000);
		driver.close();

		driver.switchTo().window((String) list8.get(6));
		Thread.sleep(4000);
		driver.close();

		driver.switchTo().window((String) list8.get(5));
		Thread.sleep(4000);
		driver.close();

		driver.switchTo().window((String) list8.get(4));
		Thread.sleep(4000);
		driver.close();

		driver.switchTo().window((String) list8.get(3));
		Thread.sleep(4000);
		driver.close();

		driver.switchTo().window((String) list8.get(2));
		Thread.sleep(4000);
		driver.close();

		driver.switchTo().window((String) list8.get(1));
		Thread.sleep(4000);
		driver.close();

		driver.switchTo().window((String) list8.get(0));
		Thread.sleep(4000);
		driver.close();
		System.out.println("successfully Nine windows opened and closed");
	}
}
