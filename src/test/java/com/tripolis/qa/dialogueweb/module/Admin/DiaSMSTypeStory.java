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
import com.tripolis.qa.dialogueweb.steps.serenity.DiaCreateSMSTypeDefinitionSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaCreateWorkspaceSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaEditSMSTypeDefinitionSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaHomeSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaListContactDatabasesSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaListSMSMessageTypeDefinitionsSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaListWorkspacesSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaLoginSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DiaSMSTypeStory {
	
	private String databaseName = "ABC Dialogue DB Test "+ System.currentTimeMillis();
	private String databaseLabel = "ABC Dialogue DB Test "+ System.currentTimeMillis();
	private String databaseId;
	private String workspaceLabel = "ABC Dialogue Workspace Test "+ System.currentTimeMillis();
	private String workspaceName = "ABC Dialogue Workspace Test "+ System.currentTimeMillis();
	private String workspaceId;
	private String smsName = "ABC Dialogue SMS Type Test "+ System.currentTimeMillis();
	private String smsLabel = "ABC Dialogue SMS Type Test "+ System.currentTimeMillis();
	private String smsId;
	
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
	public DiaListSMSMessageTypeDefinitionsSteps diaListSMSMessageTypeDefinitionsSteps;
	
	@Steps
	public DiaCreateSMSTypeDefinitionSteps diaCreateSMSTypeDefinitionSteps;
	
	@Steps
	public DiaEditSMSTypeDefinitionSteps diaEditSMSTypeDefinitionSteps;
	
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
	public void scenario1CreateDBForSMSType() throws Exception {
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
	public void scenario2CreateWorkSpaceForSMSType() throws Exception {
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
	public void scenario3GoTolistSMSTypeDefinitionsPage() throws Exception {
		diaAdministrationSteps.navigateToListWorkspacePage();
		diaListWorkspacesSteps.onListWorkspacesPage();
		diaListWorkspacesSteps.verifyheaderNameTextListWorkspaces();
		Thread.sleep(1000);
		databaseId = diaListContactDatabasesSteps.getcontactDatabasesAttribute();
		System.out.println("Database id = " + databaseId);
		workspaceId = diaListWorkspacesSteps.getcontentWorkspaceAttribute();
		System.out.println("Workspace id = " + workspaceId);
		diaListWorkspacesSteps.navigateToListSMSTypeDefinitions();
		diaListSMSMessageTypeDefinitionsSteps.onListSMSTypeDefinitionsPage();
		diaListSMSMessageTypeDefinitionsSteps.verifyheaderNameTextListSMSTypeDefinitions(workspaceLabel);
		diaListSMSMessageTypeDefinitionsSteps.clickOnNewLink();
		diaCreateSMSTypeDefinitionSteps.verifyheaderNameTextCreateSMSTypeDefinitions();
	}
	
	@Test
	public void scenario4CreateVaildSMSMesageType() throws Exception {
		diaAdministrationSteps.navigateToListWorkspacePage();
		diaListWorkspacesSteps.onListWorkspacesPage();
		diaListWorkspacesSteps.verifyheaderNameTextListWorkspaces();
		Thread.sleep(1000);
		databaseId = diaListContactDatabasesSteps.getcontactDatabasesAttribute();
		System.out.println("Database id = " + databaseId);
		workspaceId = diaListWorkspacesSteps.getcontentWorkspaceAttribute();
		System.out.println("Workspace id = " + workspaceId);
		diaListWorkspacesSteps.navigateToListSMSTypeDefinitions();
		diaListSMSMessageTypeDefinitionsSteps.onListSMSTypeDefinitionsPage();
		diaListSMSMessageTypeDefinitionsSteps.verifyheaderNameTextListSMSTypeDefinitions(workspaceLabel);
		diaListSMSMessageTypeDefinitionsSteps.clickOnNewLink();
		diaCreateSMSTypeDefinitionSteps.verifyheaderNameTextCreateSMSTypeDefinitions();
		diaCreateSMSTypeDefinitionSteps.setLabel(smsLabel);
		diaCreateSMSTypeDefinitionSteps.setName(smsName);
		diaCreateSMSTypeDefinitionSteps.setDefaultOriginatorNumber("18001095");
		diaCreateSMSTypeDefinitionSteps.setDefaultOriginator("Support");
		diaCreateSMSTypeDefinitionSteps.setMobilePhoneField("Mobile");
		diaCreateSMSTypeDefinitionSteps.setLongSMSEnabled(false);
		diaCreateSMSTypeDefinitionSteps.clickOnSaveButton();
		diaListSMSMessageTypeDefinitionsSteps.verifyheaderNameTextListSMSTypeDefinitions(workspaceLabel);
	}
	
	@Test
	public void scenario5UpdateSMSMesageType() throws Exception {
		diaAdministrationSteps.navigateToListWorkspacePage();
		diaListWorkspacesSteps.onListWorkspacesPage();
		diaListWorkspacesSteps.verifyheaderNameTextListWorkspaces();
		Thread.sleep(1000);
		databaseId = diaListContactDatabasesSteps.getcontactDatabasesAttribute();
		System.out.println("Database id = " + databaseId);
		workspaceId = diaListWorkspacesSteps.getcontentWorkspaceAttribute();
		System.out.println("Workspace id = " + workspaceId);
		diaListWorkspacesSteps.navigateToListSMSTypeDefinitions();
		diaListSMSMessageTypeDefinitionsSteps.onListSMSTypeDefinitionsPage();
		diaListSMSMessageTypeDefinitionsSteps.verifyheaderNameTextListSMSTypeDefinitions(workspaceLabel);
		diaListSMSMessageTypeDefinitionsSteps.selectSMSType();
		diaListSMSMessageTypeDefinitionsSteps.clickOnEditButton();
		diaEditSMSTypeDefinitionSteps.verifyheaderNameTextEditSMSType(smsLabel);
		diaEditSMSTypeDefinitionSteps.editLabel("AAA" + smsLabel);
		diaEditSMSTypeDefinitionSteps.checkSMSMesageNameState();
		diaEditSMSTypeDefinitionSteps.editDefaultOriginatorNumber("19002096");
		diaEditSMSTypeDefinitionSteps.editDefaultOriginator("SupportTeam");
		diaEditSMSTypeDefinitionSteps.editMobilePhoneField("Mobile");
		diaEditSMSTypeDefinitionSteps.editLongSMSEnabled(true);
		diaEditSMSTypeDefinitionSteps.clickOnSaveButton();
		diaListSMSMessageTypeDefinitionsSteps.verifyheaderNameTextListSMSTypeDefinitions(workspaceLabel);
	}
	
	@Test
	public void scenario6DeleteSMSMesageType() throws Exception {
		diaAdministrationSteps.navigateToListWorkspacePage();
		diaListWorkspacesSteps.onListWorkspacesPage();
		diaListWorkspacesSteps.verifyheaderNameTextListWorkspaces();
		Thread.sleep(1000);
		databaseId = diaListContactDatabasesSteps.getcontactDatabasesAttribute();
		System.out.println("Database id = " + databaseId);
		workspaceId = diaListWorkspacesSteps.getcontentWorkspaceAttribute();
		System.out.println("Workspace id = " + workspaceId);
		diaListWorkspacesSteps.navigateToListSMSTypeDefinitions();
		diaListSMSMessageTypeDefinitionsSteps.onListSMSTypeDefinitionsPage();
		diaListSMSMessageTypeDefinitionsSteps.verifyheaderNameTextListSMSTypeDefinitions(workspaceLabel);
		diaListSMSMessageTypeDefinitionsSteps.selectSMSType();
		diaListSMSMessageTypeDefinitionsSteps.clickOnDeleteButton();
		diaListSMSMessageTypeDefinitionsSteps.seeConfirmedPopup();
		diaListSMSMessageTypeDefinitionsSteps.verifyconfirmedMessage();
		diaListSMSMessageTypeDefinitionsSteps.clickOnConfirmedOkButton();
		diaListSMSMessageTypeDefinitionsSteps.verifyheaderNameTextListSMSTypeDefinitions(workspaceLabel);
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
