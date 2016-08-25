package com.tripolis.qa.dialogueweb.steps.serenity;

import com.tripolis.qa.dialogueweb.pages.DiaAdministrationPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class DiaAdministrationSteps extends ScenarioSteps {

	private static final long serialVersionUID = 1L;
	
	DiaAdministrationPage diaAdministrationPage;
	
	/*
	 * Main Menu
	 */
	
	@Step
	public void navigateToHomePage() {
		diaAdministrationPage.click_HomePageLink();
	}
	
	@Step
	public void navigateToContactPage() {
		diaAdministrationPage.click_ContactPageLink();
	}
	
	@Step
	public void navigateToContentPage() {
		diaAdministrationPage.click_ContentPageLink();
	}
	
	@Step
	public void navigateToCampaignPage() {
		diaAdministrationPage.click_CampaignPageLink();
	}
	
	@Step
	public void navigateToPublishingPage() {
		diaAdministrationPage.click_PublishingPageLink();
	}
	
	@Step
	public void navigateToReportPage() {
		diaAdministrationPage.click_ReportPageLink();
	}
	
	@Step
	public void navigateToProcessingPage() {
		diaAdministrationPage.click_ProcessePageLink();
	}
	
	@Step
	public void navigateToAdministrationPage() {
		diaAdministrationPage.click_SetupPageLink();
	}
	
	
	/*
	 * End Main Menu
	 */
	
	/*
	 * Sub Menu
	 */
	
	@Step
	public void navigateToListContactDatabasesPage() {
		diaAdministrationPage.clickOnsubMenuItem1();
	}
	
	@Step
	public void navigateToListWorkspacePage() {
		diaAdministrationPage.clickOnsubMenuItem2();
	}
	
	@Step
	public void navigateToSelectAdminModulePublishingPage() {
		diaAdministrationPage.clickOnsubMenuItem3();
	}
	
	@Step
	public void navigateToSelectAdminModuleApplicationPage() {
		diaAdministrationPage.clickOnsubMenuItem4();
	}
	
	/*
	 * End Sub Menu
	 */
	
	@Step
	public void onAdministrationPage() {
		assert(diaAdministrationPage.getAdministrationUrl());
	}

}
