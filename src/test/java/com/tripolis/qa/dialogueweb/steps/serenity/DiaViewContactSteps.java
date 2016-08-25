package com.tripolis.qa.dialogueweb.steps.serenity;

import static org.assertj.core.api.Assertions.assertThat;

import com.tripolis.qa.dialogueweb.pages.DiaViewContactPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class DiaViewContactSteps extends ScenarioSteps {
	
	private static final long serialVersionUID = 1L;

	DiaViewContactPage diaViewContactPage;
	
	@Step
	public void onViewContactPage() {
		assert(diaViewContactPage.getViewContactsUrl());
	}
	
	@Step
	public void verifyheaderNameTextViewContact(String value) {
		assertThat(diaViewContactPage.getheaderNameText().equalsIgnoreCase("View profile for " + value));
	}
	
	@Step
	public void verify_CreateContactSuccessfulMessage() {
		assertThat(diaViewContactPage.getSuccessfulMessage().contains("The contact was successfully created."));
	}
	
	@Step
	public void verify_UpdateContactSuccessfulMessage() {
		assertThat(diaViewContactPage.getSuccessfulMessage().contains("Contact successfully updated"));
	}
}
