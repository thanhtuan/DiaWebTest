package com.tripolis.qa.dialogueweb.steps.serenity;

import static org.assertj.core.api.Assertions.assertThat;

import com.tripolis.qa.dialogueweb.pages.DiaCreateContactPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.steps.ScenarioSteps;

public class DiaCreateContactSteps extends ScenarioSteps {
	
	private static final long serialVersionUID = 1L;
	
	DiaCreateContactPage diaCreateContactPage;
	
	@Step
	public void onCreateContactPage() {
		assert(diaCreateContactPage.getCreateContactUrl());
	}
	
	@Step
	public void verifyheaderNameTextCreateContact(String value) {
		assertThat(diaCreateContactPage.getHeaderNameText().equalsIgnoreCase("Create a new contact in the database " + value));
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

	@StepGroup
	public void setInformationToCreateContact(String keyword1, String keyword2, String keyword3) {
		setContactEmail(keyword1);
		setContactName(keyword2);
		setContactMobile(keyword3);
	}
	
	@Step
	public void shouldBeAbleToSeeTheEmailValidationMessage() {
		assertThat(diaCreateContactPage.getEmailValidationMessage().equalsIgnoreCase("The Email is required."));
	}

}
