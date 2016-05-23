package com.tripolis.qa.steps.serenity;

import static org.assertj.core.api.Assertions.assertThat;

import com.tripolis.qa.pages.DiaAdminModuleSubMenu;
import com.tripolis.qa.pages.DiaAdministrationPage;
import com.tripolis.qa.pages.DiaHomePage;
import com.tripolis.qa.pages.DiaLoginPage;
import com.tripolis.qa.pages.DiaMainMenu;
import com.tripolis.qa.pages.ListContactDatabasesPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class DiaContactDatabaseSteps extends ScenarioSteps {

	DiaMainMenu diaMainMenu;
	DiaAdminModuleSubMenu diaAdminModuleSubMenu;
	DiaLoginPage diaLoginPage;
	DiaHomePage diaHomePage;
	DiaAdministrationPage diaAdministrationPage;
	ListContactDatabasesPage listContactDatabasesPage;
	
	@Step
	public void loginToDia(String keyword1, String keyword2, String keyword3) {
		diaLoginPage.open();
		diaLoginPage.enter_DomainName(keyword1);
		diaLoginPage.enter_UserName(keyword2);
		diaLoginPage.enter_passWord(keyword3);
		diaLoginPage.click_login();
	}
	
	@Step
	public void navigateToAdministrationPage() {
		diaMainMenu.clickonAdministrationPageLink();
	}
	
	@Step
	public void onAdministrationPage() {
		assert(diaAdministrationPage.getAdministrationUrl());
	}
	
	@Step
	public void navigateToListContactDatabasesPage() {
		diaAdminModuleSubMenu.clickonAdminModuleContactSubMenuLink();
	}
	
	@Step
	public void onListContactDatabasesPage() {
		assert(listContactDatabasesPage.getListContactDatabasesUrl());
	}
	
	@Step
	public void clickOnNewLink() {
		listContactDatabasesPage.clickNewLink();
	}
	
	@Step
	public void seeCreateDatabaseDialog() {
		assertThat(listContactDatabasesPage.isShowCreateDatabaseDialog()).isTrue();
	}
	
	@Step
	public void clickOnCancelButton() {
		listContactDatabasesPage.clickCancelButton();
	}
	
	
}
