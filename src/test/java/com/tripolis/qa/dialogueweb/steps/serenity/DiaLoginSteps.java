package com.tripolis.qa.dialogueweb.steps.serenity;

import static org.assertj.core.api.Assertions.assertThat;

import com.tripolis.qa.dialogueweb.pages.DiaHomePage;
import com.tripolis.qa.dialogueweb.pages.DiaLoginPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class DiaLoginSteps extends ScenarioSteps {
	
	DiaLoginPage diaLoginPage;
	DiaHomePage diaHomePage;
	
	
	/*
	 * Steps using methods from diaHomePage
	 */
	
	@Step
	public void verifyClientName() {
		assertThat(diaHomePage.getClientName().equalsIgnoreCase("Client: Haralds Company"));
	}
	
	@Step
	public void mainMenuShouldVisible() {
		assertThat(diaHomePage.mainMenuisVisible()).isTrue();
	}
	
	@Step
	public void verify_login_successful() {	
		//System.out.println("-----------Test--------: " + diaHomePage.getHomeurl());
		assert(diaHomePage.getHomeurl());
		
	}
	
	/*
	 * *******End steps using methods from diaHomePage********
	 */
	
	
	
	/*
	 * *******Steps for Login to Dia********
	 */
	
	@Step
	public void is_the_login_page() {
		diaLoginPage.open();
	}
	
	@Step
	public void seeLoginForm() {
		assertThat(diaLoginPage.isshowloginForm()).isTrue();
	}
	
	@Step
	public void inputDataToLoginForm(String keyword1, String keyword2, String keyword3) {
		diaLoginPage.enter_DomainName(keyword1);
		diaLoginPage.enter_UserName(keyword2);
		diaLoginPage.enter_passWord(keyword3);
	}
	
	@Step
	public void clickonLoginButton(){
		diaLoginPage.click_login();
	}
	
	@Step
	public void verify_ErrorMessage() {
		assertThat(diaLoginPage.getErrorMessage().equalsIgnoreCase("         	Bad credentials         "));
	}
	
	@Step
	public void verify_login_Unsuccessful() {	
		//System.out.println("-----------Test--------: " + diaLoginPage.getErrorLoginUrl());
		assert(diaLoginPage.getErrorLoginUrl());
		
	}

}
