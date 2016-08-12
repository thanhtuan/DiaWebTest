package com.tripolis.qa.dialogueweb.module.Admin;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;

import com.tripolis.qa.common.Variables;
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
public class TestSuite4_DiaSMSTypeStory {
	
	Variables var = new Variables();
			
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
	public DiaListWorkspacesSteps diaListWorkspacesSteps;
	
	@Steps
	public DiaCreateWorkspaceSteps diaCreateWorkspaceSteps;
	
	@Steps
	public DiaListSMSMessageTypeDefinitionsSteps diaListSMSMessageTypeDefinitionsSteps;
	
	@Steps
	public DiaCreateSMSTypeDefinitionSteps diaCreateSMSTypeDefinitionSteps;
	
	@Steps
	public DiaEditSMSTypeDefinitionSteps diaEditSMSTypeDefinitionSteps;
	
	@Before
	public void setUp() {
		diaLoginSteps.isOnLoginPage();
		diaLoginSteps.inputDataToLoginForm(Variables.clientDomain, Variables.userName, Variables.passWord);
		diaLoginSteps.clickonLoginButton();	
		diaLoginSteps.verifyClientName();
		diaHomeSteps.navigateToAdministrationPage();
		diaAdministrationSteps.onAdministrationPage();
	}
	
	@Pending @Test
	public void scenario1_CreateContactDatabaseForDiaSMSTypeStory() {		
		diaAdministrationSteps.navigateToListContactDatabasesPage();
		diaListContactDatabasesSteps.onListContactDatabasesPage();
		diaListContactDatabasesSteps.verifyheaderNameTextListContactDatabases();
		diaListContactDatabasesSteps.clickOnNewLink();
		diaContactDatabaseWizardSteps.seeCreateDatabaseDialog();
		diaContactDatabaseWizardSteps.verifyheaderNameTextCreateDatabaseDialogStep1();
		diaContactDatabaseWizardSteps.setLabel(Variables.databaseLabel);
		diaContactDatabaseWizardSteps.setName(Variables.databaseName);
		diaContactDatabaseWizardSteps.clickOnNextButton();
		diaContactDatabaseWizardSteps.verifyheaderNameTextCreateDatabaseDialogStep2();
		diaContactDatabaseWizardSteps.create_Key_Field("Email", "EMAIL", "3", "254", "", "General");
		diaContactDatabaseWizardSteps.clickOnNextButton();
		diaContactDatabaseWizardSteps.verifyheaderNameTextCreateDatabaseDialogOverview();
		diaContactDatabaseWizardSteps.verify_DatabaseLabelText(Variables.databaseLabel);
		diaContactDatabaseWizardSteps.clickOnAddFieldButton();
		diaContactDatabaseWizardSteps.verifyheaderNameTextCreateDatabaseDialogStep3();
		diaContactDatabaseWizardSteps.create_Field("Name", "STRING", "3", "254", "", false, false, true, "General");
		diaContactDatabaseWizardSteps.clickOnNextButton();
		diaContactDatabaseWizardSteps.verifyheaderNameTextCreateDatabaseDialogOverview();
		diaContactDatabaseWizardSteps.verify_DatabaseLabelText(Variables.databaseLabel);
		diaContactDatabaseWizardSteps.clickOnAddFieldButton();
		diaContactDatabaseWizardSteps.create_Field("Mobile", "MOBILE", "3", "16", "", false, false, true, "General");
		diaContactDatabaseWizardSteps.clickOnNextButton();
		diaContactDatabaseWizardSteps.verifyheaderNameTextCreateDatabaseDialogOverview();
		diaContactDatabaseWizardSteps.verify_DatabaseLabelText(Variables.databaseLabel);
		diaContactDatabaseWizardSteps.clickOnFinishButton();
		diaListContactDatabasesSteps.verifyheaderNameTextListContactDatabases();
	}
	
