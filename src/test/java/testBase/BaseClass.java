package testBase;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	
	
	
	
	public  static WebDriver driver;
	
	
	@BeforeClass
	@Parameters("browser")
	public void setup(String br) {
		
		
		ChromeOptions ops=new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		if(br.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
	
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver(ops);
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get("appURL");
}
	
	@AfterClass
	   public void tearDown() {
			driver.quit();
		}
}