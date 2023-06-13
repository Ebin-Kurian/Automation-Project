package Hometest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Homepage.datepicker;

public class datepickertest {
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
	public void test() throws InterruptedException{
		datepicker obj=new datepicker(driver);
		obj.datefn();
		obj.application("Abc","BDC","Test@gmail.com","London@123");
		obj.scrolling();
		obj.file("C:/Users/ADMIN/Desktop/varghese.pdf");
		obj.close();
	}
	
}
