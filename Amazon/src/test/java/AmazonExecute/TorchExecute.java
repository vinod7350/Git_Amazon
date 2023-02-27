package AmazonExecute;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import LEDTorch.BuyTorch;
import LEDTorch.TorchAddToCart;

public class TorchExecute {
	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver.exe3");
		WebDriver driver=new ChromeDriver();// object to call get method  
		
		driver.get("https://www.amazon.in");// which url is open 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
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
}
