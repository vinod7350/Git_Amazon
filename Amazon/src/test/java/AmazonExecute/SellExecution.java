 package AmazonExecute;

 import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

 import org.openqa.selenium.WebDriver;
 import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Sell.SellHome;

 public class SellExecution {
	public static void main(String[] args) {
		

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver.exe3");
	WebDriver driver=new ChromeDriver();// object to call get method  
	
  	driver.get("https://www.amazon.in");// which url is open 
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
    SellHome sellHome = new SellHome(driver) ;
    sellHome.clickonbestsell();
    sellHome.clickonstartSell();
 	ArrayList<String> child = new ArrayList<String>(driver.getWindowHandles() );
 	driver.switchTo().window(child.get(0));

    sellHome.clickonaddToCart();
    sellHome.clickonproceedToBuy();
    System.out.println("Sell End");
	}
	
}
