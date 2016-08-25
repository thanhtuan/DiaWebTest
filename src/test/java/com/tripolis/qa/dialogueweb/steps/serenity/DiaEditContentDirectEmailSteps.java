package com.tripolis.qa.dialogueweb.steps.serenity;

import static org.assertj.core.api.Assertions.assertThat;

import com.tripolis.qa.dialogueweb.pages.DiaEditContentDirectEmailPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class DiaEditContentDirectEmailSteps extends ScenarioSteps {
	
	private static final long serialVersionUID = 1L;
	
	DiaEditContentDirectEmailPage diaEditContentDirectEmailPage;
	
	
	
	@Step
	public void onEditContentDirectEmailPage() {
		assert(diaEditContentDirectEmailPage.getEditDirectEmailUrl());
	}
	
	@Step
	public void verifyheaderNameTextEditDirectEmail(String value) {
		assertThat(diaEditContentDirectEmailPage.getheaderNameText().equalsIgnoreCase("Direct email " + value));
	}
	
	@Step
	public void setDirectEmailBody(String keyword) {
		diaEditContentDirectEmailPage.enter_DirectEmailBody(keyword);
	}
	
	@Step
	public void clickOnSaveLink() {
		diaEditContentDirectEmailPage.clickSaveLink();
	}
	
	@Step
	public void clickOnSaveButton() {
		diaEditContentDirectEmailPage.clickSaveButton();
	}
	
	@Step
	public void verify_UpdateDirectEmailSuccessfulMessage() {
		assertThat(diaEditContentDirectEmailPage.getSuccessfulMessage().contains("The Email was successfully updated."));
	}
	
	@Step
	public void verify_UpdateDirectEmailWithoutUnsubscribeURLSuccessfulMessage() {
		assertThat(diaEditContentDirectEmailPage.getSuccessfulMessage().contains("The Email was successfully updated. - Remark: no unsubscribe url was found."));
	}

}
