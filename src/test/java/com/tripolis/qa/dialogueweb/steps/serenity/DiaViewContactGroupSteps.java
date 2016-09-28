package com.tripolis.qa.dialogueweb.steps.serenity;

import static org.assertj.core.api.Assertions.assertThat;

import com.tripolis.qa.dialogueweb.pages.DiaViewContactGroupPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class DiaViewContactGroupSteps extends ScenarioSteps {

	private static final long serialVersionUID = 1L;
	
	DiaViewContactGroupPage diaViewContactGroupPage;
	
	@Step
	public void onViewContactGroupPage() {
		assert(diaViewContactGroupPage.getViewContactGroupUrl());
	}
	
	@Step
	public void verifyheaderNameTextViewContactGroup(String value) {
		assertThat(diaViewContactGroupPage.getHeaderNameText().equalsIgnoreCase("Contact group " + value));
	}
	
	@Step
	public void verify_CreateContactGroupSuccessfulMessage() {
		assertThat(diaViewContactGroupPage.getSuccessfulMessage().contains("The group was successfully created."));
	}

}
