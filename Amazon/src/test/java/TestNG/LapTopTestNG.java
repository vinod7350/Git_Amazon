package TestNG;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import BuyLaptop.AddToCart;
import BuyLaptop.AmazonHome;
import LEDTorch.BuyTorch;
import LEDTorch.TorchAddToCart;
import Sell.SellHome;

public class LapTopTestNG {
	WebDriver driver;

	 AmazonHome amazonHome ;
	 SellHome sellHome ;
	 BuyTorch buyTorch;
	TorchAddToCart torchAddToCart;
	
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
	
	@BeforeClass
	public void objectStore() {
		System.out.println("Before Class");
		
		   amazonHome =new AmazonHome(driver);
		   sellHome = new SellHome(driver) ;
		   
		   torchAddToCart= new TorchAddToCart(driver);
		     buyTorch= new BuyTorch(driver);

		
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("BeforeMethod");
		driver.get("https://www.amazon.in");// which url is open 
	 	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
	}
	
//	@Test 
//	public void include() throws InterruptedException {
//		
//		System.out.println("include");
//		
//	}

	@Test 
	public void testLappy() throws InterruptedException {
		System.out.println("testLappy");
		
	 	 amazonHome.searchTab();
	 	 amazonHome.clicksymb();
	 	 Thread.sleep(5000);
	 	 amazonHome.selectitom();
	 	
	 	      // Switch to another page
	 	ArrayList<String> child = new ArrayList<String>(driver.getWindowHandles() );
	 	driver.switchTo().window(child.get(1));
	 	
		AddToCart addToCart =new AddToCart(driver);
		addToCart.addToCart();
			
	}
	@Test
	public void bestSeller() {
		
		System.out.println("Best Seller");
		
		
		 sellHome.clickonbestsell();
		 sellHome.clickonstartSell();
		 sellHome.clickonaddToCart();
		 sellHome.clickonproceedToBuy();
	}
	@Test
	public void BuyTorch() throws InterruptedException {
		
BuyTorch buyTorch= new BuyTorch(driver);
	    
	    buyTorch.clickOnsearchTab();
	    buyTorch.clicksymb();
	    
	    Thread.sleep(5000);
	    
	//    buyTorch.clickOnSelectBajaj();
	    buyTorch.clickSelectTorch();
	    
	    TorchAddToCart torchAddToCart= new TorchAddToCart(driver);
	    
	    ArrayList<String> child = new ArrayList<String>(driver.getWindowHandles() );
	 	driver.switchTo().window(child.get(1));

	    torchAddToCart.clickOnaddToCart();
	    torchAddToCart.clickOnproceedToBuy();
	}
	

	@AfterMethod
	public void aftermethod() {
		
		System.out.println("after method");
		ArrayList<String> child = new ArrayList<String>(driver.getWindowHandles() );
	 	driver.switchTo().window(child.get(0));
	 		}
	
	@AfterClass
	public void nullObject() {
		System.out.println("after class");
		
		WebDriver driver= null;
		AmazonHome amazonHome = null;
		SellHome sellHome = null;
		BuyTorch buyTorch=null;
		TorchAddToCart torchAddToCart=null;
		
	}
	@AfterTest
	public void afterTest() {
		System.out.println("afterTest");
		driver.close();

	}
	
}
