package com.tripolis.qa.dialogueweb.steps.serenity;

import static org.assertj.core.api.Assertions.assertThat;

import com.tripolis.qa.dialogueweb.pages.DiaListDirectEmailsPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class DiaListDirectEmailsSteps extends ScenarioSteps {
	
	private static final long serialVersionUID = 1L;
	
	DiaListDirectEmailsPage diaDirectEmailsBrowsePage;
	
	@Step
	public void onListDirectEmailsPage() {
		assert(diaDirectEmailsBrowsePage.getListDirectEmailsUrl());
	}
	
	@Step
	public void verifyheaderNameTextListDirectEmails(String value) {
		assertThat(diaDirectEmailsBrowsePage.getHeaderNameText().equalsIgnoreCase("Direct emails for " + value));
	}
	
	@Step
	public void selectDirectEmail(String value) {
		diaDirectEmailsBrowsePage.findDirectEmail(value);
	}

}
