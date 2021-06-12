package org.test;

import java.awt.PopupMenu;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

import org.baseclass.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import javafx.stage.Popup;

public class Example extends Base {

	public static void main(String[] args) {
		
		WebDriverManager.iedriver().setup();
		driver = new InternetExplorerDriver();
		maximizeWindow();
		implicitWait(10);
		launchUrl("https://www.facebook.com");
			

	}

}
