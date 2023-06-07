package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddToCart {
	public WebDriver driver;

	private By search = By.xpath("//input[@name='search']");

	private By clicksearchbutton = By.xpath("(//button[@type='button'])[4]");

	private By iphonetext = By.xpath("//a[contains(text(),'iPhone')]");

	private By addcartiphone = By.xpath("(//button[@type='button'])[9]");

	private By samsungtext = By.xpath("//a[contains(text(),'Samsung Galaxy Tab 10.1')]");

	private By addcartsamsung = By.xpath("(//span[@class='hidden-xs hidden-sm hidden-md'])[8]");

	private By totalofcart = By.xpath("//div[@id='cart']");

	private By totalsum = By.xpath("(//td[@class=\"text-right\"])[10]");

	private By iphoneprice = By.xpath("//p[contains(text(),'$123.20')]");

	private By samsungprice = By.xpath("//p[contains(text(),'$241.99')]");

	public AddToCart(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement search() {
		return driver.findElement(search);

	}

	public WebElement clicksearchbutton() {
		return driver.findElement(clicksearchbutton);

	}

	public WebElement iphonetext() {
		return driver.findElement(iphonetext);

	}

	public WebElement addcartiphone() {
		return driver.findElement(addcartiphone);

	}

	public WebElement samsungtext() {
		return driver.findElement(samsungtext);

	}

	public WebElement addcartsamsung() {
		return driver.findElement(addcartsamsung);

	}

	public WebElement totalofcart() {
		return driver.findElement(totalofcart);
	}

	public WebElement totalsum() {
		return driver.findElement(totalsum);

	}

	public WebElement iphoneprice() {
		return driver.findElement(iphoneprice);

	}

	public WebElement samsungprice() {
		return driver.findElement(samsungprice);

	}
}
