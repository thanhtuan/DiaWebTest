package com.tripolis.qa.dialogueweb.steps.serenity;

import static org.assertj.core.api.Assertions.assertThat;

import com.tripolis.qa.dialogueweb.pages.DiaPreviewContentSMSMessagePage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class DiaPreviewContentSMSMessageSteps extends ScenarioSteps {

	private static final long serialVersionUID = 1L;
	
	DiaPreviewContentSMSMessagePage diaPreviewContentSMSMessagePage;
	
	@Step
	public void onPreviewContentSMSMessagePage() {
		assert(diaPreviewContentSMSMessagePage.getPreviewSMSMessageUrl());
	}
	
	@Step
	public void verifyheaderNameTextPreviewSMSMessage(String value) {
		assertThat(diaPreviewContentSMSMessagePage.getHeaderNameText().equalsIgnoreCase("Preview " + value));
	}
	
	@Step
	public void verify_CreateSMSMessageSuccessfulMessage() {
		assertThat(diaPreviewContentSMSMessagePage.getSuccessfulMessage().contains("The SMS Message was successfully created."));
	}

}
