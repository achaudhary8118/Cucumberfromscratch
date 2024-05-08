package Pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Offerpage {
	
	
	public WebDriver driver;
	public Offerpage(WebDriver driver) {
		this.driver = driver;
	}

private By searchfield	= By.id("search-field");  //encapsulation
private By offerpageproductname = By.cssSelector("tr td:nth-child(1)");


	public void searchfield (String name) {
	
		driver.findElement(searchfield).sendKeys(name);

	}
	
	public String offerpageproductname () {
		return driver.findElement(offerpageproductname).getText();
}
	
}