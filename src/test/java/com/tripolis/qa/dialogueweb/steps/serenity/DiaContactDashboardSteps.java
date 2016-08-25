package com.tripolis.qa.dialogueweb.steps.serenity;

import com.tripolis.qa.dialogueweb.pages.DiaContactDashboardPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class DiaContactDashboardSteps extends ScenarioSteps {
	
	private static final long serialVersionUID = 1L;
	
	DiaContactDashboardPage diaContactDashboardPage;
	
	@Step
	public void onContactDashboardPage() {
		assert(diaContactDashboardPage.getContactDashboardUrl());
	}

}
