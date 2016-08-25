package com.tripolis.qa.common;

import static org.assertj.core.api.Assertions.assertThat;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class DiaMainMenuSteps extends ScenarioSteps {

	private static final long serialVersionUID = 1L;
	
	DiaMainMenuPage diaMainMenuPage;
	
	@Step
	public void mainMenuShouldVisible() {
		assertThat(diaMainMenuPage.mainMenuisVisible()).isTrue();
	}
	
	@Step
	public void navigateToHomePage() {
		diaMainMenuPage.click_HomePageLink();
	}
	
	@Step
	public void navigateToContactPage() {
		diaMainMenuPage.click_ContactPageLink();
	}
	
	@Step
	public void navigateToContentPage() {
		diaMainMenuPage.click_ContentPageLink();
	}
	
	@Step
	public void navigateToCampaignPage() {
		diaMainMenuPage.click_CampaignPageLink();
	}
	
	@Step
	public void navigateToPublishingPage() {
		diaMainMenuPage.click_PublishingPageLink();
	}
	
	@Step
	public void navigateToReportPage() {
		diaMainMenuPage.click_ReportPageLink();
	}
	
	@Step
	public void navigateToProcessingPage() {
		diaMainMenuPage.click_ProcessePageLink();
	}
	
	@Step
	public void navigateToAdministrationPage() {
		diaMainMenuPage.click_SetupPageLink();
	}

}
