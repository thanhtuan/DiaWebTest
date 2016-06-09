package com.tripolis.qa.dialogueweb.steps.serenity;

import static org.assertj.core.api.Assertions.assertThat;

import com.tripolis.qa.dialogueweb.pages.DiaCreateWorkspacePage;
import com.tripolis.qa.dialogueweb.pages.DiaEditWorkspacePage;
import com.tripolis.qa.dialogueweb.pages.DiaListContactDatabasesPage;
import com.tripolis.qa.dialogueweb.pages.DiaListWorkspacesPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class DiaWorkspaceSteps extends ScenarioSteps {
	
	DiaListContactDatabasesPage diaListContactDatabasesPage;
	DiaListWorkspacesPage diaListWorkspacesPage;
	DiaCreateWorkspacePage diaCreateWorkspacePage;
	DiaEditWorkspacePage diaEditWorkspacePage;
	
	
	/*
	 * Steps using methods from DiaListContactDatabasesPage
	 */
	
	@Step
	public void navigateToListWorkspacePage() {
		diaListContactDatabasesPage.clickOnsubMenuItem2();
	}
	
	/*
	 * *******End Steps using methods from DiaListContactDatabasesPage********
	 */
	
	/*
	 * Steps using methods from ListWorkspacesPage
	 */
	
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
	 * *******End Steps using methods from ListWorkspacesPage********
	 */
	
	
	
	/*
	 * Steps using methods from DiaCreateWorkspacePage
	 */
	
	@Step
	public void onCreateWorkspacesPage() {
		assert(diaCreateWorkspacePage.getCreateWorkspacesUrl());
	}
	
	@Step
	public void verifyheaderNameTextCreateWorkspaces() {
		assertThat(diaCreateWorkspacePage.getheaderNameText().equalsIgnoreCase("New workspace"));
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
	
	/*
	 * *******End Steps using methods from DiaCreateWorkspacePage********
	 */
	
	
	/*
	 * Steps using methods from DiaEditWorkspacePage
	 */
	
	@Step
	public void onEditWorkspacesPage() {
		assert(diaEditWorkspacePage.getEditWorkspacesUrl());
	}
	
	@Step
	public void verify_HeaderNameTextEditWorkspaces(String keyword) {
		assertThat(diaEditWorkspacePage.getheaderNameText().equalsIgnoreCase("Edit workspace " + '"' + keyword + '"'));
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
	public void clickOnSaveButtonEditPage() {
		diaEditWorkspacePage.clickSaveButton();		
	}
	
	/*
	 * *******End Steps using methods from DiaEditWorkspacePage********
	 */

}
