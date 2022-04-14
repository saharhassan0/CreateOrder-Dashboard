//package tests;
//
//import org.openqa.selenium.WebDriver;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//import pages.AdminLogin;
//
//public class OrderPageTest extends TestBase {
//	
//	AdminLogin adminLogin;
//	OrderPageTest orderPageTest;
//	
//	
//
//
//
//
//	@Test
//	public void goToOrdersPage() throws InterruptedException {
//		adminLogin = new AdminLogin(driver);
//		adminLogin.Login(user,String pswd);
//		Thread.sleep(8000);
//		orderPageTest = new OrderPageTest();
//		orderPageTest.goToOrdersPage();
//		String actualUrl="https://saharhassan.myexpandcart.dev/admin/sale/order";
//		String expectedUrl= driver.getCurrentUrl();
//		Assert.assertEquals(actualUrl, expectedUrl);
//	}
//
//}
