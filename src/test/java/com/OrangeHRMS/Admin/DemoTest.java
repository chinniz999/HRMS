package com.OrangeHRMS.Admin;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class DemoTest {
	WebDriver driver = null;
  
	@Test
  public void f() {
		driver.get("https://www.gmail.com");
  }
  
  @BeforeClass
  public void beforeClass() {
	  driver = new FirefoxDriver();
  }

  @AfterClass
  public void afterClass() {
	  driver.manage().deleteAllCookies();
	  driver.close();
  }

}
