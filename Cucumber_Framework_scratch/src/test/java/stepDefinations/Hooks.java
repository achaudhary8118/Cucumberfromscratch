package stepDefinations;

import java.io.IOException;

import Utlis.TestContextSetup;
import io.cucumber.java.After;

public class Hooks {

	TestContextSetup testcontextsetup;
	public Hooks(TestContextSetup testcontextsetup) {
		this.testcontextsetup = testcontextsetup;
	}
	@After
	public void Afterscenario () throws IOException{
		testcontextsetup.testBase.WebDriverManager().quit();
	}
}
