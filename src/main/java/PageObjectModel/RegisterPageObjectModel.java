package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPageObjectModel {

	public WebDriver driver;
	private By MyAccount = By.xpath("//a[@title='My Account']");

	private By Register = By.xpath("//a[contains(text(),'Register')]");

	private By FirstName = By.xpath("//input[@id='input-firstname']");

	private By LastName = By.xpath("//input[@id='input-lastname']");

	private By Email = By.xpath("//input[@id='input-email']");

	private By Telephone = By.xpath("//input[@id='input-telephone']");

	private By Passward = By.xpath("//input[@id='input-password']");

	private By PasswardConfirm = By.xpath("//input[@id='input-confirm']");

	private By NewsLetterSubscribe = By.xpath("(//input[@name='newsletter'])[2]");

	private By clickPrivacyPolicy = By.xpath("//input[@name='agree']");
	
	private By clickContinue = By.xpath("//input[@class='btn btn-primary']");
	
	private By ValidateText =By.xpath("//p[contains(text(),'Congratulations! Your new account has been successfully created!')]");
	
	private By Continue=By.xpath("//a[@class='btn btn-primary']");
	

	public RegisterPageObjectModel(WebDriver driver2) {
		this.driver = driver2;
	}

	public WebElement clickMyAccount() {
		return driver.findElement(MyAccount);

	}

	public WebElement clickRegister() {
		return driver.findElement(Register);

	}

	public WebElement enterFirstName() {
		return driver.findElement(FirstName);

	}

	public WebElement enterLastName() {
		return driver.findElement(LastName);

	}

	public WebElement enterEmail() {
		return driver.findElement(Email);

	}

	public WebElement enterTelephone() {
		return driver.findElement(Telephone);

	}

	public WebElement enterPassward() {
		return driver.findElement(Passward);

	}

	public WebElement enterPasswardConfirm() {
		return driver.findElement(PasswardConfirm);

	}

	public WebElement clickNewsLetterSubscribe() {
		return driver.findElement(NewsLetterSubscribe);

	}

	public WebElement clickPrivacyPolicy() {
		return driver.findElement(clickPrivacyPolicy);
	}
	
	
	public WebElement clickContinue() {
		return driver.findElement(clickContinue);
	}
	
	public WebElement validateSucessText() {
		return driver.findElement(ValidateText);
	}
	
	public WebElement Continue() {
		return driver.findElement(Continue);
	}
	
	
}
