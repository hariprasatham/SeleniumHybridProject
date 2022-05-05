package scripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.CoreJavaForSeleniumTrainnig;
import pomPages.Search;
import pomPages.SkillraryLoginPage;



public class TestCase3 extends BaseClass {
	@Test
	public void tc3() throws IOException {
	
	SkillraryLoginPage l = new SkillraryLoginPage(driver);
	l.searchTextField(pdata.getPropertyFileData("courseName"));
	l.SearchButton();
	
	Search s = new Search(driver);
	driverUtilities.switchingTabs(driver);
	s.javaForSelenium();
	
	CoreJavaForSeleniumTrainnig st = new CoreJavaForSeleniumTrainnig(driver);
	driverUtilities.switchingTabs(driver);
	driverUtilities.switchFrames(driver);
	st.playButton();
	st.pauseButton();
	driverUtilities.switchBackFrames(driver);
	st.wishListBtn();
	
	

	
	
	
	
	
	}
	

}
