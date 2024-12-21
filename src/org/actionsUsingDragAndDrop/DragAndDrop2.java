package org.actionsUsingDragAndDrop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-nodes/drag-drop-nodes-demo2.html");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,200)");
		
		Actions as = new Actions(driver);
		WebElement drag1 = driver.findElement(By.xpath("//li[@id='node1']"));
		WebElement drop1 = driver.findElement(By.xpath("//ul[@id='box1']"));
		as.dragAndDrop(drag1, drop1).perform();
		
		WebElement drag2 = driver.findElement(By.xpath("//li[@id='node2']"));
		WebElement drop2 = driver.findElement(By.xpath("//ul[@id='box1']"));
		as.dragAndDrop(drag2, drop2).perform();
		
		WebElement drag3 = driver.findElement(By.xpath("//li[@id='node3']"));
		WebElement drop3 = driver.findElement(By.xpath("//ul[@id='box1']"));
		as.dragAndDrop(drag3, drop3).perform();
		
		WebElement drag4 = driver.findElement(By.xpath("//li[@id='node4']"));
		WebElement drop4 = driver.findElement(By.xpath("//ul[@id='box2']"));
		as.dragAndDrop(drag4, drop4).perform();
		
		WebElement drag5 = driver.findElement(By.xpath("//li[@id='node5']"));
		WebElement drop5 = driver.findElement(By.xpath("//ul[@id='box2']"));
		as.dragAndDrop(drag5, drop5).perform();
		
		WebElement drag6 = driver.findElement(By.xpath("//li[@id='node6']"));
		WebElement drop6 = driver.findElement(By.xpath("//ul[@id='box2']"));
		as.dragAndDrop(drag6, drop6).perform();
		
		WebElement drag7 = driver.findElement(By.xpath("//li[@id='node7']"));
		WebElement drop7 = driver.findElement(By.xpath("//ul[@id='box2']"));
		as.dragAndDrop(drag7, drop7).perform();
		
		WebElement drag8 = driver.findElement(By.xpath("//li[@id='node8']"));
		WebElement drop8 = driver.findElement(By.xpath("//ul[@id='box3']"));
		as.dragAndDrop(drag8, drop8).perform();
		
		WebElement drag9 = driver.findElement(By.xpath("//li[@id='node9']"));
		WebElement drop9 = driver.findElement(By.xpath("//ul[@id='box4']"));
		as.dragAndDrop(drag9, drop9).perform();
		
		WebElement drag10 = driver.findElement(By.xpath("//li[@id='node10']"));
		WebElement drop10 = driver.findElement(By.xpath("//ul[@id='box4']"));
		as.dragAndDrop(drag10, drop10).perform();
		
		WebElement drag11 = driver.findElement(By.xpath("//li[@id='node11']"));
		WebElement drop11 = driver.findElement(By.xpath("//ul[@id='box4']"));
		as.dragAndDrop(drag11, drop11).perform();
		
		WebElement drag12 = driver.findElement(By.xpath("//li[@id='node12']"));
		WebElement drop12 = driver.findElement(By.xpath("//ul[@id='box5']"));
		as.dragAndDrop(drag12, drop12).perform();
		
		WebElement drag13 = driver.findElement(By.xpath("//li[@id='node13']"));
		WebElement drop13 = driver.findElement(By.xpath("//ul[@id='box5']"));
		as.dragAndDrop(drag13, drop13).perform();
		
		WebElement drag14 = driver.findElement(By.xpath("//li[@id='node14']"));
		WebElement drop14 = driver.findElement(By.xpath("//ul[@id='box5']"));
		as.dragAndDrop(drag14, drop14).perform();
		
		WebElement drag15 = driver.findElement(By.xpath("//li[@id='node15']"));
		WebElement drop15 = driver.findElement(By.xpath("//ul[@id='box5']"));
		as.dragAndDrop(drag15, drop15).perform();
		
		
	}
}
