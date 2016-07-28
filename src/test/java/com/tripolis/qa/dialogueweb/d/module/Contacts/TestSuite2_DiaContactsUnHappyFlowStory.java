package com.tripolis.qa.dialogueweb.d.module.Contacts;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;

import com.tripolis.qa.dialogueweb.steps.serenity.DiaAdministrationSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaContactDashboardSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaContactDatabaseWizardSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaCreateContactSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaHomeSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaListContactDatabasesSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaListContactsSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaLoginSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaViewContactSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestSuite2_DiaContactsUnHappyFlowStory {
	
	@Managed(uniqueSession = true)
	public WebDriver driver;
	
	@Steps
	public DiaLoginSteps diaLoginSteps;
	
	@Steps
	public DiaHomeSteps diaHomeSteps;
	
	@Steps
	public DiaAdministrationSteps diaAdministrationSteps;
	
	@Steps
	public DiaListContactDatabasesSteps diaListContactDatabasesSteps;
	
	@Steps
	public DiaContactDatabaseWizardSteps diaContactDatabaseWizardSteps;
	
	@Steps
	public DiaContactDashboardSteps diaContactDashboardSteps;
	
	@Steps
	public DiaListContactsSteps diaListContactsSteps;
	
	@Steps
	public DiaCreateContactSteps diaCreateContactSteps;
	
	@Steps
	public DiaViewContactSteps diaViewContactSteps;
	
	@Before
	public void setUp() {
		diaLoginSteps.isOnLoginPage();
		diaLoginSteps.inputDataToLoginForm("Tripolis QA", "test_automated_user@tripolis.com", "test");
		diaLoginSteps.clickonLoginButton();	
		diaLoginSteps.verifyClientName();
	}
	
	@Pending @Test
	public void scenario2_CreateContactWith() {
		diaHomeSteps.navigateToContactPage();
		diaContactDashboardSteps.navigateToListContactsPage();
		diaListContactsSteps.verifyheaderNameTextListContacts("");
		diaListContactsSteps.clickOnNewLink();
		diaCreateContactSteps.onCreateContactPage();
		diaCreateContactSteps.setContactEmail("");
		diaCreateContactSteps.setContactName("");
		diaCreateContactSteps.setContactMobile("");
		diaCreateContactSteps.clickOnSubmitOkButton();
		diaViewContactSteps.onViewContactPage();
	}
	
	@After
	public void tearDown() {
		driver.close();
	}

}
