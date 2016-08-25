package com.tripolis.qa.dialogueweb.pages;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.tripolis.qa.common.AbstractPage;

import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("/dialogue/contacts/viewContact.html")
public class DiaViewContactPage extends AbstractPage {

	private static final Logger logger = LoggerFactory.getLogger(DiaViewContactPage.class);
	
	public boolean getViewContactsUrl() {
		logger.info("Get View Contacts URL");
		return getDriver().getCurrentUrl().contains("/dialogue/contacts/viewContact.html");
	}
	
}
