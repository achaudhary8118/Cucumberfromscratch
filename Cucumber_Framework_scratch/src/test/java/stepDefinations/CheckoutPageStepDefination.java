package stepDefinations;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Pageobjects.CheckoutPage;
import Utlis.TestContextSetup;
import io.cucumber.java.en.Then;

public class CheckoutPageStepDefination {
	public WebDriver driver;
	public String landingPageProductName;
	public String offerPageProductName;
	public CheckoutPage checkoutPage;
	TestContextSetup testcontextsetup;

	public CheckoutPageStepDefination(TestContextSetup testcontextsetup) {
		this.testcontextsetup = testcontextsetup;
		this.checkoutPage = testcontextsetup.pageObjectManager.getCheckOutPage();
	}

	@Then("verify user has ability to enter promo code and place the order")
	public void verify_user_has_ability_to_enter_promo() {
		
		Assert.assertTrue(checkoutPage.VerifyPromoBtn());
		Assert.assertTrue(checkoutPage.VerifyPlaceOrder());
	}
	
	@Then("^User proceeds to Checkout and validate the (.+) items to checkout page$")
	public void user_proceeds_to_checkout(String name) throws InterruptedException {
		checkoutPage.Checkoutitems();
		//Thread.sleep(2000);
		
	}

}





