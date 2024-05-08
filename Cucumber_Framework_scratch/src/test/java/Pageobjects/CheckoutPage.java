package Pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {

	public WebDriver driver;

	public CheckoutPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By cartBag = By.cssSelector("img[alt='Cart']");
	By checkOutButton = By.xpath("//button[normalize-space()='PROCEED TO CHECKOUT']");
	By promoBtn = By.cssSelector(".promoBtn");
	By placeOrder = By.xpath("//button[normalize-space()='Place Order']");
	
	
	public void Checkoutitems() {
		driver.findElement(cartBag).click();
		driver.findElement(checkOutButton).click();
	}
	
	public Boolean VerifyPromoBtn() {
		return driver.findElement(promoBtn).isDisplayed();
	}
	
	public Boolean VerifyPlaceOrder() {
		return driver.findElement(placeOrder).isDisplayed();
	}

	}
