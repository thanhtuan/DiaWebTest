package com.tripolis.qa.dialogueweb.steps.serenity;

import static org.assertj.core.api.Assertions.assertThat;

import com.tripolis.qa.dialogueweb.pages.DiaListWorkspacesPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class DiaListWorkspacesSteps extends ScenarioSteps {
	
	DiaListWorkspacesPage diaListWorkspacesPage;
	
	@Step
	public void onListWorkspacesPage() {
		assert(diaListWorkspacesPage.getListWorkspacesUrl());
	}
	
	@Step
	public void verifyheaderNameTextListWorkspaces() {
		assertThat(diaListWorkspacesPage.getheaderNameText().equalsIgnoreCase("List of workspaces"));
	}
	
	@Step
	public void clickOnNewLink() {
		diaListWorkspacesPage.clickNewLink();
	}
	
	@Step
	public void clickOnEditButton() {
		diaListWorkspacesPage.clickEditButton();
	}
	
	@Step
	public void clickOnDeleteButton () {
		diaListWorkspacesPage.clickDeleteButton();
	}
	
	@Step
	public void verifyDeleteconfirmedMessage() {
		assertThat(diaListWorkspacesPage.getconfirmedMessage().equalsIgnoreCase("Are you sure you would like to delete this workspace?"));
	}
	
	@Step
	public void clickOnConfirmedButton () {
		diaListWorkspacesPage.clickconfirmedButton();
	}
	
	@Step
	public void clickOnDeleteBtn () {
		diaListWorkspacesPage.clickDeleteBtn();
	}
	
	@Step
	public String getcontentWorkspaceAttribute() {
		return diaListWorkspacesPage.contentWorkspaceAttribute();
	}
	
	@Step
	public void selectWorkspace() {
		diaListWorkspacesPage.select_Workspaces();
	}
	
	/*
	 * Handle the Left Panel on List Workspaces Page
	 */
	
	@Step
	public void navigateToEditWorkspace() {
		diaListWorkspacesPage.clickOnleftpanelItem1();
	}
	
	@Step
	public void navigateToListArticleTypeDefinitions() {
		diaListWorkspacesPage.clickOnleftpanelItem2();
	}
	
	@Step
	public void navigateToListNewsletterTypeDefinitions() {
		diaListWorkspacesPage.clickOnleftpanelItem3();
	}
	
	@Step
	public void navigateToListEmailTypeDefinitions() {
		diaListWorkspacesPage.clickOnleftpanelItem4();
	}
	
	@Step
	public void navigateToListSMSTypeDefinitions() {
		diaListWorkspacesPage.clickOnleftpanelItem5();
	}
	
	@Step
	public void navigateToListAnalyticsIntegrations() {
		diaListWorkspacesPage.clickOnleftpanelItem6();
	}
	
	@Step
	public void navigateToListProcedureDefinitions() {
		diaListWorkspacesPage.clickOnleftpanelItem7();
	}
	
	/*
	 * Handle the Left Panel on List Workspaces Page
	 */
}
