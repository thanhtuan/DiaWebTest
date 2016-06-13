package com.tripolis.qa.dialogueweb.module.Admin;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;

import com.tripolis.qa.dialogueweb.steps.serenity.DiaAdministrationSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaContactDatabaseWizardSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaEditContactDatabaseDetailsSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaHomeSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaListContactDatabasesSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaLoginSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DiaContactDatabaseStory {
	
	private String databaseName = "ABC Dialogue DB Test "+ System.currentTimeMillis();
	private String databaseLabel = "ABC Dialogue DB Test "+ System.currentTimeMillis();
	private String databaseId;
	
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
		diaLoginSteps.inputDataToLoginForm("Tripolis QA", "telerik@tripolis.com", "Telerik1!");
		diaLoginSteps.clickonLoginButton();
		diaLoginSteps.verifyClientName();
		diaHomeSteps.navigateToAdministrationPage();
		diaAdministrationSteps.onAdministrationPage();
		diaAdministrationSteps.navigateToListContactDatabasesPage();
		diaListContactDatabasesSteps.onListContactDatabasesPage();
		diaListContactDatabasesSteps.verifyheaderNameTextListContactDatabases();
	}
	
	@Test
	public void scenario1ClickOnCancelButtonWhenCreateContactDatabase() {
		diaListContactDatabasesSteps.clickOnNewLink();
		diaContactDatabaseWizardSteps.seeCreateDatabaseDialog();
		diaContactDatabaseWizardSteps.verifyheaderNameTextCreateDatabaseDialogStep1();
		diaContactDatabaseWizardSteps.setLabel(databaseLabel);
		diaContactDatabaseWizardSteps.setName(databaseName);
		diaContactDatabaseWizardSteps.clickOnCancelButton();
		diaListContactDatabasesSteps.verifyheaderNameTextListContactDatabases();
	}
	
	@Test
	public void scenario2CreateVaildContactDatabase() throws Exception {
		diaListContactDatabasesSteps.clickOnNewLink();
		diaContactDatabaseWizardSteps.seeCreateDatabaseDialog();
		diaContactDatabaseWizardSteps.verifyheaderNameTextCreateDatabaseDialogStep1();
		diaContactDatabaseWizardSteps.setLabel(databaseLabel);
		diaContactDatabaseWizardSteps.setName(databaseName);
		diaContactDatabaseWizardSteps.clickOnNextButton();
		diaContactDatabaseWizardSteps.verifyheaderNameTextCreateDatabaseDialogStep2();
		diaContactDatabaseWizardSteps.create_First_Key_Field("Email", "EMAIL", "3", "254", "", "General");
		diaContactDatabaseWizardSteps.clickOnNextButton();
		diaContactDatabaseWizardSteps.verifyheaderNameTextCreateDatabaseDialogOverview();
		diaContactDatabaseWizardSteps.verify_DatabaseLabelText(databaseLabel);
		diaContactDatabaseWizardSteps.clickOnAddFieldButton();
		diaContactDatabaseWizardSteps.verifyheaderNameTextCreateDatabaseDialogStep3();
		diaContactDatabaseWizardSteps.create_Field("Name", "STRING", "3", "254", "", "General");
		diaContactDatabaseWizardSteps.clickOnNextButton();
		diaContactDatabaseWizardSteps.verifyheaderNameTextCreateDatabaseDialogOverview();
		diaContactDatabaseWizardSteps.verify_DatabaseLabelText(databaseLabel);
		diaContactDatabaseWizardSteps.clickOnAddFieldButton();
		diaContactDatabaseWizardSteps.create_Field("Mobile", "MOBILE", "3", "16", "", "General");
		diaContactDatabaseWizardSteps.clickOnNextButton();
		diaContactDatabaseWizardSteps.verifyheaderNameTextCreateDatabaseDialogOverview();
		diaContactDatabaseWizardSteps.verify_DatabaseLabelText(databaseLabel);
		diaContactDatabaseWizardSteps.clickOnFinishButton();
		Thread.sleep(1000);
		databaseId = diaListContactDatabasesSteps.getcontactDatabasesAttribute();
		System.out.println("Database id = " + databaseId);
		diaListContactDatabasesSteps.verifyheaderNameTextListContactDatabases();
	}
	
	@Test
	public void scenario3EditContactDatabase() throws Exception {
		diaListContactDatabasesSteps.selectContactDB();
		diaListContactDatabasesSteps.clickOnEditButton();
		diaEditContactDatabaseDetailsSteps.onEditContactDatabasePage();
		diaEditContactDatabaseDetailsSteps.verify_HeaderNameTextEditContactDatabase(databaseLabel);
		diaEditContactDatabaseDetailsSteps.editLabel("ABC SerenityBDD "+ databaseLabel);
		diaEditContactDatabaseDetailsSteps.editName("ABC SerenityBDD "+ databaseName);
		diaEditContactDatabaseDetailsSteps.clickOnSubmitButton();
	}
	
	@Test
	public void scenario4DeleteContactDatabase() throws Exception {
		diaListContactDatabasesSteps.selectContactDB();
		diaListContactDatabasesSteps.clickOnDeleteButton();
		diaListContactDatabasesSteps.verifyDeleteconfirmedMessage(databaseLabel);
		diaListContactDatabasesSteps.clickOnConfirmedButton();
		diaListContactDatabasesSteps.clickOnDeleteBtn();
		diaListContactDatabasesSteps.verifyheaderNameTextListContactDatabases();
	}
	
	@After
	public void tearDown() throws Exception {
		driver.close();
	}
}
