package scripts;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.SkillraryDemoApp;
import pomPages.SkillraryLoginPage;
import pomPages.TestingPage;

public class Testcase2 extends BaseClass {
	
	@Test
	public void tc2() throws IOException, InterruptedException
	{
		SkillraryLoginPage s = new SkillraryLoginPage(driver);
		s.gearsButton();
		s.skillrarydemoapp();
		
		SkillraryDemoApp sd = new SkillraryDemoApp(driver);
		driverUtilities.switchingTabs(driver);
		driverUtilities.dropDown(sd.getAddressdd(), pdata.getPropertyFileData("dropdowndata"));
		
		TestingPage t = new TestingPage(driver);
		driverUtilities.switchingTabs(driver);
		driverUtilities.draganddrop(driver, t.getSeleniumtraining(), t.getCart());
		Point loc = t.getCart().getLocation();
		int x = loc.getX();
		int y = loc.getY();
		driverUtilities.scrollBar(driver, x, y);
	
	}

}
