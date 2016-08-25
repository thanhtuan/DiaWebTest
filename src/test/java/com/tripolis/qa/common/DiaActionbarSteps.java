package com.tripolis.qa.common;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class DiaActionbarSteps extends ScenarioSteps {

	private static final long serialVersionUID = 1L;
	
	DiaActionbarPage diaActionbarPage;
	
	@Step
	public void navigateToPageThatActionBarItem1PresentFor() {
		diaActionbarPage.clickOnActionBarItem1();
	}
	
	@Step
	public void navigateToPageThatActionBarItem2PresentFor() {
		diaActionbarPage.clickOnActionBarItem2();
	}
	
	@Step
	public void navigateToPageThatActionBarItem3PresentFor() {
		diaActionbarPage.clickOnActionBarItem3();
	}
	
	@Step
	public void navigateToPageThatActionBarItem4PresentFor() {
		diaActionbarPage.clickOnActionBarItem4();
	}
	
	@Step
	public void navigateToPageThatActionBarItem5PresentFor() {
		diaActionbarPage.clickOnActionBarItem5();
	}
	
	@Step
	public void navigateToPageThatActionBarItem6PresentFor() {
		diaActionbarPage.clickOnActionBarItem6();
	}
	
	@Step
	public void navigateToPageThatActionBarItem7PresentFor() {
		diaActionbarPage.clickOnActionBarItem7();
	}
	

}
