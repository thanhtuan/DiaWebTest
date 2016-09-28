package com.tripolis.qa.dialogueweb.TearDownTestData;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;

import com.tripolis.qa.common.DiaLeftSidebarSteps;
import com.tripolis.qa.common.DiaMainMenuSteps;
import com.tripolis.qa.common.DiaSubMenuSteps;
import com.tripolis.qa.common.Variables;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaAdministrationSteps;
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
public class CleanUpData {
	
	Variables var = new Variables();
	
	@Managed(uniqueSession = true)
	public WebDriver driver;
	
	@Steps
	DiaMainMenuSteps diaMainMenuSteps;
	
	@Steps
	DiaSubMenuSteps diaSubMenuSteps;
	
	@Steps
	DiaLeftSidebarSteps diaLeftSidebarSteps;
	
	@Steps
	DiaLoginSteps diaLoginSteps;
	
	@Steps
	DiaHomeSteps diaHomeSteps;
	
	@Steps
	DiaAdministrationSteps diaAdministrationSteps;
	
	@Steps
	DiaListContactDatabasesSteps diaListContactDatabasesSteps;
	
	@Steps
	DiaListWorkspacesSteps diaListWorkspacesSteps;
	
	@Steps
	DiaListEmailTypeDefinitionsSteps diaListEmailTypeDefinitionsSteps;
	
	@Steps
	DiaListSMSMessageTypeDefinitionsSteps diaListSMSMessageTypeDefinitionsSteps;
	
	@Before
	public void setUp() {
		diaLoginSteps.isOnLoginPage();
		diaLoginSteps.inputDataToLoginForm(Variables.clientDomain, Variables.adminUserName, Variables.passWord);
		diaLoginSteps.clickOnLoginButton();	
		diaLeftSidebarSteps.shouldBeAbleToSeeClientDomainName();	
	}
	
	@Test
	@Title(value = "Delete SMS Message Type")
	@WithTags (
	        {
	                @WithTag(type="feature", name="SMS Mesage Type"),
	                @WithTag(type="feature", name="Cleanup Data"),
	                @WithTag(type="story", name="Delete a SMS Message Type")
	        }
	)
	public void scenario1_DeleteSMSMesageType() {
		diaMainMenuSteps.navigateToAdministrationPage();
		diaAdministrationSteps.onAdministrationPage();
		diaSubMenuSteps.navigateToPageThatSubMenuItem2PresentFor();
		diaListWorkspacesSteps.onListWorkspacesPage();
		diaListWorkspacesSteps.verifyheaderNameTextListWorkspaces();
		diaLeftSidebarSteps.navigateToPageThatLeftSidebarItem5PresentFor();
		diaListSMSMessageTypeDefinitionsSteps.onListSMSTypeDefinitionsPage();
		diaListSMSMessageTypeDefinitionsSteps.verifyheaderNameTextListSMSTypeDefinitions(Variables.workspaceLabel);
		diaListSMSMessageTypeDefinitionsSteps.selectSMSType(Variables.updatedSMSMessageTypeLabel);
		diaListSMSMessageTypeDefinitionsSteps.clickOnDeleteButton();
		diaListSMSMessageTypeDefinitionsSteps.seeDeleteConfirmedPopup();
		diaListSMSMessageTypeDefinitionsSteps.verifyconfirmedMessage();
		diaListSMSMessageTypeDefinitionsSteps.clickOnConfirmedOkButton();
		//diaListSMSMessageTypeDefinitionsSteps.verify_DeleteSMSMessageSuccessfulMessage();
		diaListSMSMessageTypeDefinitionsSteps.verifyheaderNameTextListSMSTypeDefinitions(Variables.workspaceLabel);
	}
	
