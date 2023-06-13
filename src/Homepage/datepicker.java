package Homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class datepicker {
	WebDriver driver;
	
	By dte=By.xpath("//*[@id=\"ctl00_SPWebPartManager1_g_2e358ead_f206_43f4_952b_16fc6c87d890_ctl00_divCompRegis\"]/div[2]/div/div/div[8]/div[2]/img");
	By mdrpdwn=By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]"); 
	By datebtn=By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[4]/td[2]/a");
	
	By fdrpdwn=By.xpath("//*[@id=\"ctl00_SPWebPartManager1_g_2e358ead_f206_43f4_952b_16fc6c87d890_ctl00_drpTitle\"]");
	By fname=By.id("ctl00_SPWebPartManager1_g_2e358ead_f206_43f4_952b_16fc6c87d890_ctl00_txtFirstName");
	By lname=By.id("ctl00_SPWebPartManager1_g_2e358ead_f206_43f4_952b_16fc6c87d890_ctl00_txtLastName");
	By email=By.id("ctl00_SPWebPartManager1_g_2e358ead_f206_43f4_952b_16fc6c87d890_ctl00_txtEmail");
	By addr=By.xpath("//*[@id=\"ctl00_SPWebPartManager1_g_2e358ead_f206_43f4_952b_16fc6c87d890_ctl00_txtAddress1\"]");
	By files=By.xpath("//*[contains(@title,'Upload File')]");	

	
public datepicker(WebDriver driver) {
	this.driver=driver;
}

public void datefn() {
	driver.findElement(dte).click();
	
	WebElement day=(WebElement) driver.findElement(mdrpdwn);
	Select category=new Select(day);		
	category.selectByValue("2");

	driver.findElement(datebtn).click();

}

public void application(String frstname,String lstname,String mail,String Address) {
	WebElement fcat=(WebElement) driver.findElement(fdrpdwn);
	Select cat=new Select(fcat);		
	cat.selectByVisibleText("Mr.");	
	
	driver.findElement(fname).sendKeys(frstname);
	driver.findElement(lname).sendKeys(lstname);
	driver.findElement(email).sendKeys(mail);
	driver.findElement(addr).sendKeys(Address);
}

public void scrolling() {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,1000)","");
}

public void file(String path) throws InterruptedException {
	driver.findElement(files).sendKeys(path);
	Thread.sleep(2000);
}

public void close() {
	driver.quit();
}
}
