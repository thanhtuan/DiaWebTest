package com.tripolis.qa.dialogueweb.pages;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.tripolis.qa.common.FormWizard;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class DiaContentPublicationWizard extends FormWizard {
	
	private static final Logger logger = LoggerFactory.getLogger(DiaContentPublicationWizard.class);
	
	@FindBy(xpath=".//*[@id='newsletterTypeSelector']/div", timeoutInSeconds="5")
	protected WebElementFacade newsletterType;
	
	@FindBy(xpath=".//*[@id='newsletterTypeSelector']/div/div", timeoutInSeconds="5")
	protected WebElementFacade selectedNewsletter;
	
	@FindBy(xpath=".//*[@id='emailTypeSelector']/div", timeoutInSeconds="5")
	protected WebElementFacade emailType;
	
	@FindBy(xpath=".//*[@id='emailSelector']/div/div", timeoutInSeconds="5")
	protected WebElementFacade selectedEmail;
	
	@FindBy(xpath=".//*[@id='smsTypeSelector']/div", timeoutInSeconds="5")
	protected WebElementFacade smsType;
	
	@FindBy(id="newsletterTypes", timeoutInSeconds="5")
	protected WebElementFacade newsletterTypeDropDown;
	
	@FindBy(id="smsMessageTypes", timeoutInSeconds="5")
	protected WebElementFacade smsMessageTypesDropDown;
	
	@FindBy(id="noneMailingSelector", timeoutInSeconds="5")
	protected WebElementFacade noneMailingSelector;
	
	@FindBy(id="editionMailing", timeoutInSeconds="5")
	protected WebElementFacade editionMailing;
	
	@FindBy(id="noneGroupSelector", timeoutInSeconds="5")
	protected WebElementFacade noneGroupSelector;
	
	@FindBy(id="selectedContactGroup", timeoutInSeconds="5")
	protected WebElementFacade selectedContactGroup;
	
	@FindBy(id="sendOption1", timeoutInSeconds="5")
	protected WebElementFacade sendNowOption;
	
	@FindBy(id="sendOption2", timeoutInSeconds="5")
	protected WebElementFacade scheduleOption;
	
	@FindBy(id="confirmMailing", timeoutInSeconds="10")
	protected WebElementFacade confirmMailing;
	
	@FindBy(id="closeBt", timeoutInSeconds="5")
	protected WebElementFacade finishButton;
	
	public void selectNewsletterType(String keyword) {
		newsletterTypeDropDown.selectByVisibleText(keyword);
	}
	
	public void selectSMSMessageType(String keyword) {
		smsMessageTypesDropDown.selectByVisibleText(keyword);
	}
	
	public String getNoneMailingSelectorLabel() {
		return noneMailingSelector.waitUntilPresent().getText();
	}
	
	public void selectEditionMailing(String keyword) {
		editionMailing.selectByVisibleText(keyword);
	}
	
	public String getNewsletterTypeLabel() {
		return newsletterType.waitUntilPresent().getText();
	}

	public String getNewsletterLabel() {
		return selectedNewsletter.waitUntilPresent().getText();
	}
	
	public String getDirectEmailTypeLabel() {
		return emailType.waitUntilPresent().getText();
	}

	public String getDirectEmailLabel() {
		return selectedEmail.waitUntilPresent().getText();
	}
	
	public String getSMSMessageTypeLabel() {
		return smsType.waitUntilPresent().getText();
	}
	
	public String getNoneGroupSelectorLabel() {
		return noneGroupSelector.waitUntilPresent().getText();
	}
	
	public void selectGroup(String keyword) {
	selectedContactGroup.selectByVisibleText(keyword);
	}
	
	public void chooseSendOption(String value) {
		
		if(value.equals(sendNowOption.waitUntilPresent().getAttribute("value"))) {
			sendNowOption.waitUntilClickable().click();
		} else if (value.equals(scheduleOption.waitUntilPresent().getAttribute("value"))) {
			scheduleOption.waitUntilClickable().click();
		}
	}
	
	public void checkBox_ConfirmMailing(boolean value) {
		setCheckbox(confirmMailing.waitUntilPresent(), value);
		
	}	

	public void clickFinishButton() {
		logger.info("Please click on Finish Button");
		finishButton.waitUntilClickable().click();
		logger.info("already click on Finish Button");
	}
}
