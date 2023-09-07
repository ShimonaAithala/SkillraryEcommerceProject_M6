package Scripts;

import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pomPages.SkillraryLoginPage;
import pomPages.Skillrary_DemoLoginPage;
import pomPages.Skillrary_testingPage;

public class TestCase2 extends BaseClass
{
	@Test
	public void tc2() throws Throwable
	{
		SkillraryLoginPage sl= new SkillraryLoginPage(driver);
		sl.gearsbutton();
		sl.skillrarydemoapplication();
		Skillrary_DemoLoginPage sdl = new Skillrary_DemoLoginPage(driver);
		utilities.switchingtabs(driver);
		utilities.dropDown(sdl.getCoursedd(),pdata.getPropertydata("coursedd"));
		Skillrary_testingPage  stp= new  Skillrary_testingPage (driver);
		utilities.dragdrop(driver, stp.getSeleniumtrainingdrag(), stp.getAddtocartdrop());
		
	}

}
