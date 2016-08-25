package com.tripolis.qa.dialogueweb.steps.serenity;

import static org.assertj.core.api.Assertions.assertThat;

import com.tripolis.qa.dialogueweb.pages.DiaDirectEmailsBrowsePage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class DiaDirectEmailsBrowseSteps extends ScenarioSteps {
	
	private static final long serialVersionUID = 1L;
	
	DiaDirectEmailsBrowsePage diaDirectEmailsBrowsePage;
	
	@Step
	public void onListDirectEmailsPage() {
		assert(diaDirectEmailsBrowsePage.getListDirectEmailsUrl());
	}
	
	@Step
	public void clickOnNewLink() {
		diaDirectEmailsBrowsePage.clickNewLink();
	}
	
	@Step
	public void verifyheaderNameTextListDirectEmails(String value) {
		assertThat(diaDirectEmailsBrowsePage.getheaderNameText().equalsIgnoreCase("Direct emails for " + value));
	}
	
	@Step
	public void selectDirectEmail(String value) {
		diaDirectEmailsBrowsePage.findDirectEmail(value);
	}

}
