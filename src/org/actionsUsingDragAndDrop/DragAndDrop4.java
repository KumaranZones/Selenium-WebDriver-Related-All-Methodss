package org.actionsUsingDragAndDrop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		
		driver.get("https://demoqa.com/droppable/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,350)");
		
		Actions as = new Actions(driver);
		WebElement drag1 = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement drop1 = driver.findElement(By.xpath("//div[@id='droppable']"));
		as.dragAndDrop(drag1, drop1).build().perform();
		
		WebElement acceptClick = driver.findElement(By.xpath("//a[text()='Accept']"));
		acceptClick.click();
		
		WebElement drag2 = driver.findElement(By.xpath("//div[text()='Acceptable']"));
		WebElement drop2 = driver.findElement(By.xpath("(//div[@id='droppable'])[2]"));
		as.dragAndDrop(drag2, drop2).build().perform();
		
		WebElement drag3 = driver.findElement(By.xpath("//div[@id='notAcceptable']"));
		WebElement drop3 = driver.findElement(By.xpath("(//div[@id='droppable'])[2]"));
		as.dragAndDrop(drag3, drop3).build().perform();
		
		
		WebElement preventClick = driver.findElement(By.xpath("//a[text()='Prevent Propogation']"));
		preventClick.click();
		
		WebElement drag4 = driver.findElement(By.xpath("//div[@id='dragBox']"));
		WebElement drop4 = driver.findElement(By.xpath("//div[@id='notGreedyInnerDropBox']"));
		as.dragAndDrop(drag4, drop4).build().perform();
		
		//a[text()='Revert Draggable']
		WebElement revertClick = driver.findElement(By.xpath("//a[text()='Revert Draggable']"));
		revertClick.click();
		
		WebElement drag5 = driver.findElement(By.xpath("//div[@id='revertable']"));
		WebElement drop5 = driver.findElement(By.xpath("(//div[@id='droppable'])[3]"));
		as.dragAndDrop(drag5, drop5).build().perform();
		
		WebElement drag6 = driver.findElement(By.xpath("//div[@id='notRevertable']"));
		WebElement drop6 = driver.findElement(By.xpath("(//div[@id='droppable'])[3]"));
		as.dragAndDrop(drag6, drop6).build().perform();
}
}
