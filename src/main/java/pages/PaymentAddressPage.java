package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentAddressPage extends PageBase {
	
	public PaymentAddressPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//*[@id=\"payment_address_1\"]")
	WebElement adress1;
	
	@FindBy(xpath="//a[contains(text(), 'Next Step')]")
	WebElement nextStep;
	
	public void goToShippingAdress(String addressOne) {
		SendText(adress1, addressOne);
		
	}
	
	public void nextStepBtn() {
		ClickButton(nextStep);
	}
	
	

}
