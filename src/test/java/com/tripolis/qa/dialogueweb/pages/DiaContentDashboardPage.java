package com.tripolis.qa.dialogueweb.pages;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.tripolis.qa.common.AbstractPage;

import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("/dialogue/content/dashboard.html")
public class DiaContentDashboardPage extends AbstractPage {
	
	private static final Logger logger = LoggerFactory.getLogger(DiaContentDashboardPage.class);
	
	public boolean getContentDashboardUrl() {
		logger.info("Get Content Dashboard URL");
		return getDriver().getCurrentUrl().contains("/dialogue/content/dashboard.html");
	}

}
