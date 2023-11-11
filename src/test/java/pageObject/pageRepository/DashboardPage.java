package pageObject.pageRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import common.BaseClass;

public class DashboardPage extends BaseClass{
		
	public DashboardPage(WebDriver driver) {
		this.driver = driver;
	}
	
    /////////////////////////////////////////Labels///////////////////////////////////////////
	
	public final String labelHome = "Home";
	public final String labelAuth = "Auth";
	
	///////////////////////////////////////Locators////////////////////////////////////////////
	
	public WebElement getMenuItem(String menuItem) {
		return driver.findElement(By.xpath("//form[@id='menuform']/ul/li/a[normalize-space()='"+menuItem+"']"));
	}
	
	public WebElement getSubMenuItem(String subMenuItem) {
		return driver.findElement(By.xpath("//span[normalize-space()='"+subMenuItem+"']"));
	}
	
	
	
	
	
	

}
