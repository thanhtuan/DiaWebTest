package com.tripolis.qa.dialogueweb.module.Content;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.tripolis.qa.common.Variables;
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

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

public class TestSuite1_Setup {
	
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
		diaLoginSteps.inputDataToLoginForm("Tripolis QA", "test_automated_user@tripolis.com", "test");
		diaLoginSteps.clickonLoginButton();	
		diaLoginSteps.verifyClientName();
	}
	
	@Test
	public void scenario1_CreateContactDatabaseForDiaContentStory() {	
		diaHomeSteps.navigateToAdministrationPage();
		diaAdministrationSteps.onAdministrationPage();
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
	
	@Test
	public void scenario2_CreateWorkspaceForDiaContentStory() {
		diaHomeSteps.navigateToAdministrationPage();
		diaAdministrationSteps.onAdministrationPage();
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
		diaCreateWorkspaceSteps.setAddListUnsubscribeHeader(false);
		diaCreateWorkspaceSteps.clickOnSaveButton();
		diaListWorkspacesSteps.verifyheaderNameTextListWorkspaces();
	}
	
	@Test
	public void scenario4_CreateDirectEmailTypeForDiaContentStory() {
		diaHomeSteps.navigateToAdministrationPage();
		diaAdministrationSteps.onAdministrationPage();
		diaAdministrationSteps.navigateToListWorkspacePage();
		diaListWorkspacesSteps.onListWorkspacesPage();
		diaListWorkspacesSteps.verifyheaderNameTextListWorkspaces();
		diaListWorkspacesSteps.navigateToListEmailTypeDefinitions();
		diaListEmailTypeDefinitionsSteps.onListEmailTypeDefinitionsPage();
		diaListEmailTypeDefinitionsSteps.verifyheaderNameTextListEmailTypeDefinitions(Variables.workspaceLabel);
		diaListEmailTypeDefinitionsSteps.clickOnNewLink();
		diaCreateEmailTypeDefinitionSteps.onCreateDirectEmailTypePage();
		diaCreateEmailTypeDefinitionSteps.verifyheaderNameTextCreateEmailTypeDefinitions();
		diaCreateEmailTypeDefinitionSteps.setLabel(Variables.directemailTypeLabel);
		diaCreateEmailTypeDefinitionSteps.setName(Variables.directemailTypeName);
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
		diaEditEmailTypeDefinitionSteps.verifyheaderNameTextEditDirectEmailType(Variables.directemailTypeLabel);
	}
	
	@After
	public void tearDown() {
		driver.close();
	}
}
