package Homepage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import Page.Fb;
import Utilities.Excelutil;

public class Login {
WebDriver driver;
By Signinlink=By.id("ctl00_UCLogin1_lblSignIn"); 
By reglink=By.id("ctl00_UCLogin1_lblRegisteredUser");
By user=By.id("USER");
By password=By.id("PASSWORD");
By signin=By.xpath("//*[@id=\"text3\"]/div/div/div[1]/input");

public Login(WebDriver driver) {
	this.driver=driver;
}
public void Signin() {
	driver.findElement(Signinlink).click();
	driver.findElement(reglink).click();
}


//public void form(String id,String pass) {
//	driver.findElement(user).sendKeys(id);
//	driver.findElement(password).sendKeys(pass);
//	driver.findElement(signin).click();
//}

public void regform() throws IOException 
{
	File f=new File("D:\\datasel\\Book1.xlsx");
	FileInputStream fi=new FileInputStream(f);
	XSSFWorkbook wb=new XSSFWorkbook(fi);
	XSSFSheet sh= wb.getSheet("Sheet1");

	String username=sh.getRow(1).getCell(0).getStringCellValue();
	System.out.println("Username "+username);
	String pswd=sh.getRow(1).getCell(1).getStringCellValue();
	System.out.println("Password "+pswd);	
	driver.findElement(user).sendKeys(username);
	driver.findElement(password).sendKeys(pswd);
	driver.findElement(signin).click();
				
}

public void link() {
	driver.quit();
}



}
