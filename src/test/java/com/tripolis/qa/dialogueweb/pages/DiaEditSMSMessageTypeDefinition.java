package com.tripolis.qa.dialogueweb.pages;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.tripolis.qa.common.AbstractPage;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.NamedUrl;
import net.thucydides.core.annotations.NamedUrls;

@DefaultUrl("/dialogue/admin/content/editSmsMessageTypeDefinition.html")
public class DiaEditSMSMessageTypeDefinition extends AbstractPage {

	public DiaEditSMSMessageTypeDefinition(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	Logger logger = LoggerFactory.getLogger(DiaEditSMSMessageTypeDefinition.class);
	
	@FindBy(id="defaultOriginatorNumber", timeoutInSeconds="5")
	private WebElementFacade defaultOriginatorNumber;
	
	@FindBy(id="defaultOriginator", timeoutInSeconds="5")
	private WebElementFacade defaultOriginator;
	
	@FindBy(name="mobilePhoneFieldDescriptorsRowId", timeoutInSeconds="5")
	private WebElementFacade mobilePhoneFieldDescriptorsRowId;
	
	@FindBy(name="longSmsEnabled", timeoutInSeconds="5")
	private WebElementFacade longSmsEnabled;
	
	public boolean getEditEmailTypeDefinitionUrl() {
		logger.info("Get Edit Email Type Definition URL");
		return driver.getCurrentUrl().contains("/dialogue/admin/content/editSmsMessageTypeDefinition.html");	
	}
	
	public void smsTypeNameState() {
		name.shouldNotBeEnabled();
	}
	
	public void enter_DefaultOriginatorNumber(String keyword) {
		logger.info("Please input Default Originator Number");
		defaultOriginatorNumber.waitUntilPresent().clear();
		defaultOriginatorNumber.waitUntilPresent().type(keyword);
		logger.info("already input Default Originator Number");
    }
	
	public void enter_DefaultOriginator(String keyword) {
		logger.info("Please input Default Originator");
		defaultOriginator.waitUntilPresent().clear();
		defaultOriginator.waitUntilPresent().type(keyword);
		logger.info("already input Default Originator");
    }
	
	public void select_MobilePhoneField(String keyword) {
		mobilePhoneFieldDescriptorsRowId.waitUntilPresent().selectByVisibleText(keyword);
	}
	
	public void checkbox_LongSMSEnabled(boolean value) {
		setCheckbox(longSmsEnabled.waitUntilPresent(), value);
	}

}
