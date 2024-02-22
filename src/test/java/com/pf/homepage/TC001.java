package com.pf.homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC001 {
		public WebDriver driver;
		@Test(priority=1)
		public void tc001txt1() {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://master.d2rw13x98c31hq.amplifyapp.com/");
			WebElement logo = driver.findElement(By.xpath("//html[1]/body[1]/div[1]/div[2]/div[2]/a[1]/img[1]"));
			if(driver.getTitle().equals("Peacefulness")) {
				Reporter.log("Logo is Displayed");
				Reporter.log(driver.getTitle());
			} else {
				Reporter.log("Logo is not Displayed");
				Reporter.log(driver.getTitle());
			}
			WebElement logo_act = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[2]/a/img"));
			String logo_src = logo_act.getAttribute("src");
			System.out.println(logo_src);
			
			//Assert.assertEquals(logo_src, "img/HFN_Peacefulness_Logo_ai_Peacefulness_Uniting-hearts_Logo_horizontal_black.png");
			driver.quit();
		}
	}
