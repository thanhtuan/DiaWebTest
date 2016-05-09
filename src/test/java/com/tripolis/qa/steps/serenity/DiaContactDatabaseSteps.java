package com.tripolis.qa.steps.serenity;

import static org.assertj.core.api.Assertions.assertThat;

import com.tripolis.qa.pages.DiaAdminPage;
import com.tripolis.qa.pages.DiaHomePage;
import com.tripolis.qa.pages.DiaLoginPage;
import com.tripolis.qa.pages.ListContactDatabasesPage;

import net.thucydides.core.annotations.Step;

public class DiaContactDatabaseSteps {

	DiaLoginPage diaLoginPage;
	DiaHomePage diaHomePage;
	DiaAdminPage diaAdminPage;
	ListContactDatabasesPage listContactDatabasesPage;
	
	@Step
	public void loginAndNavigateToAdminPage(String keyword1, String keyword2, String keyword3) {
		diaLoginPage.open();
		diaLoginPage.enter_DomainName(keyword1);
		diaLoginPage.enter_UserName(keyword2);
		diaLoginPage.enter_passWord(keyword3);
		//diaHomePage.getHomeurl();
		//diaHomePage.clickOnHomeMainMenu();
		//listContactDatabasesPage.clickOnSetupMainMenu();
		//listContactDatabasesPage.getSetupUrl();
		//listContactDatabasesPage.clickOnContactSetupSubMenu();
		//listContactDatabasesPage.getContactSetupSubMenuUrl();
	}
	
	@Step
	public void goToHomePage() {
		diaLoginPage.navigateToHomePage();
		
	}
	
	@Step
	public void goToAdminPage() {
		diaHomePage.navigateToAdminPage();
	}
	
	@Step
	public void clickOnNewLink() {
		listContactDatabasesPage.clickNewLink();
	}
	
	@Step
	public void clickOnCancelButton() {
		listContactDatabasesPage.clickCancelButton();
	}
	
	@Step
	public void seeCreateDatabaseDialog() {
		assertThat(listContactDatabasesPage.isShowCreateDatabaseDialog()).isTrue();
	}
	
}
