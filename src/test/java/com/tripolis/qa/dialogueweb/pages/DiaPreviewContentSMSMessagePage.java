package com.tripolis.qa.dialogueweb.pages;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.tripolis.qa.common.AbstractPage;

import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("/dialogue/content/sms/preview.html")
public class DiaPreviewContentSMSMessagePage extends AbstractPage {

private static final Logger logger = LoggerFactory.getLogger(DiaPreviewContentSMSMessagePage.class);
	
	public boolean getPreviewSMSMessageUrl() {
		logger.info("Get Preview SMS Message URL");
		return getDriver().getCurrentUrl().contains("/dialogue/content/sms/preview.html");
	}
	
	public String getSuccessfulMessage() {
		return getTextMessageByAttribute("taglineSucces");
	}
}
