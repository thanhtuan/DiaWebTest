package com.tripolis.qa.dialogueweb.ContactsModule;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;

import com.tripolis.qa.common.DiaLeftSidebarSteps;
import com.tripolis.qa.common.DiaMainMenuSteps;
import com.tripolis.qa.common.DiaSubMenuSteps;
import com.tripolis.qa.common.Variables;
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
public class DiaContactsUnHappyFlowStory {
	
	@Managed(uniqueSession = true)
	public WebDriver driver;
	
	@Steps
	DiaMainMenuSteps diaMainMenuSteps;
	
	@Steps
	DiaSubMenuSteps diaSubMenuSteps;
	
	@Steps
	DiaLeftSidebarSteps diaLeftSidebarSteps;
	
	@Steps
	DiaLoginSteps diaLoginSteps;
	
	@Steps
	DiaHomeSteps diaHomeSteps;
	
	@Steps
	DiaAdministrationSteps diaAdministrationSteps;
	
	@Steps
	DiaListContactDatabasesSteps diaListContactDatabasesSteps;
	
	@Steps
	DiaContactDatabaseWizardSteps diaContactDatabaseWizardSteps;
	
	@Steps
	DiaContactDashboardSteps diaContactDashboardSteps;
	
	@Steps
	DiaListContactsSteps diaListContactsSteps;
	
	@Steps
	DiaCreateContactSteps diaCreateContactSteps;
	
	@Steps
	DiaViewContactSteps diaViewContactSteps;
	
	@Before
	public void setUp() {
		diaLoginSteps.isOnLoginPage();
		diaLoginSteps.inputDataToLoginForm(Variables.clientDomain, Variables.userName, Variables.passWord);
		diaLoginSteps.clickonLoginButton();	
		diaLeftSidebarSteps.verifyClientName();
	}
	
	@Pending @Test
	public void scenario2_CreateContactWith() {
		diaMainMenuSteps.navigateToContactPage();
		diaContactDashboardSteps.onContactDashboardPage();
		diaSubMenuSteps.navigateToPageThatSubMenuItem2PresentFor();
		diaListContactsSteps.verifyheaderNameTextListContacts("");
		diaListContactsSteps.clickOnNewLink();
		diaCreateContactSteps.onCreateContactPage();
		diaCreateContactSteps.setContactEmail("");
		diaCreateContactSteps.setContactName("");
		diaCreateContactSteps.setContactMobile("");
		diaCreateContactSteps.clickOnSaveButton();
		diaViewContactSteps.verify_CreateContactSuccessfulMessage();
		diaViewContactSteps.onViewContactPage();
	}
	
	@After
	public void tearDown() {
		driver.close();
	}

}
