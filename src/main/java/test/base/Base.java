package test.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;



public class Base{
	
	public static WebDriver driver;
	public static FileInputStream fis;
	public static Properties config= new Properties();
	public static Properties OR= new Properties();
	public static WebDriverWait wait;

	
	
	@BeforeSuite
	public void setUp() {
		
if(driver==null) {
			
			try {
				fis = new FileInputStream("C:\\Workspace\\TestAspire\\src\\test\\resources\\properties\\Config.properties");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				config.load(fis);
				} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			try {
				fis= new FileInputStream("C:\\Workspace\\TestAspire\\src\\test\\resources\\properties\\OR.properties");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				OR.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		if(config.getProperty("browser").equals("Firefox")) {
			//System.setProperty("webdriver.chrome.driver","C:\\Workspace\\TestAspire\\src\\test\\resources\\executables\\geckodriver.exe");
			driver= new FirefoxDriver();
		}else if(config.getProperty("browser").equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Workspace\\TestAspire\\src\\test\\resources\\executables\\chromedriver.exe");
			driver=new ChromeDriver();
			
		}else if(config.getProperty("browser").equals("IE")) {
			System.setProperty("webdriver.IE.driver","C:\\Workspace\\TestAspire\\src\\test\\resources\\executables\\IEDriverServer.exe");;
			driver= new InternetExplorerDriver();
		}
		driver.get(config.getProperty("testsiteurl"));
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Integer.parseInt(config.getProperty("implicit.time")),TimeUnit.SECONDS);
		wait= new WebDriverWait(driver,5);
	}
	
	
	
	public void click(String locator) {
	
			driver.findElement(By.xpath(OR.getProperty(locator))).click();
			
		}
	
	public void clear(String locator) {
		
		driver.findElement(By.xpath(OR.getProperty(locator))).clear();
		
	}
		
		
		

	
	public void type(String locator, String value) {
	
			driver.findElement(By.xpath(OR.getProperty(locator))).sendKeys(value);
		}
		

	
		
		
	
	
	@AfterSuite
	public void tearDown() {
		
		driver.quit();
	}
	
	
	
	
}




