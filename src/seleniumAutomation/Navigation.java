package seleniumAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();	
driver.get("https://www.facebook.com/");
driver.navigate().to("https://www.amazon.in/");

driver.navigate().back();
driver.navigate().forward();
driver.navigate().refresh();
	}

}