	@Test
	@Title(value = "Delete Direct Email Type")
	@WithTags (
	        {
	                @WithTag(type="feature", name="Direct Email Type"),
	                @WithTag(type="feature", name="Cleanup Data"),
	                @WithTag(type="story", name="Delete a Direct Email Type")
	        }
	)
	public void scenario2_DeleteDirectEmailType() {
		diaMainMenuSteps.navigateToAdministrationPage();
		diaAdministrationSteps.onAdministrationPage();
		diaSubMenuSteps.navigateToPageThatSubMenuItem2PresentFor();
		diaListWorkspacesSteps.onListWorkspacesPage();
		diaListWorkspacesSteps.verifyheaderNameTextListWorkspaces();
		diaLeftSidebarSteps.navigateToPageThatLeftSidebarItem4PresentFor();
		diaListEmailTypeDefinitionsSteps.onListEmailTypeDefinitionsPage();
		diaListEmailTypeDefinitionsSteps.verifyheaderNameTextListEmailTypeDefinitions(Variables.workspaceLabel);
		diaListEmailTypeDefinitionsSteps.selectDirectEmailType(Variables.updatedDirectEmailTypeLabel);
		diaListEmailTypeDefinitionsSteps.clickOnDeleteButton();
		diaListEmailTypeDefinitionsSteps.seeDeleteConfirmedPopup();
		diaListEmailTypeDefinitionsSteps.verifyconfirmedMessage();
		diaListEmailTypeDefinitionsSteps.clickOnConfirmedOkButton();
		//diaListEmailTypeDefinitionsSteps.verify_DeleteDirectEmailTypeSuccessfulMessage();
		diaListEmailTypeDefinitionsSteps.verifyheaderNameTextListEmailTypeDefinitions(Variables.workspaceLabel);
	}
	
	@Test
	@Title(value = "Delete Workspace")
	@WithTags (
	        {
	                @WithTag(type="feature", name="Content Workspace"),
	                @WithTag(type="feature", name="Cleanup Data"),
	                @WithTag(type="story", name="Delete a Workspace")
	        }
	)
	public void scenario3_DeleteWorkspace() {
		var.WSlabel = diaLeftSidebarSteps.getcontentWorkspaceLabel();
		diaMainMenuSteps.navigateToAdministrationPage();
		diaAdministrationSteps.onAdministrationPage();
		diaSubMenuSteps.navigateToPageThatSubMenuItem2PresentFor();
		diaListWorkspacesSteps.onListWorkspacesPage();
		diaListWorkspacesSteps.verifyheaderNameTextListWorkspaces();
		diaListWorkspacesSteps.selectWorkspace(var.WSlabel);
		diaListWorkspacesSteps.clickOnDeleteButton();
		diaListWorkspacesSteps.seeDeleteConfirmedPopup();
		diaListWorkspacesSteps.verifyDeleteconfirmedMessage();
		diaListWorkspacesSteps.clickOnConfirmedButton();
		diaListWorkspacesSteps.clickOnDeleteBtn();
		diaListWorkspacesSteps.verify_DeleteWorkspaceSuccessfulMessage();
		diaListWorkspacesSteps.verifyheaderNameTextListWorkspaces();	
	}
	
	@Test
	@Title(value = "Delete Contact Database")
	@WithTags (
	        {
	                @WithTag(type="feature", name="Contact Database"),
	                @WithTag(type="feature", name="Cleanup Data"),
	                @WithTag(type="story", name="Delete a Contact Database")
	        }
	)
	public void scenarior4_DeleteContactDatabase() {
		var.BDlabel = diaLeftSidebarSteps.getcontactDatabasesLabel();
		diaMainMenuSteps.navigateToAdministrationPage();
		diaAdministrationSteps.onAdministrationPage();
		diaSubMenuSteps.navigateToPageThatSubMenuItem1PresentFor();
		diaListContactDatabasesSteps.onListContactDatabasesPage();
		diaListContactDatabasesSteps.verifyheaderNameTextListContactDatabases();
		diaListContactDatabasesSteps.selectContactDB(var.BDlabel);
		diaListContactDatabasesSteps.clickOnDeleteButton();
		diaListContactDatabasesSteps.seeDeleteConfirmedPopup();
		diaListContactDatabasesSteps.verifyDeleteconfirmedMessage(var.BDlabel);
		diaListContactDatabasesSteps.clickOnConfirmedButton();
		diaListContactDatabasesSteps.clickOnDeleteBtn();
		diaListContactDatabasesSteps.verify_DeleteContactDatabaseSuccessfulMessage();
		diaListContactDatabasesSteps.verifyheaderNameTextListContactDatabases();
	}
	
	@After
	public void tearDown() {
		driver.close();
	}
}
