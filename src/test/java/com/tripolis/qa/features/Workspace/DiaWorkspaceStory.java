package com.tripolis.qa.features;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;

import com.tripolis.qa.steps.serenity.DiaContactDatabaseSteps;
import com.tripolis.qa.steps.serenity.DiaLoginSteps;
import com.tripolis.qa.steps.serenity.DiaWorkspaceSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DiaWorkspaceStory {
	
	private String databaseName = "Dialogue DB Test "+ System.currentTimeMillis();
	private String databaseLabel = "Dialogue DB Test "+ System.currentTimeMillis();
	private String databaseId;
	
	@Managed(uniqueSession = true)
	public WebDriver driver = null;
	
	@Steps
	DiaLoginSteps diaLoginSteps;
	
	@Steps
	public DiaContactDatabaseSteps diaContactDatabaseSteps;
	
	@Steps
	DiaWorkspaceSteps EndUser;
	
	@Before
	public void setUp() {
		diaLoginSteps.is_the_login_page();
		diaLoginSteps.enterDomain("haralds company");
		diaLoginSteps.enterUser("telerik@tripolis.com");
		diaLoginSteps.enterPass("Telerik1!");
		diaLoginSteps.clickonLoginButton();
		diaContactDatabaseSteps.navigateToAdministrationPage();
		diaContactDatabaseSteps.onAdministrationPage();
		//EndUser.navigateToListWorkspacePage();
		//EndUser.onListWorkspacesPage();
	}
	
	@Test
	public void scenario1CreateVaildWorkspace() throws Exception {
		diaContactDatabaseSteps.navigateToListContactDatabasesPage();
		diaContactDatabaseSteps.onListContactDatabasesPage();
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
		Thread.sleep(1000);
		databaseId = diaContactDatabaseSteps.getcontactDatabasesAttribute();
		System.out.println("Database id = " + databaseId);
		EndUser.navigateToListWorkspacePage();
		EndUser.onListWorkspacesPage();
		EndUser.clickOnNewLink();
		EndUser.onCreateWorkspacesPage();
		EndUser.setLabel("Dialogue Workspace Test "+ System.currentTimeMillis());
		EndUser.setName("Dialogue Workspace Test "+ System.currentTimeMillis());
		EndUser.selected_DB(databaseLabel);
		EndUser.setPublicDomainNameLinkAndPage("");
		EndUser.setPublicDomainNameImages("");
		EndUser.setBounceDomainName("");
		EndUser.clickOnSaveButton();
		Thread.sleep(1000);
		EndUser.navigateToListWorkspacePage();
	}
	
	@Test
	public void scenario2EditWorkspace() throws Exception {
		EndUser.navigateToListWorkspacePage();
		EndUser.onListWorkspacesPage();
		EndUser.selectWorkspace();
		EndUser.clickOnEditButton();
		EndUser.onEditWorkspacesPage();
		EndUser.editLabel("ABC SerenityBDD "+ "Dialogue Workspace Test "+ System.currentTimeMillis());
		EndUser.editName("ABC SerenityBDD "+ "Dialogue Workspace Test "+ System.currentTimeMillis());
		EndUser.checkcontactDatabaseState();
		EndUser.editPublicDomainNameLinkAndPage("http://site.int.tripolis.com/");
		EndUser.editPublicDomainNameImages("http://site.int.tripolis.com/");
		EndUser.editBounceDomainName("");
		EndUser.checked_AddListUnsubscribeHeader();
		EndUser.clickOnSaveButtonEditPage();
		//Thread.sleep(10000);
	}
	
	@Test
	public void scenario3DeleteWorkspace() throws Exception {
		EndUser.navigateToListWorkspacePage();
		EndUser.onListWorkspacesPage();
		EndUser.selectWorkspace();
		EndUser.clickOnDeleteButton();
		EndUser.clickOnConfirmedButton();
		EndUser.clickOnDeleteBtn();
		Thread.sleep(1000);
		diaContactDatabaseSteps.navigateToListContactDatabasesPage();
		diaContactDatabaseSteps.onListContactDatabasesPage();
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
