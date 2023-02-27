package BuyLaptop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TotalHome {

	
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	private WebElement searchTab;
	
	@FindBy(xpath="//input[@id='nav-search-submit-button']")
	private WebElement clicksymb;
	
	@FindBy(xpath="(//div[@data-asin='B0B82FX9JW']//span)[11]")
	private WebElement selectitom;
	

	  public TotalHome (WebDriver driver) {
		  PageFactory.initElements(driver, this);
	  }
	  public void searchTab () {
		  searchTab.click();
		  searchTab.sendKeys("Hp Laptop core i5");
	  }
	  public void clicksymb () {
		  clicksymb.click();
	  }
	 
	  public void selectitom () {
		  selectitom.click();
	  }
	  
	   // For Best Seller
	  
	  @FindBy (xpath = "(//a[text()='Best Sellers'])[1]") 
		private WebElement bestsell ;
		
		@FindBy (xpath = "(//div[@id='anonCarousel1']//div)[4]") 
		private WebElement startSell ;
		
		@FindBy (xpath = "//input[@id='add-to-cart-button']") 
		private WebElement addToCart ;
		
		
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
		
	  
	  
}
