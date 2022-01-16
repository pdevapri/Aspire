package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import test.base.Base;

public class CreateProduct extends Base{
	
	
	@Test
	public void InventoryCreateProduct() throws InterruptedException {
		
        	
		click("inventory");
		
		click("productHeader");
		
		click("dropdownProducts");
		
		click("createBtnProduct");
		
		type("productName","ProductTest");
		
		click("generalInfoSection");
		
		clear("salesPrice");
		type("salesPrice","2.00");
		
		click("generalInfoSection");

		clear("cost");
		type("cost","10");
						
		click("bottomLeftSection");
		click("saveBtnProduct");
		
		Thread.sleep(3000);
		
		click("statusBar");
		click("updateQuantityBtn");

		click("createQuantity");
		
		click("location");
			
		click("locationDropdown");
		
		type("package","100");
		
		
		clear("onHandQuantity");
		type("onHandQuantity","11");
		
		click("modal1");
		click("createbtn1");
		
		click("savebtn1");
		
		click("application");
		
		

	}
	
	
	

}
