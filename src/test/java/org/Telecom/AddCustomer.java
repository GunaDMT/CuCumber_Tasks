package org.Telecom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class AddCustomer {
	public static WebDriver driver;
	@Given("Launch the URL and get into the Add Customer Page")
	public void launch_the_URL_and_get_into_the_Add_Customer_Page() {
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\JB JK\\eclipse-workspace\\CuCumber_Task\\driver\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://demo.guru99.com/telecom/addcustomer.php");
	}

	@When("Fill the Credentials {string},{string},{string},{string},{string}")
	public void fill_the_Credentials(String fname, String lname, String email, String address, String phno) {
		driver.findElement(By.id("fname")).sendKeys(fname);
		driver.findElement(By.id("lname")).sendKeys(lname);
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.name("addr")).sendKeys(address);
		driver.findElement(By.id("telephoneno")).sendKeys(phno);
			
	   
	}

	@When("Click the Submit")
	public void click_the_Submit() {
		driver.findElement(By.name("submit")).click();
	}

	@Then("Genrate the Customer ID")
	public void genrate_the_Customer_ID() {
		System.out.println("CUSTOMER ID : "+driver.findElement(By.xpath("//h3")).getText());
		
	}

	
	@Then("Return Success Message {string}")
	public void return_Success_Message(String success) {
	    Assert.assertEquals(success, driver.findElement(By.xpath("//h1")).getText());
	    System.out.println(driver.findElement(By.xpath("//h1")).getText());
	    driver.quit();
	}


}
