package seleniumAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginscript {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/accounts/login/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("username")).sendKeys("6202230175");
		driver.findElement(By.name("password")).sendKeys("Anshukumar@1");
		driver.findElement(By.xpath("(//div[contains(@class,'qF0y9')])[4]")).click();
		String actualtitle = driver.getTitle();
		System.out.println(actualtitle);

		String url = driver.getCurrentUrl();
		System.out.println(url);

		driver.close();
		

	}

}
