package com.tripolis.qa.pages;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class AbstractPage extends PageObject {

	@FindBy(linkText="Home")
	private WebElementFacade homedashboardpage;
	
	//@FindBy(linkText="Contacts")
	//private WebElementFacade contactsdashboardpage;
	
	
	
	public WebDriver driver=null;
	
	Logger logger = LoggerFactory.getLogger(AbstractPage.class);
	
	public AbstractPage (WebDriver driver) {
		System.setProperty(org.slf4j.impl.SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "TRACE");
		this.driver=driver;
	}
	
	
	public boolean getSetupUrl() {
		logger.info("Get Setup URL");
		return driver.getCurrentUrl().contains("/dialogue/administration.html");
		
	}
	
	public boolean getContactSetupSubMenuUrl() {
		logger.info("Get List Contact Database URL");
		return driver.getCurrentUrl().contains("/dialogue/admin/contacts/listContactDatabases.html");
		
	}
}
