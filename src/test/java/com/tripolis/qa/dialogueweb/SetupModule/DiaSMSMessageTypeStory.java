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
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.WithTag;

@RunWith(SerenityRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DiaSMSMessageTypeStory {
	
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
	DiaListSMSMessageTypeDefinitionsSteps diaListSMSMessageTypeDefinitionsSteps;
	
	@Steps
	DiaCreateSMSTypeDefinitionSteps diaCreateSMSTypeDefinitionSteps;
	
	@Steps
	DiaEditSMSTypeDefinitionSteps diaEditSMSTypeDefinitionSteps;
	
	@Before
	public void setUp() {
		diaLoginSteps.isOnLoginPage();
		diaLoginSteps.inputDataToLoginForm(Variables.clientDomain, Variables.userName, Variables.passWord);
		diaLoginSteps.clickonLoginButton();
		diaLeftSidebarSteps.verifyClientName();
		diaMainMenuSteps.navigateToAdministrationPage();
		diaAdministrationSteps.onAdministrationPage();
	}
	
	@Test
	@WithTag(type="feature", name="SMS Mesage Type")
	public void scenario5_UpdateSMSMesageType() {
		diaSubMenuSteps.navigateToPageThatSubMenuItem2PresentFor();
		diaListWorkspacesSteps.onListWorkspacesPage();
		diaListWorkspacesSteps.verifyheaderNameTextListWorkspaces();
		diaLeftSidebarSteps.navigateToPageThatLeftSidebarItem5PresentFor();
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
		diaListSMSMessageTypeDefinitionsSteps.verify_UpdateSMSMessageSuccessfulMessage();
		diaListSMSMessageTypeDefinitionsSteps.verifyheaderNameTextListSMSTypeDefinitions(Variables.workspaceLabel);
	}
	
	@After
	public void tearDown() {
		driver.close();
	}

}
