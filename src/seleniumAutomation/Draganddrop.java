package seleniumAutomation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {

	private static Actions a;

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement block1 =  driver.findElement(By.xpath("//h1[text()='Block 3']"));
		WebElement block2 =  driver.findElement(By.xpath("//h1[text()='Block 2']"));
		
		Thread.sleep(5000);
		Actions a = new Actions(driver);
		a.dragAndDrop(block1,block2).perform();
	}

	
	}