	@Pending @Test
	public void scenario2_CreateWorkSpaceForDiaSMSTypeStory() {
		diaAdministrationSteps.navigateToListWorkspacePage();
		diaListWorkspacesSteps.onListWorkspacesPage();
		diaListWorkspacesSteps.verifyheaderNameTextListWorkspaces();
		var.databaseId = diaListContactDatabasesSteps.getcontactDatabasesAttribute();
		diaListWorkspacesSteps.clickOnNewLink();
		diaCreateWorkspaceSteps.onCreateWorkspacesPage();
		diaCreateWorkspaceSteps.verifyheaderNameTextCreateWorkspaces();
		diaCreateWorkspaceSteps.setLabel(Variables.workspaceLabel);
		diaCreateWorkspaceSteps.setName(Variables.workspaceName);
		diaCreateWorkspaceSteps.selected_DB(var.databaseId);
		diaCreateWorkspaceSteps.setPublicDomainNameLinkAndPage("");
		diaCreateWorkspaceSteps.setPublicDomainNameImages("");
		diaCreateWorkspaceSteps.setBounceDomainName("");
		diaCreateWorkspaceSteps.setAddListUnsubscribeHeader(true);
		diaCreateWorkspaceSteps.clickOnSaveButton();
		diaListWorkspacesSteps.verifyheaderNameTextListWorkspaces();
	}
	
	@Pending @Test
	public void scenario3_GoTolistSMSTypeDefinitionsPage() {
		diaAdministrationSteps.navigateToListWorkspacePage();
		diaListWorkspacesSteps.onListWorkspacesPage();
		diaListWorkspacesSteps.verifyheaderNameTextListWorkspaces();
		diaListWorkspacesSteps.navigateToListSMSTypeDefinitions();
		diaListSMSMessageTypeDefinitionsSteps.onListSMSTypeDefinitionsPage();
		diaListSMSMessageTypeDefinitionsSteps.verifyheaderNameTextListSMSTypeDefinitions(Variables.workspaceLabel);
		diaListSMSMessageTypeDefinitionsSteps.clickOnNewLink();
		diaCreateSMSTypeDefinitionSteps.verifyheaderNameTextCreateSMSTypeDefinitions();
	}
	
	@Pending @Test
	public void scenario4_CreateSMSMesageType() {
		diaAdministrationSteps.navigateToListWorkspacePage();
		diaListWorkspacesSteps.onListWorkspacesPage();
		diaListWorkspacesSteps.verifyheaderNameTextListWorkspaces();
		diaListWorkspacesSteps.navigateToListSMSTypeDefinitions();
		diaListSMSMessageTypeDefinitionsSteps.onListSMSTypeDefinitionsPage();
		diaListSMSMessageTypeDefinitionsSteps.verifyheaderNameTextListSMSTypeDefinitions(Variables.workspaceLabel);
		diaListSMSMessageTypeDefinitionsSteps.clickOnNewLink();
		diaCreateSMSTypeDefinitionSteps.verifyheaderNameTextCreateSMSTypeDefinitions();
		diaCreateSMSTypeDefinitionSteps.setLabel(Variables.smsmessageTypeLabel);
		diaCreateSMSTypeDefinitionSteps.setName(Variables.smsmessageTypeName);
		diaCreateSMSTypeDefinitionSteps.setDefaultOriginatorNumber("18001095");
		diaCreateSMSTypeDefinitionSteps.setDefaultOriginator("Support");
		diaCreateSMSTypeDefinitionSteps.setMobilePhoneField("Mobile");
		diaCreateSMSTypeDefinitionSteps.setLongSMSEnabled(false);
		diaCreateSMSTypeDefinitionSteps.clickOnSaveButton();
		diaListSMSMessageTypeDefinitionsSteps.verifyheaderNameTextListSMSTypeDefinitions(Variables.workspaceLabel);
	}
	
