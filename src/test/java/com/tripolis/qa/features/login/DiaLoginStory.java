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
	public DiaLoginSteps telerik;
	
	@Before
	public void setUp() throws Exception {
		telerik.is_the_login_page();
	}
	
	@Test
	public void scenario1LoginWithBlankClientDomain() throws InterruptedException {
		telerik.enterDomain("");
		telerik.enterUser("telerik@tripolis.com");
		telerik.enterPass("Telerik1!");
		telerik.clickonLoginButton();
		Thread.sleep(5000);
		telerik.seeLoginForm();
		telerik.verify_login_Unsuccessful();
	}
	
	@Test
	public void scenario2LoginWithBlankPassword() throws InterruptedException {
		telerik.enterDomain("haralds company");
		telerik.enterUser("telerik@tripolis.com");
		telerik.enterPass("");
		telerik.clickonLoginButton();
		Thread.sleep(5000);
		telerik.seeLoginForm();
		telerik.verify_login_Unsuccessful();
	}
	
	@Test
	public void scenario3LoginWithBlankUsername() throws InterruptedException {
		telerik.enterDomain("haralds company");
		telerik.enterUser("");
		telerik.enterPass("Telerik1!");
		telerik.clickonLoginButton();
		Thread.sleep(5000);
		telerik.seeLoginForm();
		telerik.verify_login_Unsuccessful();
	}
	
	@Test
	public void scenario4LoginWithWrongClientDomain() throws InterruptedException {
		telerik.enterDomain("harald companies");
		telerik.enterUser("telerik@tripolis.com");
		telerik.enterPass("Telerik1!");
		telerik.clickonLoginButton();
		Thread.sleep(30000);
		telerik.seeLoginForm();
		telerik.verify_login_Unsuccessful();
	}
	
	@Test
	public void scenario5LoginWithWrongPassword() throws InterruptedException {
		telerik.enterDomain("haralds company");
		telerik.enterUser("telerik@tripolis.com");
		telerik.enterPass("Pa$$w0rt");
		telerik.clickonLoginButton();
		Thread.sleep(30000);
		telerik.seeLoginForm();
		telerik.verify_login_Unsuccessful();
	}
	
	@Test
	public void scenario6LoginWithWrongUsername() throws InterruptedException {
		telerik.enterDomain("haralds company");
		telerik.enterUser("tuan@tripolis.com");
		telerik.enterPass("Telerik1!");
		telerik.clickonLoginButton();
		Thread.sleep(5000);
		telerik.seeLoginForm();
		telerik.verify_login_Unsuccessful();
	}
	
	@Test
	public void scenario7LoginWithVaildCredentials() throws InterruptedException {
		telerik.seeLoginForm();
		telerik.enterDomain("haralds company");
		telerik.enterUser("telerik@tripolis.com");
		telerik.enterPass("Telerik1!");
		telerik.clickonLoginButton();
		Thread.sleep(5000);
		telerik.verify_login_successful();
	}
	
	@After
	public void tearDown() throws Exception {
		driver.close();
	}
}
