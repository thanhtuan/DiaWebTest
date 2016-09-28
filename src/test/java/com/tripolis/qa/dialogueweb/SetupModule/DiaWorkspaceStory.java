package com.tripolis.qa.dialogueweb.SetupModule;

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
import com.tripolis.qa.dialogueweb.steps.serenity.DiaContactDatabaseWizardSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaCreateWorkspaceSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaEditWorkspaceSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaHomeSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaListContactDatabasesSteps;
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
public class DiaWorkspaceStory {
	
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
	DiaContactDatabaseWizardSteps diaContactDatabaseWizardSteps;
	
	@Steps
	DiaListWorkspacesSteps diaListWorkspacesSteps;
	
	@Steps
	DiaCreateWorkspaceSteps diaCreateWorkspaceSteps;
	
	@Steps
	DiaEditWorkspaceSteps diaEditWorkspaceSteps;
	
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
	@Title(value = "Update Workspace")
	@WithTags (
	        {  
	        		@WithTag(type="feature", name="Content Workspace"),
	                @WithTag(type="story", name="Update a Workspace")
	        }
	)
	public void scenario1_UpdateWorkspace() {
		diaSubMenuSteps.navigateToPageThatSubMenuItem2PresentFor();
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
		diaListWorkspacesSteps.verify_UpdateWorkspaceSuccessfulMessage();
		diaListWorkspacesSteps.verifyheaderNameTextListWorkspaces();
	}
	
	@After
	public void tearDown() {
		driver.close();
	}

}
