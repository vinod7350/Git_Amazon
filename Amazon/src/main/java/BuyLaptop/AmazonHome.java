package BuyLaptop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonHome {

	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	private WebElement searchTab;
	
	@FindBy(xpath="//input[@id='nav-search-submit-button']")
	private WebElement clicksymb;
	
	@FindBy(xpath="(//div[@cel_widget_id='MAIN-SEARCH_RESULTS-2']//span)[1]")
	private WebElement selectitom;
	

	  public AmazonHome (WebDriver driver) {
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
	 
	
	
	
	
	
	
	
}
