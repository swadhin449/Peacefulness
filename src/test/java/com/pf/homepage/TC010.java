package com.pf.homepage;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC010 {
	public static WebDriver driver;

	@Test(priority = 1)
	public static void intension1() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://master.d2rw13x98c31hq.amplifyapp.com/");
		WebElement element1 = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[8]/div[1]/div[1]/div[1]"));
		if (element1.isDisplayed()) {
			Reporter.log("Intension1 is Displayed : " + "true");
		} else {
			Reporter.log("Intension1 is Displayed : " + "false");
		}
	}
	@Test(priority=2)
	public static void clickintension1() throws InterruptedException {
	WebElement element2 = driver.findElement(By.xpath("/html/body/div/div[8]/div/div[1]/div[2]/div/p[1]"));
	element2.click();
	waitStatement();
	}
	@Test(priority=4)
	public static void intensiontxt() {
		WebElement element3 = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[8]/div[1]/div[1]/div[2]/div[1]/p[1]"));
		String ActualText = (element3.getText());		   
		Reporter.log(ActualText);
		String ExpectedText = "Among all people in the world Let there be compassion Let there be kindness Let there be love Let there be peace";
		Assert.assertEquals(ActualText, ExpectedText);
	}
	@Test(priority=5)
	public static void intensiontxt1() {
		WebElement element4 = driver.findElement(By.xpath("/html/body/div/div[8]/div/div[1]/div[2]/div/p[2]"));
		String ActualText1 = (element4.getText());
		Reporter.log(ActualText1);
		String ExpectedText1 = "This intention will improve the atmosphere wherever you are, especially in your family, among friends, and in your local communities.";
		Assert.assertEquals(ActualText1, ExpectedText1);
	}

	public static void waitStatement() throws InterruptedException {
		Thread.sleep(2000);
	}
	
	@Test(priority = 8)
	public static void exitBrowser() {
		driver.quit();
	}
	
	

}
