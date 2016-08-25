package com.tripolis.qa.dialogueweb.steps.serenity;

import com.tripolis.qa.dialogueweb.pages.DiaContentDirectEmailHTMLSourcePage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class DiaContentDirectEmailHTMLSourceSteps extends ScenarioSteps {
	
	private static final long serialVersionUID = 1L;
	
	DiaContentDirectEmailHTMLSourcePage diaContentDirectEmailHTMLSourcePage;
	
	@Step
	public void onContentDirectEmailHTMLSourcePage() {
		assert(diaContentDirectEmailHTMLSourcePage.getDirectEmailHTMLSourcePageUrl());
	}
	
	@Step
	public void setHTMLSourceBody(String keyword) {
		diaContentDirectEmailHTMLSourcePage.enter_HtmlSourceBody(keyword);
	}
	
	@Step
	public void clickOnSaveButton() {
		diaContentDirectEmailHTMLSourcePage.clickSaveButton();
	}
}
