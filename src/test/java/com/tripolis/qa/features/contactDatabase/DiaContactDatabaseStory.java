package com.tripolis.qa.features.contactDatabase;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;

import org.openqa.selenium.WebDriver;

import com.tripolis.qa.steps.serenity.DiaContactDatabaseSteps;
import com.tripolis.qa.steps.serenity.DiaLoginSteps;

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
    public WebDriver driver = null;
	
	@Steps
	DiaLoginSteps diaLoginSteps;
	
	@Steps
	public DiaContactDatabaseSteps EndUser;
	
	@Before
	public void setUp() throws InterruptedException {
		//EndUser.loginToDia("haralds company", "telerik@tripolis.com", );
		diaLoginSteps.is_the_login_page();
		diaLoginSteps.enterDomain("haralds company");
		diaLoginSteps.enterUser("telerik@tripolis.com");
		diaLoginSteps.enterPass("Telerik1!");
		diaLoginSteps.clickonLoginButton();
		EndUser.navigateToAdministrationPage();
		EndUser.onAdministrationPage();
		EndUser.navigateToListContactDatabasesPage();
		EndUser.onListContactDatabasesPage();
	}
	
	@Test
	public void scenario1ClickOnCancelButtonCreateContactDatabase() {
		EndUser.clickOnNewLink();
		EndUser.seeCreateDatabaseDialog();
		EndUser.setLabel(databaseLabel);
		EndUser.setName(databaseName);
		EndUser.clickOnCancelButton();
	}
	
	@Test
	public void scenario2CreateVaildContactDatabase() throws Exception {
		EndUser.clickOnNewLink();
		EndUser.seeCreateDatabaseDialog();
		EndUser.setLabel(databaseLabel);
		EndUser.setName(databaseName);
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
		databaseId = EndUser.getcontactDatabasesAttribute();
		System.out.println("Database id = " + databaseId);
	}
	
	@Test
	public void scenario3EditContactDatabase() throws Exception {
		EndUser.selectContactDB();
		EndUser.clickOnEditButton();
		EndUser.onEditContactDatabasePage();
		//EndUser.verify_HeaderNameText(databaseLabel);
		EndUser.editLable("ABC SerenityBDD "+ databaseLabel);
		EndUser.editName("ABC SerenityBDD "+ databaseName);
		EndUser.clickOnSubmitButton();
	}
	
	@Test
	public void scenario4DeleteContactDatabase() throws Exception {
		EndUser.selectContactDB();
		EndUser.clickOnDeleteButton();
		EndUser.clickOnConfirmedButton();
		EndUser.clickOnDeleteBtn();
	}
	
	@After
	public void tearDown() throws Exception {
		driver.close();
	}
}
