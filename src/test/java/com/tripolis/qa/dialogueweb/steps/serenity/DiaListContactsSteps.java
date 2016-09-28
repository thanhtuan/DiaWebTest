package com.tripolis.qa.dialogueweb.steps.serenity;

import static org.assertj.core.api.Assertions.assertThat;

import com.tripolis.qa.dialogueweb.pages.DiaListContactsPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class DiaListContactsSteps extends ScenarioSteps {
	
	private static final long serialVersionUID = 1L;
	
	DiaListContactsPage diaListContactsPage;
	
	@Step
	public void onListContactsPage() {
		assert(diaListContactsPage.getListContactsUrl());
	}
	
	@Step
	public void verifyheaderNameTextListContacts(String value) {
		assertThat(diaListContactsPage.getHeaderNameText().equalsIgnoreCase("List of contacts for database " + value));
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
	public void typeAndEnterOnFilterEmail(String keyword) {
		diaListContactsPage.typeAndEnterFilterEmail(keyword);
	}
	
	@Step
	public void typeAndEnterOnFilterName(String keyword) {
		diaListContactsPage.typeAndEnterFilterName(keyword);
	}
	
	@Step
	public void typeAndEnterOnFilterMobile(String keyword) {
		diaListContactsPage.typeAndEnterFilterMobile(keyword);
	}
	
	/*@Step
	public void dataForFilter(String keyword) {
		diaListContactsPage.enterDataForFilter(keyword);
	}*/
	
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
