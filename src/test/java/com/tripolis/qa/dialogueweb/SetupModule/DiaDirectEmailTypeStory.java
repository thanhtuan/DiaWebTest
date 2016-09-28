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
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import net.thucydides.core.annotations.WithTag;
import net.thucydides.core.annotations.WithTags;

@RunWith(SerenityRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DiaDirectEmailTypeStory {
	
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
	DiaListEmailTypeDefinitionsSteps diaListEmailTypeDefinitionsSteps;
	
	@Steps
	DiaCreateEmailTypeDefinitionSteps diaCreateEmailTypeDefinitionSteps;
	
	@Steps
	DiaEditEmailTypeDefinitionSteps diaEditEmailTypeDefinitionSteps;
	
	
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
	@Title(value = "Update a Direct Email Type")
	@WithTags (
	        {
	                @WithTag(type="feature", name="Direct Email Type"),
	                @WithTag(type="story", name="Update Direct Email Type")
	        }
	)
	public void scenario1_UpdateDirectEmailType() {
		diaSubMenuSteps.navigateToPageThatSubMenuItem2PresentFor();
		diaListWorkspacesSteps.onListWorkspacesPage();
		diaListWorkspacesSteps.verifyheaderNameTextListWorkspaces();
		diaLeftSidebarSteps.navigateToPageThatLeftSidebarItem4PresentFor();
		diaListEmailTypeDefinitionsSteps.onListEmailTypeDefinitionsPage();
		diaListEmailTypeDefinitionsSteps.verifyheaderNameTextListEmailTypeDefinitions(Variables.workspaceLabel);
		diaListEmailTypeDefinitionsSteps.selectDirectEmailType(Variables.directemailTypeLabel);
		diaListEmailTypeDefinitionsSteps.clickOnEditButton();
		diaEditEmailTypeDefinitionSteps.onEditDirectEmailTypePage();
		diaEditEmailTypeDefinitionSteps.verifyheaderNameTextEditDirectEmailType(Variables.directemailTypeLabel);
		diaEditEmailTypeDefinitionSteps.editLabel(Variables.updatedDirectEmailTypeLabel);
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
		diaListEmailTypeDefinitionsSteps.verify_UpdateDirectEmailTypeSuccessfulMessage();
		diaListEmailTypeDefinitionsSteps.verifyheaderNameTextListEmailTypeDefinitions(Variables.workspaceLabel);
	}
	
	@After
	public void tearDown() {
		driver.close();
	}

}
