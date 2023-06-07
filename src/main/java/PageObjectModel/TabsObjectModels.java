package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TabsObjectModels {
	
      public WebDriver driver;
       
	
	private By DesktopTab=By.xpath("(//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=product/category&path=20'])[1]");
	
	private By DesktopText=By.xpath("//a[contains(text(),'PC (0)')]  ");
	
	private By LaptopandNotebookTab=By.xpath("(//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=product/category&path=18'])[1]");
	
	private By LaptopandNotebookText=By.xpath("//a[contains(text(),'Macs (0)')]");
	
	private By componentTab=By.xpath("(//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=product/category&path=25'])[1]");
	
	private By componentText=By.xpath("//a[contains(text(),'Mice and Trackballs (0)')]");
	
	private By TabletsTab=By.xpath("(//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=product/category&path=57'])[1]");
	
	private By TabletsText=By.xpath("(//a[contains(text(),'Tablets')])[2]");
	
	private By SoftwareTab=By.xpath("(//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=product/category&path=17'])[1]");
	
	private By SoftwareText=By.xpath("(//a[contains(text(),'Software')])[2]");
	
	private By PhonesAndPDAsTab=By.xpath("(//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=product/category&path=24'])[1]");
	
	private By PhonesAnsPDAsText=By.xpath("//a[contains(text(),'Phones & PDAs (3)')]");
	
	private By CamerasTab=By.xpath("(//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=product/category&path=33'])[1]");
	
	private By CamerasText=By.xpath("(//a[contains(text(),'Cameras')])[2]");
	
	private By MP3PlayersTab =By.xpath("(//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=product/category&path=34'])[1]");
	
	private By MP3PlayersText =By.xpath("(//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=product/category&path=34'])[2]");
	
	private By MP3PlayersText2=By.xpath("(//a[contains(text(),'MP3 Players')])[2]");
	
	private By LaptopsNotebooksTab=By.xpath("//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=product/category&path=18'])[2]");
	
	private By LaptopsNotebooksText=By.xpath("//a[contains(text(),'Laptops & Notebooks')])[3]");
	
	public TabsObjectModels(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement DeskTopTab() {
		return driver.findElement(DesktopTab);

	}
	
	public WebElement DesktopText() {
		return driver.findElement(DesktopText);

	}
	
	public WebElement LaptopandNotebookTab() {
		return driver.findElement(LaptopandNotebookTab);

	}
	
	public WebElement LaptopandNotebookText() {
		return driver.findElement(LaptopandNotebookText);

	}
	
	public WebElement componentTab() {
		return driver.findElement(componentTab);

	}
	
	public WebElement componentText() {
		return driver.findElement(componentText);

	}
	
	public WebElement TabletsTab() {
		return driver.findElement(TabletsTab);

	}
	
	public WebElement TabletsText() {
		return driver.findElement(TabletsText);

	}
	
	public WebElement SoftwareTab() {
		return driver.findElement(SoftwareTab);

	}
	
	public WebElement SoftwareText() {
		return driver.findElement(SoftwareText);

	}
	
	public WebElement PhonesAndPDAsTab() {
		return driver.findElement(PhonesAndPDAsTab);

	}
	
	public WebElement PhonesAndPDAsText() {
		return driver.findElement(PhonesAnsPDAsText);

	}
	
	public WebElement CamerasTab() {
		return driver.findElement(CamerasTab);

	}
	
	public WebElement CamerasText() {
		return driver.findElement(CamerasText);

	}
	
	public WebElement MP3PlayersTab() {
		return driver.findElement(MP3PlayersTab);

	}
	
	public WebElement MP3PlayersText() {
		return driver.findElement(MP3PlayersText);

	}
	
	public WebElement MP3PlayersText2() {
		return driver.findElement(MP3PlayersText2);

	}
	
	public WebElement LaptopsNotebooksTab() {
		return driver.findElement(LaptopsNotebooksTab);

	}
	
	public WebElement LaptopsNotebooksText() {
		return driver.findElement(LaptopsNotebooksText);

	}
	
}
