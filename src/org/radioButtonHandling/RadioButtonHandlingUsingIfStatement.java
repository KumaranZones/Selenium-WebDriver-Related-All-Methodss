package org.radioButtonHandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonHandlingUsingIfStatement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/r.php");
		
		WebElement radioButton = driver.findElement(By.xpath("(//input[starts-with(@id,'sex')])[2]"));
		
		if(radioButton.isDisplayed()) {
			System.out.println(radioButton.isDisplayed());
			if(radioButton.isEnabled()) {
				System.out.println(radioButton.isEnabled());
				if(!radioButton.isSelected()) {
					System.out.println(radioButton.isSelected());
					radioButton.click();
					if(radioButton.isSelected()) {
						System.out.println(radioButton.isSelected());
					}else {
						System.out.println("Not Selected");
					}
				}else {
					System.out.println("Yes Selected");
				}
			}else {
				System.out.println("Not Enabled");
			}
		}else {
			System.out.println("Not Displayed");
		}
		driver.close();
	}
}
