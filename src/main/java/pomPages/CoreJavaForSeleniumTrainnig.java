package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoreJavaForSeleniumTrainnig {
	
	@FindBy(xpath="//body[@bis_frame_id='6442450949']")
	private WebElement frame;
	
	@FindBy(xpath="//div[@class='play-icon']")
	private WebElement playbtn;
	
	@FindBy(xpath="//div[@class='pause-icon']")
	private WebElement pausebtn;
	
	@FindBy(xpath="//span[text()='Add To Wishlist']")
	private WebElement wishlist;
	
	public CoreJavaForSeleniumTrainnig(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void playButton()
	{
		playbtn.click();
	}
	
	public void pauseButton()
	{
		pausebtn.click();
	}

	public WebElement getFrame() {
		return frame;
	}
	
	public void wishListBtn()
	{
		wishlist.click();
	}
	
	

}
