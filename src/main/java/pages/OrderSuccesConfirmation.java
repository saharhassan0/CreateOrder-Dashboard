package pages;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderSuccesConfirmation extends PageBase {
	
	public OrderSuccesConfirmation(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//label[text()= 'Order Created']")
	WebElement orderCreatedMsg;
	
	public void orderSuccessConfirmationTxt() throws InterruptedException {
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", orderCreatedMsg);
//		Thread.sleep(500);
//		String actualString = orderCreatedMsg.getText();
//		assertTrue(actualString.contains("Order Created"));
		Dispaly(driver, orderCreatedMsg);
	} 

}
