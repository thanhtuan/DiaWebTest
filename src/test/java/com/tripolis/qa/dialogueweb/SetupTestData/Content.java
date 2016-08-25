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
import com.tripolis.qa.common.DiaSubMenuSteps;
import com.tripolis.qa.common.Variables;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaContentDashboardSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaContentDirectEmailHTMLSourceSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaCreateContentDirectEmailSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaHomeSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaDirectEmailsBrowseSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaLoginSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaPreviewContentDirectEmailSteps;
import com.tripolis.qa.dialogueweb.steps.serenity.DiaSelectDirectEmailTypeSteps;
import com.tripolis.qa.util.DataHelper;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
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
	DiaContentDirectEmailHTMLSourceSteps diaContentDirectEmailHTMLSourceSteps;

	
	@Before
	public void setUp() {
		diaLoginSteps.isOnLoginPage();
		diaLoginSteps.inputDataToLoginForm("Tripolis QA", "test_automated_user@tripolis.com", "test");
		diaLoginSteps.clickonLoginButton();	
		diaLeftSidebarSteps.verifyClientName();
	}
	
	@Test
	@WithTags (
	        {
	                @WithTag(type="feature", name="Direct Email"),
	                @WithTag(type="feature", name="Prepare Data")
	        }
	)
	public void scenario1_CreateDirectEmail() {
		diaMainMenuSteps.navigateToContentPage();
		diaContentDashboardSteps.onContentDashboardPage();
		diaSubMenuSteps.navigateToPageThatSubMenuItem3PresentFor();
		diaListDirectEmailsSteps.onListDirectEmailsPage();
		diaListDirectEmailsSteps.verifyheaderNameTextListDirectEmails(Variables.workspaceLabel);
		diaListDirectEmailsSteps.clickOnNewLink();
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
	@WithTags (
	        {
	                @WithTag(type="feature", name="Direct Email"),
	                @WithTag(type="feature", name="Prepare Data")
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
