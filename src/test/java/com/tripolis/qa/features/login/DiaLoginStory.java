package com.tripolis.qa.features.login;
import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;

import com.tripolis.qa.steps.serenity.DiaLoginSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DiaLoginStory {
	
	@Managed(uniqueSession = true)
    public WebDriver driver = null;
	
	@Steps
	public DiaLoginSteps EndUser;
	
	@Before
	public void setUp() {
		EndUser.is_the_login_page();
	}
	
	@Test
	public void scenario1LoginWithBlankClientDomain() {
		EndUser.enterDomain("");
		EndUser.enterUser("telerik@tripolis.com");
		EndUser.enterPass("Telerik1!");
		EndUser.clickonLoginButton();
		EndUser.seeLoginForm();
		EndUser.verify_login_Unsuccessful();
	}
	
	@Test
	public void scenario2LoginWithBlankPassword() {
		EndUser.enterDomain("haralds company");
		EndUser.enterUser("telerik@tripolis.com");
		EndUser.enterPass("");
		EndUser.clickonLoginButton();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		EndUser.seeLoginForm();
		EndUser.verify_login_Unsuccessful();
	}
	
	@Test
	public void scenario3LoginWithBlankUsername() {
		EndUser.enterDomain("haralds company");
		EndUser.enterUser("");
		EndUser.enterPass("Telerik1!");
		EndUser.clickonLoginButton();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		EndUser.seeLoginForm();
		EndUser.verify_login_Unsuccessful();
	}
	
	@Test
	public void scenario4LoginWithWrongClientDomain() {
		EndUser.enterDomain("harald companies");
		EndUser.enterUser("telerik@tripolis.com");
		EndUser.enterPass("Telerik1!");
		EndUser.clickonLoginButton();
		EndUser.seeLoginForm();
		EndUser.verify_login_Unsuccessful();
	}
	
	@Test
	public void scenario5LoginWithWrongPassword() {
		EndUser.enterDomain("haralds company");
		EndUser.enterUser("telerik@tripolis.com");
		EndUser.enterPass("Pa$$w0rt");
		EndUser.clickonLoginButton();
		EndUser.seeLoginForm();
		EndUser.verify_login_Unsuccessful();
	}
	
	@Test
	public void scenario6LoginWithWrongUsername() {
		EndUser.enterDomain("haralds company");
		EndUser.enterUser("tuan@tripolis.com");
		EndUser.enterPass("Telerik1!");
		EndUser.clickonLoginButton();
		EndUser.seeLoginForm();
		EndUser.verify_login_Unsuccessful();
	}
	
	@Test
	public void scenario7LoginWithVaildCredentials(){
		EndUser.seeLoginForm();
		EndUser.enterDomain("haralds company");
		EndUser.enterUser("telerik@tripolis.com");
		EndUser.enterPass("Telerik1!");
		EndUser.clickonLoginButton();
		EndUser.verify_login_successful();
		EndUser.verify_ClientName();
	}
	
	@After
	public void tearDown() throws Exception {
		driver.close();
	}
}
