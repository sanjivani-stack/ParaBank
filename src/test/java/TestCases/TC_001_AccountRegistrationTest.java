package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.Registerpage;
import testBase.BaseClass;

public class TC_001_AccountRegistrationTest extends BaseClass{
  @Test
  public void Registration() {
	  try
	  {
	  Registerpage rp= new Registerpage(driver);
	  rp.lnk();
	  rp.setfirstname("sai");
	  rp.setlasttname("s");
	  rp.setaddress("123  street");
	  rp.setcity("richmond");
	  rp.setstate("ontario");
	  rp.setzipcode("ad456");
	  rp.setphoneum("1237895679");
	  rp.setssnumber("34589675");
	  rp.setusername("sais@abc.com");
	  rp.setpassword("password");
	  rp.setrepeatpassword("password");
	  rp.btton();
	  
		  
	  }
	  catch (Exception e)
	  {
		  Assert.fail();
	  }
  }
}
