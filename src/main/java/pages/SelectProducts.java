package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SelectProducts extends PageBase {
	
	public SelectProducts(WebDriver driver) 
	{
		super(driver);
	}
	
	@FindBy(xpath="//*[@id=\"orderForm-p-3\"]/div/div[1]/div[1]/span[1]/span[1]/span")
	WebElement productsSearch;
	
	@FindBy(xpath="*//span[1]/input")
	WebElement searchBox;
	
	//sendKeys(Keys.ENTER);
	
	@FindBy(xpath="//*[@id=\"option-value-185\"]")
	WebElement selectColor;
	
	@FindBy(xpath="//*[@id=\"products-add-product\"]")
	WebElement addProduct;
	
	@FindBy(xpath="//a[contains(text(), 'Next Step')]")
	WebElement nextStep;
	
	
	public void searchForProduct(String productName) throws InterruptedException {
		ClickButton(productsSearch);
		SendText(searchBox, productName);
		Thread.sleep(5000);
		searchBox.sendKeys(Keys.ENTER);
	}
	public void nextStep() throws InterruptedException {
		ClickButton(selectColor);
		ClickButton(addProduct);
		ClickButton(nextStep);
		
	}

}
