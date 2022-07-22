package seleniumAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.zeromq.ZStar.Set;

public class Childbrowserpopup {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/?ext_vrnc=hi&tag=googinkenshoo-21&ascsubtag=_k_CjwKCAjwgr6TBhAGEiwA3aVuIXTneXLJPz2FdQdNhmciy66rxBLIScLWddytFwvvhjMvBdcyJGmm5xoCh08QAvD_BwE_k_&gclid=CjwKCAjwgr6TBhAGEiwA3aVuIXTneXLJPz2FdQdNhmciy66rxBLIScLWddytFwvvhjMvBdcyJGmm5xoCh08QAvD_BwE");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.myntra.com/?utm_source=perf_google_search_brand&utm_medium=perf_google_search_brand&utm_campaign=Search%20-%20Myntra%20Brand%20(India)&gclid=CjwKCAjwgr6TBhAGEiwA3aVuIToz9NxfpRXrN3c1lwuBGvFVfqo0mRhVeZhk72HzNuBnQa6go35z4BoCSFwQAvD_BwE");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("admin");
		java.util.Set<String> child = driver.getWindowHandles();



		for(String b:child) {
			driver.switchTo().window(b);
			String title = driver.getTitle();
			System.out.println(title);
	}
	}
}
