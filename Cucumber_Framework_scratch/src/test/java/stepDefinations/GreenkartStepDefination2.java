package stepDefinations;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Pageobjects.LandingPage;
import Pageobjects.Offerpage;
import Pageobjects.PageObjectManager;
import Utlis.TestBase;
import Utlis.TestContextSetup;
import io.cucumber.java.en.Then;

public class GreenkartStepDefination2 {
public WebDriver driver;
public String landingPageProductName;
public String offerPageProductName;
TestContextSetup testcontextsetup;
	
public GreenkartStepDefination2 (TestContextSetup testcontextsetup)
{
	this.testcontextsetup = testcontextsetup;
}
	
	@Then("^user searched for (.+) shortname in offer page$")
	public void user_searched_for_same_shortname_in_offer_page(String shortname) throws InterruptedException {
		
		switchToOffersPage();
		Offerpage offer = testcontextsetup.pageObjectManager.Offerpage();//new Offerpage(testcontextsetup.driver);
		offer.searchfield(shortname);
	    //testcontextsetup.driver.findElement(By.id("search-field")).sendKeys(shortname);
	    Thread.sleep(2000);
	    offerPageProductName = offer.offerpageproductname();  
	   
	}
	
	public void switchToOffersPage () {
	
		//if switched to offer page -> skip below part
		//if (testcontextsetup.driver.getCurrentUrl().equalsIgnoreCase("https://rahulshettyacademy.com/seleniumPractise/#/offers"))
		LandingPage	land = testcontextsetup.pageObjectManager.getLandPage();//new LandingPage(testcontextsetup.driver);
		land.topdeals();
		//testcontextsetup.driver.findElement(By.linkText("Top Deals")).click();
		testcontextsetup.genericUtils.SwitchWindowToChild();
	}
	
	@Then("validate product name in offers page matched with Landing page")
	public void validate_product_name_in_offers_page_matched_with_Landing_page ()
	{
		Assert.assertEquals(testcontextsetup.landingPageProductName, offerPageProductName);
		System.out.println("I am here to close window");
		//testcontextsetup.genericUtils.driver.close();
		//testcontextsetup.pageObjectManager.driver.close();
		System.out.println("closeds window");
		
	}

	
					
	

	
	
}
