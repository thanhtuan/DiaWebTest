package com.tripolis.qa.dialogueweb.pages;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.tripolis.qa.common.AbstractPage;

import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("/dialogue/content/directemails/preview.html")
public class DiaPreviewContentDirectEmailPage extends AbstractPage {
	
	private static final Logger logger = LoggerFactory.getLogger(DiaPreviewContentDirectEmailPage.class);
	
	public boolean getPreviewDirectEmailUrl() {
		logger.info("Get Preview Direct Email URL");
		return getDriver().getCurrentUrl().contains("/dialogue/content/directemails/preview.html");
	}

}
