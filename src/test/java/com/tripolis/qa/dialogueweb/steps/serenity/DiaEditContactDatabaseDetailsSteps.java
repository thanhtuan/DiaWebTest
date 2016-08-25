package com.tripolis.qa.dialogueweb.steps.serenity;

import static org.assertj.core.api.Assertions.assertThat;

import com.tripolis.qa.dialogueweb.pages.DiaEditContactDatabaseDetailsPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class DiaEditContactDatabaseDetailsSteps extends ScenarioSteps {
	
	private static final long serialVersionUID = 1L;

	DiaEditContactDatabaseDetailsPage diaEditContactDatabaseDetailsPage;
	
	@Step
	public void onEditContactDatabasePage() {
		assert(diaEditContactDatabaseDetailsPage.getEditContactDatabaseUrl());
	}
	
	@Step
	public void verify_HeaderNameTextEditContactDatabase(String keyword) {
		assertThat(diaEditContactDatabaseDetailsPage.getheaderNameText().equalsIgnoreCase("Edit contact database " + '"' + keyword + '"'));
	}
	
	@Step
	public void editLabel(String keyword) {
		diaEditContactDatabaseDetailsPage.enter_Label(keyword);
	}
	
	@Step
	public void editName(String keyword) {
		diaEditContactDatabaseDetailsPage.enter_Name(keyword);
	}
	
	@Step
	public void editPresentationField(String keyword) {
		diaEditContactDatabaseDetailsPage.select_PresentationField(keyword);
	}
	
	@Step
	public void clickOnSubmitButton() {
		diaEditContactDatabaseDetailsPage.clickSaveButton();
	}
}
