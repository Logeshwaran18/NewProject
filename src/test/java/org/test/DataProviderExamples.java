package org.test;

import org.baseclass.Base;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExamples extends Base{
	@BeforeClass
	private void Start() {
		loadBrowser();
		maximizeWindow();
		implicitWait(10);

	}

	@Test(dataProvider="LoginDatas")
	private void tc1(String name,String password) {
		launchUrl("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(name);
		driver.findElement(By.id("pass")).sendKeys(password);
		driver.findElement(By.name("login")).click();
	}
	
	
	@DataProvider(name="LoginDatas")
	private Object[][] data() {
		return new Object[][] {
			{"logii","1234500"},
			{"happi","852584100"},
			{"mam","ydgbj"}
		};

	}
}
