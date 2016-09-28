package com.tripolis.qa.dialogueweb.pages;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.tripolis.qa.common.AbstractPage;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("/dialogue/content/sms/selectType.html")
public class DiaSelectSMSMessageTypePage extends AbstractPage {

	private static final Logger logger = LoggerFactory.getLogger(DiaSelectSMSMessageTypePage.class);
	
	@FindBy(name="smsMessageTypeDefinitionId", timeoutInSeconds="5")
	private WebElementFacade smsMessageTypeDropDown;
	
	public boolean getSelectSMSMessageTypeUrl() {
		logger.info("Get Select SMS Message Type URL");
		return getDriver().getCurrentUrl().contains("/dialogue/content/sms/selectType.html");
	}
	
	public void select_SMSMessageType(String keyword) {
		smsMessageTypeDropDown.selectByVisibleText(keyword);
	}
}
