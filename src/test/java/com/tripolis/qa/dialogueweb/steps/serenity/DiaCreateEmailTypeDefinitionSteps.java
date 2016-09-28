package com.tripolis.qa.dialogueweb.steps.serenity;

import static org.assertj.core.api.Assertions.assertThat;

import com.tripolis.qa.dialogueweb.pages.DiaCreateEmailTypeDefinition;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class DiaCreateEmailTypeDefinitionSteps extends ScenarioSteps {
	
	private static final long serialVersionUID = 1L;
	
	DiaCreateEmailTypeDefinition diaCreateEmailTypeDefinition;
	
	@Step
	public void onCreateDirectEmailTypePage() {
		assert(diaCreateEmailTypeDefinition.getCreateDirectEmailTypeUrl());
	}
	
	@Step
	public void verifyheaderNameTextCreateEmailTypeDefinitions() {
		assertThat(diaCreateEmailTypeDefinition.getHeaderNameText().equalsIgnoreCase("New direct email type"));
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
	public void setEmailField(String keyword) {
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
	public void setCharacterSetEncoding(String keyword) {
		diaCreateEmailTypeDefinition.select_CharacterSetEncoding(keyword);
	}
	
	@Step
	public void attachmentShouldDisplay() {
		assertThat(diaCreateEmailTypeDefinition.isDisplayedAttachmentEnabled()).isTrue();
	}
	
	@Step
	public void setAttachmentEnabled(boolean value) {
		diaCreateEmailTypeDefinition.checkbox_AttachmentEnabled(value);
	}
	
	@Step
	public void externalAttachmentShouldDisplay() {
		assertThat(diaCreateEmailTypeDefinition.isDisplayedExternalAttachmentEnabled()).isTrue();
	}
	
	@Step
	public void setExternalAttachmentEnabled(boolean value) {
		diaCreateEmailTypeDefinition.checkbox_ExternalAttachmentEnabled(value);
	}
	
	@Step
	public void clickOnSaveButton() {
		diaCreateEmailTypeDefinition.clickSaveButton();
	}

}
