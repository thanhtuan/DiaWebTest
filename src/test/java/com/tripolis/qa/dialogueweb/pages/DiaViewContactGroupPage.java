package com.tripolis.qa.dialogueweb.pages;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.tripolis.qa.common.AbstractPage;

import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("/dialogue/contacts/viewContactGroup.html")
public class DiaViewContactGroupPage extends AbstractPage {
	
	private static final Logger logger = LoggerFactory.getLogger(DiaViewContactGroupPage.class);
	
	public boolean getViewContactGroupUrl() {
		logger.info("Get View Contact Group URL");
		return getDriver().getCurrentUrl().contains("/dialogue/contacts/viewContactGroup.html");
	}
	
	public String getSuccessfulMessage() {
		return getTextMessageByAttribute("taglineSucces");
	}

}
