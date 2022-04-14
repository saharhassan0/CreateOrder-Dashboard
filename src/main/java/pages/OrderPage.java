package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class OrderPage extends PageBase {
	
	
	public OrderPage(WebDriver driver) 
	{
		super(driver);
	}
	
	@FindBy(xpath="*//div[3]/div/div[1]/div/div/div/ul/li[2]")
	WebElement firstOrderBtn;
	
	@FindBy(xpath="*//li[2]/ul/li[1]/a ")
	WebElement secondOrderBtn;
	
	@FindBy(xpath="//a[contains(text(), 'Create Order')]")
	WebElement createOrderBtn;	
	
	public void goToOrdersPage() {
		ClickButton(firstOrderBtn);
		ClickButton(secondOrderBtn);
//		String actualOrdersUrl="https://saharhassan.myexpandcart.dev/admin/sale/order";
//		String expectedOrdersUrl= driver.getCurrentUrl();
//		Assert.assertEquals(actualOrdersUrl, expectedOrdersUrl);
	}
	public void orderCreationSteps() {
		ClickButton(createOrderBtn);
	}

}
