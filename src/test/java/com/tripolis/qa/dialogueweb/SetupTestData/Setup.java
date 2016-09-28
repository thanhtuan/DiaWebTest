package com.tripolis.qa.dialogueweb.SetupTestData;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;

import com.tripolis.qa.common.DiaLeftSidebarSteps;
import com.tripolis.qa.common.DiaMainMenuSteps;
import com.tripolis.qa.common.DiaSecondActionbarSteps;
import com.tripolis.qa.common.DiaSubMenuSteps;
import com.tripolis.qa.common.Variables;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaAdministrationSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaContactDatabaseWizardSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaCreateEmailTypeDefinitionSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaCreateSMSTypeDefinitionSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaCreateWorkspaceSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaEditEmailTypeDefinitionSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaHomeSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaListContactDatabasesSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaListEmailTypeDefinitionsSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaListSMSMessageTypeDefinitionsSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaListWorkspacesSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaLoginSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import net.thucydides.core.annotations.WithTag;
import net.thucydides.core.annotations.WithTags;

@RunWith(SerenityRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Setup {

	@Managed(uniqueSession = true)
	public WebDriver driver;
	
	@Steps
	DiaMainMenuSteps diaMainMenuSteps;
	
	@Steps
	DiaSubMenuSteps diaSubMenuSteps;
	
	@Steps
	DiaLeftSidebarSteps diaLeftSidebarSteps;
	
	@Steps
	DiaSecondActionbarSteps diaSecondActionbarSteps;
	
	@Steps
	DiaLoginSteps diaLoginSteps;
	
	@Steps
	DiaHomeSteps diaHomeSteps;
	
	@Steps
	DiaAdministrationSteps diaAdministrationSteps;
	
	@Steps
	DiaListContactDatabasesSteps diaListContactDatabasesSteps;
	
	@Steps
	DiaContactDatabaseWizardSteps diaContactDatabaseWizardSteps;
	
	@Steps
	DiaListWorkspacesSteps diaListWorkspacesSteps;
	
	@Steps
	DiaCreateWorkspaceSteps diaCreateWorkspaceSteps;
	
	@Steps
	DiaListEmailTypeDefinitionsSteps diaListEmailTypeDefinitionsSteps;
	
	@Steps
	DiaCreateEmailTypeDefinitionSteps diaCreateEmailTypeDefinitionSteps;
	
	@Steps
	DiaEditEmailTypeDefinitionSteps diaEditEmailTypeDefinitionSteps;
	
	@Steps
	DiaListSMSMessageTypeDefinitionsSteps diaListSMSMessageTypeDefinitionsSteps;
	
	@Steps
	DiaCreateSMSTypeDefinitionSteps diaCreateSMSTypeDefinitionSteps;
	
	Variables var = new Variables();
	
	@Before
	public void setUp() {
		diaLoginSteps.isOnLoginPage();
		diaLoginSteps.inputDataToLoginForm(Variables.clientDomain, Variables.adminUserName, Variables.passWord);
		diaLoginSteps.clickOnLoginButton();
		diaLeftSidebarSteps.shouldBeAbleToSeeClientDomainName();
		diaMainMenuSteps.navigateToAdministrationPage();
		diaAdministrationSteps.onAdministrationPage();
	}
	
	
	@Test
	@Title(value = "Create Contact Database")
	@WithTags (
	        {
	                @WithTag(type="feature", name="Contact Database"),
	                @WithTag(type="feature", name="Prepare Data"),
	                @WithTag(type="story", name="Create a Contact Database")
	        }
	)
	public void scenario1_CreateContactDatabase() {
		diaSubMenuSteps.navigateToPageThatSubMenuItem1PresentFor();
		diaListContactDatabasesSteps.onListContactDatabasesPage();
		diaListContactDatabasesSteps.verifyheaderNameTextListContactDatabases();
		diaSecondActionbarSteps.navigateToPageThatSecondActionBarItem1PresentFor();
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
	@Title(value = "Create a Workspace")
	@WithTags (
	        {
	                @WithTag(type="feature", name="Content Workspace"),
	                @WithTag(type="feature", name="Prepare Data"),
	                @WithTag(type="story", name="Create Workspace")
	        }
	)
	public void scenario2_CreateWorkspace() {
		diaSubMenuSteps.navigateToPageThatSubMenuItem2PresentFor();
		diaListWorkspacesSteps.onListWorkspacesPage();
		diaListWorkspacesSteps.verifyheaderNameTextListWorkspaces();
		var.databaseId = diaLeftSidebarSteps.getcontactDatabasesAttribute();
		diaSecondActionbarSteps.navigateToPageThatSecondActionBarItem1PresentFor();
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
		diaListWorkspacesSteps.verify_CreateWorkspaceSuccessfulMessage();
		diaListWorkspacesSteps.verifyheaderNameTextListWorkspaces();
	}
	
	@Test
	@Title(value = "Create a Direct Email Type")
	@WithTags (
	        {
	                @WithTag(type="feature", name="Direct Email Type"),
	                @WithTag(type="feature", name="Prepare Data"),
	                @WithTag(type="story", name="Create Direct Email Type")
	        }
	)
	public void scenario3_CreateDirectEmailType() {
		diaSubMenuSteps.navigateToPageThatSubMenuItem2PresentFor();
		diaListWorkspacesSteps.onListWorkspacesPage();
		diaListWorkspacesSteps.verifyheaderNameTextListWorkspaces();
		diaLeftSidebarSteps.navigateToPageThatLeftSidebarItem4PresentFor();
		diaListEmailTypeDefinitionsSteps.onListEmailTypeDefinitionsPage();
		diaListEmailTypeDefinitionsSteps.verifyheaderNameTextListEmailTypeDefinitions(Variables.workspaceLabel);
		diaSecondActionbarSteps.navigateToPageThatSecondActionBarItem1PresentFor();
		diaCreateEmailTypeDefinitionSteps.onCreateDirectEmailTypePage();
		diaCreateEmailTypeDefinitionSteps.verifyheaderNameTextCreateEmailTypeDefinitions();
		diaCreateEmailTypeDefinitionSteps.setLabel(Variables.directemailTypeLabel);
		diaCreateEmailTypeDefinitionSteps.setName(Variables.directemailTypeName);
		diaCreateEmailTypeDefinitionSteps.setFromAddress("telerik@tripolis.com");
		diaCreateEmailTypeDefinitionSteps.setFromName("Telerik");
		diaCreateEmailTypeDefinitionSteps.setReplyToAddress("mimo@tripolis.com");
		diaCreateEmailTypeDefinitionSteps.setExternalHtmlUrl("");
		diaCreateEmailTypeDefinitionSteps.setExternalTextUrl("");
		diaCreateEmailTypeDefinitionSteps.setTinyMceEnabled(true);
		diaCreateEmailTypeDefinitionSteps.setEmailField("Email");
		diaCreateEmailTypeDefinitionSteps.setCharacterSetEncoding("ISO8859_1");
		diaCreateEmailTypeDefinitionSteps.setAttachmentEnabled(false);
		diaCreateEmailTypeDefinitionSteps.setExternalAttachmentEnabled(false);
		diaCreateEmailTypeDefinitionSteps.clickOnSaveButton();
		diaEditEmailTypeDefinitionSteps.verify_CreateDirectEmailTypeSuccessfulMessage();
		diaEditEmailTypeDefinitionSteps.verifyheaderNameTextEditDirectEmailType(Variables.directemailTypeLabel);
	}
	
	@Test
	@Title(value = "Create a SMS Message Type")
	@WithTags (
	        {
	                @WithTag(type="feature", name="SMS Mesage Type"),
	                @WithTag(type="feature", name="Prepare Data"),
	                @WithTag(type="story", name="Create SMS Message Type")
	        }
	)
	public void scenario4_CreateSMSMesageType() {
		diaSubMenuSteps.navigateToPageThatSubMenuItem2PresentFor();
		diaListWorkspacesSteps.onListWorkspacesPage();
		diaListWorkspacesSteps.verifyheaderNameTextListWorkspaces();
		diaLeftSidebarSteps.navigateToPageThatLeftSidebarItem5PresentFor();
		diaListSMSMessageTypeDefinitionsSteps.onListSMSTypeDefinitionsPage();
		diaListSMSMessageTypeDefinitionsSteps.verifyheaderNameTextListSMSTypeDefinitions(Variables.workspaceLabel);
		diaSecondActionbarSteps.navigateToPageThatSecondActionBarItem1PresentFor();
		diaCreateSMSTypeDefinitionSteps.verifyheaderNameTextCreateSMSTypeDefinitions();
		diaCreateSMSTypeDefinitionSteps.setLabel(Variables.smsmessageTypeLabel);
		diaCreateSMSTypeDefinitionSteps.setName(Variables.smsmessageTypeName);
		diaCreateSMSTypeDefinitionSteps.setDefaultOriginatorNumber("18001095");
		diaCreateSMSTypeDefinitionSteps.setDefaultOriginator("Support");
		diaCreateSMSTypeDefinitionSteps.setMobilePhoneField("Mobile");
		diaCreateSMSTypeDefinitionSteps.setLongSMSEnabled(false);
		diaCreateSMSTypeDefinitionSteps.clickOnSaveButton();
		diaListSMSMessageTypeDefinitionsSteps.verify_CreateSMSMessageSuccessfulMessage();
		diaListSMSMessageTypeDefinitionsSteps.verifyheaderNameTextListSMSTypeDefinitions(Variables.workspaceLabel);
	}
	
	@After
	public void tearDown() {
		driver.close();
	}
}
