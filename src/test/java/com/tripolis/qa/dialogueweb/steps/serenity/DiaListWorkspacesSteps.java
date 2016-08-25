package com.tripolis.qa.dialogueweb.steps.serenity;

import static org.assertj.core.api.Assertions.assertThat;

import com.tripolis.qa.dialogueweb.pages.DiaListWorkspacesPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class DiaListWorkspacesSteps extends ScenarioSteps {
	
	private static final long serialVersionUID = 1L;
	
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
	public void seeDeleteConfirmedPopup() {
		assertThat(diaListWorkspacesPage.isshowconfirmedPopup()).isTrue();
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
	public String getcontentWorkspaceLabel() {
		return diaListWorkspacesPage.contentWorkspaceLabel();
	}
	
	@Step
	public void selectAllWorkspaces(boolean value) {
		diaListWorkspacesPage.allWorkspaces(value);
	}
	
	@Step
	public void selectWorkspace(String value) {
		diaListWorkspacesPage.findWorkspace(value);
	}
	
	@Step
	public void verify_CreateWorkspaceSuccessfulMessage() {
		assertThat(diaListWorkspacesPage.getSuccessfulMessage().contains("The Workspace was successfully created."));
	}
	
	@Step
	public void verify_UpdateWorkspaceSuccessfulMessage() {
		assertThat(diaListWorkspacesPage.getSuccessfulMessage().contains("The Workspace was successfully updated."));
	}
	
	@Step
	public void verify_DeleteWorkspaceSuccessfulMessage() {
		assertThat(diaListWorkspacesPage.getSuccessfulMessage().contains("The workspace is deleted."));
	}
	
	
}
