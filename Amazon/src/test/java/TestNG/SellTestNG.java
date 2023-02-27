package TestNG;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import BuyLaptop.AddToCart;
import BuyLaptop.AmazonHome;
import Sell.SellHome;

public class SellTestNG {

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
	@BeforeClass
	public void beforeclass() {
		System.out.println("Before Class");
	
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("BeforeMethod");
		driver.get("https://www.amazon.in");// which url is open 
	 	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
	}
	
		@Test (priority=2)
	public void test1BestSeller() {
		System.out.println("BestSeller");
		
		SellHome sellHome = new SellHome(driver) ;
		 sellHome.clickonbestsell();
		 sellHome.clickonstartSell();
		 sellHome.clickonaddToCart();
		 sellHome.clickonproceedToBuy();
	}
	@AfterMethod
	public void aftermethod() {
		System.out.println("after method");
		
	}
	
	@AfterClass
	public void afterclass() {
		System.out.println("after class");
	}
	
}
