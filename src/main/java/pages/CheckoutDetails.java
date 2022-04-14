package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutDetails extends PageBase {
	
	public CheckoutDetails(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//*/textarea[@id=\"comment\"]")
	WebElement comment;
	
	@FindBy(xpath="//a[contains(text(), 'Save')]")
	WebElement save;
	
	
	public void addComment(String comm) {
		SendText(comment, comm);
	}
	
	public void completeOrder() {
		ClickButton(save);
	}

}
