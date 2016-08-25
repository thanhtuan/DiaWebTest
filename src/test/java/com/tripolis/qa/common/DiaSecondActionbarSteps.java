package com.tripolis.qa.common;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class DiaSecondActionbarSteps extends ScenarioSteps {

	private static final long serialVersionUID = 1L;
	
	DiaSecondActionbarPage diaSecondActionbarPage;
	
	@Step
	public void navigateToPageThatSecondActionBarItem1PresentFor() {
		diaSecondActionbarPage.clickOnSecondActionBarItem1();
	}
	
	@Step
	public void navigateToPageThatSecondActionBarItem2PresentFor() {
		diaSecondActionbarPage.clickOnSecondActionBarItem2();
	}
	
	@Step
	public void navigateToPageThatSecondActionBarItem3PresentFor() {
		diaSecondActionbarPage.clickOnSecondActionBarItem3();
	}
	
	@Step
	public void navigateToPageThatSecondActionBarItem4PresentFor() {
		diaSecondActionbarPage.clickOnSecondActionBarItem4();
	}
	
	@Step
	public void navigateToPageThatSecondActionBarItem5PresentFor() {
		diaSecondActionbarPage.clickOnSecondActionBarItem5();
	}

}
