package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateOrderPage extends PageBase {
	
	public CreateOrderPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//*[@id=\"firstname\"]")
	WebElement firstName;
	
	@FindBy(xpath="//*[@id=\"lastname\"]")
	WebElement lastName;
	
	@FindBy(xpath="//*[@id=\"email\"]")
	WebElement email;
	
	@FindBy(xpath="//*[@id=\"telephone\"]")
	WebElement telephone;
	
	@FindBy(xpath="//a[contains(text(), 'Next Step')]")
	WebElement nextStep;
	
	public void goToPaymentAddress(String fName, String lName, String Email,  String phone) {
		SendText(firstName, fName);
		SendText(lastName, lName);
		SendText(email, Email);
		SendText(telephone, phone);
		ClickButton(nextStep);
		
	}
	
}
