package seleniumAutomation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 WebElement ref = driver.findElement(By.id("searchDropdownBox"));
		 Select s=new Select((WebElement) ref);
		 Thread.sleep(5000);
		 s.selectByIndex(5);
		 Thread.sleep(5000);
		 s.selectByValue("search-alias=mobile-apps");
		 Thread.sleep(5000);
         s.selectByVisibleText("Clothing & Accessories");
         
         
         
        
      
	}

}
