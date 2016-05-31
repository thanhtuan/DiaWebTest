package com.tripolis.qa.steps.serenity;

import static org.assertj.core.api.Assertions.assertThat;

import com.tripolis.qa.pages.DiaAdministrationPage;
import com.tripolis.qa.pages.DiaContactDatabaseWizard;
import com.tripolis.qa.pages.DiaEditContactDatabaseDetailsPage;
import com.tripolis.qa.pages.DiaHomePage;
import com.tripolis.qa.pages.DiaMainMenu;
import com.tripolis.qa.pages.DiaSubMenuSetupModule;
import com.tripolis.qa.pages.ListContactDatabasesPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class DiaContactDatabaseSteps extends ScenarioSteps {

	DiaMainMenu diaMainMenu;
	DiaSubMenuSetupModule diaSubMenuSetupModule;
	DiaHomePage diaHomePage;
	DiaAdministrationPage diaAdministrationPage;
	ListContactDatabasesPage listContactDatabasesPage;
	DiaEditContactDatabaseDetailsPage diaEditContactDatabaseDetailsPage;
	DiaContactDatabaseWizard diaContactDatabaseWizard;
	
	/*
	 * Steps using methods from DiaMainMenu
	 */
	
	@Step
	public void navigateToAdministrationPage() {
		diaMainMenu.click_SetupPageLink();
	}
	
	/*
	 * *******End Steps using methods from DiaMainMenu********
	 */
	
	
	/*
	 * Steps using methods from DiaSubMenuSetupModule
	 */
	
	@Step
	public void navigateToListContactDatabasesPage() {
		diaSubMenuSetupModule.click_ListContactDatabasesPageLink();
	}
	
	/*
	 * *******End Steps using methods from DiaSubMenuSetupModule********
	 */
	
	
	/*
	 * Steps using methods from DiaAdministrationPage
	 */
	
	@Step
	public void onAdministrationPage() {
		assert(diaAdministrationPage.getAdministrationUrl());
	}
	
	/*
	 * *******End Steps using methods from DiaAdministrationPage********
	 */
	
	
	/*
	 * Steps using methods from ListContactDatabasesPage
	 */
	
	@Step
	public void onListContactDatabasesPage() {
		assert(listContactDatabasesPage.getListContactDatabasesUrl());
	}
	
	@Step
	public void clickOnNewLink() {
		listContactDatabasesPage.clickNewLink();
	}
	
	@Step
	public void clickOnEditButton() {
		listContactDatabasesPage.clickEditButton();
	}
	
	@Step
	public void clickOnDeleteButton () {
		listContactDatabasesPage.clickDeleteButton();
	}
	
	@Step
	public void clickOnConfirmedButton () {
		listContactDatabasesPage.clickconfirmedButton();
	}
	
	@Step
	public void clickOnDeleteBtn () {
		listContactDatabasesPage.clickDeleteBtn();
	}
	
	@Step
	public String getcontactDatabasesAttribute() {
		return listContactDatabasesPage.contactDatabasesAttribute();
	}
	
	@Step
	public void selectContactDB() {
		listContactDatabasesPage.select_ContactDatabases();
	}
	
	/*
	 * *******End Steps using methods from ListContactDatabasesPage********
	 */
	
	
	/*
	 * Steps using methods from DiaEditContactDatabaseDetailsPage
	 */
	
	@Step
	public void onEditContactDatabasePage() {
		assert(diaEditContactDatabaseDetailsPage.getEditContactDatabaseUrl());
	}
	
	@Step
	public void editLable(String keyword) {
		diaEditContactDatabaseDetailsPage.enter_Label(keyword);
	}
	
	@Step
	public void editName(String keyword) {
		diaEditContactDatabaseDetailsPage.enter_Name(keyword);
	}
	
	@Step
	public void verify_HeaderNameText(String keyword) {
		assertThat(diaEditContactDatabaseDetailsPage.getHeaderNameText().equalsIgnoreCase("Edit contact database " + '"' + keyword + '"'));
	}
	
	@Step
	public void clickOnSubmitButton() {
		diaEditContactDatabaseDetailsPage.clickSubmitButton();
	}
	
	/*
	 * *******End Steps using methods from DiaEditContactDatabaseDetailsPage********
	 */
	
	
	/*
	 * Steps using methods from DiaContactDatabaseWizard
	 */
	
	@Step
	public void seeCreateDatabaseDialog() {
		assertThat(diaContactDatabaseWizard.isShowCreateDatabaseDialog()).isTrue();
	}
	
	@Step
	public void setLabel(String keyword) {
		diaContactDatabaseWizard.enter_Label(keyword);
	}
	
	@Step
	public void setName(String keyword) {
		diaContactDatabaseWizard.enter_Name(keyword);
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
	
	/*
	 * *******End methods Steps using from DiaContactDatabaseWizard********
	 */
	

	
	
	/*
	 * *******Steps for create contact database********
	 */
		
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
