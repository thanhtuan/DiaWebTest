package com.tripolis.qa.dialogueweb.pages;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.tripolis.qa.common.AbstractPage;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("/dialogue/content/sms/create.html")
public class DiaCreateContentSMSMessagePage extends AbstractPage {

	private static final Logger logger = LoggerFactory.getLogger(DiaCreateContentSMSMessagePage.class);
	
	@FindBy(id="originatorNumber", timeoutInSeconds="5")
	private WebElementFacade smsOriginatorNumber;
	
	@FindBy(id="originator", timeoutInSeconds="5")
	private WebElementFacade smsOriginatorName;
	
	@FindBy(id="message", timeoutInSeconds="5")
	private WebElementFacade smsMessage;
	
	@FindBy(name="alternativeMessage", timeoutInSeconds="5")
	private WebElementFacade alternativeSMSMessage;
	
	@FindBy(name="description", timeoutInSeconds="5")
	private WebElementFacade descriptionMessage;
	
	public boolean getCreateSMSMessageUrl() {
		logger.info("Get Create SMS Message URL");
		return getDriver().getCurrentUrl().contains("/dialogue/content/sms/create.html");
	}
	
	public void enter_SMSOriginatorNumber(String keyword) {
		logger.info("Please input SMS Originator Number");
		smsOriginatorNumber.waitUntilPresent().clear();
		smsOriginatorNumber.waitUntilPresent().type(keyword);
		logger.info("already input SMS Originator Number");
    }
	
	public void enter_SMSOriginatorName(String keyword) {
		logger.info("Please input SMS Originator Name");
		smsOriginatorName.waitUntilPresent().clear();
		smsOriginatorName.waitUntilPresent().type(keyword);
		logger.info("already input SMS Originator Name");
    }
	
	public void enter_SMSMessage(String keyword) {
		logger.info("Please input SMS Message");
		smsMessage.waitUntilPresent().clear();
		smsMessage.waitUntilPresent().type(keyword);
		logger.info("already input SMS Message");
    }
	
	public void enter_AlternativeSMSMessage(String keyword) {
		logger.info("Please input Alternative SMS Message");
		alternativeSMSMessage.waitUntilPresent().clear();
		alternativeSMSMessage.waitUntilPresent().type(keyword);
		logger.info("already input Alternative SMS Message");
    }
	
	public void enter_DescriptionMessage(String keyword) {
		logger.info("Please input Description Message");
		descriptionMessage.waitUntilPresent().clear();
		descriptionMessage.waitUntilPresent().type(keyword);
		logger.info("already input Description Message");
    }
	
}
