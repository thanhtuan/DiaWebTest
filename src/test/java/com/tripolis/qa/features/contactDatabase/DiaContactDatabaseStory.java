package com.tripolis.qa.features.contactDatabase;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;

import com.tripolis.qa.steps.serenity.DiaContactDatabaseSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DiaContactDatabaseStory {

	@Managed(uniqueSession = true)
    public WebDriver driver = null;
	
	@Steps
	public DiaContactDatabaseSteps EndUser;
	
	@Before
	public void setUp() throws InterruptedException {
		EndUser.loginToDia("haralds company", "telerik@tripolis.com", "Telerik1!");
		EndUser.navigateToAdministrationPage();
		EndUser.onAdministrationPage();
		EndUser.navigateToListContactDatabasesPage();
		EndUser.onListContactDatabasesPage();
		EndUser.clickOnNewLink();
		EndUser.seeCreateDatabaseDialog();
	}
	
	@Test
	public void scenario1ClickOnCancelButtonCreateContactDatabase() {
		EndUser.setLabel("Dialogue DB Test "+ System.currentTimeMillis());
		EndUser.setName("Dialogue DB Test "+ System.currentTimeMillis());
		EndUser.clickOnCancelButton();
	}
	
	@Test
	public void scenario2CreateVaildContactDatabase() throws Exception {
		EndUser.setLabel("Dialogue DB Test "+ System.currentTimeMillis());
		EndUser.setName("Dialogue DB Test "+ System.currentTimeMillis());
		EndUser.clickOnNextButton();
		EndUser.create_First_Key_Field("Email", "email", "3", "254", "", "General");
		EndUser.clickOnNextButton();
		EndUser.clickOnAddFieldButton();
		EndUser.create_Field("Name", "string", "3", "254", "", "General");
		EndUser.clickOnNextButton();
		EndUser.clickOnAddFieldButton();
		EndUser.create_Field("Mobile", "mobile", "3", "16", "", "General");
		EndUser.clickOnNextButton();
		EndUser.clickOnFinishButton();
		Thread.sleep(5000);
	}
	
	@Pending @Test
	public void scenario3DeleteContactDatabase() throws Exception {
		
	}
	
	@After
	public void tearDown() throws Exception {
		driver.close();
	}
}
