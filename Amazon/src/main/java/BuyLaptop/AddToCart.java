package BuyLaptop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart {
	@FindBy(xpath="//input[@id='buy-now-button']")
	private WebElement addToCart;
	

	  public AddToCart (WebDriver driver) {
		  PageFactory.initElements(driver, this);
	  }
	  public void addToCart () {
		  addToCart.click();
	  }
}
