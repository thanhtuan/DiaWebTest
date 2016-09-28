package com.tripolis.qa.dialogueweb.steps.serenity;

import static org.assertj.core.api.Assertions.assertThat;

import com.tripolis.qa.dialogueweb.pages.DiaCreateContentSMSMessagePage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class DiaCreateContentSMSMessageSteps extends ScenarioSteps {

	private static final long serialVersionUID = 1L;
	
	DiaCreateContentSMSMessagePage diaCreateContentSMSMessagePage;
	
	@Step
	public void onCreateContentSMSMessagePage() {
		assert(diaCreateContentSMSMessagePage.getCreateSMSMessageUrl());
	}
	
	@Step
	public void verifyheaderNameTextCreateContentSMSMessage() {
		assertThat(diaCreateContentSMSMessagePage.getHeaderNameText().equalsIgnoreCase("Create SMS message"));
	}
	
	@Step
	public void setLabel(String keyword) {
		diaCreateContentSMSMessagePage.enter_Label(keyword);
	}
	
	@Step
	public void setName(String keyword) {
		diaCreateContentSMSMessagePage.enter_Name(keyword);
	}
	
	@Step
	public void setSMSOriginatorNumber(String keyword) {
		diaCreateContentSMSMessagePage.enter_SMSOriginatorNumber(keyword);
	}
	
	@Step
	public void setSMSOriginatorName(String keyword) {
		diaCreateContentSMSMessagePage.enter_SMSOriginatorName(keyword);
	}
	
	@Step
	public void setSMSMessage(String keyword) {
		diaCreateContentSMSMessagePage.enter_SMSMessage(keyword);
	}
	
	@Step
	public void setAlternativeSMSMessage(String keyword) {
		diaCreateContentSMSMessagePage.enter_AlternativeSMSMessage(keyword);
	}
	
	@Step
	public void setDescriptionMessage(String keyword) {
		diaCreateContentSMSMessagePage.enter_DescriptionMessage(keyword);
	}
	
	@Step
	public void clickOnResetButton() {
		diaCreateContentSMSMessagePage.clickSubmitCancelButton();
	}
	
	@Step
	public void clickOnSaveButton() {
		diaCreateContentSMSMessagePage.clickSaveButton();
	}

}
