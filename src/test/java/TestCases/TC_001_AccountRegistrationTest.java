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
	  rp.setfirstname(randomeString().toUpperCase());
	  rp.setlasttname(randomeString().toUpperCase());
	  rp.setaddress("123  street");
	  rp.setcity("richmond");
	  rp.setstate("ontario");
	  rp.setzipcode("ad456");
	  rp.setphoneum(randomeNumber());
	  rp.setssnumber(randomeNumber());
	  rp.setusername(randomeString()+"@gmail.com");
	  String password = randomeAlphaNumeric();
	  rp.setpassword(password);
	  rp.setrepeatpassword(password);
	  rp.btton();
	  
		  
	  }
	  catch (Exception e)
	  {
		  Assert.fail();
	  }
  }
}
