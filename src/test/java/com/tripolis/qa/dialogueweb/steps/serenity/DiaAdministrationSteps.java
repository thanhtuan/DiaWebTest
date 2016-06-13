package com.tripolis.qa.dialogueweb.steps.serenity;

import com.tripolis.qa.dialogueweb.pages.DiaAdministrationPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class DiaAdministrationSteps extends ScenarioSteps {
	
	DiaAdministrationPage diaAdministrationPage;
	
	@Step
	public void onAdministrationPage() {
		assert(diaAdministrationPage.getAdministrationUrl());
	}
	
	@Step
	public void navigateToListContactDatabasesPage() {
		diaAdministrationPage.clickOnsubMenuItem1();
	}
	
	@Step
	public void navigateToListWorkspacePage() {
		diaAdministrationPage.clickOnsubMenuItem2();
	}
	
	@Step
	public void navigateToSelectAdminModulePublishingPage() {
		diaAdministrationPage.clickOnsubMenuItem3();
	}
	
	@Step
	public void navigateToSelectAdminModuleApplicationPage() {
		diaAdministrationPage.clickOnsubMenuItem4();
	}

}
