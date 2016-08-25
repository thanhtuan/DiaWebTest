package com.tripolis.qa.dialogueweb.pages;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.tripolis.qa.common.AbstractPage;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("/dialogue/admin/contacts/editContactDatabaseDetails.html")
public class DiaEditContactDatabaseDetailsPage extends AbstractPage {
	
	private static final Logger logger = LoggerFactory.getLogger(DiaEditContactDatabaseDetailsPage.class);
	
	
	@FindBy(name="defaultFieldDescriptorId", timeoutInSeconds="5")
	private WebElementFacade presentationField;
	
	public void select_PresentationField(String keyword) {
		presentationField.waitUntilPresent().selectByVisibleText(keyword);
	}
	
	public boolean getEditContactDatabaseUrl() {
		logger.info("Get Edit Contact Database URL");
		return getDriver().getCurrentUrl().contains("/dialogue/admin/contacts/editContactDatabaseDetails.html");	
	}
	
	public String getSuccesfulMessage() {
		return getTextMessageByAttribute("taglineSucces");
	}
	
}
