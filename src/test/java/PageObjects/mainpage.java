package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class mainpage {

	
	WebDriver driver;
	public mainpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
}
