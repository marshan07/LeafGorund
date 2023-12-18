package scenarios;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import common.BaseClass;
import pageObject.pageRepository.DashboardPage;

public class DashboardTest extends BaseClass{	

	DashboardPage dashboardPage;;;;;

	@BeforeClass
	public void setUp() {
		setUpBrowser("chrome");
		goToApplication("https://leafground.com/");
	}

	@Test
	public void verifyDashboard() throws Exception {
		dashboardPage = new DashboardPage(driver);
		
		clickOn(dashboardPage.getMenuItem(dashboardPage.labelHome));
		clickOn(dashboardPage.getSubMenuItem(dashboardPage.labelAuth));
	}
	
	
	@AfterClass
	public void tearDown() {
		tearDownBrowser();
	}
	
	

}
