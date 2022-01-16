package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import test.base.Base;

public class CreateManufacturingOrder extends Base {
	
	@Test
	
	public void CreateManufacturingOrder() throws InterruptedException {
	
	
		
	click("manufacturing");
	
	click("createBtnManufacOrder");
	
	type("product","ProductTest");
	
	click("productDropdown");
	
	
	type("billOfMaterial","200");
	click("bilLabel");
	
	click("bOMmodal");
	
	click("createBtn2");
	
	click("createBOMmodal");
	
	click("saveBtn2");
	click("componentTab");
	
	click("addNewLine");
	
	type("componentProduct","testProduct");
	
	
	click("header");
	
	click("createbtn3");

	clear("toConsume");
	type("toConsume","1.00");
	
	
	click("uOM");
	
	click("confirmBtn");
	
	
	click("statusBar");

	click("confirmBtn2");
	
	
	click("markAsDoneBtn");
	
	click("applyBtn");
	
}
}
