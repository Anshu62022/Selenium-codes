package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebook {
	@FindBy(id="email")
	private WebElement usernametb;
	@FindBy(name="pass")			
	private WebElement passwordtb;
	@FindBy(name="login")			
	private WebElement loginbtn;
	public Facebook(WebDriver driver) {
		PageFactory.initElements(driver, this);
}
	public void user(String name) {
		usernametb.sendKeys(name);
	}
	public void pwd(String name) {
		passwordtb.sendKeys(name);
	
	}
	public void loginbutton() {
		loginbtn.click();
		
	}

}
