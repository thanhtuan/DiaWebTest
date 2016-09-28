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
import com.tripolis.qa.dialogueweb.steps.serenity.DiaHomeSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaListSMSMessagesSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaLoginSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaPreviewContentSMSMessageSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import net.thucydides.core.annotations.WithTag;
import net.thucydides.core.annotations.WithTags;

@RunWith(SerenityRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PublishSMSMessage {

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
	DiaContentDashboardSteps diaContentDashboardSteps;
	
	@Steps
	DiaListSMSMessagesSteps diaListSMSMessagesSteps;
	
	@Steps
	DiaPreviewContentSMSMessageSteps diaPreviewContentSMSMessageSteps;
	
	@Steps
	DiaContentPublicationWizardSteps diaContentPublicationWizardSteps;
	
	Variables var = new Variables();
	
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
	@Title(value = "Publish SMS to Static Group using 'Send Now' Option")
	@WithTags (
	        {
	                @WithTag(type="feature", name="End to End Flow"),
	                @WithTag(type="feature", name="Publish SMS Message"),
	                @WithTag(type="Story", name="Publish SMS Message to Contact Group")
	        }
	)
	public void scenario1_PublishSMSMessageUsingSendNowOption() {
		diaSubMenuSteps.navigateToPageThatSubMenuItem4PresentFor();
		diaListSMSMessagesSteps.onListSMSMessagesPage();
		diaListSMSMessagesSteps.verifyheaderNameTextListSMSMessages(Variables.workspaceLabel);
		diaListSMSMessagesSteps.selectSMSMessage(Variables.smsmessageLabel);
		diaPreviewContentSMSMessageSteps.onPreviewContentSMSMessagePage();
		diaPreviewContentSMSMessageSteps.verifyheaderNameTextPreviewSMSMessage(Variables.smsmessageLabel);
		diaSecondActionbarSteps.navigateToPageThatSecondActionBarItem2PresentFor();
		diaContentPublicationWizardSteps.shouldOpenThePublicationWizard();
		diaContentPublicationWizardSteps.shouldSeeTheSMSPublicationWizardHeaderName();
		diaContentPublicationWizardSteps.shouldSeeTheCorrectSMSMessageTypeLabel(Variables.smsmessageTypeLabel);
		diaContentPublicationWizardSteps.shouldSeeTheCorrectSMSMessageEditionLabel(Variables.smsmessageLabel);
		diaContentPublicationWizardSteps.shouldBeAbleToSelectTheGroup(Variables.staticGroupLabel);
		diaContentPublicationWizardSteps.shouldBeAbleToSelectSendOption("sendNow");
		diaContentPublicationWizardSteps.shouldBeAbleToCheckContentPersonalization(true);
		diaContentPublicationWizardSteps.clickOnNextButton();
		diaContentPublicationWizardSteps.shouldBeAbleToConfirmMailing(true);
		diaContentPublicationWizardSteps.clickOnSendNowButton();
		//diaContentPublicationWizardSteps.verifyheaderNameTextFinishedPublishSMS();
		diaContentPublicationWizardSteps.clickOnFinishButton();
	}
	
	@After
	public void tearDown() {
		driver.close();
	}
}
