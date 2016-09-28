package com.tripolis.qa.dialogueweb.steps.serenity;

import static org.assertj.core.api.Assertions.assertThat;

import com.tripolis.qa.dialogueweb.pages.DiaListSMSMessagesPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class DiaListSMSMessagesSteps extends ScenarioSteps {

	private static final long serialVersionUID = 1L;
	
	DiaListSMSMessagesPage diaSMSMessagesBrowsePage;
	
	@Step
	public void onListSMSMessagesPage() {
		assert(diaSMSMessagesBrowsePage.getListSMSMessagesUrl());
	}
	
	@Step
	public void verifyheaderNameTextListSMSMessages(String value) {
		assertThat(diaSMSMessagesBrowsePage.getHeaderNameText().equalsIgnoreCase("SMS messages for " + value));
	}
	
	@Step
	public void selectSMSMessage(String value) {
		diaSMSMessagesBrowsePage.clickSMSMessage(value);
	}

}
