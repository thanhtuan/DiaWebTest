package com.tripolis.qa.dialogueweb.pages;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.tripolis.qa.common.AbstractPage;

import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("/dialogue/administration.html")
public class DiaAdministrationPage extends AbstractPage {
	
	private static final Logger logger = LoggerFactory.getLogger(DiaAdministrationPage.class);
	
	public boolean getAdministrationUrl() {
		logger.info("Get administration URL");
		return getDriver().getCurrentUrl().contains("/dialogue/administration.html");
		
	}
}
