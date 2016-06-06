package com.tripolis.qa.dialogueweb.features.contactdatabase;

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

@RunWith(SerenityRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DiaContactDatabaseStory {
	
	private String databaseName = "Dialogue DB Test "+ System.currentTimeMillis();
	private String databaseLabel = "Dialogue DB Test "+ System.currentTimeMillis();
	private String databaseId;
	
	@Managed(uniqueSession = true)
	public WebDriver driver=null;
	
	@Steps
	DiaLoginSteps diaLoginSteps;
	
	@Steps
	public DiaContactDatabaseSteps diaContactDatabaseSteps;
	
	@Before
	public void setUp() {
		diaLoginSteps.is_the_login_page();
		diaLoginSteps.inputDataToLoginForm("haralds company", "telerik@tripolis.com", "Telerik1!");
		diaLoginSteps.clickonLoginButton();
		diaContactDatabaseSteps.navigateToAdministrationPage();
		diaContactDatabaseSteps.onAdministrationPage();
		diaContactDatabaseSteps.navigateToListContactDatabasesPage();
		diaContactDatabaseSteps.onListContactDatabasesPage();
	}
	
	@Test
	public void scenario1ClickOnCancelButtonWhenCreateContactDatabase() {
		diaContactDatabaseSteps.clickOnNewLink();
		diaContactDatabaseSteps.seeCreateDatabaseDialog();
		diaContactDatabaseSteps.setLabel(databaseLabel);
		diaContactDatabaseSteps.setName(databaseName);
		diaContactDatabaseSteps.clickOnCancelButton();
	}
	
	@Test
	public void scenario2CreateVaildContactDatabase() throws Exception {
		diaContactDatabaseSteps.clickOnNewLink();
		diaContactDatabaseSteps.seeCreateDatabaseDialog();
		diaContactDatabaseSteps.setLabel(databaseLabel);
		diaContactDatabaseSteps.setName(databaseName);
		diaContactDatabaseSteps.clickOnNextButton();
		diaContactDatabaseSteps.create_First_Key_Field("Email", "email", "3", "254", "", "General");
		diaContactDatabaseSteps.clickOnNextButton();
		diaContactDatabaseSteps.clickOnAddFieldButton();
		diaContactDatabaseSteps.create_Field("Name", "string", "3", "254", "", "General");
		diaContactDatabaseSteps.clickOnNextButton();
		diaContactDatabaseSteps.clickOnAddFieldButton();
		diaContactDatabaseSteps.create_Field("Mobile", "mobile", "3", "16", "", "General");
		diaContactDatabaseSteps.clickOnNextButton();
		diaContactDatabaseSteps.clickOnFinishButton();
		Thread.sleep(5000);
		databaseId = diaContactDatabaseSteps.getcontactDatabasesAttribute();
		System.out.println("Database id = " + databaseId);
	}
	
	@Test
	public void scenario3EditContactDatabase() throws Exception {
		diaContactDatabaseSteps.selectContactDB();
		diaContactDatabaseSteps.clickOnEditButton();
		diaContactDatabaseSteps.onEditContactDatabasePage();
		//diaContactDatabaseSteps.verify_HeaderNameText(databaseLabel);
		diaContactDatabaseSteps.editLable("ABC SerenityBDD "+ databaseLabel);
		diaContactDatabaseSteps.editName("ABC SerenityBDD "+ databaseName);
		diaContactDatabaseSteps.clickOnSubmitButton();
	}
	
	@Test
	public void scenario4DeleteContactDatabase() throws Exception {
		diaContactDatabaseSteps.selectContactDB();
		diaContactDatabaseSteps.clickOnDeleteButton();
		diaContactDatabaseSteps.clickOnConfirmedButton();
		diaContactDatabaseSteps.clickOnDeleteBtn();
	}
	
	@After
	public void tearDown() throws Exception {
		driver.close();
	}
}
