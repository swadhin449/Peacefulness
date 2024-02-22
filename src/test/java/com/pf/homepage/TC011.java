package com.pf.homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC011 {
	public static WebDriver driver;

	@Test(priority = 1)
	public static void intension2() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://master.d2rw13x98c31hq.amplifyapp.com/");
		WebElement element1 = driver.findElement(By.xpath("/html/body/div/div[8]/div/div[2]/div[1]"));
		if (element1.isDisplayed()) {
			Reporter.log("Intension2 is Displayed : " + "true");
		} else {
			Reporter.log("Intension2 is Displayed : " + "false");
		}
	}
	@Test(priority=2)
	public static void clickintension2() {
	WebElement element2 = driver.findElement(By.xpath("/html/body/div/div[8]/div/div[2]/div[2]"));
	element2.click();
	}
	@Test(priority=3)
	public static void intensiontxt() {
		WebElement element3 = driver.findElement(By.xpath("/html/body/div/div[8]/div/div[2]/div[2]/div/p[1]"));
		String ActualText = (element3.getText());		   
		Reporter.log(ActualText);
		String ExpectedText = "Everything around you is absorbing peace, including the sky, the oceans, the trees, the people, the wildlife, the buildings � and everything is radiating peace.";
		Assert.assertEquals(ActualText, ExpectedText);
	}
	@Test(priority=4)
	public static void intensiontxt1() {
		WebElement element4 = driver.findElement(By.xpath("/html/body/div/div[8]/div/div[2]/div[2]/div/p[2]"));
		String ActualText1 = (element4.getText());
		Reporter.log(ActualText1);
		String ExpectedText1 = "A beautiful intention which can be used to resonate with and benefit Nature, and to calm and balance the atmosphere in public places, and urban areas.";
		Assert.assertEquals(ActualText1, ExpectedText1);
	}

	@Test(priority = 5)
	public static void exitBrowser() {
		driver.quit();
	}
	

}
