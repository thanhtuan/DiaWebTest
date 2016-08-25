package com.tripolis.qa.dialogueweb.steps.serenity;

import static org.assertj.core.api.Assertions.assertThat;

import com.tripolis.qa.dialogueweb.pages.DiaViewContactPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class DiaViewContactSteps extends ScenarioSteps {
	
	private static final long serialVersionUID = 1L;

	DiaViewContactPage diaViewContactPage;
	
	/*
	 * Sub Menu
	 */
	
	@Step
	public void navigateToContactDashBoardPage() {
		diaViewContactPage.clickOnsubMenuItem1();
	}
	
	@Step
	public void navigateToListContactsPage() {
		diaViewContactPage.clickOnsubMenuItem2();
	}
	
	@Step
	public void navigateToListContactGroupsPage() {
		diaViewContactPage.clickOnsubMenuItem3();
	}
	
	@Step
	public void navigateToImportWizardPage() {
		diaViewContactPage.clickOnsubMenuItem4();
	}
	
	@Step
	public void navigateToExportAsyncContactsPage() {
		diaViewContactPage.clickOnsubMenuItem5();
	}
	
	@Step
	public void navigateToQueryWizardPage() {
		diaViewContactPage.clickOnsubMenuItem6();
	}
	
	/*
	 * End Sub Menu
	 */
	
	@Step
	public void onViewContactPage() {
		assert(diaViewContactPage.getViewContactsUrl());
	}
	
	@Step
	public void verifyheaderNameTextViewContact(String value) {
		assertThat(diaViewContactPage.getheaderNameText().equalsIgnoreCase("View profile for " + value));
	}
}
