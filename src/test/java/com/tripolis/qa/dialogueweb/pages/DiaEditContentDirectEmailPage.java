package com.tripolis.qa.dialogueweb.pages;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.tripolis.qa.common.AbstractPage;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("/dialogue/content/directemails/edit.html")
public class DiaEditContentDirectEmailPage extends AbstractPage {
	
	private static final Logger logger = LoggerFactory.getLogger(DiaEditContentDirectEmailPage.class);
	
	@FindBy(xpath=".//*[@id='main-hd']/ul/li/a", timeoutInSeconds="5")
	private WebElementFacade saveLink;
	
	@FindBy(id="tinymce", timeoutInSeconds="5")
	private WebElementFacade tinymceDirectEmailBody;
	
	public boolean getEditDirectEmailUrl() {
		logger.info("Get Preview Direct Email URL");
		return getDriver().getCurrentUrl().contains("/dialogue/content/directemails/edit.html");
	}
	
	public void clickSaveLink() {
		logger.info("Please click on Save Link");
		saveLink.waitUntilClickable().click();
		logger.info("already click on Save Link");
	}
	
	public void enter_DirectEmailBody(String keyword) {
		logger.info("Please input Direct Email Body");
		tinymceDirectEmailBody.waitUntilPresent().clear();
		tinymceDirectEmailBody.waitUntilPresent().type(keyword);
		logger.info("already input Direct Email Body");
    }

}
