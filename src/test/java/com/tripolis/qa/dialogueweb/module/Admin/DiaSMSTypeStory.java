package com.tripolis.qa.dialogueweb.module.Admin;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
	
	private static String databaseName = "Test DB "+ System.currentTimeMillis();
	private static String databaseLabel = "Test DB "+ System.currentTimeMillis();
	private String databaseId;
	private String BDlabel;
	private static String workspaceLabel = "Test Workspace "+ System.currentTimeMillis();
	private static String workspaceName = "Test Workspace "+ System.currentTimeMillis();
	private String workspaceId;	
	private String WSlabel;
	private static String smsName = "Test SMS Type "+ System.currentTimeMillis();
	private static String smsLabel = "Test SMS Type "+ System.currentTimeMillis();
			
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
	public void scenario1_CreateContactDatabaseForDiaSMSTypeStory() {		
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
		diaContactDatabaseWizardSteps.create_Field("Name", "STRING", "3", "254", "", false, false, true, "General");
		diaContactDatabaseWizardSteps.clickOnNextButton();
		diaContactDatabaseWizardSteps.verifyheaderNameTextCreateDatabaseDialogOverview();
		diaContactDatabaseWizardSteps.verify_DatabaseLabelText(databaseLabel);
		diaContactDatabaseWizardSteps.clickOnAddFieldButton();
		diaContactDatabaseWizardSteps.create_Field("Mobile", "MOBILE", "3", "16", "", false, false, true, "General");
		diaContactDatabaseWizardSteps.clickOnNextButton();
		diaContactDatabaseWizardSteps.verifyheaderNameTextCreateDatabaseDialogOverview();
		diaContactDatabaseWizardSteps.verify_DatabaseLabelText(databaseLabel);
		diaContactDatabaseWizardSteps.clickOnFinishButton();
		diaListContactDatabasesSteps.verifyheaderNameTextListContactDatabases();
	}
	
	@Test
	public void scenario2_CreateWorkSpaceForDiaSMSTypeStory() {
		diaAdministrationSteps.navigateToListWorkspacePage();
		diaListWorkspacesSteps.onListWorkspacesPage();
		diaListWorkspacesSteps.verifyheaderNameTextListWorkspaces();
		databaseId = diaListContactDatabasesSteps.getcontactDatabasesAttribute();
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
	public void scenario3_GoTolistSMSTypeDefinitionsPage() {
		diaAdministrationSteps.navigateToListWorkspacePage();
		diaListWorkspacesSteps.onListWorkspacesPage();
		diaListWorkspacesSteps.verifyheaderNameTextListWorkspaces();
		diaListWorkspacesSteps.navigateToListSMSTypeDefinitions();
		diaListSMSMessageTypeDefinitionsSteps.onListSMSTypeDefinitionsPage();
		diaListSMSMessageTypeDefinitionsSteps.verifyheaderNameTextListSMSTypeDefinitions(workspaceLabel);
		diaListSMSMessageTypeDefinitionsSteps.clickOnNewLink();
		diaCreateSMSTypeDefinitionSteps.verifyheaderNameTextCreateSMSTypeDefinitions();
	}
	
	@Test
	public void scenario4_CreateSMSMesageType() {
		diaAdministrationSteps.navigateToListWorkspacePage();
		diaListWorkspacesSteps.onListWorkspacesPage();
		diaListWorkspacesSteps.verifyheaderNameTextListWorkspaces();
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
	public void scenario5_UpdateSMSMesageType() {
		diaAdministrationSteps.navigateToListWorkspacePage();
		diaListWorkspacesSteps.onListWorkspacesPage();
		diaListWorkspacesSteps.verifyheaderNameTextListWorkspaces();
		diaListWorkspacesSteps.navigateToListSMSTypeDefinitions();
		diaListSMSMessageTypeDefinitionsSteps.onListSMSTypeDefinitionsPage();
		diaListSMSMessageTypeDefinitionsSteps.verifyheaderNameTextListSMSTypeDefinitions(workspaceLabel);
		diaListSMSMessageTypeDefinitionsSteps.selectSMSType(smsLabel);
		diaListSMSMessageTypeDefinitionsSteps.clickOnEditButton();
		diaEditSMSTypeDefinitionSteps.verifyheaderNameTextEditSMSType(smsLabel);
		diaEditSMSTypeDefinitionSteps.editLabel("Serenity " + smsLabel);
		diaEditSMSTypeDefinitionSteps.checkSMSMesageNameState();
		diaEditSMSTypeDefinitionSteps.editDefaultOriginatorNumber("19002096");
		diaEditSMSTypeDefinitionSteps.editDefaultOriginator("SupportTeam");
		diaEditSMSTypeDefinitionSteps.editMobilePhoneField("Mobile");
		diaEditSMSTypeDefinitionSteps.editLongSMSEnabled(true);
		diaEditSMSTypeDefinitionSteps.clickOnSaveButton();
		diaListSMSMessageTypeDefinitionsSteps.verifyheaderNameTextListSMSTypeDefinitions(workspaceLabel);
	}
	
	@Test
	public void scenario6_DeleteSMSMesageType() {
		diaAdministrationSteps.navigateToListWorkspacePage();
		diaListWorkspacesSteps.onListWorkspacesPage();
		diaListWorkspacesSteps.verifyheaderNameTextListWorkspaces();
		diaListWorkspacesSteps.navigateToListSMSTypeDefinitions();
		diaListSMSMessageTypeDefinitionsSteps.onListSMSTypeDefinitionsPage();
		diaListSMSMessageTypeDefinitionsSteps.verifyheaderNameTextListSMSTypeDefinitions(workspaceLabel);
		diaListSMSMessageTypeDefinitionsSteps.selectSMSType("Serenity " + smsLabel);
		diaListSMSMessageTypeDefinitionsSteps.clickOnDeleteButton();
		diaListSMSMessageTypeDefinitionsSteps.seeDeleteConfirmedPopup();
		diaListSMSMessageTypeDefinitionsSteps.verifyconfirmedMessage();
		diaListSMSMessageTypeDefinitionsSteps.clickOnConfirmedOkButton();
		diaListSMSMessageTypeDefinitionsSteps.verifyheaderNameTextListSMSTypeDefinitions(workspaceLabel);
	}
	
	@Test
	public void scenario7_CleanUpWorkSpaceDiaSMSTypeStory() {
		diaAdministrationSteps.navigateToListWorkspacePage();
		diaListWorkspacesSteps.onListWorkspacesPage();
		diaListWorkspacesSteps.verifyheaderNameTextListWorkspaces();		
		WSlabel = diaListWorkspacesSteps.getcontentWorkspaceLabel();
		diaListWorkspacesSteps.selectWorkspace(WSlabel);
		diaListWorkspacesSteps.clickOnDeleteButton();
		diaListWorkspacesSteps.verifyDeleteconfirmedMessage();
		diaListWorkspacesSteps.clickOnConfirmedButton();
		diaListWorkspacesSteps.clickOnDeleteBtn();
		diaListWorkspacesSteps.verifyheaderNameTextListWorkspaces();	
	}
	
	@Test
	public void scenario8_CleanUpContactDatabaseDiaSMSTypeStory() {
		diaAdministrationSteps.navigateToListContactDatabasesPage();
		diaListContactDatabasesSteps.onListContactDatabasesPage();
		diaListContactDatabasesSteps.verifyheaderNameTextListContactDatabases();
		BDlabel = diaListContactDatabasesSteps.getcontactDatabasesLabel();
		diaListContactDatabasesSteps.selectContactDB(BDlabel);
		diaListContactDatabasesSteps.clickOnDeleteButton();
		diaListContactDatabasesSteps.seeDeleteConfirmedPopup();
		diaListContactDatabasesSteps.verifyDeleteconfirmedMessage(databaseLabel);
		diaListContactDatabasesSteps.clickOnConfirmedButton();
		diaListContactDatabasesSteps.clickOnDeleteBtn();
		diaListContactDatabasesSteps.verifyheaderNameTextListContactDatabases();
	}
	
	@After
	public void tearDown() {
		driver.close();
	}
	
}
