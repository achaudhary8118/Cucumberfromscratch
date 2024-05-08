package stepDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import Pageobjects.LandingPage;
import Utlis.TestContextSetup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class GreenkartStepDefination {
	public WebDriver driver;
	public String landingPageProductName;
	public String offerPageProductName;
	LandingPage land;
	TestContextSetup testcontextsetup;

	public GreenkartStepDefination(TestContextSetup testcontextsetup) {
		this.testcontextsetup = testcontextsetup;
		this.land = testcontextsetup.pageObjectManager.getLandPage();
	}

	@Given("User is on Greencart Landing Page")
	public void user_is_on_greencart_landing_page() {
		/*System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ARMY\\OneDrive - Capco\\Desktop\\Amit\\chromedriver-win64\\chromedriver.exe");
		testcontextsetup.driver = new ChromeDriver();
		testcontextsetup.driver.manage().window().maximize();
		testcontextsetup.driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");*/
	 Assert.assertTrue(land.getTitleLandingPage().contains("GreenKart"));
	}

	@When("^user searched with shortname (.+) and extracted actual name of product$")
	public void user_searched_with_shortname_and_extracted_actual_name_of_product(String shortname)
			throws InterruptedException {
		// object initiation of landing page bcoz we have search locator present over
		// there
		//new LandingPage(testcontextsetup.driver);
		land.searchItem(shortname);
		Thread.sleep(2000);
		testcontextsetup.landingPageProductName = land.getproductname().split("-")[0].trim();
		System.out.println(testcontextsetup.landingPageProductName + " is extracted from Home Page");
	}

	@When("Added {string} items of the selected product to cart")
	public void Added_items_product(String Quantity) {
		
		land.incrementQuantity(Integer.parseInt(Quantity));
		land.addToCart();
	}
}





