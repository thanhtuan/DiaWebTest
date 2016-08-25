package com.tripolis.qa.dialogueweb.steps.serenity;

import com.tripolis.qa.dialogueweb.pages.DiaContentDashboardPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class DiaContentDashboardSteps extends ScenarioSteps {
	
	private static final long serialVersionUID = 1L;
	
	DiaContentDashboardPage diaContentDashboardPage;
	
	@Step
	public void onContentDashboardPage() {
		assert(diaContentDashboardPage.getContentDashboardUrl());
	}

}
