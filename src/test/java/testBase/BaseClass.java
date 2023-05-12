package testBase;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

public  static WebDriver driver;
	
	
	@BeforeClass

	public void setup() {
		
		
		ChromeOptions ops=new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		/*if(br.equals("chrome"))
		{
			driver=new ChromeDriver();
		}*/
	
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver(ops);
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get("https://parabank.parasoft.com/parabank/index.htm");
}
	
	@AfterClass
	   public void tearDown() {
			driver.quit();
		}
}