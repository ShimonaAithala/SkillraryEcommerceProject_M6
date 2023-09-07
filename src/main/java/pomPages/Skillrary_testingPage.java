package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Skillrary_testingPage 
{
	//declaration
	//address of selenium training- to be dragged
	@FindBy(xpath="(//a[text()='Selenium Training'])[2]")
	private WebElement seleniumtrainingdrag;
	
	//address of add to cart- to be dropped into
	@FindBy(id="mycart")
	private WebElement addtocartdrop;
	
	//address of fb icon below the page
	@FindBy(xpath="(//i[@class='fa fa-facebook'])[2]")
	private WebElement fbbtn;
	
	//initialization
	public Skillrary_testingPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	
	//utilization
	
	public WebElement getSeleniumtrainingdrag()
	{
		return seleniumtrainingdrag;
	}

	public WebElement getAddtocartdrop()
	{
		return addtocartdrop;
	}
	
	public void facebookicon()
	{
		fbbtn.click();
	}
	
	

}
