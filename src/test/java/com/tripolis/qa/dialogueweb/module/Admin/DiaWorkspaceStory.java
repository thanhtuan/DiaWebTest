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
import com.tripolis.qa.dialogueweb.steps.serenity.DiaWorkspaceSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Story;

@RunWith(SerenityRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DiaWorkspaceStory {
	
	private String databaseName = "ABC Dialogue DB Test "+ System.currentTimeMillis();
	private String databaseLabel = "ABC Dialogue DB Test "+ System.currentTimeMillis();
	private String databaseId;
	private String workspaceLabel = "ABC Dialogue Workspace Test "+ System.currentTimeMillis();
	private String workspaceName = "ABC Dialogue Workspace Test "+ System.currentTimeMillis();
	private String workspaceId;	
	
	@Managed(uniqueSession = true)
	public WebDriver driver;
	
	@Steps
	public DiaLoginSteps diaLoginSteps;
	
	@Steps
	public DiaContactDatabaseSteps diaContactDatabaseSteps;
	
	@Steps
	DiaWorkspaceSteps diaWorkspaceSteps;
	
	@Before
	public void setUp() {
		diaLoginSteps.isOnLoginPage();
		diaLoginSteps.inputDataToLoginForm("Tripolis QA", "telerik@tripolis.com", "Telerik1!");
		diaLoginSteps.clickonLoginButton();
		diaLoginSteps.verifyClientName();
		diaContactDatabaseSteps.navigateToAdministrationPage();
		diaContactDatabaseSteps.onAdministrationPage();
	}
	
	@Test
	public void scenario1CreateBDForWorkspace() throws Exception {
		diaContactDatabaseSteps.navigateToListContactDatabasesPage();
		diaContactDatabaseSteps.onListContactDatabasesPage();
		diaContactDatabaseSteps.verifyheaderNameTextListContactDatabases();
		diaContactDatabaseSteps.clickOnNewLink();
		diaContactDatabaseSteps.seeCreateDatabaseDialog();
		diaContactDatabaseSteps.setLabel(databaseLabel);
		diaContactDatabaseSteps.setName(databaseName);
		diaContactDatabaseSteps.clickOnNextButton();
		diaContactDatabaseSteps.create_First_Key_Field("Email", "EMAIL", "3", "254", "", "General");
		diaContactDatabaseSteps.clickOnNextButton();
		diaContactDatabaseSteps.clickOnAddFieldButton();
		diaContactDatabaseSteps.create_Field("Name", "STRING", "3", "254", "", "General");
		diaContactDatabaseSteps.clickOnNextButton();
		diaContactDatabaseSteps.clickOnAddFieldButton();
		diaContactDatabaseSteps.create_Field("Mobile", "MOBILE", "3", "16", "", "General");
		diaContactDatabaseSteps.clickOnNextButton();
		diaContactDatabaseSteps.clickOnFinishButton();
		diaContactDatabaseSteps.verifyheaderNameTextListContactDatabases();
	}
	
	@Test
	public void scenario2CreateVaildWorkspace() throws Exception {
		diaWorkspaceSteps.navigateToListWorkspacePage();
		diaWorkspaceSteps.onListWorkspacesPage();
		diaWorkspaceSteps.verifyheaderNameTextListWorkspaces();
		Thread.sleep(1000);
		databaseId = diaContactDatabaseSteps.getcontactDatabasesAttribute();
		System.out.println("Database id = " + databaseId);
		diaWorkspaceSteps.clickOnNewLink();
		diaWorkspaceSteps.onCreateWorkspacesPage();
		diaWorkspaceSteps.setLabel(workspaceLabel);
		diaWorkspaceSteps.setName(workspaceName);
		diaWorkspaceSteps.selected_DB(databaseId);
		diaWorkspaceSteps.setPublicDomainNameLinkAndPage("");
		diaWorkspaceSteps.setPublicDomainNameImages("");
		diaWorkspaceSteps.setBounceDomainName("");
		diaWorkspaceSteps.setAddListUnsubscribeHeader(false);
		diaWorkspaceSteps.clickOnSaveButton();
		Thread.sleep(1000);
		workspaceId = diaWorkspaceSteps.getcontentWorkspaceAttribute();
		System.out.println("Workspace id = " + workspaceId);
		diaWorkspaceSteps.verifyheaderNameTextListWorkspaces();
		//diaWorkspaceSteps.navigateToListWorkspacePage();
	}
	
	@Test
	public void scenario3UpdateWorkspace() throws Exception {
		diaWorkspaceSteps.navigateToListWorkspacePage();
		diaWorkspaceSteps.onListWorkspacesPage();
		diaWorkspaceSteps.verifyheaderNameTextListWorkspaces();
		diaWorkspaceSteps.selectWorkspace();
		diaWorkspaceSteps.clickOnEditButton();
		diaWorkspaceSteps.onEditWorkspacesPage();
		diaWorkspaceSteps.verify_HeaderNameTextEditWorkspaces(workspaceLabel);
		diaWorkspaceSteps.editLabel("ABC SerenityBDD "+ "Dialogue Workspace Test "+ System.currentTimeMillis());
		diaWorkspaceSteps.editName("ABC SerenityBDD "+ "Dialogue Workspace Test "+ System.currentTimeMillis());
		diaWorkspaceSteps.checkcontactDatabaseState();
		diaWorkspaceSteps.editPublicDomainNameLinkAndPage("http://site.int.tripolis.com/");
		diaWorkspaceSteps.editPublicDomainNameImages("http://site.int.tripolis.com/");
		diaWorkspaceSteps.editBounceDomainName("");
		diaWorkspaceSteps.setAddListUnsubscribeHeader(true);
		diaWorkspaceSteps.clickOnSaveButtonEditPage();
		//Thread.sleep(1000);
	}
	
	@Test
	public void scenario4DeleteWorkspace() throws Exception {
		diaWorkspaceSteps.navigateToListWorkspacePage();
		diaWorkspaceSteps.onListWorkspacesPage();
		diaWorkspaceSteps.verifyheaderNameTextListWorkspaces();
		diaWorkspaceSteps.selectWorkspace();
		diaWorkspaceSteps.clickOnDeleteButton();
		diaWorkspaceSteps.verifyDeleteconfirmedMessage();
		diaWorkspaceSteps.clickOnConfirmedButton();
		diaWorkspaceSteps.clickOnDeleteBtn();
		diaWorkspaceSteps.verifyheaderNameTextListWorkspaces();	
	}
	
	@Test
	public void scenario5CleanUpDB() throws Exception {
		diaContactDatabaseSteps.navigateToListContactDatabasesPage();
		diaContactDatabaseSteps.onListContactDatabasesPage();
		diaContactDatabaseSteps.verifyheaderNameTextListContactDatabases();
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
