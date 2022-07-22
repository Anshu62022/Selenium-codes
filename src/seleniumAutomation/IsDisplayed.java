package seleniumAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement ref= driver.findElement(By.id("twotabsearchtextbox"));
		if(ref.isDisplayed()) {
			System.out.println("pass:element is displayed");
		}
			else {
				System.out.println("Failed:element is not displayed");
			
				
			}
		}
	}


