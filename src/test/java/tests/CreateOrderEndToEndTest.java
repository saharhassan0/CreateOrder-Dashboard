package tests;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.AdminLogin;
import pages.CheckoutDetails;
import pages.CreateOrderPage;
import pages.OrderPage;
import pages.OrderSuccesConfirmation;
import pages.OrderSuccesConfirmation;
import pages.PaymentAddressPage;
import pages.SelectProducts;

public class CreateOrderEndToEndTest extends TestBase{
	
	AdminLogin adminLogin;
	OrderPage orderPage;
	CreateOrderPage createOrderPage;
	PaymentAddressPage paymentAddressPage;
	SelectProducts selectProduct;
	CheckoutDetails checkoutDetails;
	OrderSuccesConfirmation orderSucessConfirmation;
	
	@DataProvider(name="loginData")
		public static Object[][] loginData() {
				return new Object[][]
								{
											{"admin","admin"}};
								}	    
	
	@DataProvider(name ="orderCreationData" )
	public static Object[][] OrderCreationData() {
		return new Object[][]
						{
									{"sahar","hassan", "sahar.hassan@expandcart.com", "01005820775"}};
						}

	@DataProvider(name="addressPageData")
	public static Object[][] AddressPageData() {
		return new Object[][]
			        	{
									{"6th of october"}};
                        }
	
	@DataProvider(name="productSelectionData")
	public static Object[][] ProductSelectionData() {
		return new Object[][]
			        	{
									{"iphone"}};
                        }
	
	@DataProvider(name="addCommentData")
	public static Object[][] AddCommentData() {
		return new Object[][]
			        	{
									{"comment"}};
                        }

	@Test(dataProvider="loginData", priority = 1)
		public void Login(String user, String pswd) throws InterruptedException {
			adminLogin = new AdminLogin(driver);
			adminLogin.Login(user, pswd);
			Thread.sleep(8000);
			String actualHomeUrl="https://saharhassan.myexpandcart.dev/admin/common/dashboard";
			String expectedHomeUrl= driver.getCurrentUrl();
			Assert.assertEquals(actualHomeUrl, expectedHomeUrl);
			orderPage = new OrderPage(driver);
			orderPage.goToOrdersPage();
			Thread.sleep(5000);
			orderPage.orderCreationSteps();
			Thread.sleep(5000);
	}			
			
		@Test(dataProvider="orderCreationData", priority = 2)	
		public void goToPaymentAddress(String fName, String lName, String Email,  String phone) throws InterruptedException {
			createOrderPage = new CreateOrderPage(driver);
			createOrderPage.goToPaymentAddress(fName, lName, Email, phone);	
			Thread.sleep(5000);
			
			
			
}
		@Test(dataProvider="addressPageData", priority = 3)
			public void goToShippingAddress(String addressOne) throws InterruptedException {
			paymentAddressPage = new PaymentAddressPage(driver);
			paymentAddressPage.goToShippingAdress(addressOne);
			Thread.sleep(8000);		
//			JavascriptExecutor js = (JavascriptExecutor) driver;
//			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			paymentAddressPage.nextStepBtn();
			Thread.sleep(8000);
//			JavascriptExecutor js2 = (JavascriptExecutor) driver;
//			js2.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			paymentAddressPage.nextStepBtn();
			
		}
		
		@Test(dataProvider="productSelectionData", priority = 4)
			public void searchForProduct(String productName) throws InterruptedException {
			selectProduct = new SelectProducts(driver);
			selectProduct.searchForProduct(productName);
			Thread.sleep(3000);
			JavascriptExecutor js2 = (JavascriptExecutor) driver;
			js2.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			selectProduct.nextStep();
		}
		
		@Test(dataProvider="addCommentData", priority = 5)
		public void addComment(String comm) throws InterruptedException{
			checkoutDetails = new CheckoutDetails(driver);
			checkoutDetails.addComment(comm);
			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			checkoutDetails.completeOrder();
			Thread.sleep(9000);
			
		}
		
		@Test
		public void orderSuccessConfirmationTxt() throws InterruptedException {
		orderSucessConfirmation = new OrderSuccesConfirmation(driver);
		orderSucessConfirmation.orderSuccessConfirmationTxt();
		
}}




