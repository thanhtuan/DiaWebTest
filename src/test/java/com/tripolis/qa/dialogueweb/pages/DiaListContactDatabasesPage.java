package com.tripolis.qa.dialogueweb.pages;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.tripolis.qa.common.AbstractPage;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("/dialogue/admin/contacts/listContactDatabases.html")
public class DiaListContactDatabasesPage extends AbstractPage {
	
	public DiaListContactDatabasesPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
	}
	
	Logger logger = LoggerFactory.getLogger(DiaListContactDatabasesPage.class);
	
	@FindBy(xpath=".//*[@id='table_row1']/td[1]/input[2]", timeoutInSeconds="5")
	private WebElementFacade selectedDeletedContactDatabases;
	
	@FindBy(id="modalText", timeoutInSeconds="5")
	private WebElementFacade confirmedMessage;
	
	public boolean getListContactDatabasesUrl() {
		logger.info("Get List Contact Databases URL");
		return driver.getCurrentUrl().contains("/dialogue/admin/contacts/listContactDatabases.html");
		
	}
	
	public String getconfirmedMessage() {
		return confirmedMessage.waitUntilPresent().getText();
	}
	
	public void select_ContactDatabases() {
		selectedDeletedContactDatabases.waitUntilClickable().click();
	}
	
}