	@Pending @Test
	public void scenario5_UpdateSMSMesageType() {
		diaAdministrationSteps.navigateToListWorkspacePage();
		diaListWorkspacesSteps.onListWorkspacesPage();
		diaListWorkspacesSteps.verifyheaderNameTextListWorkspaces();
		diaListWorkspacesSteps.navigateToListSMSTypeDefinitions();
		diaListSMSMessageTypeDefinitionsSteps.onListSMSTypeDefinitionsPage();
		diaListSMSMessageTypeDefinitionsSteps.verifyheaderNameTextListSMSTypeDefinitions(Variables.workspaceLabel);
		diaListSMSMessageTypeDefinitionsSteps.selectSMSType(Variables.smsmessageTypeLabel);
		diaListSMSMessageTypeDefinitionsSteps.clickOnEditButton();
		diaEditSMSTypeDefinitionSteps.verifyheaderNameTextEditSMSType(Variables.smsmessageTypeLabel);
		diaEditSMSTypeDefinitionSteps.editLabel(Variables.updatedSMSMessageTypeLabel);
		diaEditSMSTypeDefinitionSteps.checkSMSMesageNameState();
		diaEditSMSTypeDefinitionSteps.editDefaultOriginatorNumber("19002096");
		diaEditSMSTypeDefinitionSteps.editDefaultOriginator("SupportTeam");
		diaEditSMSTypeDefinitionSteps.editMobilePhoneField("Mobile");
		diaEditSMSTypeDefinitionSteps.editLongSMSEnabled(true);
		diaEditSMSTypeDefinitionSteps.clickOnSaveButton();
		diaListSMSMessageTypeDefinitionsSteps.verifyheaderNameTextListSMSTypeDefinitions(Variables.workspaceLabel);
	}
	
	@Pending @Test
	public void scenario6_DeleteSMSMesageType() {
		diaAdministrationSteps.navigateToListWorkspacePage();
		diaListWorkspacesSteps.onListWorkspacesPage();
		diaListWorkspacesSteps.verifyheaderNameTextListWorkspaces();
		diaListWorkspacesSteps.navigateToListSMSTypeDefinitions();
		diaListSMSMessageTypeDefinitionsSteps.onListSMSTypeDefinitionsPage();
		diaListSMSMessageTypeDefinitionsSteps.verifyheaderNameTextListSMSTypeDefinitions(Variables.workspaceLabel);
		diaListSMSMessageTypeDefinitionsSteps.selectSMSType(Variables.updatedSMSMessageTypeLabel);
		diaListSMSMessageTypeDefinitionsSteps.clickOnDeleteButton();
		diaListSMSMessageTypeDefinitionsSteps.seeDeleteConfirmedPopup();
		diaListSMSMessageTypeDefinitionsSteps.verifyconfirmedMessage();
		diaListSMSMessageTypeDefinitionsSteps.clickOnConfirmedOkButton();
		diaListSMSMessageTypeDefinitionsSteps.verifyheaderNameTextListSMSTypeDefinitions(Variables.workspaceLabel);
	}
	
	@Pending @Test
	public void scenario7_CleanUpWorkSpaceDiaSMSTypeStory() {
		diaAdministrationSteps.navigateToListWorkspacePage();
		diaListWorkspacesSteps.onListWorkspacesPage();
		diaListWorkspacesSteps.verifyheaderNameTextListWorkspaces();		
		var.WSlabel = diaListWorkspacesSteps.getcontentWorkspaceLabel();
		diaListWorkspacesSteps.selectWorkspace(var.WSlabel);
		diaListWorkspacesSteps.clickOnDeleteButton();
		diaListWorkspacesSteps.verifyDeleteconfirmedMessage();
		diaListWorkspacesSteps.clickOnConfirmedButton();
		diaListWorkspacesSteps.clickOnDeleteBtn();
		diaListWorkspacesSteps.verifyheaderNameTextListWorkspaces();	
	}
	
	@Pending @Test
	public void scenario8_CleanUpContactDatabaseDiaSMSTypeStory() {
		diaAdministrationSteps.navigateToListContactDatabasesPage();
		diaListContactDatabasesSteps.onListContactDatabasesPage();
		diaListContactDatabasesSteps.verifyheaderNameTextListContactDatabases();
		var.BDlabel = diaListContactDatabasesSteps.getcontactDatabasesLabel();
		diaListContactDatabasesSteps.selectContactDB(var.BDlabel);
		diaListContactDatabasesSteps.clickOnDeleteButton();
		diaListContactDatabasesSteps.seeDeleteConfirmedPopup();
		diaListContactDatabasesSteps.verifyDeleteconfirmedMessage(Variables.databaseLabel);
		diaListContactDatabasesSteps.clickOnConfirmedButton();
		diaListContactDatabasesSteps.clickOnDeleteBtn();
		diaListContactDatabasesSteps.verifyheaderNameTextListContactDatabases();
	}
	
	@After
	public void tearDown() {
		driver.close();
	}

}
