package com.tripolis.qa.dialogueweb.pages;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.tripolis.qa.common.AbstractPage;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("/dialogue/admin/content/editEmailTypeDefinition.html")
public class DiaEditEmailTypeDefinition extends AbstractPage {

	private static final Logger logger = LoggerFactory.getLogger(DiaEditEmailTypeDefinition.class);
	
	@FindBy(xpath=".//*[@id='emailTypeDefinitionForm']/input[1]", timeoutInSeconds="5")
	private WebElementFacade emailTypeId;
	
	@FindBy(id="externalHtmlUrl", timeoutInSeconds="5")
	private WebElementFacade externalHtmlUrl;
	
	@FindBy(id="externalTextUrl", timeoutInSeconds="5")
	private WebElementFacade externalTextUrl;
	
	@FindBy(name="tinyMceEnabled", timeoutInSeconds="5")
	private WebElementFacade tinyMceEnabled;
	
	@FindBy(name="emailFieldDescriptorsRowId", timeoutInSeconds="5")
	private WebElementFacade emailFieldDescriptorsRowId;
	
	@FindBy(id="characterSetEncoding", timeoutInSeconds="5")
	private WebElementFacade characterSetEncoding;
	
	@FindBy(name="attachmentEnabled", timeoutInSeconds="5")
	private WebElementFacade attachmentEnabled;
	
	@FindBy(name="externalAttachmentEnabled", timeoutInSeconds="5")
	private WebElementFacade externalAttachmentEnabled;
	
	public boolean getEditEmailTypeDefinitionUrl() {
		logger.info("Get Edit Email Type Definition URL");
		return getDriver().getCurrentUrl().contains("/dialogue/admin/content/editEmailTypeDefinition.html");	
	}
	
	public void directEmailTypeNameState() {
		name.shouldNotBeEnabled();
	}
	
	public void enter_ExternalHtmlUrl(String keyword) {
		logger.info("Please input External Html Url");
		externalHtmlUrl.waitUntilPresent().clear();
		externalHtmlUrl.waitUntilPresent().type(keyword);
		logger.info("already input External Html Url");
    }
	
	public void enter_ExternalTextUrl(String keyword) {
		logger.info("Please input External Text Url");
		externalTextUrl.waitUntilPresent().clear();
		externalTextUrl.waitUntilPresent().type(keyword);
		logger.info("already input External Text Url");
    }
	
	public void checkbox_TinyMceEnabled(boolean value) {
		setCheckbox(tinyMceEnabled.waitUntilPresent(), value);
	}
	
	public void select_EmailField(String keyword) {
		emailFieldDescriptorsRowId.waitUntilPresent().selectByVisibleText(keyword);
	}
	
	public void select_CharacterSetEncoding(String keyword) {
		characterSetEncoding.waitUntilPresent().selectByValue(keyword);
	}
	
	public boolean isDisplayedAttachmentEnabled() {
		return attachmentEnabled.isDisplayed();
	}
	
	public void checkbox_AttachmentEnabled(boolean value) {
		setCheckbox(attachmentEnabled.waitUntilPresent(), value);
	}
	
	public boolean isDisplayedExternalAttachmentEnabled() {
		return externalAttachmentEnabled.isDisplayed();
	}
	
	public void checkbox_ExternalAttachmentEnabled(boolean value) {
		setCheckbox(externalAttachmentEnabled.waitUntilPresent(), value);
	}
	
	public String getSuccessfulMessage() {
		return getTextMessageByAttribute("taglineSucces");
	}
	
}
