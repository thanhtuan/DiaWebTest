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
import com.tripolis.qa.dialogueweb.steps.serenity.DiaCreateEmailTypeDefinitionSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaCreateWorkspaceSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaEditEmailTypeDefinitionSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaHomeSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaListContactDatabasesSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaListEmailTypeDefinitionsSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaListWorkspacesSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaLoginSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Steps;

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
	public DiaHomeSteps diaHomeSteps;
	
	@Steps
	public DiaAdministrationSteps diaAdministrationSteps;
	
	@Steps
	public DiaListContactDatabasesSteps diaListContactDatabasesSteps;
	
	@Steps
	public DiaContactDatabaseWizardSteps diaContactDatabaseWizardSteps;
	
	@Steps
	DiaListWorkspacesSteps diaListWorkspacesSteps;
	
	@Steps
	DiaCreateWorkspaceSteps diaCreateWorkspaceSteps;
	
	@Steps
	public DiaListEmailTypeDefinitionsSteps diaListEmailTypeDefinitionsSteps;
	
	@Steps
	public DiaCreateEmailTypeDefinitionSteps diaCreateEmailTypeDefinitionSteps;
	
	@Steps
	public DiaEditEmailTypeDefinitionSteps diaEditEmailTypeDefinitionSteps;
	
	
	@Before
	public void setUp() {
		diaLoginSteps.isOnLoginPage();
		diaLoginSteps.inputDataToLoginForm("Tripolis QA", "telerik@tripolis.com", "Telerik1!");
		diaLoginSteps.clickonLoginButton();	
		diaLoginSteps.verifyClientName();
		diaHomeSteps.navigateToAdministrationPage();
		diaAdministrationSteps.onAdministrationPage();
	}
	
	@Test
	public void scenario1CreateDBForDirectEmailType() throws Exception {
		diaAdministrationSteps.navigateToListContactDatabasesPage();
		diaListContactDatabasesSteps.onListContactDatabasesPage();
		diaListContactDatabasesSteps.verifyheaderNameTextListContactDatabases();
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
		diaListContactDatabasesSteps.verifyheaderNameTextListContactDatabases();
	}
	
	@Test
	public void scenario2CreateWorkSpaceForDirectEmailType() throws Exception {
		diaAdministrationSteps.navigateToListWorkspacePage();
		diaListWorkspacesSteps.onListWorkspacesPage();
		diaListWorkspacesSteps.verifyheaderNameTextListWorkspaces();
		Thread.sleep(1000);
		databaseId = diaListContactDatabasesSteps.getcontactDatabasesAttribute();
		System.out.println("Database id = " + databaseId);
		diaListWorkspacesSteps.clickOnNewLink();
		diaCreateWorkspaceSteps.onCreateWorkspacesPage();
		diaCreateWorkspaceSteps.verifyheaderNameTextCreateWorkspaces();
		diaCreateWorkspaceSteps.setLabel(workspaceLabel);
		diaCreateWorkspaceSteps.setName(workspaceName);
		diaCreateWorkspaceSteps.selected_DB(databaseId);
		diaCreateWorkspaceSteps.setPublicDomainNameLinkAndPage("");
		diaCreateWorkspaceSteps.setPublicDomainNameImages("");
		diaCreateWorkspaceSteps.setBounceDomainName("");
		diaCreateWorkspaceSteps.setAddListUnsubscribeHeader(true);
		diaCreateWorkspaceSteps.clickOnSaveButton();
		diaListWorkspacesSteps.verifyheaderNameTextListWorkspaces();
	}
	
	@Test
	public void scenario3GoTolistEmailTypeDefinitionsPage() throws Exception {
		diaAdministrationSteps.navigateToListWorkspacePage();
		diaListWorkspacesSteps.onListWorkspacesPage();
		diaListWorkspacesSteps.verifyheaderNameTextListWorkspaces();
		Thread.sleep(1000);
		databaseId = diaListContactDatabasesSteps.getcontactDatabasesAttribute();
		System.out.println("Database id = " + databaseId);
		workspaceId = diaListWorkspacesSteps.getcontentWorkspaceAttribute();
		System.out.println("Workspace id = " + workspaceId);
		diaListWorkspacesSteps.navigateToListEmailTypeDefinitions();
		diaListEmailTypeDefinitionsSteps.onListEmailTypeDefinitionsPage();
		diaListEmailTypeDefinitionsSteps.verifyheaderNameTextListEmailTypeDefinitions(workspaceLabel);
		diaListEmailTypeDefinitionsSteps.clickOnNewLink();
		diaCreateEmailTypeDefinitionSteps.verifyheaderNameTextCreateEmailTypeDefinitions();
	}
	
	@Test
	public void scenario4CreateVaildDirectEmailType() throws Exception {
		diaAdministrationSteps.navigateToListWorkspacePage();
		diaListWorkspacesSteps.onListWorkspacesPage();
		diaListWorkspacesSteps.verifyheaderNameTextListWorkspaces();
		Thread.sleep(1000);
		databaseId = diaListContactDatabasesSteps.getcontactDatabasesAttribute();
		System.out.println("Database id = " + databaseId);
		workspaceId = diaListWorkspacesSteps.getcontentWorkspaceAttribute();
		System.out.println("Workspace id = " + workspaceId);
		diaListWorkspacesSteps.navigateToListEmailTypeDefinitions();
		diaListEmailTypeDefinitionsSteps.onListEmailTypeDefinitionsPage();
		diaListEmailTypeDefinitionsSteps.verifyheaderNameTextListEmailTypeDefinitions(workspaceLabel);
		diaListEmailTypeDefinitionsSteps.clickOnNewLink();
		diaCreateEmailTypeDefinitionSteps.onCreateDirectEmailTypePage();
		diaCreateEmailTypeDefinitionSteps.verifyheaderNameTextCreateEmailTypeDefinitions();
		diaCreateEmailTypeDefinitionSteps.setLabel(directemailName);
		diaCreateEmailTypeDefinitionSteps.setName(directemailLabel);
		diaCreateEmailTypeDefinitionSteps.setFromAddress("telerik@tripolis.com");
		diaCreateEmailTypeDefinitionSteps.setFromName("Telerik");
		diaCreateEmailTypeDefinitionSteps.setReplyToAddress("mimo@tripolis.com");
		diaCreateEmailTypeDefinitionSteps.setExternalHtmlUrl("http://site.int.tripolis.com/~site/import_features/webimporter/basic_email.html");
		diaCreateEmailTypeDefinitionSteps.setExternalTextUrl("http://site.int.tripolis.com/~site/import_features/webimporter/basic_email.html");
		diaCreateEmailTypeDefinitionSteps.setTinyMceEnabled(true);
		diaCreateEmailTypeDefinitionSteps.setEmailField("Email");
		diaCreateEmailTypeDefinitionSteps.setCharacterSetEncoding("ISO8859_1");
		diaCreateEmailTypeDefinitionSteps.setAttachmentEnabled(false);
		diaCreateEmailTypeDefinitionSteps.setExternalAttachmentEnabled(false);
		diaCreateEmailTypeDefinitionSteps.clickOnSaveButton();
		diaEditEmailTypeDefinitionSteps.verifyheaderNameTextEditDirectEmailType(directemailLabel);
	}
	
	@Test
	public void scenario5UpdateDirectEmailType() throws Exception {
		diaAdministrationSteps.navigateToListWorkspacePage();
		diaListWorkspacesSteps.onListWorkspacesPage();
		diaListWorkspacesSteps.verifyheaderNameTextListWorkspaces();
		Thread.sleep(1000);
		databaseId = diaListContactDatabasesSteps.getcontactDatabasesAttribute();
		System.out.println("Database id = " + databaseId);
		workspaceId = diaListWorkspacesSteps.getcontentWorkspaceAttribute();
		System.out.println("Workspace id = " + workspaceId);
		diaListWorkspacesSteps.navigateToListEmailTypeDefinitions();
		diaListEmailTypeDefinitionsSteps.onListEmailTypeDefinitionsPage();
		diaListEmailTypeDefinitionsSteps.verifyheaderNameTextListEmailTypeDefinitions(workspaceLabel);
		diaListEmailTypeDefinitionsSteps.selectEmailType();
		diaListEmailTypeDefinitionsSteps.clickOnEditButton();
		diaEditEmailTypeDefinitionSteps.onEditDirectEmailTypePage();
		diaEditEmailTypeDefinitionSteps.verifyheaderNameTextEditDirectEmailType(directemailLabel);
		diaEditEmailTypeDefinitionSteps.editLabel("AAA" + directemailName);
		diaEditEmailTypeDefinitionSteps.checkDirectEmailTypeNameState();
		diaEditEmailTypeDefinitionSteps.editFromAddress("tuan.tran@tripolis.com");
		diaEditEmailTypeDefinitionSteps.editFromName("Tuan Tran");
		diaEditEmailTypeDefinitionSteps.editReplyToAddress("tuan.tran@tripolis.com");
		diaEditEmailTypeDefinitionSteps.editExternalHtmlUrl("http://site.int.tripolis.com/~site/import_features/webimporter/basic_email.html");
		diaEditEmailTypeDefinitionSteps.editExternalTextUrl("http://site.int.tripolis.com/~site/import_features/webimporter/basic_email.html");
		diaEditEmailTypeDefinitionSteps.editTinyMceEnabled(true);
		diaEditEmailTypeDefinitionSteps.editEmailField("Email");
		diaEditEmailTypeDefinitionSteps.editCharacterSetEncoding("UTF8");
		diaEditEmailTypeDefinitionSteps.editAttachmentEnabled(true);
		diaEditEmailTypeDefinitionSteps.editExternalAttachmentEnabled(true);
		diaEditEmailTypeDefinitionSteps.clickOnSaveButton();
		diaListEmailTypeDefinitionsSteps.verifyheaderNameTextListEmailTypeDefinitions(workspaceLabel);
	}
	
	@Test
	public void scenario6DeleteDirectEmailType() throws Exception {
		diaAdministrationSteps.navigateToListWorkspacePage();
		diaListWorkspacesSteps.onListWorkspacesPage();
		diaListWorkspacesSteps.verifyheaderNameTextListWorkspaces();
		Thread.sleep(1000);
		databaseId = diaListContactDatabasesSteps.getcontactDatabasesAttribute();
		System.out.println("Database id = " + databaseId);
		workspaceId = diaListWorkspacesSteps.getcontentWorkspaceAttribute();
		System.out.println("Workspace id = " + workspaceId);
		diaListWorkspacesSteps.navigateToListEmailTypeDefinitions();
		diaListEmailTypeDefinitionsSteps.onListEmailTypeDefinitionsPage();
		diaListEmailTypeDefinitionsSteps.verifyheaderNameTextListEmailTypeDefinitions(workspaceLabel);
		diaListEmailTypeDefinitionsSteps.selectEmailType();
		diaListEmailTypeDefinitionsSteps.clickOnDeleteButton();
		diaListEmailTypeDefinitionsSteps.seeConfirmedPopup();
		diaListEmailTypeDefinitionsSteps.verifyconfirmedMessage();
		diaListEmailTypeDefinitionsSteps.clickOnConfirmedOkButton();
		diaListEmailTypeDefinitionsSteps.verifyheaderNameTextListEmailTypeDefinitions(workspaceLabel);
	}
	
	@Test
	public void scenario7CleanUpWorkSpace() throws Exception {
		diaAdministrationSteps.navigateToListWorkspacePage();
		diaListWorkspacesSteps.onListWorkspacesPage();
		diaListWorkspacesSteps.verifyheaderNameTextListWorkspaces();		
		diaListWorkspacesSteps.selectWorkspace();
		diaListWorkspacesSteps.clickOnDeleteButton();
		diaListWorkspacesSteps.verifyDeleteconfirmedMessage();
		diaListWorkspacesSteps.clickOnConfirmedButton();
		diaListWorkspacesSteps.clickOnDeleteBtn();
		diaListWorkspacesSteps.verifyheaderNameTextListWorkspaces();	
	}
	
	@Test
	public void scenario8CleanUpDB() throws Exception {
		diaAdministrationSteps.navigateToListContactDatabasesPage();
		diaListContactDatabasesSteps.onListContactDatabasesPage();
		diaListContactDatabasesSteps.verifyheaderNameTextListContactDatabases();
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
