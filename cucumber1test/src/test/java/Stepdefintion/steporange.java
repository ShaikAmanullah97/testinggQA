package Stepdefintion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class steporange {
	WebDriver driver;

@Given("I launch the chrome browser")
public void i_launch_the_chrome_browser() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SK Aman\\Downloads\\chromedriver.exe");
   WebDriver driver =new ChromeDriver();
   driver.manage().window().maximize();
}

@When("I open the orange hrm homepage")
public void i_open_the_orange_hrm_homepage() {
	driver.get("https://opensource-demo.orangehrmlive.com/");     
}

@Then("I verify that the logo present on the page")
public void i_verify_that_the_logo_present_on_the_page() {
	driver.findElement(By.xpath("\"//*[@id=\\\"divLogo\\\"]/img")).isDisplayed();  
	
}

@And("close the browser")
public void close_the_browser() {
	driver.quit();
  
}


}
