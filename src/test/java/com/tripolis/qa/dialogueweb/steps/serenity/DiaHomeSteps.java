package com.tripolis.qa.dialogueweb.steps.serenity;

import static org.assertj.core.api.Assertions.assertThat;

import com.tripolis.qa.dialogueweb.pages.DiaHomePage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class DiaHomeSteps extends ScenarioSteps {
	
	private static final long serialVersionUID = 1L;
	
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
	
	/*
	 * Steps using methods from diaHomePage
	 */
	
	@Step
	public void verifyClientName() {
		assertThat(diaHomePage.getClientName().equalsIgnoreCase("Client: Tripolis QA"));
	}
	
	@Step
	public void mainMenuShouldVisible() {
		assertThat(diaHomePage.mainMenuisVisible()).isTrue();
	}
	
	@Step
	public void verifyIsOnHomePage() {	
		//System.out.println("-----------Test--------: " + diaHomePage.getHomeurl());
		assert(diaHomePage.getHomeurl());
		
	}
	
	/*
	 * *******End steps using methods from diaHomePage********
	 */

}
