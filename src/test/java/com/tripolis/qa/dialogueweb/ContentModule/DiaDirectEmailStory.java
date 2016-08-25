package com.tripolis.qa.dialogueweb.ContentModule;

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
import com.tripolis.qa.common.DiaSubMenuSteps;
import com.tripolis.qa.common.Variables;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaContentDashboardSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaContentDirectEmailHTMLSourceSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaCreateContentDirectEmailSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaEditContentDirectEmailSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaHomeSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaDirectEmailsBrowseSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaLoginSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaPreviewContentDirectEmailSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaSelectDirectEmailTypeSteps;
import com.tripolis.qa.util.DataHelper;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DiaDirectEmailStory {

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
	DiaLoginSteps diaLoginSteps;
	
	@Steps
	DiaHomeSteps diaHomeSteps;
	
	@Steps
	DiaContentDashboardSteps diaContentDashboardSteps;
	
	@Steps
	DiaDirectEmailsBrowseSteps diaListDirectEmailsSteps;
	
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
		diaLeftSidebarSteps.verifyClientName();
	}
	
	@Pending @Test
	public void scenario1_CreateDirectEmail() {
		diaMainMenuSteps.navigateToContentPage();
		diaContentDashboardSteps.onContentDashboardPage();
		diaSubMenuSteps.navigateToPageThatSubMenuItem3PresentFor();
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
	
	@Pending @Test
	public void scenario2_UpdateContentForDirectEmail() throws IOException {
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
		String body = DataHelper.getContentFile("content/html/confirm.html");
		System.out.print("==================" + body + "===================");
		diaContentDirectEmailHTMLSourceSteps.setHTMLSourceBody(body);
		diaContentDirectEmailHTMLSourceSteps.clickOnSaveButton();
		diaContentDirectEmailHTMLSourceSteps.verify_UpdateDirectEmailWithoutUnsubscribeURLSuccessfulMessage();
	}
	
	@After
	public void tearDown() {
		driver.close();
	}
	
}
