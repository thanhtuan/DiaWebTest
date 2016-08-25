package com.tripolis.qa.dialogueweb.SetupModule;

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
import com.tripolis.qa.dialogueweb.steps.serenity.DiaContactDatabaseWizardSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaEditContactDatabaseDetailsSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaHomeSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaListContactDatabasesSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaLoginSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.WithTag;

@RunWith(SerenityRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DiaContactDatabaseStory {
	
	Variables var = new Variables();
	
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
	DiaEditContactDatabaseDetailsSteps diaEditContactDatabaseDetailsSteps;
	
	@Before
	public void setUp() {
		diaLoginSteps.isOnLoginPage();
		diaLoginSteps.inputDataToLoginForm(Variables.clientDomain, Variables.userName, Variables.passWord);
		diaLoginSteps.clickonLoginButton();
		diaLeftSidebarSteps.verifyClientName();
		diaMainMenuSteps.navigateToAdministrationPage();
		diaAdministrationSteps.onAdministrationPage();
		diaSubMenuSteps.navigateToPageThatSubMenuItem1PresentFor();
		diaListContactDatabasesSteps.onListContactDatabasesPage();
		diaListContactDatabasesSteps.verifyheaderNameTextListContactDatabases();
	}
	
	@Test
	@WithTag(type="feature", name="Contact Database")
	public void scenario1_UpdateContactDatabase() {
		diaListContactDatabasesSteps.selectContactDB(Variables.databaseLabel);
		diaListContactDatabasesSteps.clickOnEditButton();
		diaEditContactDatabaseDetailsSteps.onEditContactDatabasePage();
		diaEditContactDatabaseDetailsSteps.verify_HeaderNameTextEditContactDatabase(Variables.databaseLabel);
		diaEditContactDatabaseDetailsSteps.editLabel(Variables.updatedDatabaseLabel);
		diaEditContactDatabaseDetailsSteps.editName(Variables.updatedDatabaseLabel);
		diaEditContactDatabaseDetailsSteps.editPresentationField("Email");
		diaEditContactDatabaseDetailsSteps.clickOnSubmitButton();
		diaEditContactDatabaseDetailsSteps.verify_UpdateContactDatabaseSuccesfulMessage();
		diaEditContactDatabaseDetailsSteps.verify_HeaderNameTextEditContactDatabase(Variables.updatedDatabaseLabel);
	}
	
	@After
	public void tearDown() {
		driver.close();
	}

}
