package com.pf.homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC002 {
	public WebDriver driver;
	@Test(priority=1)
	public void txt1() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://master.d2rw13x98c31hq.amplifyapp.com/");
		WebElement element1 = driver.findElement(By.xpath("/html/body/div/div[3]/div/p[2]"));
		String ActualText1 = element1.getText();
		Reporter.log(ActualText1);
		String ExpectedText1   = "With the power of intention, together we can transform the world";
		Assert.assertEquals(ActualText1, ExpectedText1);
	}
	@Test(priority=2)
	public void txt2() {
		WebElement element2 = driver.findElement(By.xpath("/html/body/div/div[3]/div/p[3]"));
		String ActualText2 = element2.getText();
		Reporter.log(ActualText2);
		String ExpectedText2   = "We can do it!";
		Assert.assertEquals(ActualText2, ExpectedText2);
	}
	@Test(priority=3)
	public void txt3() {
		WebElement element3 = driver.findElement(By.xpath("/html/body/div/div[4]/div/p[1]"));
		String ActualText3 = element3.getText();
		Reporter.log(ActualText3);
		String ExpectedText3  = "Peacefulness is a state of being with the world, with ourselves, with each other, with the planet";
		Assert.assertEquals(ActualText3, ExpectedText3);
	}
	@Test(priority=4)
	public void txt4() {
		WebElement element4 = driver.findElement(By.xpath("/html/body/div/div[4]/div/p[2]"));
		String ActualText4 = element4.getText();
		Reporter.log(ActualText4);
		String ExpectedText4  = "To live in peace is a daily challenge. Whether at home, at work, in your community, and your country, peace is the need of the hour. You can help to make the change. Peacefulness provides the tools for individual and collective transformation in a very simple way. Peace can be experienced while doing the things you love, whether at school, at work, in your environment, through art, sport, etc. Your intentions are powerful. They set the tone of your life. A great way to live a peaceful life is to practice peaceful intentions. Here are 3 intentions to support your peacefulness journey.";
		Assert.assertEquals(ActualText4, ExpectedText4);
	}
	@Test(priority=5)
	public void txt5() {
		WebElement element5 = driver.findElement(By.xpath("/html/body/div/div[6]/div/div[2]/p[1]"));
		String ActualText5 = element5.getText();
		Reporter.log(ActualText5);
		String ExpectedText5  = "21 days of Peace";
		Assert.assertEquals(ActualText5, ExpectedText5);
	}
	@Test(priority=6)
	public void txt6() {
		WebElement element6 = driver.findElement(By.xpath("/html/body/div/div[6]/div/div[2]/p[2]"));
		String ActualText6 = element6.getText();
		Reporter.log(ActualText6);
		String ExpectedText6  = "Try Peacefulness. Join our 21 days for a more peaceful world!";
		Assert.assertEquals(ActualText6, ExpectedText6);
	}
	@Test(priority=7)
	public void txt7() {
		WebElement element7 = driver.findElement(By.xpath("/html/body/div/div[7]/div/p[1]"));
		String ActualText7 = element7.getText();
		Reporter.log(ActualText7);
		String ExpectedText7 = "Our intentions for peace";
		Assert.assertEquals(ActualText7, ExpectedText7);
	}
	@Test(priority=8)
	public void txt8() {
		WebElement element8 = driver.findElement(By.xpath("/html/body/div/div[7]/div/p[2]"));
		String ActualText8 = element8.getText();
		Reporter.log(ActualText8);
		String ExpectedText8 = "We use the power of thoughts to bring about individual and collective change. When starting to make a peaceful intention, first take a moment to center yourself in the present moment, in the simplicity that is the quintessence of Nature. Let your heart be in it!";
		Assert.assertEquals(ActualText8, ExpectedText8);
	}
	@Test(priority=9)
	public void txt9() {
		WebElement element9 = driver.findElement(By.xpath("/html/body/div/div[9]/div[1]/p[1]"));
		String ActualText9 = element9.getText();
		Reporter.log(ActualText9);
		String ExpectedText9 = "How these intentions can work";
		Assert.assertEquals(ActualText9, ExpectedText9);
	}
	@Test(priority=10)
	public void txt10() {
		WebElement element10 = driver.findElement(By.xpath("/html/body/div/div[9]/div[1]/p[2]"));
		String ActualText10 = element10.getText();
		Reporter.log(ActualText10);
		String ExpectedText10 = "By using peaceful intentions every day, and by starting our activities with them, we naturally contribute to peace for ourselves, our families, with friends, and in our communities.";
		Assert.assertEquals(ActualText10, ExpectedText10);
	}
	@Test(priority=11)
	public void txt11() {
		WebElement element11 = driver.findElement(By.xpath("/html/body/div/div[10]/div/div/div/div/p[1]"));
		String ActualText11 = element11.getText();
		Reporter.log(ActualText11);
		String ExpectedText11 = "Find out your score in our Peace Index";
		Assert.assertEquals(ActualText11, ExpectedText11);
	}
	@Test(priority=12)
	public void txt12() {
		WebElement element12 = driver.findElement(By.xpath("/html/body/div/div[11]/div/p"));
		String ActualText12 = element12.getText();
		Reporter.log(ActualText12);
		String ExpectedText12 = "Subscribe to our weekly newsletter";
		Assert.assertEquals(ActualText12, ExpectedText12);
	}
	/*@Test(priority=13)
	public void txt13() {
		WebElement element13 = driver.findElement(By.xpath(""));
		String ActualText13 = element13.getText();
		Reporter.log(ActualText13);
		String ExpectedText13 = "";
		Assert.assertEquals(ActualText13, ExpectedText13);
	}*/
	@Test(priority=13)
	public void exitBrowser() {
		driver.quit();	
	}
	
	
	
	
	
}
