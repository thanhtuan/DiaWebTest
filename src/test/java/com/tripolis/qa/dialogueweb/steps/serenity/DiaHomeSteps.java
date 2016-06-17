package com.tripolis.qa.dialogueweb.steps.serenity;

import com.tripolis.qa.dialogueweb.pages.DiaHomePage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class DiaHomeSteps extends ScenarioSteps {
	
	DiaHomePage diaHomePage;
	
	/*
	 * Main Menu
	 */
	
	@Step
	public void navigateToHomePage() {
		diaHomePage.click_HomePageLink();
	}
	
	@Step
	public void navigateToContactPage() {
		diaHomePage.click_ContactPageLink();
	}
	
	@Step
	public void navigateToContentPage() {
		diaHomePage.click_ContentPageLink();
	}
	
	@Step
	public void navigateToCampaignPage() {
		diaHomePage.click_CampaignPageLink();
	}
	
	@Step
	public void navigateToPublishingPage() {
		diaHomePage.click_PublishingPageLink();
	}
	
	@Step
	public void navigateToReportPage() {
		diaHomePage.click_ReportPageLink();
	}
	
	@Step
	public void navigateToProcessingPage() {
		diaHomePage.click_ProcessePageLink();
	}
	
	@Step
	public void navigateToAdministrationPage() {
		diaHomePage.click_SetupPageLink();
	}
	
	/*
	 * End Main Menu
	 */

}
