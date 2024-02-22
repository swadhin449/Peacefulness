package com.pf.homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC012 {
	public static WebDriver driver;

	@Test(priority = 1)
	public static void intension2() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://master.d2rw13x98c31hq.amplifyapp.com/");
		WebElement element1 = driver.findElement(By.xpath("/html/body/div/div[8]/div/div[3]/div[2]"));
		if (element1.isDisplayed()) {
			Reporter.log("Intension3 is Displayed : " + "true");
		} else {
			Reporter.log("Intension3 is Displayed : " + "false");
		}
	}
	@Test(priority=2)
	public static void clickintension2() {
	WebElement element2 = driver.findElement(By.xpath("/html/body/div/div[8]/div/div[3]/div[2]"));
	element2.click();
	}
	@Test(priority=3)
	public static void intensiontxt() {
		WebElement element3 = driver.findElement(By.xpath("/html/body/div/div[8]/div/div[3]/div[2]/div/p[1]"));
		String ActualText = (element3.getText());		   
		Reporter.log(ActualText);
		String ExpectedText = "Everyone is becoming peaceful, nurturing correct thinking, right understanding, and integrity of purpose.";
		Assert.assertEquals(ActualText, ExpectedText);
	}
	@Test(priority=4)
	public static void intensiontxt1() {
		WebElement element4 = driver.findElement(By.xpath("/html/body/div/div[8]/div/div[3]/div[2]/div/p[2]"));
		String ActualText1 = (element4.getText());
		Reporter.log(ActualText1);
		String ExpectedText1 = "An effective and subtle intention to improve our workplaces and meetings, which helps us to understand each other better and supports us when we face challenges";
		Assert.assertEquals(ActualText1, ExpectedText1);
	}

	@Test(priority = 5)
	public static void exitBrowser() {
		driver.quit();
	}
}
	





