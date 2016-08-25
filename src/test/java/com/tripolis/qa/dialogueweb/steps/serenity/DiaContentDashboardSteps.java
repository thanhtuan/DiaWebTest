package com.tripolis.qa.dialogueweb.steps.serenity;

import com.tripolis.qa.dialogueweb.pages.DiaContentDashboardPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class DiaContentDashboardSteps extends ScenarioSteps {
	
	private static final long serialVersionUID = 1L;
	
	DiaContentDashboardPage diaContentDashboardPage;
	
	/*
	 * Main Menu
	 */
	
	@Step
	public void navigateToHomePage() {
		diaContentDashboardPage.click_HomePageLink();
	}
	
	@Step
	public void navigateToContactPage() {
		diaContentDashboardPage.click_ContactPageLink();
	}
	
	@Step
	public void navigateToContentPage() {
		diaContentDashboardPage.click_ContentPageLink();
	}
	
	@Step
	public void navigateToCampaignPage() {
		diaContentDashboardPage.click_CampaignPageLink();
	}
	
	@Step
	public void navigateToPublishingPage() {
		diaContentDashboardPage.click_PublishingPageLink();
	}
	
	@Step
	public void navigateToReportPage() {
		diaContentDashboardPage.click_ReportPageLink();
	}
	
	@Step
	public void navigateToProcessingPage() {
		diaContentDashboardPage.click_ProcessePageLink();
	}
	
	@Step
	public void navigateToAdministrationPage() {
		diaContentDashboardPage.click_SetupPageLink();
	}
	
	/*
	 * End Main Menu
	 */
	
	/*
	 * Sub Menu
	 */
	
	@Step
	public void navigateToContentDashBoardPage() {
		diaContentDashboardPage.clickOnsubMenuItem1();
	}
	
	@Step
	public void navigateToListNewslettersPage() {
		diaContentDashboardPage.clickOnsubMenuItem2();
	}
	
	@Step
	public void navigateToListDirectEmailsPage() {
		diaContentDashboardPage.clickOnsubMenuItem3();
	}
	
	@Step
	public void navigateToListSMSMessagesPage() {
		diaContentDashboardPage.clickOnsubMenuItem4();
	}
	
	@Step
	public void navigateToListArticlesInLibraryPage() {
		diaContentDashboardPage.clickOnsubMenuItem5();
	}
	
	/*
	 * End Sub Menu
	 */
	
	@Step
	public void onContentDashboardPage() {
		assert(diaContentDashboardPage.getContentDashboardUrl());
	}

}
