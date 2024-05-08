package Pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {

	public WebDriver driver;

	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}

	By search = By.xpath("//input[@placeholder='Search for Vegetables and Fruits']");
	By productName = (By.cssSelector("h4.product-name"));
	By topdeals = (By.linkText("Top Deals"));
	By Increment = By.cssSelector("a.increment");
	By addToCart = By.cssSelector(".product-action button");
	// String landingPageProductName;
	// create a action method for above stored locators

	public void searchItem(String name) { // what string we are sending through StepDefination file should pass here
		driver.findElement(search).sendKeys(name);
	}

	public String getproductname() {

		return driver.findElement(productName).getText();
	}
	
	public void incrementQuantity(int Quantity)
	{
		int i = Quantity-1;
		while(i>0)
		{
			driver.findElement(Increment).click();
			i--;
		}
	}
	
	public void addToCart() {
		driver.findElement(addToCart).click();
	}

	public void topdeals() {
		driver.findElement(topdeals).click();
	}
	
	public String getTitleLandingPage() {
		return driver.getTitle();
	}
	
	
}



