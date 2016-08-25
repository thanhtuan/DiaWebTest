package com.tripolis.qa.dialogueweb.steps.serenity;

import static org.assertj.core.api.Assertions.assertThat;

import com.tripolis.qa.dialogueweb.pages.DiaContactDatabaseWizard;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class DiaContactDatabaseWizardSteps extends ScenarioSteps {
	
	private static final long serialVersionUID = 1L;
	
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
	public void verifyheaderNameTextCreatePickListStep3_1() {
		assertThat(diaContactDatabaseWizard.getCreateDatabaseDialogheaderNameText().equalsIgnoreCase("Database Wizard - Step 3.1: Create picklist item"));
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
	public void clickOnAddItemButton() {
		diaContactDatabaseWizard.clickAddItemButton();
	}
	
	@Step
	public void clickOnPreviousButtonOnPicklist() {
		diaContactDatabaseWizard.clickPreviousButtonOnPicklist();
	}
	
	@Step
	public void selected_DefaultValueOnPicklist(String keyword) {
		diaContactDatabaseWizard.select_DefaultValue(keyword);
	}
	
	@Step
	public void clickOnFinishButton() {
		diaContactDatabaseWizard.clickFinishButton();
	}
	
	/*
	 * *******Steps for create contact database********
	 */
		
	/*
	 * This function can use for Create some field types: String, int, decimal, email, mobile
	 */
	
	@Step
	public void create_Key_Field(String keyword1, String keyword2, String keyword3, String keyword4, String keyword5, String keyword6) {
		diaContactDatabaseWizard.enter_FieldDescriptorLabel(keyword1);
		diaContactDatabaseWizard.enter_FieldDescriptorName(keyword1);
		diaContactDatabaseWizard.select_FieldType(keyword2);
		diaContactDatabaseWizard.enter_MinLength(keyword3);
		diaContactDatabaseWizard.enter_MaxLength(keyword4);
		diaContactDatabaseWizard.enter_DefaultStringValue(keyword5);
		diaContactDatabaseWizard.select_KindOfField(keyword6);
	}
	
	/* Default value "Date" field: yyyy-MM-dd
	 * Default value "Datetime" field:yyyy-MM-dd hh:mm:ss
	 */
	@Step
	public void create_DateTime_Key_Field(String keyword1, String keyword2, String keyword3, String keyword4) {
		diaContactDatabaseWizard.enter_FieldDescriptorLabel(keyword1);
		diaContactDatabaseWizard.enter_FieldDescriptorName(keyword1);
		diaContactDatabaseWizard.select_FieldType(keyword2);
		diaContactDatabaseWizard.enter_DefaultStringValue(keyword3);
		diaContactDatabaseWizard.select_KindOfField(keyword4);
	}
	
	/*
	 * This function can use for Create some field types: String, int, decimal, email, mobile
	 */
	
	@Step
	public void create_Field(String keyword1, String keyword2, String keyword3, String keyword4, String keyword5, boolean value1, boolean value2, boolean value3, String keyword6) {
		diaContactDatabaseWizard.enter_FieldDescriptorLabel(keyword1);
		diaContactDatabaseWizard.enter_FieldDescriptorName(keyword1);
		diaContactDatabaseWizard.select_FieldType(keyword2);
		diaContactDatabaseWizard.enter_MinLength(keyword3);
		diaContactDatabaseWizard.enter_MaxLength(keyword4);
		diaContactDatabaseWizard.enter_DefaultStringValue(keyword5);
		diaContactDatabaseWizard.checkbox_key(value1);
		diaContactDatabaseWizard.checkbox_required(value2);
		diaContactDatabaseWizard.checkbox_inOverView(value3);
		diaContactDatabaseWizard.select_KindOfField(keyword6);
	}
	
	/* Default value "Date" field: yyyy-MM-dd
	 * Default value "Datetime" field:yyyy-MM-dd hh:mm:ss
	 */
	
	@Step
	public void create_DateTimeField(String keyword1, String keyword2, String keyword3, String keyword4, boolean value1, boolean value2, boolean value3) {
		diaContactDatabaseWizard.enter_FieldDescriptorLabel(keyword1);
		diaContactDatabaseWizard.enter_FieldDescriptorName(keyword1);
		diaContactDatabaseWizard.select_FieldType(keyword2);
		diaContactDatabaseWizard.enter_DefaultStringValue(keyword3);
		diaContactDatabaseWizard.checkbox_key(value1);
		diaContactDatabaseWizard.checkbox_required(value2);
		diaContactDatabaseWizard.checkbox_inOverView(value3);
		diaContactDatabaseWizard.select_KindOfField(keyword4);
	}
	
	@Step
	public void create_BooleanField(String keyword1, String keyword2, int number1, String keyword4, boolean value1, boolean value2, boolean value3) {
		diaContactDatabaseWizard.enter_FieldDescriptorLabel(keyword1);
		diaContactDatabaseWizard.enter_FieldDescriptorName(keyword1);
		diaContactDatabaseWizard.select_FieldType(keyword2);
		diaContactDatabaseWizard.select_RadioButton(number1);
		diaContactDatabaseWizard.checkbox_key(value1);
		diaContactDatabaseWizard.checkbox_required(value2);
		diaContactDatabaseWizard.checkbox_inOverView(value3);
		diaContactDatabaseWizard.select_KindOfField(keyword4);
	}
	
	@Step
	public void create_PickListField(String keyword1, String keyword2, String keyword3, String keyword4, String keyword5, boolean value1, boolean value2, boolean value3, String keyword6) {
		diaContactDatabaseWizard.enter_FieldDescriptorLabel(keyword1);
		diaContactDatabaseWizard.enter_FieldDescriptorName(keyword1);
		diaContactDatabaseWizard.select_FieldType(keyword2);
		diaContactDatabaseWizard.enter_DefaultStringValue(keyword5);
		diaContactDatabaseWizard.checkbox_key(value1);
		diaContactDatabaseWizard.checkbox_required(value2);
		diaContactDatabaseWizard.checkbox_inOverView(value3);
		diaContactDatabaseWizard.select_KindOfField(keyword6);
	}
	
	@Step
	public void create_PickListItem(String label, String value) {
		diaContactDatabaseWizard.enter_PicklistItemLabel(label);
		diaContactDatabaseWizard.enter_PicklistItemValue(value);
	}
}
