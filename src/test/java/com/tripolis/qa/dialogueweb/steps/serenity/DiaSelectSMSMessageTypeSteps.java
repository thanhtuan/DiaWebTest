package com.tripolis.qa.dialogueweb.steps.serenity;

import static org.assertj.core.api.Assertions.assertThat;

import com.tripolis.qa.dialogueweb.pages.DiaSelectSMSMessageTypePage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class DiaSelectSMSMessageTypeSteps extends ScenarioSteps {

	private static final long serialVersionUID = 1L;
	
	DiaSelectSMSMessageTypePage diaSelectSMSMessageTypePage;
	
	@Step
	public void onSelectSMSMessageTypePage() {
		assert(diaSelectSMSMessageTypePage.getSelectSMSMessageTypeUrl());
	}
	
	@Step
	public void verifyheaderNameTextSelectSMSMessageType() {
		assertThat(diaSelectSMSMessageTypePage.getHeaderNameText().equalsIgnoreCase("Select the sms type definition"));
	}
	
	@Step
	public void selected_SMSMessageType(String keyword) {
		diaSelectSMSMessageTypePage.select_SMSMessageType(keyword);
	}
	
	@Step
	public void clickOnNextButton() {
		diaSelectSMSMessageTypePage.clickSaveButton();
	}

}
