package com.tripolis.qa.dialogueweb.features.login;
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
	public WebDriver driver=null;
	
	@Steps
	protected DiaLoginSteps diaLoginSteps;
	
	@Before
	public void setUp() {
		diaLoginSteps.is_the_login_page();
	}
	
	@Test
	public void scenario1LoginWithBlankClientDomain() {
		diaLoginSteps.inputDataToLoginForm("", "telerik@tripolis.com", "Telerik1!");
		diaLoginSteps.clickonLoginButton();
		diaLoginSteps.seeLoginForm();
		diaLoginSteps.verify_login_Unsuccessful();
	}
	
	@Test
	public void scenario2LoginWithBlankUsername() {
		diaLoginSteps.inputDataToLoginForm("haralds company", "", "Telerik1!");
		diaLoginSteps.clickonLoginButton();
		diaLoginSteps.seeLoginForm();
		diaLoginSteps.verify_login_Unsuccessful();
	}
	
	@Test
	public void scenario3LoginWithBlankPassword() {
		diaLoginSteps.inputDataToLoginForm("haralds company", "telerik@tripolis.com", "");
		diaLoginSteps.clickonLoginButton();
		diaLoginSteps.seeLoginForm();
		diaLoginSteps.verify_login_Unsuccessful();
	}
	
	@Test
	public void scenario4LoginWithWrongClientDomain() {
		diaLoginSteps.inputDataToLoginForm("harald companies", "telerik@tripolis.com", "Telerik1!");
		diaLoginSteps.clickonLoginButton();
		diaLoginSteps.seeLoginForm();
		diaLoginSteps.verify_login_Unsuccessful();
	}
	
	@Test
	public void scenario5LoginWithWrongPassword() {
		diaLoginSteps.inputDataToLoginForm("haralds company", "telerik@tripolis.com", "Pa$$w0rt");
		diaLoginSteps.clickonLoginButton();
		diaLoginSteps.seeLoginForm();
		diaLoginSteps.verify_login_Unsuccessful();
	}
	
	@Test
	public void scenario6LoginWithWrongUsername() {
		diaLoginSteps.inputDataToLoginForm("haralds company", "telerik2@tripolis.com", "Telerik1!");
		diaLoginSteps.clickonLoginButton();
		diaLoginSteps.seeLoginForm();
		diaLoginSteps.verify_login_Unsuccessful();
	}
	
	@Test
	public void scenario7LoginWithVaildCredentials(){
		diaLoginSteps.seeLoginForm();
		diaLoginSteps.inputDataToLoginForm("haralds company", "telerik@tripolis.com", "Telerik1!");
		diaLoginSteps.clickonLoginButton();
		diaLoginSteps.verify_login_successful();
	}
	
	@After
	public void tearDown() throws Exception {
		driver.close();
	}
}
