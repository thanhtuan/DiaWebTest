package com.tripolis.qa.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class FormWizard extends AbstractPage {
	
	private static final Logger logger = LoggerFactory.getLogger(FormWizard.class);
	
	@FindBy(id="dialog", timeoutInSeconds="5")
	protected WebElementFacade diaLog;
	
	@FindBy(id="wizardForm", timeoutInSeconds="5")
	protected WebElementFacade confirmedMessage;
	
	@FindBy(xpath=".//*[@id='wizardForm']/div[1]/div[1]", timeoutInSeconds="5")
	protected WebElementFacade formWizardHeaderNameText;
	
	@FindBy(name="checkTemplates", timeoutInSeconds="5")
	protected WebElementFacade checkContentPersonalization;
	
	@FindBy(name="checkUrls", timeoutInSeconds="5")
	protected WebElementFacade checkAllURLs;
	
	@FindBy(id="mailsPerHour", timeoutInSeconds="5")
	protected WebElementFacade mailsPerHour;
	
	@FindBy(name="mailReportEnabled", timeoutInSeconds="5")
	protected WebElementFacade mailReportEnabled;
	
	@FindBy(id="finish", timeoutInSeconds="5")
	protected WebElementFacade finishButton;
	
	
	public boolean isShowDialog() {
		try {
			diaLog.isDisplayed();
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public String getFormWizardHeaderNameText() {
		return formWizardHeaderNameText.waitUntilPresent().getText();
	}
	
	public void checkBox_ContentPersonalization(boolean value) {
		setCheckbox(checkContentPersonalization.waitUntilPresent(), value);
	}
	
	public void checkBox_AllURLs(boolean value) {
		setCheckbox(checkAllURLs.waitUntilPresent(), value);
	}
	
	public void select_MailsPerHour(String keyword) {
		mailsPerHour.selectByValue(keyword);
	}
	
	public void checkBox_MailReportEnabled(boolean value) {
		setCheckbox(mailReportEnabled.waitUntilPresent(), value);
	}

	public void clickFinishButton() {
		logger.info("Please click on Finish Button");
		finishButton.waitUntilClickable().click();
		logger.info("already click on Finish Button");
	}
}
