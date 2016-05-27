package com.tripolis.qa.steps.serenity;

import static org.assertj.core.api.Assertions.assertThat;

import com.tripolis.qa.pages.DiaAdministrationPage;
import com.tripolis.qa.pages.DiaContactDatabaseWizard;
import com.tripolis.qa.pages.DiaHomePage;
import com.tripolis.qa.pages.DiaLoginPage;
import com.tripolis.qa.pages.DiaMainMenu;
import com.tripolis.qa.pages.DiaSubMenuSetupModule;
import com.tripolis.qa.pages.ListContactDatabasesPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class DiaContactDatabaseSteps extends ScenarioSteps {

	DiaMainMenu diaMainMenu;
	DiaSubMenuSetupModule diaSubMenuSetupModule;
	DiaLoginPage diaLoginPage;
	DiaHomePage diaHomePage;
	DiaAdministrationPage diaAdministrationPage;
	ListContactDatabasesPage listContactDatabasesPage;
	DiaContactDatabaseWizard diaContactDatabaseWizard;
	
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
		diaMainMenu.click_SetupPageLink();
	}
	
	@Step
	public void onAdministrationPage() {
		assert(diaAdministrationPage.getAdministrationUrl());
	}
	
	@Step
	public void navigateToListContactDatabasesPage() {
		diaSubMenuSetupModule.click_ListContactDatabasesPageLink();
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
		assertThat(diaContactDatabaseWizard.isShowCreateDatabaseDialog()).isTrue();
	}
	
	@Step
	public void clickOnCancelButton() {
		diaContactDatabaseWizard.clickCancelButton();
	}
	
	@Step
	public void clickOnNextButton() {
		diaContactDatabaseWizard.clickNextButton();
	}
	
	@Step
	public void clickOnPreviousButton() {
		diaContactDatabaseWizard.clickPreviousButton();
	}
	
	@Step
	public void clickOnAddFieldButton() {
		diaContactDatabaseWizard.clickAddFieldButton();
	}
	
	@Step
	public void clickOnFinishButton() {
		diaContactDatabaseWizard.clickFinishButton();
	}
	
	@Step
	public void setLabel(String keyword) {
		diaContactDatabaseWizard.enter_Label(keyword);
	}
	
	@Step
	public void setName(String keyword) {
		diaContactDatabaseWizard.enter_Name(keyword);
	}
	
	/*
	 * This function can use for some field types: string, int, decimal, email, mobile
	 */
	
	@Step
	public void create_First_Key_Field(String keyword1, String keyword2, String keyword3, String keyword4, String keyword5, String keyword6) {
		diaContactDatabaseWizard.enter_FieldDescriptorLabel(keyword1);
		diaContactDatabaseWizard.enter_FieldDescriptorName(keyword1);
		diaContactDatabaseWizard.select_FieldType(keyword2);
		diaContactDatabaseWizard.enter_MinLength(keyword3);
		diaContactDatabaseWizard.enter_MaxLength(keyword4);
		diaContactDatabaseWizard.enter_DefaultValue(keyword5);
		diaContactDatabaseWizard.select_KindOfField(keyword6);
	}
	
	/*
	 * This function can use for some field types: string, int, decimal, email, mobile
	 */
	
	@Step
	public void create_Key_Required_Field(String keyword1, String keyword2, String keyword3, String keyword4, String keyword5, String keyword6) {
		diaContactDatabaseWizard.enter_FieldDescriptorLabel(keyword1);
		diaContactDatabaseWizard.enter_FieldDescriptorName(keyword1);
		diaContactDatabaseWizard.select_FieldType(keyword2);
		diaContactDatabaseWizard.enter_MinLength(keyword3);
		diaContactDatabaseWizard.enter_MaxLength(keyword4);
		diaContactDatabaseWizard.enter_DefaultValue(keyword5);
		diaContactDatabaseWizard.checkbox_key();
		diaContactDatabaseWizard.checkbox_required();
		diaContactDatabaseWizard.select_KindOfField(keyword6);
	}
	
	/*
	 * This function can use for some field types: string, int, decimal, email, mobile
	 */
	
	@Step
	public void create_Key_Field(String keyword1, String keyword2, String keyword3, String keyword4, String keyword5, String keyword6) {
		diaContactDatabaseWizard.enter_FieldDescriptorLabel(keyword1);
		diaContactDatabaseWizard.enter_FieldDescriptorName(keyword1);
		diaContactDatabaseWizard.select_FieldType(keyword2);
		diaContactDatabaseWizard.enter_MinLength(keyword3);
		diaContactDatabaseWizard.enter_MaxLength(keyword4);
		diaContactDatabaseWizard.enter_DefaultValue(keyword5);
		diaContactDatabaseWizard.checkbox_key();
		diaContactDatabaseWizard.select_KindOfField(keyword6);
	}
	
	/*
	 * This function can use for some field types: string, int, decimal, email, mobile
	 */
	
	@Step
	public void create_Required_Field(String keyword1, String keyword2, String keyword3, String keyword4, String keyword5, String keyword6) {
		diaContactDatabaseWizard.enter_FieldDescriptorLabel(keyword1);
		diaContactDatabaseWizard.enter_FieldDescriptorName(keyword1);
		diaContactDatabaseWizard.select_FieldType(keyword2);
		diaContactDatabaseWizard.enter_MinLength(keyword3);
		diaContactDatabaseWizard.enter_MaxLength(keyword4);
		diaContactDatabaseWizard.enter_DefaultValue(keyword5);
		diaContactDatabaseWizard.checkbox_required();
		diaContactDatabaseWizard.select_KindOfField(keyword6);
	}
	
	/*
	 * This function can use for some field types: string, int, decimal, email, mobile
	 */
	
	@Step
	public void create_Field(String keyword1, String keyword2, String keyword3, String keyword4, String keyword5, String keyword6) {
		diaContactDatabaseWizard.enter_FieldDescriptorLabel(keyword1);
		diaContactDatabaseWizard.enter_FieldDescriptorName(keyword1);
		diaContactDatabaseWizard.select_FieldType(keyword2);
		diaContactDatabaseWizard.enter_MinLength(keyword3);
		diaContactDatabaseWizard.enter_MaxLength(keyword4);
		diaContactDatabaseWizard.enter_DefaultValue(keyword5);
		diaContactDatabaseWizard.select_KindOfField(keyword6);
	}
	
}
