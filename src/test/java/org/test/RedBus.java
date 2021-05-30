package org.test;

import java.util.concurrent.TimeUnit;

import org.baseclass.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBus extends Base {

	@Test
	private void tc1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.redbus.in/");
		driver.findElement(By.id("i-icon-profile")).click();
		driver.findElement(By.id("signInLink")).click();

		WebElement ss = driver.findElement(By.xpath("//div[@class='modal']//iframe[@class='modalIframe']"));
		driver.switchTo().frame(ss);
		WebElement number = driver.findElement(By.id("mobileNoInp"));
		number.sendKeys("8006008522");

	}
}
