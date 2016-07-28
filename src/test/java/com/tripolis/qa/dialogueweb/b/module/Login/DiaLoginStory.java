package com.tripolis.qa.dialogueweb.b.module.Login;
import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;

import com.tripolis.qa.dialogueweb.steps.serenity.DiaLoginSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DiaLoginStory {
	
	@Managed(uniqueSession = true)
	public WebDriver driver;
	
	@Steps
	public DiaLoginSteps diaLoginSteps;
	
	@Before
	public void setUp() {
		diaLoginSteps.isOnLoginPage();
	}
	
	@Pending @Test
	public void scenario1_LoginWithBlankClientDomain() {
		diaLoginSteps.inputDataToLoginForm("", "telerik@tripolis.com", "Telerik1!");
		diaLoginSteps.clickonLoginButton();
		diaLoginSteps.seeLoginForm();
		diaLoginSteps.verifyIsOnErrorLoginPage();
	}
	
	@Pending @Test
	public void scenario2_LoginWithBlankUsername() {
		diaLoginSteps.inputDataToLoginForm("Tripolis QA", "", "Telerik1!");
		diaLoginSteps.clickonLoginButton();
		diaLoginSteps.seeLoginForm();
		diaLoginSteps.verifyIsOnErrorLoginPage();
	}
	
	@Pending @Test
	public void scenario3_LoginWithBlankPassword() {
		diaLoginSteps.inputDataToLoginForm("Tripolis QA", "telerik@tripolis.com", "");
		diaLoginSteps.clickonLoginButton();
		diaLoginSteps.seeLoginForm();
		diaLoginSteps.verifyIsOnErrorLoginPage();
	}
	
	@Pending @Test
	public void scenario4_LoginWithWrongClientDomain() {
		diaLoginSteps.inputDataToLoginForm("harald companies", "telerik@tripolis.com", "Telerik1!");
		diaLoginSteps.clickonLoginButton();
		diaLoginSteps.seeLoginForm();
		diaLoginSteps.verifyIsOnErrorLoginPage();
	}
	
	@Pending @Test
	public void scenario5_LoginWithWrongPassword() {
		diaLoginSteps.inputDataToLoginForm("Tripolis QA", "telerik@tripolis.com", "Pa$$w0rt");
		diaLoginSteps.clickonLoginButton();
		diaLoginSteps.seeLoginForm();
		diaLoginSteps.verifyIsOnErrorLoginPage();
	}
	
	@Pending @Test
	public void scenario6_LoginWithWrongUsername() {
		diaLoginSteps.inputDataToLoginForm("Tripolis QA", "telerik2@tripolis.com", "Telerik1!");
		diaLoginSteps.clickonLoginButton();
		diaLoginSteps.seeLoginForm();
		diaLoginSteps.verifyIsOnErrorLoginPage();
	}
	
	@Pending @Test
	public void scenario7_LoginWithVaildCredentials(){
		diaLoginSteps.seeLoginForm();
		diaLoginSteps.inputDataToLoginForm("Tripolis QA", "test_automated_user@tripolis.com", "test");
		diaLoginSteps.clickonLoginButton();
		diaLoginSteps.verifyIsOnHomePage();
		diaLoginSteps.verifyClientName();
	}
	
	@After
	public void tearDown() throws Exception {
		driver.close();
	}
}
