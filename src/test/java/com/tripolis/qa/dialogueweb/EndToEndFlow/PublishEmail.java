package com.tripolis.qa.dialogueweb.EndToEndFlow;

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
import com.tripolis.qa.dialogueweb.steps.serenity.DiaContentDashboardSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaContentPublicationWizardSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaListDirectEmailsSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaHomeSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaLoginSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaPreviewContentDirectEmailSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import net.thucydides.core.annotations.WithTag;
import net.thucydides.core.annotations.WithTags;

@RunWith(SerenityRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PublishEmail {

	@Managed(uniqueSession = true)
	public WebDriver driver;
	
	Variables var = new Variables();
	
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
	DiaContentDashboardSteps diaContentDashboardSteps;
	
	@Steps
	DiaListDirectEmailsSteps diaListDirectEmailsSteps;
	
	@Steps
	DiaPreviewContentDirectEmailSteps diaPreviewContentDirectEmailSteps;
	
	@Steps
	DiaContentPublicationWizardSteps diaContentPublicationWizardSteps;
	
	@Before
	public void setUp() {
		diaLoginSteps.isOnLoginPage();
		diaLoginSteps.inputDataToLoginForm(Variables.clientDomain, Variables.adminUserName, Variables.passWord);
		diaLoginSteps.clickOnLoginButton();
		diaHomeSteps.verifyIsOnHomePage();
		diaMainMenuSteps.shouldBeAbleToSeeLogoutText();
		diaLeftSidebarSteps.shouldBeAbleToSeeClientDomainName();
		diaMainMenuSteps.navigateToContentPage();
		diaContentDashboardSteps.onContentDashboardPage();
	}
	
	@Test
	@Title(value = "Publish DirectEmail to Static Group using 'Send Now' Option")
	@WithTags (
	        {
	                @WithTag(type="feature", name="End to End Flow"),
	                @WithTag(type="feature", name="Publish DirectEmail"),
	                @WithTag(type="Story", name="Publish DirectEmail to Contact Group")
	        }
	)
	public void scenario1_PublishDirectEmailUsingSendNowOption() {
		diaSubMenuSteps.navigateToPageThatSubMenuItem3PresentFor();
		diaListDirectEmailsSteps.onListDirectEmailsPage();
		diaListDirectEmailsSteps.verifyheaderNameTextListDirectEmails(Variables.workspaceLabel);
		diaListDirectEmailsSteps.selectDirectEmail(Variables.directemailLabel);
		diaPreviewContentDirectEmailSteps.onPreviewContentDirectEmailPage();
		diaPreviewContentDirectEmailSteps.verifyheaderNameTextPreviewDirectEmail(Variables.directemailLabel);
		diaSecondActionbarSteps.navigateToPageThatSecondActionBarItem2PresentFor();
		diaContentPublicationWizardSteps.shouldOpenThePublicationWizard();
		diaContentPublicationWizardSteps.shouldSeeTheEmailPublicationWizardHeaderName();
		diaContentPublicationWizardSteps.shouldSeeTheCorrectDirectEmailTypeLabel(Variables.directemailTypeLabel);
		diaContentPublicationWizardSteps.shouldSeeTheCorrectDirectEmailEditionLabel(Variables.directemailLabel);
		diaContentPublicationWizardSteps.shouldBeAbleToSelectTheGroup(Variables.staticGroupLabel);
		diaContentPublicationWizardSteps.shouldBeAbleToSelectSendOption("sendNow");
		diaContentPublicationWizardSteps.shouldBeAbleToCheckContentPersonalization(true);
		diaContentPublicationWizardSteps.shouldBeAbleToCheckAllURLs(false);
		diaContentPublicationWizardSteps.shouldBeAbleToSelectMailsPerHour("0");
		diaContentPublicationWizardSteps.shouldBeAbleToCheckmailReportEnabled(false);
		diaContentPublicationWizardSteps.clickOnNextButton();
		diaContentPublicationWizardSteps.shouldBeAbleToConfirmMailing(true);
		diaContentPublicationWizardSteps.clickOnSendNowButton();
		//diaContentPublicationWizardSteps.verifyheaderNameTextFinishedPublishEmail();
		diaContentPublicationWizardSteps.clickOnFinishButton();
	}
	
	@After
	public void tearDown() {
		driver.close();
	}
}
