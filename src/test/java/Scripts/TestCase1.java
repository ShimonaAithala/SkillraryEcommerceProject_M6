package Scripts;

import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pomPages.SkillraryLoginPage;
import pomPages.Skillrary_AddToCartPage;
import pomPages.Skillrary_DemoLoginPage;

public class TestCase1 extends BaseClass
{
	@Test
	public void tc1()
	{
		SkillraryLoginPage s= new SkillraryLoginPage(driver);
		s.gearsbutton();
		s.skillrarydemoapplication();
		utilities.switchingtabs(driver);
		Skillrary_DemoLoginPage sd= new Skillrary_DemoLoginPage(driver);
		utilities.mouseHover(driver, sd.getCoursetab());
		sd.seleniumtrainingtab();
		Skillrary_AddToCartPage satc= new Skillrary_AddToCartPage(driver);
		utilities.doubleClick(driver, satc.getAddbtn());
		satc.carttocartbtn();
		utilities.alertPopup(driver);
		
	}

}
