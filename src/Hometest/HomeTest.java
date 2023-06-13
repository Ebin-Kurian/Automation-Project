package Hometest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Homepage.Home;

public class HomeTest {
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
public void test() throws IOException, InterruptedException {
	Home obj=new Home(driver);
	obj.title();
	obj.Scrnshot();
    obj.scrolling();
    obj.link();
}
}
