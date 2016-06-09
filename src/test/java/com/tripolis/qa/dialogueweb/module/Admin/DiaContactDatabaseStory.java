package com.tripolis.qa.dialogueweb.module.Admin;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;

import com.tripolis.qa.dialogueweb.steps.serenity.DiaContactDatabaseSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaLoginSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Story;

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
	public DiaContactDatabaseSteps diaContactDatabaseSteps;
	
	@Before
	public void setUp() {
		diaLoginSteps.isOnLoginPage();
		diaLoginSteps.inputDataToLoginForm("Tripolis QA", "telerik@tripolis.com", "Telerik1!");
		diaLoginSteps.clickonLoginButton();
		diaLoginSteps.verifyClientName();
		diaContactDatabaseSteps.navigateToAdministrationPage();
		diaContactDatabaseSteps.onAdministrationPage();
		diaContactDatabaseSteps.navigateToListContactDatabasesPage();
		diaContactDatabaseSteps.onListContactDatabasesPage();
		diaContactDatabaseSteps.verifyheaderNameTextListContactDatabases();
	}
	
	@Test
	public void scenario1ClickOnCancelButtonWhenCreateContactDatabase() {
		diaContactDatabaseSteps.clickOnNewLink();
		diaContactDatabaseSteps.seeCreateDatabaseDialog();
		diaContactDatabaseSteps.verifyheaderNameTextCreateDatabaseDialogStep1();
		diaContactDatabaseSteps.setLabel(databaseLabel);
		diaContactDatabaseSteps.setName(databaseName);
		diaContactDatabaseSteps.clickOnCancelButton();
		diaContactDatabaseSteps.verifyheaderNameTextListContactDatabases();
	}
	
	@Test
	public void scenario2CreateVaildContactDatabase() throws Exception {
		diaContactDatabaseSteps.clickOnNewLink();
		diaContactDatabaseSteps.seeCreateDatabaseDialog();
		diaContactDatabaseSteps.verifyheaderNameTextCreateDatabaseDialogStep1();
		diaContactDatabaseSteps.setLabel(databaseLabel);
		diaContactDatabaseSteps.setName(databaseName);
		diaContactDatabaseSteps.clickOnNextButton();
		diaContactDatabaseSteps.verifyheaderNameTextCreateDatabaseDialogStep2();
		diaContactDatabaseSteps.create_First_Key_Field("Email", "EMAIL", "3", "254", "", "General");
		diaContactDatabaseSteps.clickOnNextButton();
		diaContactDatabaseSteps.verifyheaderNameTextCreateDatabaseDialogOverview();
		diaContactDatabaseSteps.verify_DatabaseLabelText(databaseLabel);
		diaContactDatabaseSteps.clickOnAddFieldButton();
		diaContactDatabaseSteps.verifyheaderNameTextCreateDatabaseDialogStep3();
		diaContactDatabaseSteps.create_Field("Name", "STRING", "3", "254", "", "General");
		diaContactDatabaseSteps.clickOnNextButton();
		diaContactDatabaseSteps.verifyheaderNameTextCreateDatabaseDialogOverview();
		diaContactDatabaseSteps.verify_DatabaseLabelText(databaseLabel);
		diaContactDatabaseSteps.clickOnAddFieldButton();
		diaContactDatabaseSteps.create_Field("Mobile", "MOBILE", "3", "16", "", "General");
		diaContactDatabaseSteps.clickOnNextButton();
		diaContactDatabaseSteps.verifyheaderNameTextCreateDatabaseDialogOverview();
		diaContactDatabaseSteps.verify_DatabaseLabelText(databaseLabel);
		diaContactDatabaseSteps.clickOnFinishButton();
		Thread.sleep(1000);
		databaseId = diaContactDatabaseSteps.getcontactDatabasesAttribute();
		System.out.println("Database id = " + databaseId);
		diaContactDatabaseSteps.verifyheaderNameTextListContactDatabases();
	}
	
	@Test
	public void scenario3EditContactDatabase() throws Exception {
		diaContactDatabaseSteps.selectContactDB();
		diaContactDatabaseSteps.clickOnEditButton();
		diaContactDatabaseSteps.onEditContactDatabasePage();
		diaContactDatabaseSteps.verify_HeaderNameTextEditContactDatabase(databaseLabel);
		diaContactDatabaseSteps.editLable("ABC SerenityBDD "+ databaseLabel);
		diaContactDatabaseSteps.editName("ABC SerenityBDD "+ databaseName);
		diaContactDatabaseSteps.clickOnSubmitButton();
	}
	
	@Test
	public void scenario4DeleteContactDatabase() throws Exception {
		diaContactDatabaseSteps.selectContactDB();
		diaContactDatabaseSteps.clickOnDeleteButton();
		diaContactDatabaseSteps.verifyDeleteconfirmedMessage(databaseLabel);
		diaContactDatabaseSteps.clickOnConfirmedButton();
		diaContactDatabaseSteps.clickOnDeleteBtn();
		diaContactDatabaseSteps.verifyheaderNameTextListContactDatabases();
	}
	
	@After
	public void tearDown() throws Exception {
		driver.close();
	}
}
