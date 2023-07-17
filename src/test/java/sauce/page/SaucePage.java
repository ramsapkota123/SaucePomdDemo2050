package sauce.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SaucePage {
	private WebDriver driver;
	
	@FindBy(id="user-name")
	WebElement user;
	
	@FindBy(id="password")
	WebElement password;
	

	@FindBy(id="login-button")
	WebElement lognbtn;
	

	@FindBy(id="add-to-cart-sauce-labs-backpack")
	WebElement backpack;
	

	@FindBy(xpath="//*[@id=\\\"shopping_cart_container\\\"]/a/span")
	WebElement cart;
	
	@FindBy(id="checkout")
	WebElement checkout;
	
	@FindBy(id="first-name")
	WebElement name;
	
	@FindBy(id="last-name")
	WebElement lastname;
	
	@FindBy(id="postal-code")
	WebElement postal;
	
	@FindBy(id="continue")
	WebElement contBtn;
	
	@FindBy(id="finish")
	WebElement finishBtn;
	
	public SaucePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	public void setUserbame(String usernameString) {
		user.sendKeys(usernameString);
		
	}
	public void setPassword(String passwordString) {
		password.sendKeys(passwordString);
		
	}
	public void clickButton() {
		lognbtn.click();
		
	}
	public void clickBackpack() {
		backpack.click();
		
	}
	public void clickCart() {
		cart.click();
		
	}
	public void clickCheckOut() {
		checkout.click();
		
	}
	public void FillText(String nameString, String lastnameString, String postalString) {
		name.sendKeys(nameString);
		lastname.sendKeys(lastnameString);
		postal.sendKeys(postalString);
	}
		
   public void displayContinue() {
	   contBtn.click();
	   
   
		
	}
   public void displayFinish() {
	   finishBtn.click();
	   System.out.println("i am in sauce demo");
	   System.out.println("hello");
   }

}
