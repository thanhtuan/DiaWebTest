package com.tripolis.qa.pages;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class DiaSubMenuSetupModule extends PageObject {

	public WebDriver driver=null;
	Logger logger = LoggerFactory.getLogger(DiaSubMenuSetupModule.class);
	
	public DiaSubMenuSetupModule(WebDriver driver) {
		System.setProperty(org.slf4j.impl.SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "TRACE");
		this.driver = driver;
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath=".//*[@id='sub-nav']/ul/li[1]/a", timeoutInSeconds="5")
	private WebElementFacade subMenuListContactDatabasesPage;
	
	@FindBy(xpath=".//*[@id='sub-nav']/ul/li[2]/a", timeoutInSeconds="5")
	private WebElementFacade subMenuListWorkspacesPage;
	
	@FindBy(xpath=".//*[@id='sub-nav']/ul/li[3]/a", timeoutInSeconds="5")
	private WebElementFacade subMenuSetupModulePublishingPage;
	
	@FindBy(xpath=".//*[@id='sub-nav']/ul/li[4]/a", timeoutInSeconds="5")
	private WebElementFacade subMenuSetupModuleApplicationPage;
	
	public void click_ListContactDatabasesPageLink() {
		logger.info("Please click on List Contact Databases Page Link");
		subMenuListContactDatabasesPage.waitUntilClickable().click();
		logger.info("already click on List Contact Databases Page Link");
    }
	
	public void click_ListWorkspacesPageLink() {
		logger.info("Please click on List Work spaces Page Link");
		subMenuListWorkspacesPage.waitUntilClickable().click();
		logger.info("already click on List Work spaces Page Link");
    }
	
	public void click_SetupModulePublishingPageLink() {
		logger.info("Please click on Setup Module Publishing Page Link");
		subMenuSetupModulePublishingPage.waitUntilClickable().click();
		logger.info("already click on Setup Module Publishing Page Link");
    }
	
	public void click_SetupModuleApplicationPageLink() {
		logger.info("Please click on Setup Module Application Page Link");
		subMenuSetupModuleApplicationPage.waitUntilClickable().click();
		logger.info("already click on Setup Module Application Page Link");
    }
	
}
