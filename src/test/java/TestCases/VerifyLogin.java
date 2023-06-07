package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.LoginPageObject;
import Resources.BaseClass;
import Resources.constant;

@Test

public class VerifyLogin extends BaseClass {

	SoftAssert assertions = new SoftAssert();

	public void validlogin() throws IOException, InterruptedException {
		LoginPageObject LPO = new LoginPageObject(driver);

		LPO.myaccount().click();
		LPO.login().click();
		LPO.emaillogin().sendKeys(VerifyRegister.email);
		LPO.password().sendKeys(constant.password);
		LPO.loginclick().click();

		String A = LPO.validtext().getText();
		String B = "My Account";

		assertions.assertEquals(A, B, "fails with data");

		assertions.assertAll();
	}

}
