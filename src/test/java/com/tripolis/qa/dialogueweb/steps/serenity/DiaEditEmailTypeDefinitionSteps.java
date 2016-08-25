package com.tripolis.qa.dialogueweb.steps.serenity;

import static org.assertj.core.api.Assertions.assertThat;

import com.tripolis.qa.dialogueweb.pages.DiaEditEmailTypeDefinition;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class DiaEditEmailTypeDefinitionSteps extends ScenarioSteps {
	
	private static final long serialVersionUID = 1L;
	
	DiaEditEmailTypeDefinition diaEditEmailTypeDefinition;
	
	@Step
	public void onEditDirectEmailTypePage() {
		assert(diaEditEmailTypeDefinition.getEditEmailTypeDefinitionUrl());
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
	public void editEmailField(String keyword) {
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
	public void editCharacterSetEncoding(String keyword) {
		diaEditEmailTypeDefinition.select_CharacterSetEncoding(keyword);
	}
	
	@Step
	public void attachmentShouldDisplay() {
		assertThat(diaEditEmailTypeDefinition.isDisplayedAttachmentEnabled()).isTrue();
	}
	
	@Step
	public void editAttachmentEnabled(boolean value) {
		diaEditEmailTypeDefinition.checkbox_AttachmentEnabled(value);
	}
	
	@Step
	public void externalAttachmentShouldDisplay() {
		assertThat(diaEditEmailTypeDefinition.isDisplayedExternalAttachmentEnabled()).isTrue();
	}
	
	@Step
	public void editExternalAttachmentEnabled(boolean value) {
		diaEditEmailTypeDefinition.checkbox_ExternalAttachmentEnabled(value);
	}
	
	@Step
	public void clickOnSaveButton() {
		diaEditEmailTypeDefinition.clickSaveButton();
	}

}
