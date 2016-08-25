package com.tripolis.qa.dialogueweb.steps.serenity;

import com.tripolis.qa.dialogueweb.pages.DiaListContactGroupsPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class DiaListContactGroupsSteps extends ScenarioSteps {
	
	private static final long serialVersionUID = 1L;
	
	DiaListContactGroupsPage diaListContactGroupsPage;
	
	/*
	 * Sub Menu
	 */
	
	@Step
	public void navigateToContactDashBoardPage() {
		diaListContactGroupsPage.clickOnsubMenuItem1();
	}
	
	@Step
	public void navigateToListContactsPage() {
		diaListContactGroupsPage.clickOnsubMenuItem2();
	}
	
	@Step
	public void navigateToListContactGroupsPage() {
		diaListContactGroupsPage.clickOnsubMenuItem3();
	}
	
	@Step
	public void navigateToImportWizardPage() {
		diaListContactGroupsPage.clickOnsubMenuItem4();
	}
	
	@Step
	public void navigateToExportAsyncContactsPage() {
		diaListContactGroupsPage.clickOnsubMenuItem5();
	}
	
	@Step
	public void navigateToQueryWizardPage() {
		diaListContactGroupsPage.clickOnsubMenuItem6();
	}
	
	/*
	 * End Sub Menu
	 */

}
