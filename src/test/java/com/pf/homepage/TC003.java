package com.pf.homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC003 {
	public WebDriver driver;

	@Test(priority = 1)
	public void img1() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://master.d2rw13x98c31hq.amplifyapp.com/");
		WebElement element1 = driver.findElement(By.xpath("/html/body/div/div[3]"));
		if (element1.isDisplayed()) {
			Reporter.log("Img1 is Displayed : " + "true");
		} else {
			Reporter.log("Img1 is Displayed : " + "false");
		}
	}

	@Test(priority = 2)
	public void img2() {
		WebElement element2 = driver.findElement(By.xpath("/html/body/div/div[5]/div/div[1]/div[1]"));
		if (element2.isDisplayed()) {
			Reporter.log("Img2 is Displayed : " + "true");
		} else {
			Reporter.log("Img2 is Displayed : " + "false");
		}
	}

	@Test(priority = 3)
	public void img3() {
		WebElement element3 = driver.findElement(By.xpath("/html/body/div/div[5]/div/div[2]/div[1]/div[1]"));
		if (element3.isDisplayed()) {
			Reporter.log("Img3 is Displayed : " + "true");
		} else {
			Reporter.log("Img3 is Displayed : " + "false");
		}

	}

	@Test(priority = 4)
	public void img4() {
		WebElement element4 = driver.findElement(By.xpath("/html/body/div/div[5]/div/div[2]/div[2]/div[1]"));
		if (element4.isDisplayed()) {
			Reporter.log("Img4 is Displayed : " + "true");
		} else {
			Reporter.log("Img4 is Displayed : " + "false");
		}
	}

	@Test(priority = 5)
	public void img5() {
		WebElement element5 = driver.findElement(By.xpath("/html/body/div/div[6]/div/div[2]"));
		if (element5.isDisplayed()) {
			Reporter.log("Img5 is Displayed : " + "true");
		} else {
			Reporter.log("Img5 is Displayed : " + "false");
		}
	}

	@Test(priority = 6)
	public void exitBrowser() {
		driver.quit();
	}

}
