package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.RegisterPageObjectModel;
import Resources.BaseClass;
import Resources.constant;
import Resources.creative1;
@Test
public class VerifyRegister extends BaseClass {
	public static String email;
	SoftAssert assertions = new SoftAssert();
	@Test
	public void Register() throws IOException, InterruptedException {
		initializeDriver();
		
		
		driver.get("https://naveenautomationlabs.com/opencart/");
		
		driver.manage().window().maximize();
		
		RegisterPageObjectModel RPO=new RegisterPageObjectModel(driver);
		
		Thread.sleep(2000);
		
		RPO.clickMyAccount().click();
		
		RPO.clickRegister().click();
		
		RPO.enterFirstName().sendKeys(constant.firstname);
		
		RPO.enterLastName().sendKeys(constant.lastname);
		
		email=creative1.generateemail();
		
		RPO.enterEmail().sendKeys(constant.email);
		
		RPO.enterTelephone().sendKeys(constant.phone);
		
		RPO.enterPassward().sendKeys(constant.password);
		
		RPO.enterPasswardConfirm().sendKeys(constant.password1);
		
		RPO.clickNewsLetterSubscribe() .click();
		
		RPO.clickPrivacyPolicy().click();
		
		RPO.clickContinue().click();
		Thread.sleep(3000);
		
	    RPO.validateSucessText().getText();
	    
	    Thread.sleep(3000);
	    
	    RPO.Continue().click();
	    System.out.println(email);

		String P = RPO.validateSucessText().getText();
		String Q = constant.expectedtext;
		assertions.assertEquals(P, Q, "ENTER INVALID DATA");
		assertions.assertAll();

		
		
	}

}
