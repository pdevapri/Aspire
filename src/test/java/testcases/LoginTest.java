package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import test.base.Base;

public class LoginTest extends Base{
	
	@Test
	

	public  void Login() throws InterruptedException {
		
		
		String Loginid="user@aspireapp.com";
		String Password="@sp1r3app";
		
		type("loginid",Loginid);
		
		type("password",Password);
				
		click("loginButton");
		
		
		
		
	}
	}


