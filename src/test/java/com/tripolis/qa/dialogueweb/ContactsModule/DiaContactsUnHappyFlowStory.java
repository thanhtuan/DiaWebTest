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
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import net.thucydides.core.annotations.WithTag;
import net.thucydides.core.annotations.WithTags;

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
	
	Variables var = new Variables();
	
	@Before
	public void setUp() {
		diaLoginSteps.isOnLoginPage();
		diaLoginSteps.inputDataToLoginForm(Variables.clientDomain, Variables.adminUserName, Variables.passWord);
		diaLoginSteps.clickOnLoginButton();	
		diaLeftSidebarSteps.shouldBeAbleToSeeClientDomainName();
	}
	
	@Test
	@Title(value = "Check the validation message when leave empty required field and click save button")
	@WithTags (
	        {
	        	@WithTag(type="feature", name="Contact Module"),
                @WithTag(type="feature", name="Contacts"),
                @WithTag(type="story", name="Validation message when create Contact")
	        }
	)
	public void scenario1_CreateContactLeaveEmptyRequiredFields() {
		var.BDlabel = diaLeftSidebarSteps.getcontactDatabasesLabel();
		diaMainMenuSteps.navigateToContactPage();
		diaContactDashboardSteps.onContactDashboardPage();
		diaSubMenuSteps.navigateToPageThatSubMenuItem2PresentFor();
		diaListContactsSteps.verifyheaderNameTextListContacts(var.BDlabel);
		diaListContactsSteps.clickOnNewLink();
		diaCreateContactSteps.onCreateContactPage();
		diaCreateContactSteps.setInformationToCreateContact("", "required field", "00000000016");
		diaCreateContactSteps.clickOnSaveButton();
		diaCreateContactSteps.shouldBeAbleToSeeTheEmailValidationMessage();
	}
	
	@After
	public void tearDown() {
		driver.close();
	}

}
