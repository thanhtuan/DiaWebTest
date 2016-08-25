package com.tripolis.qa.dialogueweb.steps.serenity;

import static org.assertj.core.api.Assertions.assertThat;

import com.tripolis.qa.dialogueweb.pages.DiaPreviewContentDirectEmailPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class DiaPreviewContentDirectEmailSteps extends ScenarioSteps {
	
	private static final long serialVersionUID = 1L;
	
	DiaPreviewContentDirectEmailPage diaPreviewContentDirectEmailPage;	
	
	@Step
	public void onPreviewContentDirectEmailPage() {
		assert(diaPreviewContentDirectEmailPage.getPreviewDirectEmailUrl());
	}
	
	@Step
	public void verifyheaderNameTextPreviewDirectEmail(String value) {
		assertThat(diaPreviewContentDirectEmailPage.getheaderNameText().equalsIgnoreCase("Direct email " + value));
	}

}
