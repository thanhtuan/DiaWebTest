package com.tripolis.qa.dialogueweb.steps.serenity;

import static org.assertj.core.api.Assertions.assertThat;

import com.tripolis.qa.dialogueweb.pages.DiaCreateEmailTypeDefinition;
import com.tripolis.qa.dialogueweb.pages.DiaEditEmailTypeDefinition;
import com.tripolis.qa.dialogueweb.pages.DiaListEmailTypeDefinitions;
import com.tripolis.qa.dialogueweb.pages.DiaListWorkspacesPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class DiaDirectEmailTypeSteps extends ScenarioSteps {
	
	DiaListWorkspacesPage diaListWorkspacesPage;
	DiaListEmailTypeDefinitions diaListEmailTypeDefinitions;
	DiaCreateEmailTypeDefinition diaCreateEmailTypeDefinition;
	DiaEditEmailTypeDefinition diaEditEmailTypeDefinition;
	
	@Step
	public void navigateToListEmailTypeDefinitions() {
		diaListWorkspacesPage.clickOnleftpanelItem4();
	}
	
	/*
	 * Steps using methods from DiaListEmailTypeDefinitions Page
	 */
	
	@Step
	public void onListEmailTypeDefinitionsPage(String value) {
		assert(diaListEmailTypeDefinitions.getListEmailTypeDefinitionUrl(value));
	}
	
	@Step
	public void clickOnNewLink() {
		diaListEmailTypeDefinitions.clickNewLink();
	}
	
	@Step
	public void clickOnEditButton() {
		diaListEmailTypeDefinitions.clickEditButton();
	}
	
	@Step
	public void clickOnDeleteButton () {
		diaListEmailTypeDefinitions.clickDeleteButton();
	}
	
	@Step
	public void seeConfirmedPopup() {
		assertThat(diaListEmailTypeDefinitions.isshowconfirmedPopup()).isTrue();
	}
	
	@Step
	public void verifyconfirmedMessage() {
		assertThat(diaListEmailTypeDefinitions.getconfirmedMessage().equalsIgnoreCase("Are you sure you want to delete the selected direct email type(s)?"));
	}
	
	@Step
	public void clickOnConfirmedOkButton () {
		diaListEmailTypeDefinitions.clickConfirmedOkButton();
	}
	
	@Step
	public void clickOnConfirmedCancelButton () {
		diaListEmailTypeDefinitions.clickConfirmedCancelButton();
	}
	
	@Step
	public void verifyheaderNameTextListEmailTypeDefinitions(String value) {
		assertThat(diaListEmailTypeDefinitions.getheaderNameText().equalsIgnoreCase("Direct email types in " + '"' + value + '"'));
	}
	
	@Step
	public void verifyheaderNameTextCreateEmailTypeDefinitions() {
		assertThat(diaCreateEmailTypeDefinition.getheaderNameText().equalsIgnoreCase("New direct email type"));
	}
	
	@Step
	public void selectEmailType() {
		diaListEmailTypeDefinitions.select_EmailType();
	}
	
	/*
	 * *******End Steps using methods from DiaListEmailTypeDefinitions Page********
	 */
	
	
	
	/*
	 * Steps using methods from DiaCreateEmailTypeDefinition Page
	 */
	
	@Step
	public void onCreateDirectEmailTypePage() {
		assert(diaCreateEmailTypeDefinition.getCreateDirectEmailTypeUrl());
	}
	
	@Step
	public void setLabel(String keyword) {
		diaCreateEmailTypeDefinition.enter_Label(keyword);
	}
	
	@Step
	public void setName(String keyword) {
		diaCreateEmailTypeDefinition.enter_Name(keyword);
	}
	
	@Step
	public void setFromAddress(String keyword) {
		diaCreateEmailTypeDefinition.enter_FromAddress(keyword);
	}
	
	@Step
	public void setFromName(String keyword) {
		diaCreateEmailTypeDefinition.enter_FromName(keyword);
	}
	
	@Step
	public void setReplyToAddress(String keyword) {
		diaCreateEmailTypeDefinition.enter_ReplyToAddress(keyword);
	}
	
	@Step
	public void setExternalHtmlUrl(String keyword) {
		diaCreateEmailTypeDefinition.enter_ExternalHtmlUrl(keyword);
	}
	
	@Step
	public void setExternalTextUrl(String keyword) {
		diaCreateEmailTypeDefinition.enter_ExternalTextUrl(keyword);
	}
	
	@Step
	public void setTinyMceEnabled(boolean value) {
		diaCreateEmailTypeDefinition.checkbox_TinyMceEnabled(value);
	}
	
	@Step
	public void selected_EmailField(String keyword) {
		diaCreateEmailTypeDefinition.select_EmailField(keyword);
	}
	
	/*
	 * the option value can be used on function selected_CharacterSetEncoding:
	 * value: UTF8
	 * value: ISO8859_1
	 * value: ISO8859_2
	 * value: ISO8859_5
	 * value: ISO8859_7
	 * value: ISO8859_15
	 */
	
	@Step
	public void selected_CharacterSetEncoding(String keyword) {
		diaCreateEmailTypeDefinition.select_CharacterSetEncoding(keyword);
	}
	
	@Step
	public void setAttachmentEnabled(boolean value) {
		diaCreateEmailTypeDefinition.checkbox_AttachmentEnabled(value);
	}
	
	@Step
	public void setExternalAttachmentEnabled(boolean value) {
		diaCreateEmailTypeDefinition.checkbox_ExternalAttachmentEnabled(value);
	}
	
	@Step
	public void clickOnSaveButton() {
		diaCreateEmailTypeDefinition.clickSaveButton();
	}
	
	/*
	 * *******End Steps using methods from DiaCreateEmailTypeDefinition Page********
	 */
	
	
	/*
	 * Steps using methods from DiaEditEmailTypeDefinition Page
	 */
	
	@Step
	public void onEditDirectEmailTypePage(String value) {
		assert(diaEditEmailTypeDefinition.getEditEmailTypeDefinitionUrl(value));
	}
	
	@Step
	public void verifyheaderNameTextEditDirectEmailType(String value) {
		assertThat(diaEditEmailTypeDefinition.getheaderNameText().equalsIgnoreCase("Edit direct email type " + '"' + value + '"'));
	}
	
	@Step
	public void editLabel(String keyword) {
		diaEditEmailTypeDefinition.enter_Label(keyword);
	}
	
	@Step
	public void checkDirectEmailTypeNameState() {
		diaEditEmailTypeDefinition.directEmailTypeNameState();
	}
	
	@Step
	public void editFromAddress(String keyword) {
		diaEditEmailTypeDefinition.enter_FromAddress(keyword);
	}
	
	@Step
	public void editFromName(String keyword) {
		diaEditEmailTypeDefinition.enter_FromName(keyword);
	}
	
	@Step
	public void editReplyToAddress(String keyword) {
		diaEditEmailTypeDefinition.enter_ReplyToAddress(keyword);
	}
	
	@Step
	public void editExternalHtmlUrl(String keyword) {
		diaEditEmailTypeDefinition.enter_ExternalHtmlUrl(keyword);
	}
	
	@Step
	public void editExternalTextUrl(String keyword) {
		diaEditEmailTypeDefinition.enter_ExternalTextUrl(keyword);
	}
	
	@Step
	public void editTinyMceEnabled(boolean value) {
		diaEditEmailTypeDefinition.checkbox_TinyMceEnabled(value);
	}
	
	@Step
	public void edit_EmailField(String keyword) {
		diaEditEmailTypeDefinition.select_EmailField(keyword);
	}
	
	/*
	 * the option value can be used on function selected_CharacterSetEncoding:
	 * value: UTF8
	 * value: ISO8859_1
	 * value: ISO8859_2
	 * value: ISO8859_5
	 * value: ISO8859_7
	 * value: ISO8859_15
	 */
	
	@Step
	public void edit_CharacterSetEncoding(String keyword) {
		diaEditEmailTypeDefinition.select_CharacterSetEncoding(keyword);
	}
	
	@Step
	public void editAttachmentEnabled(boolean value) {
		diaEditEmailTypeDefinition.checkbox_AttachmentEnabled(value);
	}
	
	@Step
	public void editExternalAttachmentEnabled(boolean value) {
		diaEditEmailTypeDefinition.checkbox_ExternalAttachmentEnabled(value);
	}
	
	@Step
	public void clickOnSaveButtonOnEditPage() {
		diaEditEmailTypeDefinition.clickSaveButton();
	}
	
	/*
	 * *******End Steps using methods from DiaEditEmailTypeDefinition Page********
	 */
}
