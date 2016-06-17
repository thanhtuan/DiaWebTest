package com.tripolis.qa.dialogueweb.steps.serenity;

import static org.assertj.core.api.Assertions.assertThat;

import com.tripolis.qa.dialogueweb.pages.DiaListContactDatabasesPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class DiaListContactDatabasesSteps extends ScenarioSteps {
	
	DiaListContactDatabasesPage diaListContactDatabasesPage;
	
	@Step
	public void onListContactDatabasesPage() {
		assert(diaListContactDatabasesPage.getListContactDatabasesUrl());
	}
	
	@Step
	public void verifyheaderNameTextListContactDatabases() {
		assertThat(diaListContactDatabasesPage.getheaderNameText().equalsIgnoreCase("List of contact databases"));
	}
	
	@Step
	public void clickOnNewLink() {
		diaListContactDatabasesPage.clickNewLink();
	}

	@Step
	public void clickOnEditButton() {
		diaListContactDatabasesPage.clickEditButton();
	}
	
	@Step
	public void clickOnDeleteButton () {
		diaListContactDatabasesPage.clickDeleteButton();
	}
	
	@Step
	public void seeDeleteConfirmedPopup() {
		assertThat(diaListContactDatabasesPage.isshowconfirmedPopup()).isTrue();
	}
	
	@Step
	public void verifyDeleteconfirmedMessage(String keyword) {
		assertThat(diaListContactDatabasesPage.getconfirmedMessage().equalsIgnoreCase("Are you sure you would like to delete these contact databases (" + keyword + ")?"));
	}
	
	@Step
	public void clickOnConfirmedButton () {
		diaListContactDatabasesPage.clickconfirmedButton();
	}
	
	@Step
	public void clickOnDeleteBtn () {
		diaListContactDatabasesPage.clickDeleteBtn();
	}
	
	@Step
	public String getcontactDatabasesAttribute() {
		return diaListContactDatabasesPage.contactDatabasesAttribute();
	}
	
	@Step
	public String getcontactDatabasesLabel() {
		return diaListContactDatabasesPage.contactDatabasesLabel();
	}
	
	@Step
	public void selectContactDB (String value) {
		diaListContactDatabasesPage.findContactDatabases(value);
	}
	
	@Step
	public void selectallContactDatabases(boolean value) {
		diaListContactDatabasesPage.allContactDatabases(value);
	}

}
