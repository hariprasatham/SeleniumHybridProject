package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestingPage {
	
	@FindBy(xpath="(//a[text()='Selenium Training'])[2]")
	private WebElement seleniumtraining;
	
	@FindBy(xpath="(//fieldset[@id='mycart'])[1]")
	private WebElement cart;

	public WebElement getSeleniumtraining() {
		return seleniumtraining;
	}

	public WebElement getCart() {
		return cart;
	}
	
	 public WebElement getFacebook() {
			return facebook;
		}
	
	@FindBy(xpath="(//i[@class='fa fa-facebook'])[2]")
	private WebElement facebook;
	
	
	public TestingPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void facebookIcon() {
		
		facebook.click();
	}

	
	
}
