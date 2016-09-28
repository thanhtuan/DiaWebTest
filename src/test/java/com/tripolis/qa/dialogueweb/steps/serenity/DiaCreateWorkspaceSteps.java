package com.tripolis.qa.dialogueweb.steps.serenity;

import static org.assertj.core.api.Assertions.assertThat;

import com.tripolis.qa.dialogueweb.pages.DiaCreateWorkspacePage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class DiaCreateWorkspaceSteps extends ScenarioSteps {
	
	private static final long serialVersionUID = 1L;
	
	DiaCreateWorkspacePage diaCreateWorkspacePage;

	@Step
	public void onCreateWorkspacesPage() {
		assert(diaCreateWorkspacePage.getCreateWorkspacesUrl());
	}
	
	@Step
	public void verifyheaderNameTextCreateWorkspaces() {
		assertThat(diaCreateWorkspacePage.getHeaderNameText().equalsIgnoreCase("New workspace"));
	}
	
	@Step
	public void setLabel(String keyword) {
		diaCreateWorkspacePage.enter_Label(keyword);
	}
	
	@Step
	public void setName(String keyword) {
		diaCreateWorkspacePage.enter_Name(keyword);
	}
	
	@Step
	public void selected_DB(String keyword) {
		diaCreateWorkspacePage.select_ContactDatabase(keyword);
	}
	
	@Step
	public void setPublicDomainNameLinkAndPage(String keyword) {
		diaCreateWorkspacePage.enter_PublicDomainNameLinkAndPage(keyword);
	}
	
	@Step
	public void setPublicDomainNameImages(String keyword) {
		diaCreateWorkspacePage.enter_PublicDomainNameImages(keyword);
	}
	
	@Step
	public void setBounceDomainName(String keyword) {
		diaCreateWorkspacePage.enter_BounceDomainName(keyword);
	}
	
	@Step
	public void setAddListUnsubscribeHeader(boolean value) {
		diaCreateWorkspacePage.checkbox_AddListUnsubscribeHeader(value);
	}
	
	@Step
	public void clickOnSaveButton() {
		diaCreateWorkspacePage.clickSaveButton();
	}
}
