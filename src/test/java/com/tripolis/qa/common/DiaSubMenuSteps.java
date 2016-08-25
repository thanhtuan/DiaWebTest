package com.tripolis.qa.common;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class DiaSubMenuSteps extends ScenarioSteps {

	private static final long serialVersionUID = 1L;
	
	DiaSubMenuPage diaSubMenuPage;
	
	@Step
	public void navigateToPageThatSubMenuItem1PresentFor() {
		diaSubMenuPage.clickOnSubMenuItem1();
	}
	
	@Step
	public void navigateToPageThatSubMenuItem2PresentFor() {
		diaSubMenuPage.clickOnSubMenuItem2();
	}
	
	@Step
	public void navigateToPageThatSubMenuItem3PresentFor() {
		diaSubMenuPage.clickOnSubMenuItem3();
	}
	
	@Step
	public void navigateToPageThatSubMenuItem4PresentFor() {
		diaSubMenuPage.clickOnSubMenuItem4();
	}
	
	@Step
	public void navigateToPageThatSubMenuItem5PresentFor() {
		diaSubMenuPage.clickOnSubMenuItem5();
	}
	
	@Step
	public void navigateToPageThatSubMenuItem6PresentFor() {
		diaSubMenuPage.clickOnSubMenuItem6();
	}
	
	@Step
	public void navigateToPageThatSubMenuItem7PresentFor() {
		diaSubMenuPage.clickOnSubMenuItem7();
	}

}
