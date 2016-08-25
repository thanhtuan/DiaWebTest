package com.tripolis.qa.dialogueweb.Login;
import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;

import com.tripolis.qa.common.DiaLeftSidebarSteps;
import com.tripolis.qa.common.Variables;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaHomeSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaLoginSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DiaLoginStory {
	
	@Managed(uniqueSession = true)
	public WebDriver driver;
	
	@Steps
	DiaLeftSidebarSteps diaLeftSidebarSteps;
	
	@Steps
	DiaLoginSteps diaLoginSteps;
	
	@Steps
	DiaHomeSteps diaHomeSteps;
	
	@Before
	public void setUp() {
		diaLoginSteps.isOnLoginPage();
	}
	
	@Test
	public void scenario1_LoginWithBlankClientDomain() {
		diaLoginSteps.inputDataToLoginForm("", Variables.userName, Variables.passWord);
		diaLoginSteps.clickonLoginButton();
		diaLoginSteps.seeLoginForm();
		diaLoginSteps.verify_ErrorMessage();
		diaLoginSteps.verifyIsOnErrorLoginPage();
	}
	
	@Test
	public void scenario2_LoginWithBlankUsername() {
		diaLoginSteps.inputDataToLoginForm(Variables.clientDomain, "", Variables.passWord);
		diaLoginSteps.clickonLoginButton();
		diaLoginSteps.seeLoginForm();
		diaLoginSteps.verify_ErrorMessage();
		diaLoginSteps.verifyIsOnErrorLoginPage();
	}
	
	@Test
	public void scenario3_LoginWithBlankPassword() {
		diaLoginSteps.inputDataToLoginForm(Variables.clientDomain, Variables.userName, "");
		diaLoginSteps.clickonLoginButton();
		diaLoginSteps.seeLoginForm();
		diaLoginSteps.verify_ErrorMessage();
		diaLoginSteps.verifyIsOnErrorLoginPage();
	}
	
	@Test
	public void scenario4_LoginWithWrongClientDomain() {
		diaLoginSteps.inputDataToLoginForm("harald companies", Variables.userName, Variables.passWord);
		diaLoginSteps.clickonLoginButton();
		diaLoginSteps.seeLoginForm();
		diaLoginSteps.verify_ErrorMessage();
		diaLoginSteps.verifyIsOnErrorLoginPage();
	}
	
	@Test
	public void scenario5_LoginWithWrongPassword() {
		diaLoginSteps.inputDataToLoginForm(Variables.clientDomain, Variables.userName, "Pa$$w0rt");
		diaLoginSteps.clickonLoginButton();
		diaLoginSteps.seeLoginForm();
		diaLoginSteps.verify_ErrorMessage();
		diaLoginSteps.verifyIsOnErrorLoginPage();
	}
	
	@Test
	public void scenario6_LoginWithWrongUsername() {
		diaLoginSteps.inputDataToLoginForm(Variables.clientDomain, "telerik2@tripolis.com", Variables.passWord);
		diaLoginSteps.clickonLoginButton();
		diaLoginSteps.seeLoginForm();
		diaLoginSteps.verify_ErrorMessage();
		diaLoginSteps.verifyIsOnErrorLoginPage();
	}
	
	@Test
	public void scenario7_LoginWithVaildCredentials(){		
		diaLoginSteps.seeLoginForm();
		diaLoginSteps.inputDataToLoginForm(Variables.clientDomain, Variables.userName, Variables.passWord);
		diaLoginSteps.clickonLoginButton();
		diaHomeSteps.verifyIsOnHomePage();
		diaLeftSidebarSteps.verifyClientName();
	}
	
	@After
	public void tearDown() throws Exception {
		driver.close();
	}
}
