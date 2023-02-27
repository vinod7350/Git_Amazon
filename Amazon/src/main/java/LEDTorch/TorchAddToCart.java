package LEDTorch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TorchAddToCart {


	@FindBy(xpath="//input[@id='add-to-cart-button']")
	private WebElement addToCart;

	@FindBy(xpath="//input[@name='proceedToRetailCheckout']")
	private WebElement proceedToBuy;

	  public TorchAddToCart (WebDriver driver) {
		  PageFactory.initElements(driver, this);
	  }
	  public void clickOnaddToCart () {
		  addToCart.click();
	  }
	  public void clickOnproceedToBuy () {
		  proceedToBuy.click();
	  }
}//input[@name='proceedToRetailCheckout']
