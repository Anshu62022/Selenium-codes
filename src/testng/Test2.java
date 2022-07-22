package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Test
public class Test2 {
	@BeforeMethod
	public void openApp(ChromeDriver driver) {
	 driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.facebook.com/");
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	public void forgetPassword(ChromeDriver driver) {
		
		driver.findElement(By.linkText("Forgotten password?")).click();
		driver.findElement(By.id("identify_email")).sendKeys("admin");
		driver.findElement(By.id("did_submit")).click();
		Reporter.log(driver.getTitle(),true);
		Reporter.log(driver.getCurrentUrl(),true);
		
	
	}

}
