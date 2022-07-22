package seleniumAutomation;

import java.awt.Dimension;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSize {

	private static int width;

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement ref= driver.findElement(By.name("login"));
		org.openqa.selenium.Dimension s=ref.getSize();
		int height;
		System.out.println(s.getHeight() );
		System.out.println(s.getWidth() );
		
		

	}

}
