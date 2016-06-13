package com.tripolis.qa.dialogueweb.steps.serenity;

import static org.assertj.core.api.Assertions.assertThat;

import com.tripolis.qa.dialogueweb.pages.DiaListSMSMessageTypeDefinitions;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class DiaListSMSMessageTypeDefinitionsSteps extends ScenarioSteps {
	
	DiaListSMSMessageTypeDefinitions diaListSMSMessageTypeDefinitions;
	
	@Step
	public void onListSMSTypeDefinitionsPage() {
		assert(diaListSMSMessageTypeDefinitions.getListSMSTypeDefinitionUrl());
	}
	
	@Step
	public void verifyheaderNameTextListSMSTypeDefinitions(String value) {
		assertThat(diaListSMSMessageTypeDefinitions.getheaderNameText().equalsIgnoreCase("SMS message types in " + '"' + value + '"'));
	}
	
	@Step
	public void selectSMSType() {
		diaListSMSMessageTypeDefinitions.select_SMSType();
	}
	
	@Step
	public void clickOnNewLink() {
		diaListSMSMessageTypeDefinitions.clickNewLink();
	}
	
	@Step
	public void clickOnEditButton() {
		diaListSMSMessageTypeDefinitions.clickEditButton();
	}
	
	@Step
	public void clickOnDeleteButton () {
		diaListSMSMessageTypeDefinitions.clickDeleteButton();
	}
	
	@Step
	public void seeConfirmedPopup() {
		assertThat(diaListSMSMessageTypeDefinitions.isshowSMSconfirmedPopup()).isTrue();
	}
	
	@Step
	public void verifyconfirmedMessage() {
		assertThat(diaListSMSMessageTypeDefinitions.getconfirmedMessage().equalsIgnoreCase("Are you sure you would like to delete the selected sms message type(s)?"));
	}
	
	@Step
	public void clickOnConfirmedOkButton () {
		diaListSMSMessageTypeDefinitions.clickConfirmedOkButton();
	}
	
	@Step
	public void clickOnConfirmedCancelButton () {
		diaListSMSMessageTypeDefinitions.clickConfirmedCancelButton();
	}

}
