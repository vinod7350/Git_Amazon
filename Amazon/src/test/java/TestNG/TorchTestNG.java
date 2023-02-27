package TestNG;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import LEDTorch.BuyTorch;
import LEDTorch.TorchAddToCart;

public class TorchTestNG {
	 BuyTorch buyTorch;
	TorchAddToCart torchAddToCart;
	WebDriver driver;
	
	@Parameters ("browser")
	@BeforeTest
	public void launchbrowser(String browserName) {
		
	   System.out.println(browserName);
	   
	  if(browserName.equals("Chrome"))
	  {
         System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver.exe3");
	     driver=new ChromeDriver();// object to call get method  
	  } 
	  if(browserName.equals("Firefox"))
	  {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\HP\\Downloads\\geckodriver.exe");
	    driver=new FirefoxDriver();// object to call get method  
	  }
	
	}
	
	@BeforeClass           // class
	public void beforeclass() {
		System.out.println("Before Class");
	     torchAddToCart= new TorchAddToCart(driver);
		     buyTorch= new BuyTorch(driver);

		
	}

	@BeforeMethod         // include
	public void beforeMethod() {
		System.out.println("BeforeMethod");
		driver.get("https://www.amazon.in");// which url is open 
	 	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@Test               // include
	public void test() throws InterruptedException {
		System.out.println(" test ");
	
	    BuyTorch buyTorch= new BuyTorch(driver);
	    
	    buyTorch.clickOnsearchTab();
	    buyTorch.clicksymb();
	    
	    Thread.sleep(5000);
	    
	    buyTorch.clickOnSelectBajaj();
	    buyTorch.clickSelectTorch();
	    
	    TorchAddToCart torchAddToCart= new TorchAddToCart(driver);
	    
	    ArrayList<String> child = new ArrayList<String>(driver.getWindowHandles() );
	 	driver.switchTo().window(child.get(1));

	    torchAddToCart.clickOnaddToCart();
	    torchAddToCart.clickOnproceedToBuy();
	} 
	
	
	@AfterMethod         // include
	public void aftermethod() {
		System.out.println("after method");
		BuyTorch buyTorch=null;
		TorchAddToCart torchAddToCart=null;
		WebDriver driver=null;
	}
	
	@AfterClass            // class
	public void afterclass() {
		System.out.println("after class");
		
	}
	
	@AfterTest            // test
	public void afterTest() {
		System.out.println("after Test");
	}
	
	
}
