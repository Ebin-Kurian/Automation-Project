package Homepage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Alertcls {
WebDriver driver;
By link=By.xpath("//*[@id=\"s4-bodyContainer\"]/div/div[6]/footer/div/div/div[1]/div[3]/ul/li[2]/a");
By radio=By.id("ctl00_SPWebPartManager1_g_aa197fec_b38c_41a8_b14e_a11722636b37_ctl00_rbTrackComplaint");
By calc=By.xpath("//*[@id=\"WebPartWPQ2\"]/div[1]/div[2]/div[1]/figure/a");
By textbox1=By.id("ctl00_SPWebPartManager1_g_66dfb396_adb3_4d9b_990a_cf15b7b9428e_ctl00_txtFromPincode");
By textbox2=By.id("ctl00_SPWebPartManager1_g_66dfb396_adb3_4d9b_990a_cf15b7b9428e_ctl00_txtToPincode");


public Alertcls(WebDriver driver) {
	this.driver=driver;
}


public void alrtfn() throws InterruptedException {
	driver.findElement(link).click();
	Alert alert=driver.switchTo().alert();
	Thread.sleep(2000);
	String msg=alert.getText();
	System.out.println(msg);
	alert.dismiss();
}

public void radiobtn() {
boolean state=driver.findElement(radio).isSelected();
if(state==true) {
	System.out.println("Complaint button selected");
}
else{
	driver.findElement(radio).click();
}
}
public void copy(String pin) throws InterruptedException {
	driver.findElement(calc).click();
	WebElement pincode1=driver.findElement(textbox1);
	pincode1.sendKeys(pin);
	
	WebElement pincode2=driver.findElement(textbox2);

	
	Actions act=new Actions(driver);
	act.keyDown(pincode1,Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);
	act.keyDown(pincode1,Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL);
	act.keyDown(pincode2,Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL);
	act.perform();
	Thread.sleep(2000);
}

public void link() {
	driver.quit();
}
}
