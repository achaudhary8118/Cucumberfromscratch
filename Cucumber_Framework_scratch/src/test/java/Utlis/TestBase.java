package Utlis;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	public WebDriver driver;

	public WebDriver WebDriverManager() throws IOException {

		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "//src//test//resources//global.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String url = prop.getProperty("QAUrl");
		//String browser = prop.getProperty("browser");
		//System.out.println(url);
		//System.out.println(browser);

		if (driver == null) {

			if (prop.getProperty("browser").trim().equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + "/src/test/resources/chromedriver.exe");
				driver = new ChromeDriver();
				driver.manage().window().maximize();
			}
System.out.println(prop.getProperty("browser") +":chrome");
			if (prop.getProperty("browser").equalsIgnoreCase("firefox")) {
				// firefox code
			}
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.get(url);
		}
		return driver;
	}
}
