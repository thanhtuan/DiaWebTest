package com.tripolis.qa.dialogueweb.pages;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.tripolis.qa.common.AbstractPage;

import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("/dialogue/home.html")
public class DiaHomePage extends AbstractPage {
	
	private static final Logger logger = LoggerFactory.getLogger(DiaHomePage.class);
	
	public boolean getHomeurl() {
		logger.info("Get Home URL");
		return getDriver().getCurrentUrl().contains("/dialogue/home.html");	
	}

	
}
