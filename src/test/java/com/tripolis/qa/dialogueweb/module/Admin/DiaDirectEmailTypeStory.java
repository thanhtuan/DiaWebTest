package com.tripolis.qa.dialogueweb.module.Admin;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;

import com.tripolis.qa.dialogueweb.steps.serenity.DiaContactDatabaseSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaDirectEmailTypeSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaLoginSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaWorkspaceSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Story;

@RunWith(SerenityRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DiaDirectEmailTypeStory {

	private String databaseName = "ABC Dialogue DB Test "+ System.currentTimeMillis();
	private String databaseLabel = "ABC Dialogue DB Test "+ System.currentTimeMillis();
	private String databaseId;
	private String workspaceLabel = "ABC Dialogue Workspace Test "+ System.currentTimeMillis();
	private String workspaceName = "Dialogue Workspace Test "+ System.currentTimeMillis();
	private String workspaceId;
	private String directemailName = "ABC Dialogue Direct Email Test "+ System.currentTimeMillis();
	private String directemailLabel = "ABC Dialogue Direct Email Test "+ System.currentTimeMillis();
	private String directemailId;
	
	@Managed(uniqueSession = true)
	public WebDriver driver;
	
	@Steps
	public DiaLoginSteps diaLoginSteps;
	
	@Steps
	public DiaContactDatabaseSteps diaContactDatabaseSteps;
	
	@Steps
	public DiaWorkspaceSteps diaWorkspaceSteps;
	
	@Steps
	public DiaDirectEmailTypeSteps diaDirectEmailTypeSteps;
	
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
	public void scenario1CreateDBForDirectEmailType() throws Exception {
		diaContactDatabaseSteps.navigateToListContactDatabasesPage();
		diaContactDatabaseSteps.onListContactDatabasesPage();
		diaContactDatabaseSteps.verifyheaderNameTextListContactDatabases();
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
		diaContactDatabaseSteps.verifyheaderNameTextListContactDatabases();
	}
	
	@Test
	public void scenario2CreateWorkSpaceForDirectEmailType() throws Exception {
		diaWorkspaceSteps.navigateToListWorkspacePage();
		diaWorkspaceSteps.onListWorkspacesPage();
		diaWorkspaceSteps.verifyheaderNameTextListWorkspaces();
		Thread.sleep(1000);
		databaseId = diaContactDatabaseSteps.getcontactDatabasesAttribute();
		System.out.println("Database id = " + databaseId);
		diaWorkspaceSteps.clickOnNewLink();
		diaWorkspaceSteps.onCreateWorkspacesPage();
		diaWorkspaceSteps.verifyheaderNameTextCreateWorkspaces();
		diaWorkspaceSteps.setLabel(workspaceLabel);
		diaWorkspaceSteps.setName(workspaceName);
		diaWorkspaceSteps.selected_DB(databaseId);
		diaWorkspaceSteps.setPublicDomainNameLinkAndPage("");
		diaWorkspaceSteps.setPublicDomainNameImages("");
		diaWorkspaceSteps.setBounceDomainName("");
		diaWorkspaceSteps.setAddListUnsubscribeHeader(true);
		diaWorkspaceSteps.clickOnSaveButton();
		diaWorkspaceSteps.verifyheaderNameTextListWorkspaces();
	}
	
	@Test
	public void scenario3GoTolistEmailTypeDefinitionsPage() throws Exception {
		diaWorkspaceSteps.navigateToListWorkspacePage();
		diaWorkspaceSteps.onListWorkspacesPage();
		diaWorkspaceSteps.verifyheaderNameTextListWorkspaces();
		Thread.sleep(1000);
		databaseId = diaContactDatabaseSteps.getcontactDatabasesAttribute();
		System.out.println("Database id = " + databaseId);
		workspaceId = diaWorkspaceSteps.getcontentWorkspaceAttribute();
		System.out.println("Workspace id = " + workspaceId);
		diaDirectEmailTypeSteps.navigateToListEmailTypeDefinitions();
		diaDirectEmailTypeSteps.onListEmailTypeDefinitionsPage(workspaceId);
		diaDirectEmailTypeSteps.verifyheaderNameTextListEmailTypeDefinitions(workspaceLabel);
		diaDirectEmailTypeSteps.clickOnNewLink();
		diaDirectEmailTypeSteps.verifyheaderNameTextCreateEmailTypeDefinitions();
	}
	
	@Test
	public void scenario4CreateVaildDirectEmailType() throws Exception {
		diaWorkspaceSteps.navigateToListWorkspacePage();
		diaWorkspaceSteps.onListWorkspacesPage();
		diaWorkspaceSteps.verifyheaderNameTextListWorkspaces();
		Thread.sleep(1000);
		databaseId = diaContactDatabaseSteps.getcontactDatabasesAttribute();
		System.out.println("Database id = " + databaseId);
		workspaceId = diaWorkspaceSteps.getcontentWorkspaceAttribute();
		System.out.println("Workspace id = " + workspaceId);
		diaDirectEmailTypeSteps.navigateToListEmailTypeDefinitions();
		diaDirectEmailTypeSteps.onListEmailTypeDefinitionsPage(workspaceId);
		diaDirectEmailTypeSteps.verifyheaderNameTextListEmailTypeDefinitions(workspaceLabel);
		diaDirectEmailTypeSteps.clickOnNewLink();
		diaDirectEmailTypeSteps.verifyheaderNameTextCreateEmailTypeDefinitions();
		diaDirectEmailTypeSteps.setLabel(directemailName);
		diaDirectEmailTypeSteps.setName(directemailLabel);
		diaDirectEmailTypeSteps.setFromAddress("telerik@tripolis.com");
		diaDirectEmailTypeSteps.setFromName("Telerik");
		diaDirectEmailTypeSteps.setReplyToAddress("mimo@tripolis.com");
		diaDirectEmailTypeSteps.setExternalHtmlUrl("http://site.int.tripolis.com/~site/import_features/webimporter/basic_email.html");
		diaDirectEmailTypeSteps.setExternalTextUrl("http://site.int.tripolis.com/~site/import_features/webimporter/basic_email.html");
		diaDirectEmailTypeSteps.setTinyMceEnabled(true);
		diaDirectEmailTypeSteps.selected_EmailField("Email");
		diaDirectEmailTypeSteps.selected_CharacterSetEncoding("ISO8859_1");
		diaDirectEmailTypeSteps.setAttachmentEnabled(false);
		diaDirectEmailTypeSteps.setExternalAttachmentEnabled(false);
		diaDirectEmailTypeSteps.clickOnSaveButton();
		diaDirectEmailTypeSteps.verifyheaderNameTextEditDirectEmailType(directemailLabel);
	}
	
	@Test
	public void scenario5UpdateDirectEmailType() throws Exception {
		diaWorkspaceSteps.navigateToListWorkspacePage();
		diaWorkspaceSteps.onListWorkspacesPage();
		diaWorkspaceSteps.verifyheaderNameTextListWorkspaces();
		Thread.sleep(1000);
		databaseId = diaContactDatabaseSteps.getcontactDatabasesAttribute();
		System.out.println("Database id = " + databaseId);
		workspaceId = diaWorkspaceSteps.getcontentWorkspaceAttribute();
		System.out.println("Workspace id = " + workspaceId);
		diaDirectEmailTypeSteps.navigateToListEmailTypeDefinitions();
		diaDirectEmailTypeSteps.onListEmailTypeDefinitionsPage(workspaceId);
		diaDirectEmailTypeSteps.verifyheaderNameTextListEmailTypeDefinitions(workspaceLabel);
		diaDirectEmailTypeSteps.selectEmailType();
		diaDirectEmailTypeSteps.clickOnEditButton();
		diaDirectEmailTypeSteps.verifyheaderNameTextEditDirectEmailType(directemailLabel);
		diaDirectEmailTypeSteps.setLabel("AAA" + directemailName);
		diaDirectEmailTypeSteps.checkDirectEmailTypeNameState();
		diaDirectEmailTypeSteps.setFromAddress("tuan.tran@tripolis.com");
		diaDirectEmailTypeSteps.setFromName("Tuan Tran");
		diaDirectEmailTypeSteps.setReplyToAddress("tuan.tran@tripolis.com");
		diaDirectEmailTypeSteps.setExternalHtmlUrl("http://site.int.tripolis.com/~site/import_features/webimporter/basic_email.html");
		diaDirectEmailTypeSteps.setExternalTextUrl("http://site.int.tripolis.com/~site/import_features/webimporter/basic_email.html");
		diaDirectEmailTypeSteps.setTinyMceEnabled(true);
		diaDirectEmailTypeSteps.selected_EmailField("Email");
		diaDirectEmailTypeSteps.selected_CharacterSetEncoding("UTF8");
		diaDirectEmailTypeSteps.setAttachmentEnabled(true);
		diaDirectEmailTypeSteps.setExternalAttachmentEnabled(true);
		diaDirectEmailTypeSteps.clickOnSaveButton();
		diaDirectEmailTypeSteps.verifyheaderNameTextListEmailTypeDefinitions(workspaceLabel);
	}
	
	@Test
	public void scenario6DeleteDirectEmailType() throws Exception {
		diaWorkspaceSteps.navigateToListWorkspacePage();
		diaWorkspaceSteps.onListWorkspacesPage();
		diaWorkspaceSteps.verifyheaderNameTextListWorkspaces();
		Thread.sleep(1000);
		databaseId = diaContactDatabaseSteps.getcontactDatabasesAttribute();
		System.out.println("Database id = " + databaseId);
		workspaceId = diaWorkspaceSteps.getcontentWorkspaceAttribute();
		System.out.println("Workspace id = " + workspaceId);
		diaDirectEmailTypeSteps.navigateToListEmailTypeDefinitions();
		diaDirectEmailTypeSteps.onListEmailTypeDefinitionsPage(workspaceId);
		diaDirectEmailTypeSteps.verifyheaderNameTextListEmailTypeDefinitions(workspaceLabel);
		diaDirectEmailTypeSteps.selectEmailType();
		diaDirectEmailTypeSteps.clickOnDeleteButton();
		diaDirectEmailTypeSteps.seeConfirmedPopup();
		diaDirectEmailTypeSteps.verifyconfirmedMessage();
		diaDirectEmailTypeSteps.clickOnConfirmedOkButton();
		diaDirectEmailTypeSteps.verifyheaderNameTextListEmailTypeDefinitions(workspaceLabel);
	}
	
	@Test
	public void scenario7CleanUpWorkSpace() throws Exception {
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
	public void scenario8CleanUpDB() throws Exception {
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
