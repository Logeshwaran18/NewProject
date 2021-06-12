package org.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCaseOne {
	WebDriver driver;
	@BeforeClass
	public void getBaseUrl() {
        WebDriverManager.chromedriver().setup();
        driver = new  ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        
    }
    @Test
    public void sigin(){
    	driver.get("http://automationpractice.com/index.php");
        driver.findElement(By.xpath("//a[@class = 'login']")).click();
        driver.findElement(By.id("email_create")).sendKeys("apj1@gmail.com");
        driver.findElement(By.xpath("//i[@class='icon-user left']")).click(); 
        driver.findElement(By.xpath("//button[@id='submitAccount']")).click(); 
        String errorText = driver.findElement(By.xpath("//div[@class='alert alert-danger']")).getText();
        if(errorText.contains("There are 8 errors")) {
        	System.out.println("Error msg is displayed");
        }
        else {
        	System.out.println("Error msg is not displayed");
        }
        
    }
    @AfterClass
    
    public void TearDown() {
	  driver.quit();
    }
}
