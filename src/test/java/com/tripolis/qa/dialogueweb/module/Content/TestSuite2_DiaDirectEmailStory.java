package com.tripolis.qa.dialogueweb.module.Content;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.tripolis.qa.common.Variables;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaContentDashboardSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaContentDirectEmailHTMLSourceSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaCreateContentDirectEmailSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaEditContentDirectEmailSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaHomeSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaListDirectEmailsSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaLoginSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaPreviewContentDirectEmailSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaSelectDirectEmailTypeSteps;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

public class TestSuite2_DiaDirectEmailStory {

	Variables var = new Variables();
	
	@Managed(uniqueSession = true)
	public WebDriver driver;
	
	@Steps
	public DiaLoginSteps diaLoginSteps;
	
	@Steps
	public DiaHomeSteps diaHomeSteps;
	
	@Steps
	DiaContentDashboardSteps diaContentDashboardSteps;
	
	@Steps
	DiaListDirectEmailsSteps diaListDirectEmailsSteps;
	
	@Steps
	DiaSelectDirectEmailTypeSteps diaSelectDirectEmailTypeSteps;
	
	@Steps
	DiaCreateContentDirectEmailSteps diaCreateContentDirectEmailSteps;
	
	@Steps
	DiaPreviewContentDirectEmailSteps diaPreviewContentDirectEmailSteps;
	
	@Steps
	DiaEditContentDirectEmailSteps diaEditContentDirectEmailSteps;
	
	@Steps
	DiaContentDirectEmailHTMLSourceSteps diaContentDirectEmailHTMLSourceSteps;
	
	@Before
	public void setUp() {
		diaLoginSteps.isOnLoginPage();
		diaLoginSteps.inputDataToLoginForm(Variables.clientDomain, Variables.userName, Variables.passWord);
		diaLoginSteps.clickonLoginButton();	
		diaLoginSteps.verifyClientName();
	}
	
	@Test
	public void scenario1_CreateDirectEmail() {
		diaHomeSteps.navigateToContentPage();
		diaContentDashboardSteps.onContentDashboardPage();
		diaContentDashboardSteps.navigateToListDirectEmailsPage();
		diaListDirectEmailsSteps.onListDirectEmailsPage();
		diaListDirectEmailsSteps.verifyheaderNameTextListDirectEmails(Variables.workspaceLabel);
		diaListDirectEmailsSteps.clickOnNewLink();
		diaCreateContentDirectEmailSteps.onCreateContentDirectEmailPage();
		diaSelectDirectEmailTypeSteps.verifyheaderNameTextSelectDirectEmailType();
		diaSelectDirectEmailTypeSteps.selected_DirectEmailType(Variables.directemailTypeLabel);
		diaSelectDirectEmailTypeSteps.clickOnNextButton();
		diaCreateContentDirectEmailSteps.onCreateContentDirectEmailPage();
		diaCreateContentDirectEmailSteps.verifyheaderNameTextCreateContentDirectEmail();
		diaCreateContentDirectEmailSteps.setLabel(Variables.directemailLabel);
		diaCreateContentDirectEmailSteps.setName(Variables.directemailName);
		diaCreateContentDirectEmailSteps.setContentDirectEmailSubject("");
		diaCreateContentDirectEmailSteps.setContentDirectEmailDescription("");
		diaCreateContentDirectEmailSteps.checkDirectEmailTypeState();
		diaCreateContentDirectEmailSteps.setFromName("");
		diaCreateContentDirectEmailSteps.setFromAddress("");
		diaCreateContentDirectEmailSteps.setReplyToAddress("");
		diaCreateContentDirectEmailSteps.clickOnSaveButton();
		diaPreviewContentDirectEmailSteps.onPreviewContentDirectEmailPage();
		diaPreviewContentDirectEmailSteps.verifyheaderNameTextPreviewDirectEmail(Variables.directemailLabel);
	}
	
	@Test
	public void scenario2_CreateContentForDirectEmail() {
		diaHomeSteps.navigateToContentPage();
		diaContentDashboardSteps.onContentDashboardPage();
		diaContentDashboardSteps.navigateToListDirectEmailsPage();
		diaListDirectEmailsSteps.onListDirectEmailsPage();
		diaListDirectEmailsSteps.verifyheaderNameTextListDirectEmails(Variables.workspaceLabel);
		diaListDirectEmailsSteps.selectDirectEmail(Variables.directemailLabel);
		diaPreviewContentDirectEmailSteps.onPreviewContentDirectEmailPage();
		diaPreviewContentDirectEmailSteps.verifyheaderNameTextPreviewDirectEmail(Variables.directemailLabel);
		diaPreviewContentDirectEmailSteps.navigateToDirectEmailHTMLEditorPage();
		diaEditContentDirectEmailSteps.onPreviewContentDirectEmailPage();
	}
	
	@After
	public void tearDown() {
		driver.close();
	}
	
}
