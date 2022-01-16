package RoughPackage;

	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	public class RoughClass {
		
		public static void main (String args[]) throws InterruptedException {
		
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver","C:\\Workspace\\TestAspire\\src\\test\\resources\\executables\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://aspireapp.odoo.com");
		
		WebElement loginid= driver.findElement(By.xpath("//input[@id='login']"));
		loginid.sendKeys("user@aspireapp.com");
		
		WebElement password= driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("@sp1r3app");
		
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		loginButton.click();
		
		Thread.sleep(3000);
		
		WebElement Inventory = driver.findElement(By.xpath("//div[text()='Inventory']"));
		
		Inventory.click();
		
		Thread.sleep(3000);

		WebElement ProductHeader = driver.findElement(By.xpath("//li/a[contains (text(),'Products')]"));
		
		ProductHeader.click();
		
		WebElement DropdownProducts= driver.findElement(By.xpath("//a[@href='#menu_id=117&action=204']/span[contains (text(),'Products')]"));
		DropdownProducts.click();
		Thread.sleep(3000);
		
		WebElement Createbtn= driver.findElement(By.xpath("//button[contains(text(),'Create')]"));
		
		Createbtn.click();
		Thread.sleep(3000);
		
		WebElement Productname= driver.findElement(By.xpath("//input[@name='name']"));
		Productname.sendKeys("P2");
		
		//Select ProductType =new Select(driver.findElement(By.CSSsELECT("#o_field_input_748")));
		
		//ProductType.selectByVisibleText("Service");
		
		//WebElement  ProductCategory = driver.findElement(By.xpath("//input[@id='o_field_input_749']"));
		
		//ProductCategory.click();
		
		//WebElement ProductCategoryAll= driver.findElement(By.xpath("//a[text()= 'All']"));
		
		//ProductCategoryAll.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='General Information']")).click();
		
		WebElement SalesPrice = driver.findElement(By.xpath("//table[@class='o_group o_inner_group o_group_col_6']/tbody/tr/td/div[@name='pricing']/div/input[@class='o_input']"));
		SalesPrice.clear();
		SalesPrice.sendKeys("2.00");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='General Information']")).click();

		WebElement Cost = driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]/div[@name='standard_price_uom']/div/input[@class='o_input']"));
		Cost.clear();
		Cost.sendKeys("10");
		
//		driver.findElement(By.xpath("//a[text()='General Information']")).click();
//		WebElement UoM= driver.findElement(By.xpath("//table[@class='o_group o_inner_group o_group_col_6']/tbody/tr[4]/td[2]/div/div/input[@class='o_input ui-autocomplete-input']"));
//		UoM.click();
	//	

		//WebElement UnitValue = driver.findElement(By.xpath("//a[text()='Units']"));
		//UnitValue.click();
		
		//WebElement PUoM= driver.findElement(By.xpath("//input[@id='o_field_input_755']"));
		//UoM.click();
		
		//WebElement PurchaseUnitValue = driver.findElement(By.xpath("//a[@id='ui-id-72']"));
		//UnitValue.click();
		
		driver.findElement(By.xpath("//div[@class='o_cp_bottom_left']")).click();
		WebElement Savebtn= driver.findElement(By.xpath("//button[@class='btn btn-primary o_form_button_save']"));
		Savebtn.click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='o_statusbar_buttons']"));
		WebElement UpdateQuantity= driver.findElement(By.xpath("//button[@name='action_update_quantity_on_hand']"));
		UpdateQuantity.click();
		
		Thread.sleep(3000);
		WebElement CreateQuantity= driver.findElement(By.xpath("//button[@class='btn btn-primary o_list_button_add']"));
		CreateQuantity.click();
		Thread.sleep(3000);
		
		WebElement Location= driver.findElement(By.xpath("//table/tbody/tr/td[2]/div/div/input[@class='o_input ui-autocomplete-input']"));
		Location.click();
		
		Thread.sleep(2000);
		WebElement LocationDropdown= driver.findElement(By.xpath("//a[text()='WH/Stock']"));
		LocationDropdown.click();

		WebElement Package= driver.findElement(By.xpath("//table/tbody/tr/td[3]/div/div/input[@class='o_input ui-autocomplete-input']"));
		Package.sendKeys("100");
		
		
		

		//WebElement Packagevalue=driver.findElement(By.xpath("//a[text()='10']"));
		//Packagevalue.click();
		
		WebElement OnHandQuantity= driver.findElement(By.xpath("//table/tbody/tr/td[4]/input[@name='inventory_quantity']"));
		OnHandQuantity.clear();
		OnHandQuantity.sendKeys("11");
		
		Thread.sleep(3000);
		WebElement modal= driver.findElement(By.xpath("//footer[@class='modal-footer']"));
		modal.click();
		WebElement Createbtn1= driver.findElement(By.xpath("//button[@class='btn btn-primary']/span[text()='Create']"));
		Createbtn1.click();
		
		
		WebElement Savebtn1= driver.findElement(By.xpath("//button[@class='btn btn-primary o_list_button_save']"));
		Savebtn1.click();
		
		
		WebElement Application= driver.findElement(By.xpath("//a[@class='fa o_menu_toggle fa-th']"));
		Application.click();
		
		//------Manufacturing---
	Thread.sleep(3000);
		
		WebElement Manufacturing = driver.findElement(By.xpath("//div[text()='Manufacturing']"));
		
		Manufacturing.click();
		
		Thread.sleep(3000);
		
		WebElement CreatebtnManufacOrder= driver.findElement(By.xpath("//button[contains(text(),'Create')]"));
		
		CreatebtnManufacOrder.click();
		Thread.sleep(3000);
		
		
		WebElement Product=driver.findElement(By.xpath("//table/tbody/tr[5]/td[2]/div/div/input[@class='o_input ui-autocomplete-input']"));
		Product.sendKeys("P2");
		
		Thread.sleep(2000);
		WebElement Productdropdown=driver.findElement(By.xpath("//a[@class='ui-menu-item-wrapper'][text()='P2']"));
		Productdropdown.click();
		
		WebElement BillOfMaterial=driver.findElement(By.xpath("//table/tbody/tr[10]/td[2]/div/div/input[@class='o_input ui-autocomplete-input']"));
		BillOfMaterial.sendKeys("200");
		driver.findElement(By.xpath("//div[@class='o_group']")).click();
		
