package AmazonExecute;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import BuyLaptop.AddToCart;
import BuyLaptop.AmazonHome;

public class LaptopExecute {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("hii");//"C:\Users\HP\Downloads\chromedriver.exe"
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver.exe3");
		 WebDriver driver=new ChromeDriver();// object to call get method  
			
		  	driver.get("https://www.amazon.in");// which url is open 
 	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
 	 AmazonHome amazonHome =new AmazonHome(driver);
 	 amazonHome.searchTab();
 	 amazonHome.clicksymb();
 	 Thread.sleep(5000);
 	 amazonHome.selectitom();
 	
 	      // Switch to another page
 	ArrayList<String> child = new ArrayList<String>(driver.getWindowHandles() );
 	driver.switchTo().window(child.get(0));
 	
	AddToCart addToCart =new AddToCart(driver);
	addToCart.addToCart();
		
	System.out.println("Lappy End");
		
		
		
	}
}
