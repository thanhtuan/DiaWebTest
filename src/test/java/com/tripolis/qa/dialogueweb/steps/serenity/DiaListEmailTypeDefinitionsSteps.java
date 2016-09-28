package com.tripolis.qa.dialogueweb.steps.serenity;

import static org.assertj.core.api.Assertions.assertThat;

import com.tripolis.qa.dialogueweb.pages.DiaListEmailTypeDefinitions;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class DiaListEmailTypeDefinitionsSteps extends ScenarioSteps {
	
	private static final long serialVersionUID = 1L;
	
	DiaListEmailTypeDefinitions diaListEmailTypeDefinitions;
	
	@Step
	public void onListEmailTypeDefinitionsPage() {
		assert(diaListEmailTypeDefinitions.getListEmailTypeDefinitionUrl());
	}
	
	@Step
	public void verifyheaderNameTextListEmailTypeDefinitions(String value) {
		assertThat(diaListEmailTypeDefinitions.getHeaderNameText().equalsIgnoreCase("Direct email types in " + '"' + value + '"'));
	}
	
	@Step
	public void selectAllDirectEmailType(boolean value) {
		diaListEmailTypeDefinitions.allDirectEmailType(value);
	}
	
	@Step
	public void selectDirectEmailType(String value) {
		diaListEmailTypeDefinitions.findDirectEmailType(value);
	}
	
	/*@Step
	public void clickOnNewLink() {
		diaListEmailTypeDefinitions.clickNewLink();
	}*/
	
	@Step
	public void clickOnEditButton() {
		diaListEmailTypeDefinitions.clickEditButton();
	}
	
	@Step
	public void clickOnDeleteButton () {
		diaListEmailTypeDefinitions.clickDeleteButton();
	}
	
	@Step
	public void seeDeleteConfirmedPopup() {
		assertThat(diaListEmailTypeDefinitions.isshowconfirmedPopup()).isTrue();
	}
	
	@Step
	public void verifyconfirmedMessage() {
		assertThat(diaListEmailTypeDefinitions.getconfirmedMessage().equalsIgnoreCase("Are you sure you want to delete the selected direct email type(s)?"));
	}
	
	@Step
	public void clickOnConfirmedCancelButton () {
		diaListEmailTypeDefinitions.clickConfirmedCancelButton();
	}
	
	@Step
	public void clickOnConfirmedOkButton () {
		diaListEmailTypeDefinitions.clickConfirmedOkButton();
	}
	
	@Step
	public void verify_UpdateDirectEmailTypeSuccessfulMessage() {
		assertThat(diaListEmailTypeDefinitions.getSuccessfulMessage().contains("The Direct email type was successfully updated."));
	}
	
	@Step
	public void verify_DeleteDirectEmailTypeSuccessfulMessage() {
		assertThat(diaListEmailTypeDefinitions.getSuccessfulMessage().contains("The Direct email type is deleted."));
	}

}
