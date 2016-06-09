package com.tripolis.qa.dialogueweb.steps.serenity;

import static org.assertj.core.api.Assertions.assertThat;

import org.openqa.selenium.WebDriver;

import com.tripolis.qa.dialogueweb.pages.DiaAdministrationPage;
import com.tripolis.qa.dialogueweb.pages.DiaContactDatabaseWizard;
import com.tripolis.qa.dialogueweb.pages.DiaEditContactDatabaseDetailsPage;
import com.tripolis.qa.dialogueweb.pages.DiaHomePage;
import com.tripolis.qa.dialogueweb.pages.DiaListContactDatabasesPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class DiaContactDatabaseSteps extends ScenarioSteps {
	
	public DiaContactDatabaseSteps() {
		// TODO Auto-generated constructor stub
		System.setProperty(org.slf4j.impl.SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "TRACE");
	}

	DiaHomePage diaHomePage;
	DiaAdministrationPage diaAdministrationPage;
	DiaListContactDatabasesPage diaListContactDatabasesPage;
	DiaEditContactDatabaseDetailsPage diaEditContactDatabaseDetailsPage;
	DiaContactDatabaseWizard diaContactDatabaseWizard;
	
	/*
	 * Steps using methods from DiaHomePage
	 */
	
	@Step
	public void navigateToAdministrationPage() {
		diaHomePage.click_SetupPageLink();
	}
	
	/*
	 * *******End Steps using methods from DiaHomePage********
	 */
	
	
	/*
	 * Steps using methods from DiaAdministrationPage
	 */
	
	@Step
	public void navigateToListContactDatabasesPage() {
		diaAdministrationPage.clickOnsubMenuItem1();
	}
	
	@Step
	public void onAdministrationPage() {
		assert(diaAdministrationPage.getAdministrationUrl());
	}
	
	/*
	 * *******End Steps using methods from DiaAdministrationPage********
	 */
	
	
	/*
	 * Steps using methods from DiaListContactDatabasesPage
	 */
	
	@Step
	public void onListContactDatabasesPage() {
		assert(diaListContactDatabasesPage.getListContactDatabasesUrl());
	}
	
	@Step
	public void verifyheaderNameTextListContactDatabases() {
		assertThat(diaListContactDatabasesPage.getheaderNameText().equalsIgnoreCase("List of contact databases"));
	}
	
	@Step
	public void clickOnNewLink() {
		diaListContactDatabasesPage.clickNewLink();
	}

	@Step
	public void clickOnEditButton() {
		diaListContactDatabasesPage.clickEditButton();
	}
	
	@Step
	public void clickOnDeleteButton () {
		diaListContactDatabasesPage.clickDeleteButton();
	}
	
	@Step
	public void verifyDeleteconfirmedMessage(String keyword) {
		assertThat(diaListContactDatabasesPage.getconfirmedMessage().equalsIgnoreCase("Are you sure you would like to delete these contact databases (" + keyword + ")?"));
	}
	
	@Step
	public void clickOnConfirmedButton () {
		diaListContactDatabasesPage.clickconfirmedButton();
	}
	
	@Step
	public void clickOnDeleteBtn () {
		diaListContactDatabasesPage.clickDeleteBtn();
	}
	
	@Step
	public String getcontactDatabasesAttribute() {
		return diaListContactDatabasesPage.contactDatabasesAttribute();
	}
	
	@Step
	public void selectContactDB() {
		diaListContactDatabasesPage.select_ContactDatabases();
	}
	
	/*
	 * *******End Steps using methods from diaListContactDatabasesPage********
	 */
	
	
	/*
	 * Steps using methods from DiaEditContactDatabaseDetailsPage
	 */
	
	@Step
	public void onEditContactDatabasePage() {
		assert(diaEditContactDatabaseDetailsPage.getEditContactDatabaseUrl());
	}
	
	@Step
	public void verify_HeaderNameTextEditContactDatabase(String keyword) {
		assertThat(diaEditContactDatabaseDetailsPage.getheaderNameText().equalsIgnoreCase("Edit contact database " + '"' + keyword + '"'));
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
	public void clickOnSubmitButton() {
		diaEditContactDatabaseDetailsPage.clickSaveButton();
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
	public void verifyheaderNameTextCreateDatabaseDialogStep1() {
		assertThat(diaContactDatabaseWizard.getCreateDatabaseDialogheaderNameText().equalsIgnoreCase("Database Wizard - Step 1: Create database"));
	}
	
	@Step
	public void verifyheaderNameTextCreateDatabaseDialogStep2() {
		assertThat(diaContactDatabaseWizard.getCreateDatabaseDialogheaderNameText().equalsIgnoreCase("Database Wizard - Step 2: Create key field descriptor"));
	}
	
	@Step
	public void verifyheaderNameTextCreateDatabaseDialogStep3() {
		assertThat(diaContactDatabaseWizard.getCreateDatabaseDialogheaderNameText().equalsIgnoreCase("Database Wizard - Step 3: Create field descriptor"));
	}
	
	@Step
	public void verifyheaderNameTextCreateDatabaseDialogOverview() {
		assertThat(diaContactDatabaseWizard.getCreateDatabaseDialogheaderNameText().equalsIgnoreCase("Database Wizard - Field overview"));
	}
	
	@Step
	public void verify_DatabaseLabelText(String keyword) {
		assertThat(diaContactDatabaseWizard.getConfirmedDatabaseLabelText().equalsIgnoreCase(keyword));
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
