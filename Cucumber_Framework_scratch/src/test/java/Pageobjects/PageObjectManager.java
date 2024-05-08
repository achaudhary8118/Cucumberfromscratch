package Pageobjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager { //This act as a factory where we get all new products
	
	public LandingPage landingPage;
	public Offerpage Offerpage;
	public WebDriver driver;
	public CheckoutPage checkoutPage;
	
	public PageObjectManager(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public LandingPage getLandPage() { // get all the object of landing page here 
			
		landingPage = new LandingPage (driver);
		return landingPage;
	}
	
	public Offerpage Offerpage () { 
		
		Offerpage = new Offerpage (driver);
		return Offerpage;
	}
	
	public CheckoutPage getCheckOutPage () { 
		
		checkoutPage = new CheckoutPage (driver);
		return checkoutPage;
	}
	
	
	
}
