package com.tripolis.qa.dialogueweb.steps.serenity;

import static org.assertj.core.api.Assertions.assertThat;

import com.tripolis.qa.dialogueweb.pages.DiaEditWorkspacePage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class DiaEditWorkspaceSteps extends ScenarioSteps {
	
	private static final long serialVersionUID = 1L;

	DiaEditWorkspacePage diaEditWorkspacePage;
	
	@Step
	public void onEditWorkspacesPage() {
		assert(diaEditWorkspacePage.getEditWorkspacesUrl());
	}
	
	@Step
	public void verify_HeaderNameTextEditWorkspaces(String keyword) {
		assertThat(diaEditWorkspacePage.getHeaderNameText().equalsIgnoreCase("Edit workspace " + '"' + keyword + '"'));
	}
	
	@Step
	public void editLabel(String keyword) {
		diaEditWorkspacePage.enter_Label(keyword);
	}
	
	@Step
	public void editName(String keyword) {
		diaEditWorkspacePage.enter_Name(keyword);
	}
	
	@Step
	public void checkcontactDatabaseState() {
		diaEditWorkspacePage.contactDatabaseState();
	}
	
	@Step
	public void editPublicDomainNameLinkAndPage(String keyword) {
		diaEditWorkspacePage.enter_PublicDomainNameLinkAndPage(keyword);
	}
	
	@Step
	public void editPublicDomainNameImages(String keyword) {
		diaEditWorkspacePage.enter_PublicDomainNameImages(keyword);
	}
	
	@Step
	public void editBounceDomainName(String keyword) {
		diaEditWorkspacePage.enter_BounceDomainName(keyword);
	}
	
	@Step
	public void editAddListUnsubscribeHeader(boolean value) {
		diaEditWorkspacePage.checkbox_AddListUnsubscribeHeader(value);
	}
	
	@Step
	public void clickOnSaveButton() {
		diaEditWorkspacePage.clickSaveButton();		
	}
}
