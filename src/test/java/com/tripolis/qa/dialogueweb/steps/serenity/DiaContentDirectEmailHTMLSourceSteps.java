package com.tripolis.qa.dialogueweb.steps.serenity;

import com.tripolis.qa.dialogueweb.pages.DiaContentDirectEmailHTMLSourcePage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class DiaContentDirectEmailHTMLSourceSteps extends ScenarioSteps {
	

	DiaContentDirectEmailHTMLSourcePage diaContentDirectEmailHTMLSourcePage;
	
	@Step
	public void onContentDirectEmailHTMLSourcePage() {
		assert(diaContentDirectEmailHTMLSourcePage.getDirectEmailHTMLSourcePageUrl());
	}
}
