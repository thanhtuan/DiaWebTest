package com.tripolis.qa.dialogueweb.steps.serenity;

import static org.assertj.core.api.Assertions.assertThat;

import com.tripolis.qa.dialogueweb.pages.DiaContactDatabaseWizard;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class DiaContactDatabaseWizardSteps extends ScenarioSteps {
	
	DiaContactDatabaseWizard diaContactDatabaseWizard;
	
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
