package com.tripolis.qa.steps.serenity;

import static org.assertj.core.api.Assertions.assertThat;


import com.tripolis.qa.pages.DiaHomePage;
import com.tripolis.qa.pages.DiaLoginPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class DiaLoginSteps extends ScenarioSteps {
	
	DiaLoginPage diaLoginPage;
	DiaHomePage diaHomePage;
	
	@Step
	public void is_the_login_page() {
		diaLoginPage.open();
	}
	
	@Step
	public void seeLoginForm() {
		assertThat(diaLoginPage.isshowloginForm()).isTrue();
	}
	
	@Step
    public void enterDomain(String keyword) {
		diaLoginPage.enter_DomainName(keyword);
	}
	
	@Step
    public void enterUser(String keyword) {
		diaLoginPage.enter_UserName(keyword);
	}
	
	@Step
    public void enterPass(String keyword) {
		diaLoginPage.enter_passWord(keyword);
	}
	
	@Step
	public void clickonLoginButton(){
		diaLoginPage.click_login();
	}
	
	
	@Step
	public void verify_ClientName() {
		assertThat(diaHomePage.getSpanText().equalsIgnoreCase("Client: Haralds Company"));
	}
	
	@Step
	public void verify_ErrorMessage() {
		assertThat(diaLoginPage.getErrorMessage().equalsIgnoreCase("         	Bad credentials         "));
	}
	
	@Step
	public void verify_login_successful() {	
		//System.out.println("-----------Test--------: " + diaHomePage.getHomeurl());
		assert(diaHomePage.getHomeurl());
		
	}
	
	@Step
	public void verify_login_Unsuccessful() {	
		//System.out.println("-----------Test--------: " + diaLoginPage.getErrorLoginUrl());
		assert(diaLoginPage.getErrorLoginUrl());
		
	}

}
