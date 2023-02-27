package LEDTorch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuyTorch {
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	private WebElement searchTab;
	
	@FindBy(xpath="//input[@id='nav-search-submit-button']")
	private WebElement clicksymb;
	
	@FindBy(xpath="//span[text()='Bajaj']")
	private WebElement SelectBajaj;
	
	@FindBy(xpath="((//div[@class='sg-col-inner'])[3]//div)[31]")
	private WebElement SelectTorch;

	  public BuyTorch (WebDriver driver) {
		  PageFactory.initElements(driver, this);
	  }
	  
	  public void clickOnsearchTab () {
		  searchTab.click();
		  searchTab.sendKeys(" LED Torch");
	  }
	  public void clicksymb () {
		  clicksymb.click();
	  }
	  public void clickOnSelectBajaj () {
//		  clicksymb.click();
			boolean b;
			b=SelectBajaj.isSelected();
			System.out.println(b);
			if(b==false)
			{
				System.out.println("Element is not selected");
				SelectBajaj.click();
			}
			else
			{
				System.out.println("Element is selected");
			}
			boolean c = SelectBajaj.isSelected();
			System.out.println(c);
	  }
	  public void clickSelectTorch () {
		  SelectTorch.click();
	  }
	}
			
			
			
			
			
			
			
//a[text()='Amazon miniTV']
//driver.swith
//h1[text()='Comedy']
//img[@alt='Farzi Mushaira - Season 3 - Watch Free']