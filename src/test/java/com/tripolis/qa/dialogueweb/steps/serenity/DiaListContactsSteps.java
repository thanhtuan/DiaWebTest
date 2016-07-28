package com.tripolis.qa.dialogueweb.steps.serenity;

import static org.assertj.core.api.Assertions.assertThat;

import com.tripolis.qa.dialogueweb.pages.DiaListContactsPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class DiaListContactsSteps extends ScenarioSteps {
	
	DiaListContactsPage diaListContactsPage;
	
	/*
	 * Sub Menu
	 */
	
	@Step
	public void navigateToContactDashBoardPage() {
		diaListContactsPage.clickOnsubMenuItem1();
	}
	
	@Step
	public void navigateToListContactsPage() {
		diaListContactsPage.clickOnsubMenuItem2();
	}
	
	@Step
	public void navigateToListContactGroupsPage() {
		diaListContactsPage.clickOnsubMenuItem3();
	}
	
	@Step
	public void navigateToImportWizardPage() {
		diaListContactsPage.clickOnsubMenuItem4();
	}
	
	@Step
	public void navigateToExportAsyncContactsPage() {
		diaListContactsPage.clickOnsubMenuItem5();
	}
	
	@Step
	public void navigateToQueryWizardPage() {
		diaListContactsPage.clickOnsubMenuItem6();
	}
	
	/*
	 * End Sub Menu
	 */
	
	@Step
	public void onListContactsPage() {
		assert(diaListContactsPage.getListContactsUrl());
	}
	
	@Step
	public void verifyheaderNameTextListContacts(String value) {
		assertThat(diaListContactsPage.getheaderNameText().equalsIgnoreCase("List of contacts for database " + value));
	}
	
	@Step
	public void selectAllContacts(boolean value) {
		diaListContactsPage.allContacts(value);
	}
	
	@Step
	public void selectContact(String value) {
		diaListContactsPage.findContact(value);
	}
	
	@Step
	public void clickOnNewLink() {
		diaListContactsPage.clickNewLink();
	}
	
	@Step
	public void clickOnViewButton() {
		diaListContactsPage.clickViewButton();
	}
	
	@Step
	public void clickOnEditButton() {
		diaListContactsPage.clickEditButton();
	}
	
	@Step
	public void clickOnDeleteButton () {
		diaListContactsPage.clickDeleteButton();
	}
	
	@Step
	public void seeDeleteConfirmedPopup() {
		assertThat(diaListContactsPage.isshowconfirmedPopup()).isTrue();
	}
	
	@Step
	public void verifyconfirmedMessage() {
		assertThat(diaListContactsPage.getconfirmedMessage().equalsIgnoreCase("1 number of contact(s) will be deleted from the database. Are you sure you want to do this?"));
	}
	
	@Step
	public void clickOnConfirmButton () {
		diaListContactsPage.clickconfirmButton();
	}
	
	@Step
	public void clickOnConfirmedCancelButton () {
		diaListContactsPage.clickConfirmedCancelButton();
	}
	
	@Step
	public void clickOnConfirmedOkButton () {
		diaListContactsPage.clickConfirmedOkButton();
	}

}
