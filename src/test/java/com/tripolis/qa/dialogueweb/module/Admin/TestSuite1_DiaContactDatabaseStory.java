package com.tripolis.qa.dialogueweb.module.Admin;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;

import com.tripolis.qa.common.Variables;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaAdministrationSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaContactDatabaseWizardSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaEditContactDatabaseDetailsSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaHomeSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaListContactDatabasesSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaLoginSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestSuite1_DiaContactDatabaseStory {
	
	Variables var = new Variables();
	
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
	public DiaEditContactDatabaseDetailsSteps diaEditContactDatabaseDetailsSteps;
	
	@Before
	public void setUp() {
		diaLoginSteps.isOnLoginPage();
		diaLoginSteps.inputDataToLoginForm(Variables.clientDomain, Variables.userName, Variables.passWord);
		diaLoginSteps.clickonLoginButton();
		diaLoginSteps.verifyClientName();
		diaHomeSteps.navigateToAdministrationPage();
		diaAdministrationSteps.onAdministrationPage();
		diaAdministrationSteps.navigateToListContactDatabasesPage();
		diaListContactDatabasesSteps.onListContactDatabasesPage();
		diaListContactDatabasesSteps.verifyheaderNameTextListContactDatabases();
	}
	
	@Pending @Test
	public void scenario1_ClickOnCancelButtonWhenCreateContactDatabase() {
		diaListContactDatabasesSteps.clickOnNewLink();
		diaContactDatabaseWizardSteps.seeCreateDatabaseDialog();
		diaContactDatabaseWizardSteps.verifyheaderNameTextCreateDatabaseDialogStep1();
		diaContactDatabaseWizardSteps.setLabel(Variables.databaseLabel);
		diaContactDatabaseWizardSteps.setName(Variables.databaseName);
		diaContactDatabaseWizardSteps.clickOnCancelButton();
		diaListContactDatabasesSteps.verifyheaderNameTextListContactDatabases();
	}
	
	@Pending @Test
	public void scenario2_CreateContactDatabase() {
		diaListContactDatabasesSteps.clickOnNewLink();
		diaContactDatabaseWizardSteps.seeCreateDatabaseDialog();
		diaContactDatabaseWizardSteps.verifyheaderNameTextCreateDatabaseDialogStep1();
		diaContactDatabaseWizardSteps.setLabel(Variables.databaseLabel);
		diaContactDatabaseWizardSteps.setName(Variables.databaseName);
		diaContactDatabaseWizardSteps.clickOnNextButton();
		diaContactDatabaseWizardSteps.verifyheaderNameTextCreateDatabaseDialogStep2();
		diaContactDatabaseWizardSteps.create_Key_Field("Email", "EMAIL", "3", "254", "", "General");
		diaContactDatabaseWizardSteps.clickOnNextButton();
		diaContactDatabaseWizardSteps.verifyheaderNameTextCreateDatabaseDialogOverview();
		diaContactDatabaseWizardSteps.verify_DatabaseLabelText(Variables.databaseLabel);
		diaContactDatabaseWizardSteps.clickOnAddFieldButton();
		diaContactDatabaseWizardSteps.verifyheaderNameTextCreateDatabaseDialogStep3();
		diaContactDatabaseWizardSteps.create_Field("Name", "STRING", "3", "254", "", false, false, true, "General");
		diaContactDatabaseWizardSteps.clickOnNextButton();
		diaContactDatabaseWizardSteps.verifyheaderNameTextCreateDatabaseDialogOverview();
		diaContactDatabaseWizardSteps.verify_DatabaseLabelText(Variables.databaseLabel);
		diaContactDatabaseWizardSteps.clickOnAddFieldButton();
		diaContactDatabaseWizardSteps.create_Field("Mobile", "MOBILE", "3", "16", "", false, false, true, "General");
		diaContactDatabaseWizardSteps.clickOnNextButton();
		diaContactDatabaseWizardSteps.verifyheaderNameTextCreateDatabaseDialogOverview();
		diaContactDatabaseWizardSteps.verify_DatabaseLabelText(Variables.databaseLabel);
		diaContactDatabaseWizardSteps.clickOnFinishButton();
		diaListContactDatabasesSteps.verifyheaderNameTextListContactDatabases();
	}
	
	@Pending @Test
	public void scenario3_UpdateContactDatabase() {
		diaListContactDatabasesSteps.selectContactDB(Variables.databaseLabel);
		diaListContactDatabasesSteps.clickOnEditButton();
		diaEditContactDatabaseDetailsSteps.onEditContactDatabasePage();
		diaEditContactDatabaseDetailsSteps.verify_HeaderNameTextEditContactDatabase(Variables.databaseLabel);
		diaEditContactDatabaseDetailsSteps.editLabel(Variables.updatedDatabaseLabel);
		diaEditContactDatabaseDetailsSteps.editName(Variables.updatedDatabaseLabel);
		diaEditContactDatabaseDetailsSteps.editPresentationField("Email");
		diaEditContactDatabaseDetailsSteps.clickOnSubmitButton();
		diaEditContactDatabaseDetailsSteps.verify_HeaderNameTextEditContactDatabase(Variables.updatedDatabaseLabel);
	}
	
	@Pending @Test
	public void scenarior4_DeleteContactDatabase() {
		var.BDlabel = diaListContactDatabasesSteps.getcontactDatabasesLabel();
		diaListContactDatabasesSteps.selectContactDB(var.BDlabel);
		diaListContactDatabasesSteps.clickOnDeleteButton();
		diaListContactDatabasesSteps.seeDeleteConfirmedPopup();
		diaListContactDatabasesSteps.verifyDeleteconfirmedMessage(var.BDlabel);
		diaListContactDatabasesSteps.clickOnConfirmedButton();
		diaListContactDatabasesSteps.clickOnDeleteBtn();
		diaListContactDatabasesSteps.verifyheaderNameTextListContactDatabases();
	}
	
	@After
	public void tearDown() {
		driver.close();
	}

}