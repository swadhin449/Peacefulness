package com.pf.homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC004 {
	public WebDriver driver;
	@Test(priority=1)
	public void WhoWeAre() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://master.d2rw13x98c31hq.amplifyapp.com/");
		WebElement element = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/a[1]/p"));
		element.click();
		System.out.println("Element is Clicked");
		Reporter.log("Element is Clicked");
		WebElement element1 = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[2]"));
		
		if(element1.isDisplayed()) {
			Reporter.log("I am in Who We Are Page");
		}else {
			Reporter.log("Who we are page not found");
		}
		driver.quit();

		
	}
}
