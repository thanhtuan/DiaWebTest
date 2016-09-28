package com.tripolis.qa.dialogueweb.pages;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.tripolis.qa.common.AbstractPage;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("/dialogue/contacts/createContact.html")
public class DiaCreateContactPage extends AbstractPage {
	
	private static final Logger logger = LoggerFactory.getLogger(DiaCreateContactPage.class);
	
	public boolean getCreateContactUrl() {
		logger.info("Get Create Contact URL");
		return getDriver().getCurrentUrl().contains("/dialogue/contacts/createContact.html");
	}
	
	@FindBy(xpath=".//*[@id='main-hd']/ul/li/a", timeoutInSeconds="5")
	private WebElementFacade saveLink; 
	
	@FindBy(name="email", timeoutInSeconds="5")
	private WebElementFacade contactEmail;
	
	@FindBy(name="name", timeoutInSeconds="5")
	private WebElementFacade contactName;
	
	@FindBy(name="mobile", timeoutInSeconds="5")
	private WebElementFacade contactMobile;
	
	@FindBy(xpath=".//*[@id='required']/ul/li[1]", timeoutInSeconds="5")
	private WebElementFacade emailValidationMessage;
	
	public void enter_ContactEmail(String keyword) {
		logger.info("Please input Contact Email");
		contactEmail.waitUntilPresent().clear();
		contactEmail.waitUntilPresent().type(keyword);
		logger.info("already input Contact Email");
    }
	
	public void enter_ContactName(String keyword) {
		logger.info("Please input Contact Name");
		contactName.waitUntilPresent().clear();
		contactName.waitUntilPresent().type(keyword);
		logger.info("already input Contact Name");
    }
	
	public void enter_ContactMobile(String keyword) {
		logger.info("Please input Contact Mobile");
		contactMobile.waitUntilPresent().clear();
		contactMobile.waitUntilPresent().type(keyword);
		logger.info("already input Contact Mobile");
    }
	
	public void clickSaveLink() {
		logger.info("Please click on Save Link");
		saveLink.waitUntilClickable().click();
		logger.info("already click on Save Link");
	}
	
	public String getEmailValidationMessage() {
		return emailValidationMessage.waitUntilPresent().getText();
	}

}
