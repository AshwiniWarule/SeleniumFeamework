package PageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

import Resources.BaseClass;

public class CommonAss extends BaseClass{
	public static void commonselect(WebElement DropdownElement, String Textoption) {
		
		Select dropdown = new Select(DropdownElement);
		dropdown.selectByVisibleText(Textoption);
	}

	public static void assersion(String at, String et,String msg) {

		SoftAssert assertions = new SoftAssert();
		assertions.assertEquals(at, et);
		assertions.assertAll();
		
		
		
		
		
		
}
}