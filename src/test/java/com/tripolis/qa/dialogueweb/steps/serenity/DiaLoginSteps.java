package com.tripolis.qa.dialogueweb.steps.serenity;

import static org.assertj.core.api.Assertions.assertThat;

import com.tripolis.qa.dialogueweb.pages.DiaLoginPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.steps.ScenarioSteps;

public class DiaLoginSteps extends ScenarioSteps {
	
	private static final long serialVersionUID = 1L;
	
	DiaLoginPage diaLoginPage;
	
	
	/*
	 * *******Steps for Login to Dia********
	 */
	
	@Step
	public void isOnLoginPage() {
		diaLoginPage.open();
	}
	
	@Step
	public void seeLoginForm() {
		assertThat(diaLoginPage.isshowloginForm()).isTrue();
	}
	
	@Step
	public void setDomainName(String keyword) {
		diaLoginPage.enter_DomainName(keyword);
	}
	
	@Step
	public void setUserName(String keyword) {
		diaLoginPage.enter_UserName(keyword);
	}
	
	@Step
	public void setPassWord(String keyword) {
		diaLoginPage.enter_passWord(keyword);
	}
	
	@StepGroup
	public void inputDataToLoginForm(String keyword1, String keyword2, String keyword3) {
		setDomainName(keyword1);
		setUserName(keyword2);
		setPassWord(keyword3);
	}
	
	@Step
	public void clickonLoginButton(){
		diaLoginPage.click_login();
	}
	
	@Step
	public void verify_ErrorMessage() {
		assertThat(diaLoginPage.getErrorMessage().contains("Bad credentials"));
	}
	
	@Step
	public void verifyIsOnErrorLoginPage() {	
		assert(diaLoginPage.getErrorLoginUrl());
	}

}
