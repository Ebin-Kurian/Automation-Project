package Hometest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Homepage.Login;


public class LoginTest {
	WebDriver driver;

	@BeforeTest
	public void setup() {
		driver=new EdgeDriver();
	}
	@BeforeMethod
	public void url() {
		driver.get("https://www.indiapost.gov.in/VAS/Pages/ComplaintRegistration.aspx");
		driver.manage().window().maximize();
	}
	@Test
	public void test() throws IOException{
		Login obj=new Login(driver);
		obj.Signin();
//		obj.form("Ebin123","ebin@123");
		obj.regform();
		obj.link();
	}
	
	
}
