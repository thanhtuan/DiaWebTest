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
import com.tripolis.qa.dialogueweb.steps.serenity.DiaCreateWorkspaceSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaEditWorkspaceSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaHomeSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaListContactDatabasesSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaListWorkspacesSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaLoginSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestSuite2_DiaWorkspaceStory {
	
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
	DiaEditWorkspaceSteps diaEditWorkspaceSteps;
	
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
	public void scenario1_CreateContactDatabaseForDiaWorkspaceStory() {
		diaAdministrationSteps.navigateToListContactDatabasesPage();
		diaListContactDatabasesSteps.onListContactDatabasesPage();
		diaListContactDatabasesSteps.verifyheaderNameTextListContactDatabases();
		diaListContactDatabasesSteps.clickOnNewLink();
		diaContactDatabaseWizardSteps.seeCreateDatabaseDialog();
		diaContactDatabaseWizardSteps.verifyheaderNameTextCreateDatabaseDialogStep1();
		diaContactDatabaseWizardSteps.setLabel(Variables.databaseLabel);
		diaContactDatabaseWizardSteps.setName(Variables.databaseName);
		diaContactDatabaseWizardSteps.clickOnNextButton();
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
	public void scenario2_CreateWorkspace() {
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
	
	@Pending @Test
	public void scenario3_UpdateWorkspace() {
		diaAdministrationSteps.navigateToListWorkspacePage();
		diaListWorkspacesSteps.onListWorkspacesPage();
		diaListWorkspacesSteps.verifyheaderNameTextListWorkspaces();
		diaListWorkspacesSteps.selectWorkspace(Variables.workspaceLabel);
		diaListWorkspacesSteps.clickOnEditButton();
		diaEditWorkspaceSteps.onEditWorkspacesPage();
		diaEditWorkspaceSteps.verify_HeaderNameTextEditWorkspaces(Variables.workspaceLabel);
		diaEditWorkspaceSteps.editLabel(Variables.updatedWorkspaceLabel);
		diaEditWorkspaceSteps.editName(Variables.updatedWorkspaceLabel);
		diaEditWorkspaceSteps.checkcontactDatabaseState();
		diaEditWorkspaceSteps.editPublicDomainNameLinkAndPage("http://site.int.tripolis.com/");
		diaEditWorkspaceSteps.editPublicDomainNameImages("http://site.int.tripolis.com/");
		diaEditWorkspaceSteps.editBounceDomainName("");
		diaEditWorkspaceSteps.editAddListUnsubscribeHeader(true);
		diaEditWorkspaceSteps.clickOnSaveButton();
		diaListWorkspacesSteps.verifyheaderNameTextListWorkspaces();
	}
	
	@Pending @Test
	public void scenario4_DeleteWorkspace() {
		diaAdministrationSteps.navigateToListWorkspacePage();
		diaListWorkspacesSteps.onListWorkspacesPage();
		diaListWorkspacesSteps.verifyheaderNameTextListWorkspaces();
		var.WSlabel = diaListWorkspacesSteps.getcontentWorkspaceLabel();
		diaListWorkspacesSteps.selectWorkspace(var.WSlabel);
		diaListWorkspacesSteps.clickOnDeleteButton();
		diaListWorkspacesSteps.seeDeleteConfirmedPopup();
		diaListWorkspacesSteps.verifyDeleteconfirmedMessage();
		diaListWorkspacesSteps.clickOnConfirmedButton();
		diaListWorkspacesSteps.clickOnDeleteBtn();
		diaListWorkspacesSteps.verifyheaderNameTextListWorkspaces();	
	}
	
	@Pending @Test
	public void scenario5_CleanUpContactDatabaseDiaWorkspaceStory() {
		diaAdministrationSteps.navigateToListContactDatabasesPage();
		diaListContactDatabasesSteps.onListContactDatabasesPage();
		diaListContactDatabasesSteps.verifyheaderNameTextListContactDatabases();
		diaListContactDatabasesSteps.selectContactDB(Variables.databaseLabel);
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
