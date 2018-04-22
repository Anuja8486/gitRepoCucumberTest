package com.basic.diffrentFolder;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class MyFirstStepDef {

	WebDriver driver;

	@Given("^User need to be on Facebook login page$")
	
	public void User_need_to_be_on_Facebook_login_page(){
		
	System.setProperty("webdriver.chrome.driver", "E:\\Anuja\\radical\\selinium\\chrome\\chromedriver.exe");
		
	driver=new ChromeDriver();
		
		//System.setProperty("webdriver.gecko.driver", "D:\\Training\\TrainingContent\\SeleniumJars_Software\\geckodriver_64\\geckodriver.exe");
		//driver = new FirefoxDriver();
		
		driver.get("http://www.facebook.com");
	
	}
	
	

@When("^User enters user \"([^\"]*)\" first name and \"([^\"]*)\" as last name$")
	
public void User_enters_user_first_name(String uName,String lName){
		
		driver.findElement(By.name("firstname")).sendKeys(uName);
		driver.findElement(By.name("lastname")).sendKeys(lName);
	
	}
	
@Then("^User checks user \"([^\"]*)\" first name and \"([^\"]*)\" as last name  is present$")
	public void User_checks_user_first_name_is_present(String uName, String lName){
		String userNameActual=driver.findElement(By.name("firstname")).getAttribute("value");
		Assert.assertEquals(uName, userNameActual);
		
		String lastNameActual=driver.findElement(By.name("lastname")).getAttribute("value");
		Assert.assertEquals(lName, lastNameActual);
		
	}
}
