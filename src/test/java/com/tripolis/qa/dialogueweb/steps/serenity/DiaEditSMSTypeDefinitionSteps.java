package com.tripolis.qa.dialogueweb.steps.serenity;

import static org.assertj.core.api.Assertions.assertThat;

import com.tripolis.qa.dialogueweb.pages.DiaEditSMSMessageTypeDefinition;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class DiaEditSMSTypeDefinitionSteps extends ScenarioSteps {
	
	DiaEditSMSMessageTypeDefinition diaEditSMSMessageTypeDefinition;
	
	@Step
	public void onEditSMSTypePage() {
		assert(diaEditSMSMessageTypeDefinition.getEditEmailTypeDefinitionUrl());
	}
	
	@Step
	public void verifyheaderNameTextEditSMSType(String value) {
		assertThat(diaEditSMSMessageTypeDefinition.getheaderNameText().equalsIgnoreCase("Edit SMS message type " + '"' + value + '"'));
	}
	
	@Step
	public void editLabel(String keyword) {
		diaEditSMSMessageTypeDefinition.enter_Label(keyword);
	}
	
	@Step
	public void checkSMSMesageNameState() {
		diaEditSMSMessageTypeDefinition.smsTypeNameState();
	}
	
	@Step
	public void editDefaultOriginatorNumber(String keyword) {
		diaEditSMSMessageTypeDefinition.enter_DefaultOriginatorNumber(keyword);
	}
	
	@Step
	public void editDefaultOriginator(String keyword) {
		diaEditSMSMessageTypeDefinition.enter_DefaultOriginator(keyword);
	}
	
	@Step
	public void editMobilePhoneField(String keyword) {
		diaEditSMSMessageTypeDefinition.select_MobilePhoneField(keyword);
	}
	
	@Step
	public void editLongSMSEnabled(boolean value) {
		diaEditSMSMessageTypeDefinition.checkbox_LongSMSEnabled(value);
	}
	
	@Step
	public void clickOnSaveButton() {
		diaEditSMSMessageTypeDefinition.clickSaveButton();
	}

}
