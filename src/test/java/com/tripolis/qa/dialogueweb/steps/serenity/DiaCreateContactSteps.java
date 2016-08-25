package com.tripolis.qa.dialogueweb.steps.serenity;

import static org.assertj.core.api.Assertions.assertThat;

import com.tripolis.qa.dialogueweb.pages.DiaCreateContactPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class DiaCreateContactSteps extends ScenarioSteps {
	
	private static final long serialVersionUID = 1L;
	
	DiaCreateContactPage diaCreateContactPage;
	
	/*
	 * Sub Menu
	 */
	
	@Step
	public void navigateToContactDashBoardPage() {
		diaCreateContactPage.clickOnsubMenuItem1();
	}
	
	@Step
	public void navigateToListContactsPage() {
		diaCreateContactPage.clickOnsubMenuItem2();
	}
	
	@Step
	public void navigateToListContactGroupsPage() {
		diaCreateContactPage.clickOnsubMenuItem3();
	}
	
	@Step
	public void navigateToImportWizardPage() {
		diaCreateContactPage.clickOnsubMenuItem4();
	}
	
	@Step
	public void navigateToExportAsyncContactsPage() {
		diaCreateContactPage.clickOnsubMenuItem5();
	}
	
	@Step
	public void navigateToQueryWizardPage() {
		diaCreateContactPage.clickOnsubMenuItem6();
	}
	
	/*
	 * End Sub Menu
	 */
	
	@Step
	public void onCreateContactPage() {
		assert(diaCreateContactPage.getCreateContactUrl());
	}
	
	@Step
	public void verifyheaderNameTextCreateContact(String value) {
		assertThat(diaCreateContactPage.getheaderNameText().equalsIgnoreCase("Create a new contact in the database " + value));
	}
	
	@Step
	public void setContactEmail(String keyword) {
		diaCreateContactPage.enter_ContactEmail(keyword);
	}
	
	@Step
	public void setContactName(String keyword) {
		diaCreateContactPage.enter_ContactName(keyword);
	}
	
	@Step
	public void setContactMobile(String keyword) {
		diaCreateContactPage.enter_ContactMobile(keyword);
	}
	
	@Step
	public void clickOnSaveLink() {
		diaCreateContactPage.clickSaveLink();
	}
	
	@Step
	public void clickOnSaveButton() {
		diaCreateContactPage.clickSaveButton();
	}
	
	@Step
	public void clickOnSubmitCancelButton() {
		diaCreateContactPage.clickSubmitCancelButton();
	}

}
