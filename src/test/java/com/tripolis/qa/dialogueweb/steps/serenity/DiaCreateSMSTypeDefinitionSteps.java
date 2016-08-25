package com.tripolis.qa.dialogueweb.steps.serenity;

import static org.assertj.core.api.Assertions.assertThat;

import com.tripolis.qa.dialogueweb.pages.DiaCreateSMSMessageTypeDefinition;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class DiaCreateSMSTypeDefinitionSteps extends ScenarioSteps {
	
	private static final long serialVersionUID = 1L;
	
	DiaCreateSMSMessageTypeDefinition diaCreateSMSMessageTypeDefinition;
	
	@Step
	public void onCreateSMSTypePage() {
		assert(diaCreateSMSMessageTypeDefinition.getCreateSMSTypeDefinitionUrl());
	}
	
	@Step
	public void verifyheaderNameTextCreateSMSTypeDefinitions() {
		assertThat(diaCreateSMSMessageTypeDefinition.getheaderNameText().equalsIgnoreCase("Create SMS message type"));
	}
	
	@Step
	public void setLabel(String keyword) {
		diaCreateSMSMessageTypeDefinition.enter_Label(keyword);
	}
	
	@Step
	public void setName(String keyword) {
		diaCreateSMSMessageTypeDefinition.enter_Name(keyword);
	}
	
	@Step
	public void setDefaultOriginatorNumber(String keyword) {
		diaCreateSMSMessageTypeDefinition.enter_DefaultOriginatorNumber(keyword);
	}
	
	@Step
	public void setDefaultOriginator(String keyword) {
		diaCreateSMSMessageTypeDefinition.enter_DefaultOriginator(keyword);
	}
	
	@Step
	public void setMobilePhoneField(String keyword) {
		diaCreateSMSMessageTypeDefinition.select_MobilePhoneField(keyword);
	}
	
	@Step
	public void setLongSMSEnabled(boolean value) {
		diaCreateSMSMessageTypeDefinition.checkbox_LongSMSEnabled(value);
	}
	
	@Step
	public void clickOnSaveButton() {
		diaCreateSMSMessageTypeDefinition.clickSaveButton();
	}

}
