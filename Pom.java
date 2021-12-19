package pomconfig;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Pom {
	
	@FindBy(xpath="//input[@id='email']")private WebElement userId;
	@FindBy(xpath="//input[@id='pass']")private WebElement password;
	@FindBy(xpath="//input[@name='login']")private WebElement loginBtn;
	@FindBy(xpath="//input[@name='login']")private WebElement CreateBtn;
	@FindBy(xpath="//input[@name='login']")private WebElement forgetPassBtn;
	
PageFactory.initElements(driver,this);
}
public void enteruserid(String id) {
	userId.sendKeys(id);
} 
public void enterPassword(String pass) {
	password.sendKeys(pass);
}
	
}
	