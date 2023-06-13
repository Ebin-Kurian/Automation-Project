package Hometest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Homepage.Alertcls;
import Homepage.Home;

public class Alerttest {
	WebDriver driver;	

@BeforeTest
public void setup() {
	driver=new EdgeDriver();
}
@BeforeMethod
public void url() {
	driver.get("https://www.indiapost.gov.in/VAS/Pages/IndiaPosthome.aspx");
	driver.manage().window().maximize();
}
@Test
public void test() throws IOException, InterruptedException {
	Alertcls obj=new Alertcls(driver);
	obj.alrtfn();
	obj.radiobtn();
	obj.copy("682301");
	obj.link();
}

}
