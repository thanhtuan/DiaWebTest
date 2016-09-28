package com.tripolis.qa.dialogueweb.SetupTestData;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;

import com.tripolis.qa.common.DiaActionbarSteps;
import com.tripolis.qa.common.DiaLeftSidebarSteps;
import com.tripolis.qa.common.DiaMainMenuSteps;
import com.tripolis.qa.common.DiaSecondActionbarSteps;
import com.tripolis.qa.common.DiaSubMenuSteps;
import com.tripolis.qa.common.Variables;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaContentDashboardSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaContentDirectEmailHTMLSourceSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaCreateContentDirectEmailSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaCreateContentSMSMessageSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaHomeSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaListDirectEmailsSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaListSMSMessagesSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaLoginSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaPreviewContentDirectEmailSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaPreviewContentSMSMessageSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaSelectDirectEmailTypeSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaSelectSMSMessageTypeSteps;
import com.tripolis.qa.util.DataHelper;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import net.thucydides.core.annotations.WithTag;
import net.thucydides.core.annotations.WithTags;

@RunWith(SerenityRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Content {

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
	DiaActionbarSteps diaActionbarSteps;
	
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
	DiaSelectDirectEmailTypeSteps diaSelectDirectEmailTypeSteps;
	
	@Steps
	DiaListSMSMessagesSteps diaListSMSMessagesSteps;
	
	@Steps
	DiaSelectSMSMessageTypeSteps diaSelectSMSMessageTypeSteps;
	
	@Steps
	DiaCreateContentDirectEmailSteps diaCreateContentDirectEmailSteps;
	
	@Steps
	DiaCreateContentSMSMessageSteps diaCreateContentSMSMessageSteps;
	
	@Steps
	DiaPreviewContentDirectEmailSteps diaPreviewContentDirectEmailSteps;
	
	@Steps
	DiaPreviewContentSMSMessageSteps diaPreviewContentSMSMessageSteps;
	
	@Steps
	DiaContentDirectEmailHTMLSourceSteps diaContentDirectEmailHTMLSourceSteps;

	
	@Before
	public void setUp() {
		diaLoginSteps.isOnLoginPage();
		diaLoginSteps.inputDataToLoginForm(Variables.clientDomain, Variables.adminUserName, Variables.passWord);
		diaLoginSteps.clickOnLoginButton();	
		diaLeftSidebarSteps.shouldBeAbleToSeeClientDomainName();
	}
	
	@Test
	@Title(value = "Create a Direct Email")
	@WithTags (
	        {
	        	@WithTag(type="feature", name="Prepare Data"), 
	        	@WithTag(type="feature", name="Content Module"),
	        	@WithTag(type="feature", name="Direct Email"),	  
	        	@WithTag(type="story", name="Create Direct Email")
	        }
	)
	public void scenario1_CreateDirectEmail() {
		diaMainMenuSteps.navigateToContentPage();
		diaContentDashboardSteps.onContentDashboardPage();
		diaSubMenuSteps.navigateToPageThatSubMenuItem3PresentFor();
		diaListDirectEmailsSteps.onListDirectEmailsPage();
		diaListDirectEmailsSteps.verifyheaderNameTextListDirectEmails(Variables.workspaceLabel);
		diaSecondActionbarSteps.navigateToPageThatSecondActionBarItem1PresentFor();
		diaSelectDirectEmailTypeSteps.onSelectDirectEmailTypePage();
		diaSelectDirectEmailTypeSteps.verifyheaderNameTextSelectDirectEmailType();
		diaSelectDirectEmailTypeSteps.selected_DirectEmailType(Variables.directemailTypeLabel);
		diaSelectDirectEmailTypeSteps.clickOnNextButton();
		diaCreateContentDirectEmailSteps.onCreateContentDirectEmailPage();
		diaCreateContentDirectEmailSteps.verifyheaderNameTextCreateContentDirectEmail();
		diaCreateContentDirectEmailSteps.setLabel(Variables.directemailLabel);
		diaCreateContentDirectEmailSteps.setName(Variables.directemailName);
		diaCreateContentDirectEmailSteps.setContentDirectEmailSubject("Confirmation Mail");
		diaCreateContentDirectEmailSteps.setContentDirectEmailDescription("");
		diaCreateContentDirectEmailSteps.checkDirectEmailTypeState();
		diaCreateContentDirectEmailSteps.setFromName("Telerik");
		diaCreateContentDirectEmailSteps.setFromAddress("telerik@tripolis.com");
		diaCreateContentDirectEmailSteps.setReplyToAddress("mimo@tripolis.com");
		diaCreateContentDirectEmailSteps.clickOnSaveButton();
		diaPreviewContentDirectEmailSteps.onPreviewContentDirectEmailPage();
		diaPreviewContentDirectEmailSteps.verifyheaderNameTextPreviewDirectEmail(Variables.directemailLabel);
	}
	
	@Test
	@Title(value = "Upload HTML Source to create content for Direct Email")
	@WithTags (
	        {
	        	@WithTag(type="feature", name="Prepare Data"), 
	        	@WithTag(type="feature", name="Content Module"),
	        	@WithTag(type="feature", name="Direct Email"),	  
	        	@WithTag(type="story", name="Direct Email HTML Source Page")
	        }
	)
	public void scenario2_CreateContentForDirectEmail() throws IOException {
		diaMainMenuSteps.navigateToContentPage();
		diaContentDashboardSteps.onContentDashboardPage();
		diaSubMenuSteps.navigateToPageThatSubMenuItem3PresentFor();
		diaListDirectEmailsSteps.onListDirectEmailsPage();
		diaListDirectEmailsSteps.verifyheaderNameTextListDirectEmails(Variables.workspaceLabel);
		diaListDirectEmailsSteps.selectDirectEmail(Variables.directemailLabel);
		diaPreviewContentDirectEmailSteps.onPreviewContentDirectEmailPage();
		diaPreviewContentDirectEmailSteps.verifyheaderNameTextPreviewDirectEmail(Variables.directemailLabel);
		diaActionbarSteps.navigateToPageThatActionBarItem3PresentFor();
		diaContentDirectEmailHTMLSourceSteps.onContentDirectEmailHTMLSourcePage();
		String body = DataHelper.getContentFile("content/directemail/html/confirm.html");
		//System.out.print("==================" + body + "===================");
		diaContentDirectEmailHTMLSourceSteps.setHTMLSourceBody(body);
		diaContentDirectEmailHTMLSourceSteps.clickOnSaveButton();
		diaContentDirectEmailHTMLSourceSteps.verify_UpdateDirectEmailWithoutUnsubscribeURLSuccessfulMessage();
	}
	
	@Test
	@Title(value = "Create a SMS Message")
	@WithTags (
	        {
	        	@WithTag(type="feature", name="Prepare Data"), 
	        	@WithTag(type="feature", name="Content Module"),
	        	@WithTag(type="feature", name="SMS Message"),	  
	        	@WithTag(type="story", name="Create SMS Message")
	        }
	)
	public void scenario3_CreateSMSMessage() throws IOException {
		diaMainMenuSteps.navigateToContentPage();
		diaContentDashboardSteps.onContentDashboardPage();
		diaSubMenuSteps.navigateToPageThatSubMenuItem4PresentFor();
		diaListSMSMessagesSteps.onListSMSMessagesPage();
		diaListSMSMessagesSteps.verifyheaderNameTextListSMSMessages(Variables.workspaceLabel);
		diaSecondActionbarSteps.navigateToPageThatSecondActionBarItem1PresentFor();
		diaSelectSMSMessageTypeSteps.onSelectSMSMessageTypePage();
		diaSelectSMSMessageTypeSteps.verifyheaderNameTextSelectSMSMessageType();
		diaSelectSMSMessageTypeSteps.selected_SMSMessageType(Variables.smsmessageTypeLabel);
		diaSelectSMSMessageTypeSteps.clickOnNextButton();
		diaCreateContentSMSMessageSteps.onCreateContentSMSMessagePage();
		diaCreateContentSMSMessageSteps.verifyheaderNameTextCreateContentSMSMessage();
		diaCreateContentSMSMessageSteps.setLabel(Variables.smsmessageLabel);
		diaCreateContentSMSMessageSteps.setName(Variables.smsmessageName);
		diaCreateContentSMSMessageSteps.setSMSOriginatorNumber("123456789");
		diaCreateContentSMSMessageSteps.setSMSOriginatorName("Support");
		String smsbody = DataHelper.getContentFile("content/smsmessage/textsms1.txt");
		diaCreateContentSMSMessageSteps.setSMSMessage(smsbody);
		diaCreateContentSMSMessageSteps.setAlternativeSMSMessage("");
		diaCreateContentSMSMessageSteps.setDescriptionMessage("");
		diaCreateContentSMSMessageSteps.clickOnSaveButton();
		diaPreviewContentSMSMessageSteps.onPreviewContentSMSMessagePage();
		diaPreviewContentSMSMessageSteps.verify_CreateSMSMessageSuccessfulMessage();
		diaPreviewContentSMSMessageSteps.verifyheaderNameTextPreviewSMSMessage(Variables.smsmessageLabel);
		
	}
	
	@After
	public void tearDown() {
		driver.close();
	}
}
