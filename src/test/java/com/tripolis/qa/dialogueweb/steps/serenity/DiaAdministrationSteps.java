package com.tripolis.qa.dialogueweb.steps.serenity;

import com.tripolis.qa.dialogueweb.pages.DiaAdministrationPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class DiaAdministrationSteps extends ScenarioSteps {

	private static final long serialVersionUID = 1L;
	
	DiaAdministrationPage diaAdministrationPage;
	
	@Step
	public void onAdministrationPage() {
		assert(diaAdministrationPage.getAdministrationUrl());
	}

}
