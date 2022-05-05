package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryLoginPage 
{
	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gearbtn;
	
	@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement skillraryDemoApp;
	
	@FindBy(name="q")
	private WebElement searchfield;
	
	@FindBy(xpath="//input[@value='go']")
	private WebElement searchbtn;
	
	public SkillraryLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void gearsButton()
	{
		gearbtn.click();
	}
	
	public void skillrarydemoapp()
	{
		skillraryDemoApp.click();
	}
	
	public void searchTextField(String courseName)
	{
		searchfield.sendKeys(courseName);
	}
	
	public void  SearchButton()
	{
		searchbtn.click();
	}
}
