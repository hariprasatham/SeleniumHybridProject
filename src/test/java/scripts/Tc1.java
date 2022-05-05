package scripts;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.AddtoCart;
import pomPages.SkillraryDemoApp;
import pomPages.SkillraryLoginPage;



public class Tc1 extends BaseClass {
	@Test
	public void tc1() throws InterruptedException {
		
		SkillraryLoginPage s = new SkillraryLoginPage(driver);
		s.gearsButton();
		s.skillrarydemoapp();
		
		SkillraryDemoApp sd = new SkillraryDemoApp(driver);
		driverUtilities.switchingTabs(driver);
		driverUtilities.mouseHouver(driver, sd.getCoursetab());
		sd.seleniumtariningbtn();
		
		AddtoCart a = new AddtoCart(driver);
		driverUtilities.doubleClick(driver, a.getAdd());
		Thread.sleep(3000);
		a.addtoCart();
		
	}

}
