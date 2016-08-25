package com.tripolis.qa.dialogueweb.pages;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.tripolis.qa.common.AbstractPage;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("/dialogue/content/directemails/create.html")
public class DiaCreateContentDirectEmailPage extends AbstractPage {
	
	private static final Logger logger = LoggerFactory.getLogger(DiaCreateContentDirectEmailPage.class);
	
	@FindBy(xpath=".//*[@id='main-hd']/ul/li/a", timeoutInSeconds="5")
	private WebElementFacade saveLink; 
	
	@FindBy(id="subject", timeoutInSeconds="5")
	private WebElementFacade directEmailSubject;
	
	@FindBy(id="description", timeoutInSeconds="5")
	private WebElementFacade directEmailDescription;
	
	@FindBy(xpath=".//*[@id='emailForm']/div/div[6]/input", timeoutInSeconds="5")
	private WebElementFacade directEmailType;
	
	public boolean getCreateDirectEmailUrl() {
		logger.info("Get Create Direct Email URL");
		return getDriver().getCurrentUrl().contains("/dialogue/content/directemails/create.html");
	}
	
	public void clickSaveLink() {
		logger.info("Please click on Save Link");
		saveLink.waitUntilClickable().click();
		logger.info("already click on Save Link");
	}
	
	public void enter_ContentDirectEmailSubject(String keyword) {
		logger.info("Please input Direct Email Subject");
		directEmailSubject.waitUntilPresent().clear();
		directEmailSubject.waitUntilPresent().type(keyword);
		logger.info("already input Direct Email Subject");
    }
	
	public void enter_ContentDirectEmailDescription(String keyword) {
		logger.info("Please input Direct Email Description");
		directEmailDescription.waitUntilPresent().clear();
		directEmailDescription.waitUntilPresent().type(keyword);
		logger.info("already input Direct Email Description");
    }
	
	public void directEmailTypeState() {
		directEmailType.waitUntilPresent().shouldNotBeEnabled();
	}

}
