package com.tripolis.qa.dialogueweb.steps.serenity;

import com.tripolis.qa.dialogueweb.pages.DiaContactDashboardPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class DiaContactDashboardSteps extends ScenarioSteps {
	
	DiaContactDashboardPage diaContactDashboardPage;
	
	/*
	 * Main Menu
	 */
	
	@Step
	public void navigateToHomePage() {
		diaContactDashboardPage.click_HomePageLink();
	}
	
	@Step
	public void navigateToContactPage() {
		diaContactDashboardPage.click_ContactPageLink();
	}
	
	@Step
	public void navigateToContentPage() {
		diaContactDashboardPage.click_ContentPageLink();
	}
	
	@Step
	public void navigateToCampaignPage() {
		diaContactDashboardPage.click_CampaignPageLink();
	}
	
	@Step
	public void navigateToPublishingPage() {
		diaContactDashboardPage.click_PublishingPageLink();
	}
	
	@Step
	public void navigateToReportPage() {
		diaContactDashboardPage.click_ReportPageLink();
	}
	
	@Step
	public void navigateToProcessingPage() {
		diaContactDashboardPage.click_ProcessePageLink();
	}
	
	@Step
	public void navigateToAdministrationPage() {
		diaContactDashboardPage.click_SetupPageLink();
	}
	
	/*
	 * End Main Menu
	 */
	
	/*
	 * Sub Menu
	 */
	
	@Step
	public void navigateToContactDashBoardPage() {
		diaContactDashboardPage.clickOnsubMenuItem1();
	}
	
	@Step
	public void navigateToListContactsPage() {
		diaContactDashboardPage.clickOnsubMenuItem2();
	}
	
	@Step
	public void navigateToListContactGroupsPage() {
		diaContactDashboardPage.clickOnsubMenuItem3();
	}
	
	@Step
	public void navigateToImportWizardPage() {
		diaContactDashboardPage.clickOnsubMenuItem4();
	}
	
	@Step
	public void navigateToExportAsyncContactsPage() {
		diaContactDashboardPage.clickOnsubMenuItem5();
	}
	
	@Step
	public void navigateToQueryWizardPage() {
		diaContactDashboardPage.clickOnsubMenuItem6();
	}
	
	/*
	 * End Sub Menu
	 */
	
	@Step
	public void onContactDashboardPage() {
		assert(diaContactDashboardPage.getContactDashboardUrl());
	}

}
