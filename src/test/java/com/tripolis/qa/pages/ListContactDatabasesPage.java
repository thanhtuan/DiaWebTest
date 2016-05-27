package com.tripolis.qa.pages;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("/dialogue/admin/contacts/listContactDatabases.html")
public class ListContactDatabasesPage extends PageObject {

	public WebDriver driver=null;
	Logger logger = LoggerFactory.getLogger(ListContactDatabasesPage.class);
	
	public ListContactDatabasesPage(WebDriver driver) {
		System.setProperty(org.slf4j.impl.SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "TRACE");
		this.driver = driver;
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(id="editable")
	private WebElementFacade newLink; 
	
	public void clickNewLink() {
		logger.info("Please click on New Link");
		newLink.click();	
		logger.info("already click on New Link");
    }
	
	public boolean getListContactDatabasesUrl() {
		logger.info("Get List Contact Databases URL");
		return driver.getCurrentUrl().contains("/dialogue/admin/contacts/listContactDatabases.html");
		
	}
	
	
}
