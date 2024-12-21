package org.selenium4;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		
		driver.get("https://www.facebook.com/r.php");
		
		//WebDriver newWindow = driver.switchTo().newWindow(WindowType.TAB);
		//newWindow.navigate().to("https://www.amazon.in/");
	}
}
