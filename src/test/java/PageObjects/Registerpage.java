package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Registerpage extends mainpage{

	
	public Registerpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	//elements
	@FindBy(xpath = "//a[normalize-space()='Register']")
	WebElement link;
	
	@FindBy(id = "customer.firstName")
	WebElement frstname;
	
	@FindBy(id = "customer.lastName")
	WebElement lstname;
	
	@FindBy(id = "customer.address.street")
	WebElement addrss;
	
	@FindBy(id = "customer.address.city")
	WebElement cty;
	
	@FindBy(id = "customer.address.state")
	WebElement ste;
	
	@FindBy(id = "customer.address.zipCode")
	WebElement zpcde;
	
	@FindBy(id = "customer.phoneNumber")
	WebElement phnum;
	
	@FindBy(id = "customer.ssn")
	WebElement ssnum;
	
	@FindBy(id = "customer.username")
	WebElement usrnme;
	
	@FindBy(id = "customer.password")
	WebElement psswrd;
	
	@FindBy(id = "repeatedPassword")
	WebElement rptpssrd;
	
	@FindBy(xpath = "//input[@value='Register']")
	WebElement rstbtton;
	
	//action methods
	
	public void lnk()
	{
		link.click();
	}
	public void setfirstname(String fname)
	{
	frstname.sendKeys(fname);
	}
	
	public void setlasttname(String lname)
	{
		lstname.sendKeys(lname);
	}
	
	public void setaddress(String addr)
	{
		addrss.sendKeys(addr);
	}
	
	public void setcity(String ct)
	{
		cty.sendKeys(ct);
	}
	
	public void setstate(String sat)
	{
		ste.sendKeys(sat);
	}
	
	public void setzipcode(String zcde)
	{
		zpcde.sendKeys(zcde);
	}
	
	public void setphoneum(String pnum)
	{
		phnum.sendKeys(pnum);
	}
	
	public void setssnumber(String sin)
	{
		ssnum.sendKeys(sin);
	}
	
	public void setusername(String usern)
	{
		usrnme.sendKeys(usern);
	}
	
	public void setpassword(String pwrd)
	{
		psswrd.sendKeys(pwrd);
	}
	
	public void setrepeatpassword(String rpwrd)
	{
		rptpssrd.sendKeys(rpwrd);
	}
	
	public void btton()
	{
		rstbtton.click();
	}
}
