//package tests;
//
//import org.testng.Assert;
//import org.testng.annotations.DataProvider;
//import org.testng.annotations.Test;
//
//import pages.AdminLogin;
//import pages.OrderPage;
//
//public class AdminLoginTest extends TestBase{
//	
//	AdminLogin adminLogin;
//	OrderPage orderPage;
//	
//	
//	@DataProvider(name="loginData")
//		public static Object[][] loginData() {
//		    return new Object[][]
//		            {
//		                    {"admin","admin"}};
//		            }	    	
//	
//	@Test(dataProvider="loginData")
//	public void Login(String user, String pswd) throws InterruptedException {
//		adminLogin = new AdminLogin(driver);
//		adminLogin.Login(user, pswd);
//		Thread.sleep(8000);
//		orderPage = new OrderPage(driver);
//		orderPage.goToOrdersPage();
//
//		
//	}
//
//}
