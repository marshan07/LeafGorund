package common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public WebDriver driver;

	public void setUpBrowser(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		}
	}

	public void tearDownBrowser() {
		driver.close();
	}

	public void goToApplication(String url) {
		driver.get(url);
	}

	public void clickOn(WebElement element) {
		try {
			element.click();
		} catch (Exception e) {
			System.out.println("Failed to click on the element " + e.getClass());
		}
	}

	public void waitForPageToLoad() {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			for (int i = 0; i < 20000; i++) {
				String status = js.executeScript("return document.readyState").toString();
				if (status.equals("complete")) {
					Thread.sleep(3000);
				}
			}
		} catch (Exception e) {
			System.out.println("Failed to wait for the page to load " + e.getClass());
		}
	}

	public void waitForAllNetworkTofinish() {
		try {

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
