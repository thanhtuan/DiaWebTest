package com.tripolis.qa.dialogueweb.steps.serenity;

import static org.assertj.core.api.Assertions.assertThat;

import com.tripolis.qa.dialogueweb.pages.DiaSelectDirectEmailTypePage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class DiaSelectDirectEmailTypeSteps extends ScenarioSteps {
	
	private static final long serialVersionUID = 1L;
	
	DiaSelectDirectEmailTypePage diaSelectDirectEmailTypePage;
	
	@Step
	public void onSelectDirectEmailTypePage() {
		assert(diaSelectDirectEmailTypePage.getSelectDirectEmailTypeUrl());
	}
	
	@Step
	public void verifyheaderNameTextSelectDirectEmailType() {
		assertThat(diaSelectDirectEmailTypePage.getHeaderNameText().equalsIgnoreCase("Select a direct email type"));
	}
	
	@Step
	public void selected_DirectEmailType(String keyword) {
		diaSelectDirectEmailTypePage.select_DirectEmailType(keyword);
	}
	
	@Step
	public void clickOnNextButton() {
		diaSelectDirectEmailTypePage.clickSaveButton();
	}

}
