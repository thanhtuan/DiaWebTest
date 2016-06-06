package com.tripolis.qa.dialogueweb.features.workspace;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;

import com.tripolis.qa.dialogueweb.steps.serenity.DiaContactDatabaseSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaLoginSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaWorkspaceSteps;

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
	private String workspaceLabel = "Dialogue Workspace Test "+ System.currentTimeMillis();
	private String workspaceName = "Dialogue Workspace Test "+ System.currentTimeMillis();
	private String workspaceId;	
	
	@Managed(uniqueSession = true)
	public WebDriver driver=null;
	
	@Steps
	DiaLoginSteps diaLoginSteps;
	
	@Steps
	public DiaContactDatabaseSteps diaContactDatabaseSteps;
	
	@Steps
	DiaWorkspaceSteps diaWorkspaceSteps;
	
	@Before
	public void setUp() {
		diaLoginSteps.is_the_login_page();
		diaLoginSteps.inputDataToLoginForm("haralds company", "telerik@tripolis.com", "Telerik1!");
		diaLoginSteps.clickonLoginButton();
		diaContactDatabaseSteps.navigateToAdministrationPage();
		diaContactDatabaseSteps.onAdministrationPage();
		//diaWorkspaceSteps.navigateToListWorkspacePage();
		//diaWorkspaceSteps.onListWorkspacesPage();
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
		diaWorkspaceSteps.navigateToListWorkspacePage();
		diaWorkspaceSteps.onListWorkspacesPage();
		diaWorkspaceSteps.clickOnNewLink();
		diaWorkspaceSteps.onCreateWorkspacesPage();
		diaWorkspaceSteps.setLabel(workspaceLabel);
		diaWorkspaceSteps.setName(workspaceName);
		diaWorkspaceSteps.selected_DB(databaseLabel);
		diaWorkspaceSteps.setPublicDomainNameLinkAndPage("");
		diaWorkspaceSteps.setPublicDomainNameImages("");
		diaWorkspaceSteps.setBounceDomainName("");
		diaWorkspaceSteps.clickOnSaveButton();
		Thread.sleep(1000);
		workspaceId = diaWorkspaceSteps.getcontentWorkspaceAttribute();
		System.out.println("Workspace id = " + workspaceId);
		diaWorkspaceSteps.navigateToListWorkspacePage();
	}
	
	@Test
	public void scenario2EditWorkspace() throws Exception {
		diaWorkspaceSteps.navigateToListWorkspacePage();
		diaWorkspaceSteps.onListWorkspacesPage();
		diaWorkspaceSteps.selectWorkspace();
		diaWorkspaceSteps.clickOnEditButton();
		diaWorkspaceSteps.onEditWorkspacesPage();
		diaWorkspaceSteps.editLabel("ABC SerenityBDD "+ "Dialogue Workspace Test "+ System.currentTimeMillis());
		diaWorkspaceSteps.editName("ABC SerenityBDD "+ "Dialogue Workspace Test "+ System.currentTimeMillis());
		diaWorkspaceSteps.checkcontactDatabaseState();
		diaWorkspaceSteps.editPublicDomainNameLinkAndPage("http://site.int.tripolis.com/");
		diaWorkspaceSteps.editPublicDomainNameImages("http://site.int.tripolis.com/");
		diaWorkspaceSteps.editBounceDomainName("");
		diaWorkspaceSteps.checked_AddListUnsubscribeHeader();
		diaWorkspaceSteps.clickOnSaveButtonEditPage();
		//Thread.sleep(10000);
	}
	
	@Test
	public void scenario3DeleteWorkspace() throws Exception {
		diaWorkspaceSteps.navigateToListWorkspacePage();
		diaWorkspaceSteps.onListWorkspacesPage();
		diaWorkspaceSteps.selectWorkspace();
		diaWorkspaceSteps.clickOnDeleteButton();
		diaWorkspaceSteps.clickOnConfirmedButton();
		diaWorkspaceSteps.clickOnDeleteBtn();
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
