package com.tripolis.qa.dialogueweb.pages;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.tripolis.qa.common.AbstractPage;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("/dialogue/content/sms/browse.html")
public class DiaListSMSMessagesPage extends AbstractPage {

	private static final Logger logger = LoggerFactory.getLogger(DiaListSMSMessagesPage.class);
	
	@FindBy(xpath=".//*[@class='tbody']/tr", timeoutInSeconds="5")
	private List<WebElementFacade> listSMSMessages;
	
	public boolean getListSMSMessagesUrl() {
		logger.info("Get List SMS Message URL");
		return getDriver().getCurrentUrl().contains("/dialogue/content/sms/browse.html");
	}
	
	public void clickSMSMessage(String value) {
		for(WebElementFacade smsMessage : listSMSMessages) {
			String label = smsMessage.findBy(".//td[2]/div").waitUntilPresent().getText().trim();
			if(value.equals(label)) {
				WebElementFacade selected = smsMessage.findBy(".//td[2]/div");
				selected.waitUntilClickable().click();
			}
		}
	}
	
}
