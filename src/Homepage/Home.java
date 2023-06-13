package Homepage;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.asserts.Assertion;

import dev.failsafe.internal.util.Assert;

public class Home {
WebDriver driver;
By Startlink=By.xpath("//*[@id=\"s4-bodyContainer\"]/div/div[6]/footer/div/div/div[1]/div[1]/ul/li[3]");
//By logoimg=By.id("india-post-logo-xs");
By logoimg=By.xpath("//*[@id=\"india-post-logo\"]");

public Home(WebDriver driver) {
	this.driver=driver;
}

public void title() {
	boolean logo=driver.findElement(logoimg).isDisplayed();
	
	if(logo==true) {
		System.out.println("Logo Displayed");
	}
	else {
		System.out.println("Logo isn't Displayed");
	}
	
	String title=driver.getTitle();
	String exptitle="Complaint registration";
	assertEquals(title, exptitle);
	System.out.println(title);
}

public void Scrnshot() throws IOException {
	File sr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(sr, new File("D://SelScrnshrt//Homepageimg.png"));
	System.out.println("Screenshot Added");
}

public void scrolling() throws InterruptedException {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,1000)","");
	driver.findElement(Startlink).click();
	Thread.sleep(2000);
}
public void link() {
	driver.quit();
}
}