//		WebElement BillOfMaterialDropdown = driver.findElement(By.xpath("//a[@class='ui-menu-item-wrapper'][text()='Create \"']"));
//		BillOfMaterialDropdown.click();
		
		
		//WebElement bg = driver.findElement(By.xpath("//div[@class='clearfix position-relative o_form_sheet']"));
		//bg.click();
		
		Thread.sleep(3000);
		WebElement BOMmodal= driver.findElement(By.xpath("//footer[@class='modal-footer']"));
		BOMmodal.click();
		WebElement Createbtn2= driver.findElement(By.xpath("//button[@class='btn btn-primary']/span[text()='Create']"));
		Createbtn2.click();
		
		Thread.sleep(3000);
		WebElement CreateBOMmodal= driver.findElement(By.xpath("//footer[@class='modal-footer']"));
		CreateBOMmodal.click();
		WebElement Savebtn2= driver.findElement(By.xpath("//button[@class='btn btn-primary']/span[text()='Save']"));
		Savebtn2.click();
		
		
//		driver.findElement(By.xpath("//div[@class='o_cp_bottom_left']")).click();
	//
//		WebElement Savebtn3= driver.findElement(By.xpath("//button[@class='btn btn-primary o_form_button_save']"));
//		Savebtn2.click();
	//	
		
		Thread.sleep(3000);
		WebElement Componenttab= driver.findElement(By.xpath("//a[@class='nav-link active']"));
		Componenttab.click();
		
		WebElement Addnewline= driver.findElement(By.xpath("//table/tbody//tr[1]/td[1]/a[text()='Add a line']"));
		Addnewline.click();
		Thread.sleep(2000);
		
		WebElement ComponentProduct= driver.findElement(By.xpath("//table/tbody/tr/td[1]/div/div/input[@class='o_input ui-autocomplete-input']"));
		ComponentProduct.sendKeys("testProduct");
		
		
		WebElement Header =driver.findElement(By.xpath("//table/thead/tr[1]/th[@data-name='product_id']"));
		Header.click();
//		WebElement ComponentProductCreate= driver.findElement(By.xpath("//a[@class ='ui-menu-item-wrapper'][text()='Create \"']"));
//		ComponentProductCreate.click();
	//	
		Thread.sleep(2000);
//		WebElement modal3= driver.findElement(By.xpath("//footer[@class='modal-footer']"));
//		modal3.click();
		WebElement Createbtn3= driver.findElement(By.xpath("//button[@class='btn btn-primary']/span[text()='Create']"));
		Createbtn3.click();
		
		WebElement ToConsume= driver.findElement(By.xpath("//table/tbody/tr/td[2]/input[@name='product_uom_qty']"));
		ToConsume.clear();
		ToConsume.sendKeys("1.00");
		
		
		WebElement UOM= driver.findElement(By.xpath("//table/tbody/tr/td[3]/div/div/input[@class='o_input ui-autocomplete-input']"));
		UOM.click();
//		WebElement UOMValueUnits= driver.findElement(By.xpath("//a[text()='Units']"));
//		UOMValueUnits.click();
		Thread.sleep(3000);
		
		WebElement Confirmbtn= driver.findElement(By.xpath("//button[@name='action_confirm']"));
		Confirmbtn.click();
		
		
		
		
		
		
		driver.findElement(By.xpath("//div[@class='o_form_statusbar']")).click();

		WebElement Confirmbtn2= driver.findElement(By.xpath("//button[@name='action_confirm']"));
		Confirmbtn2.click();
		
//		WebElement ToConsumeQuantity= driver.findElement(By.xpath("//table/tbody/tr/td[2]/span/input[@name='product_uom_qty']"));
//		ToConsumeQuantity.clear();
//		ToConsumeQuantity.sendKeys("1.00");
//		
		Thread.sleep(3000);
		WebElement MarkasDonebtn= driver.findElement(By.xpath("//button[@name='button_mark_done'][@class='btn btn-primary']"));
		MarkasDonebtn.click();
		
		Thread.sleep(3000);
		WebElement Applybtn= driver.findElement(By.xpath("//span[text()='Apply']"));
		Applybtn.click();
		
		
		
		
		}


}
