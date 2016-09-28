package com.tripolis.qa.dialogueweb.steps.serenity;

import static org.assertj.core.api.Assertions.assertThat;

import com.tripolis.qa.dialogueweb.pages.DiaCreateContactGroupFromFilterPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class DiaCreateContactGroupFromFilterSteps extends ScenarioSteps {

	private static final long serialVersionUID = 1L;
	
	DiaCreateContactGroupFromFilterPage diaCreateContactGroupFromFilterPage;
	
	@Step
	public void onCreateContactGroupFromFilterPage() {
		assert(diaCreateContactGroupFromFilterPage.getCreateContactGroupFromFilterUrl());
	}
	
	@Step
	public void verifyheaderNameTextCreateContactGroupFromFilterPage() {
		assertThat(diaCreateContactGroupFromFilterPage.getHeaderNameText().equalsIgnoreCase("Create a new contact group"));
	}
	
	@Step
	public void setLabel(String keyword) {
		diaCreateContactGroupFromFilterPage.enter_Label(keyword);
	}
	
	@Step
	public void setName(String keyword) {
		diaCreateContactGroupFromFilterPage.enter_Name(keyword);
	}
	
	/*
	 * Value of Group Type: 
	 *   STATIC
	 *   TEST
	 *   SUBSCRIPTION
	 */
	@Step
	public void selectedGroupType(String keyword) {
		diaCreateContactGroupFromFilterPage.select_GroupType(keyword);
	}
	
	@Step
	public void selectedParentContactGroup(String keyword) {
		diaCreateContactGroupFromFilterPage.select_ParentContactGroup(keyword);
	}
	
	@Step
	public void clickOnSaveButton() {
		diaCreateContactGroupFromFilterPage.clickSaveButton();
	}

}
