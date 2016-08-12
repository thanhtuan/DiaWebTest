package com.tripolis.qa.dialogueweb.steps.serenity;

import static org.assertj.core.api.Assertions.assertThat;

import com.tripolis.qa.dialogueweb.pages.DiaCreateContentDirectEmailPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class DiaCreateContentDirectEmailSteps extends ScenarioSteps {
	
	DiaCreateContentDirectEmailPage diaCreateContentDirectEmailPage;
	
	@Step
	public void onCreateContentDirectEmailPage() {
		assert(diaCreateContentDirectEmailPage.getCreateDirectEmailUrl());
	}
	
	@Step
	public void verifyheaderNameTextCreateContentDirectEmail() {
		assertThat(diaCreateContentDirectEmailPage.getheaderNameText().equalsIgnoreCase("Properties for direct email"));
	}
	
	@Step
	public void setLabel(String keyword) {
		diaCreateContentDirectEmailPage.enter_Label(keyword);
	}
	
	@Step
	public void setName(String keyword) {
		diaCreateContentDirectEmailPage.enter_Name(keyword);
	}
	
	@Step
	public void setContentDirectEmailSubject(String keyword) {
		diaCreateContentDirectEmailPage.enter_ContentDirectEmailSubject(keyword);
	}
	
	@Step
	public void setContentDirectEmailDescription(String keyword) {
		diaCreateContentDirectEmailPage.enter_ContentDirectEmailDescription(keyword);
	}
	
	@Step
	public void checkDirectEmailTypeState() {
		diaCreateContentDirectEmailPage.directEmailTypeState();
	}
	
	@Step
	public void setFromAddress(String keyword) {
		diaCreateContentDirectEmailPage.enter_FromAddress(keyword);
	}
	
	@Step
	public void setFromName(String keyword) {
		diaCreateContentDirectEmailPage.enter_FromName(keyword);
	}
	
	@Step
	public void setReplyToAddress(String keyword) {
		diaCreateContentDirectEmailPage.enter_ReplyToAddress(keyword);
	}
	
	@Step
	public void clickOnSaveLink() {
		diaCreateContentDirectEmailPage.clickSaveLink();
	}
	
	@Step
	public void clickOnResetButton() {
		diaCreateContentDirectEmailPage.clickSubmitCancelButton();
	}
	
	@Step
	public void clickOnSaveButton() {
		diaCreateContentDirectEmailPage.clickSaveButton();
	}

}
