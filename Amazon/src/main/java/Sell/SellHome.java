package Sell;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SellHome {
	//              (//div[@id='B09J2MM5C6']//div)[1]
	//              (//div[@id='anonCarousel1']//div)[4]
	@FindBy (xpath = "(//a[text()='Best Sellers'])[1]") 
	private WebElement bestsell ;
	
	@FindBy (xpath = "(//div[@id='anonCarousel1']//div)[4]") 
	private WebElement startSell ;
	
	@FindBy (xpath = "//input[@id='add-to-cart-button']") 
	private WebElement addToCart ;
	
	@FindBy (xpath = "//input[@value='Proceed to checkout']") 
	private WebElement proceedToBuy ;
	
	////input[@value='Proceed to checkout']
	// Constructor : Initialization of WebElement : Login Or Sign Up Page
	
	public  SellHome(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	// Methods : Action on WebElements : Login Or Sign Up Page 
	
	public void clickonbestsell() {
		bestsell.click();
	}
	
	public void clickonstartSell() {
		startSell.click();
	}
	public void clickonaddToCart() {
		addToCart.click();
	}
	public void clickonproceedToBuy() {
		proceedToBuy.click();
	}
	
	
	//a[text()='Sell']
	
	//a[text()='Start Selling']
	
	
}//a[text()='Amazon miniTV']
