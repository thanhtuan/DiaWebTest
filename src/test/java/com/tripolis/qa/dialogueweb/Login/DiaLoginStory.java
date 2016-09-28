package com.tripolis.qa.dialogueweb.Login;
import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;

import com.tripolis.qa.common.DiaLeftSidebarSteps;
import com.tripolis.qa.common.DiaMainMenuSteps;
import com.tripolis.qa.common.Variables;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaHomeSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaLoginSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Narrative;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import net.thucydides.core.annotations.WithTag;
import net.thucydides.core.annotations.WithTags;

@Narrative(text={"In order to navigate to Home Page in Dialogue Web",                      
        "As a user",
        "I want to be able to login to Dialogue Web"})
@RunWith(SerenityRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DiaLoginStory {
	
	@Managed(uniqueSession = true)
	public WebDriver driver;
	
	@Steps
	DiaMainMenuSteps diaMainMenuSteps;
	
	@Steps
	DiaLeftSidebarSteps diaLeftSidebarSteps;
	
	@Steps
	DiaLoginSteps diaLoginSteps;
	
	@Steps
	DiaHomeSteps diaHomeSteps;
	
	@Before
	public void setUp() {
		
		diaLoginSteps.isOnLoginPage();
		//driver.manage().window().maximize();
	}
	
	@Test
	@Title(value = "Login With Blank Client Domain")
	@WithTags (
	        {
	                @WithTag(type="feature", name="Login"),
	                @WithTag(type="Story", name="User login with blank client domain")
	        }
	)
	public void scenario1_LoginWithBlankClientDomain() {
		diaLoginSteps.inputDataToLoginForm("", Variables.userName, Variables.passWord);
		diaLoginSteps.clickOnLoginButton();
		diaLoginSteps.shouldSeeLoginForm();
		diaLoginSteps.verify_ErrorMessage();
		diaLoginSteps.verifyIsOnErrorLoginPage();
	}
	
	@Test
	@Title(value = "Login With Blank Username")
	@WithTags (
	        {
	                @WithTag(type="feature", name="Login"),
	                @WithTag(type="Story", name="User login with blank Username")
	        }
	)
	public void scenario2_LoginWithBlankUsername() {
		diaLoginSteps.inputDataToLoginForm(Variables.clientDomain, "", Variables.passWord);
		diaLoginSteps.clickOnLoginButton();
		diaLoginSteps.shouldSeeLoginForm();
		diaLoginSteps.verify_ErrorMessage();
		diaLoginSteps.verifyIsOnErrorLoginPage();
	}
	
	@Test
	@Title(value = "Login With Blank Password")
	@WithTags (
	        {
	                @WithTag(type="feature", name="Login"),
	                @WithTag(type="Story", name="User login with blank Password")
	        }
	)
	public void scenario3_LoginWithBlankPassword() {
		diaLoginSteps.inputDataToLoginForm(Variables.clientDomain, Variables.userName, "");
		diaLoginSteps.clickOnLoginButton();
		diaLoginSteps.shouldSeeLoginForm();
		diaLoginSteps.verify_ErrorMessage();
		diaLoginSteps.verifyIsOnErrorLoginPage();
	}
	
	@Test
	@Title(value = "Login With Wrong Client Domain")
	@WithTags (
	        {
	                @WithTag(type="feature", name="Login"),
	                @WithTag(type="Story", name="User login with wrong Client Domain")
	        }
	)
	public void scenario4_LoginWithWrongClientDomain() {
		diaLoginSteps.inputDataToLoginForm("harald companies", Variables.userName, Variables.passWord);
		diaLoginSteps.clickOnLoginButton();
		diaLoginSteps.shouldSeeLoginForm();
		diaLoginSteps.verify_ErrorMessage();
		diaLoginSteps.verifyIsOnErrorLoginPage();
	}
	
	@Test
	@Title(value = "Login With Wrong Password")
	@WithTags (
	        {
	                @WithTag(type="feature", name="Login"),
	                @WithTag(type="Story", name="User login with wrong Password")
	        }
	)
	public void scenario5_LoginWithWrongPassword() {
		diaLoginSteps.inputDataToLoginForm(Variables.clientDomain, Variables.userName, "Pa$$w0rt");
		diaLoginSteps.clickOnLoginButton();
		diaLoginSteps.shouldSeeLoginForm();
		diaLoginSteps.verify_ErrorMessage();
		diaLoginSteps.verifyIsOnErrorLoginPage();
	}
	
	@Test
	@Title(value = "Login With Wrong Username")
	@WithTags (
	        {
	                @WithTag(type="feature", name="Login"),
	                @WithTag(type="Story", name="User login with wrong Username")
	        }
	)
	public void scenario6_LoginWithWrongUsername() {
		diaLoginSteps.inputDataToLoginForm(Variables.clientDomain, "telerik2@tripolis.com", Variables.passWord);
		diaLoginSteps.clickOnLoginButton();
		diaLoginSteps.shouldSeeLoginForm();
		diaLoginSteps.verify_ErrorMessage();
		diaLoginSteps.verifyIsOnErrorLoginPage();
	}
	
	@Test
	@Title(value = "Login With Vaild Credentials")
	@WithTags (
	        {
	                @WithTag(type="feature", name="Login"),
	                @WithTag(type="Story", name="User login with Vaild Credentials")
	        }
	)
	public void scenario7_LoginWithVaildCredentials(){		
		diaLoginSteps.shouldSeeLoginForm();
		diaLoginSteps.inputDataToLoginForm(Variables.clientDomain, Variables.userName, Variables.passWord);
		diaLoginSteps.clickOnLoginButton();
		diaHomeSteps.verifyIsOnHomePage();
		diaMainMenuSteps.shouldBeAbleToSeeLogoutText();
		diaLeftSidebarSteps.shouldBeAbleToSeeClientDomainName();
	}
	
	@After
	public void tearDown() {
		driver.close();
	}
}
