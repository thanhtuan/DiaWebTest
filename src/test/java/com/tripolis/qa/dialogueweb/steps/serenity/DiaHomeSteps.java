package com.tripolis.qa.dialogueweb.steps.serenity;

import com.tripolis.qa.dialogueweb.pages.DiaHomePage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class DiaHomeSteps extends ScenarioSteps {
	
	private static final long serialVersionUID = 1L;
	
	DiaHomePage diaHomePage;
	
	@Step
	public void verifyIsOnHomePage() {	
		assert(diaHomePage.getHomeurl());
		
	}
	
}
