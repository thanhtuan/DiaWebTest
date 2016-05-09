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
	
	@FindBy(linkText="Content")
	private WebElementFacade Contentdashboardpage;
	
	@FindBy(linkText="Campaigns")
	private WebElementFacade campaignsdashboardpage;
	
	@FindBy(linkText="Publishing")
	private WebElementFacade publishingdashboardpage;
	
	@FindBy(linkText="Reports")
	private WebElementFacade Reportsdashboardpage;
	
	@FindBy(linkText="Processes")
	private WebElementFacade Processespage;
	
	@FindBy(linkText="Setup")
	private WebElementFacade Setuppage;
	
	@FindBy(linkText="contacts")
	private WebElementFacade subSetupContactPage;
	
	public WebDriver driver=null;
	
	Logger logger = LoggerFactory.getLogger(AbstractPage.class);
	
	public AbstractPage (WebDriver driver) {
		System.setProperty(org.slf4j.impl.SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "TRACE");
		this.driver=driver;
	}
	
	public void clickOnSetupMainMenu() {
		Setuppage.click();
		
    }
	
	public boolean getSetupUrl() {
		logger.info("Get Setup URL");
		return driver.getCurrentUrl().contains("/dialogue/administration.html");
		
	}
	
	public void clickOnContactSetupSubMenu() {
		subSetupContactPage.click();
		
    }
	
	public boolean getContactSetupSubMenuUrl() {
		logger.info("Get List Contact Database URL");
		return driver.getCurrentUrl().contains("/dialogue/admin/contacts/listContactDatabases.html");
		
	}
}
