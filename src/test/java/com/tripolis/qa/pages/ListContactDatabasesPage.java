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
	
	@FindBy(id="editable", timeoutInSeconds="5")
	private WebElementFacade newLink; 
	
	@FindBy(id="edit", timeoutInSeconds="5")
	private WebElementFacade editButton;
	
	@FindBy(id="delete", timeoutInSeconds="5")
	private WebElementFacade deleteButton;
	
	@FindBy(name="confirmed", timeoutInSeconds="5")
	private WebElementFacade confirmedButton;
	
	@FindBy(id="deleteBtn", timeoutInSeconds="5")
	private WebElementFacade deleteBtn;
	
	@FindBy(css="option[selected]", timeoutInSeconds="5")
	private WebElementFacade contactDatabasesDropDown;
	
	@FindBy(xpath=".//*[@id='table_row1']/td[1]/input[2]", timeoutInSeconds="5")
	private WebElementFacade selectedContactDatabases;
	
	public void clickNewLink() {
		logger.info("Please click on New Link");
		newLink.click();	
		logger.info("already click on New Link");
    }
	
	public boolean getListContactDatabasesUrl() {
		logger.info("Get List Contact Databases URL");
		return driver.getCurrentUrl().contains("/dialogue/admin/contacts/listContactDatabases.html");
		
	}
	
	public String contactDatabasesAttribute() {
		return contactDatabasesDropDown.getAttribute("value");
	}
	
	public void select_ContactDatabases() {
		selectedContactDatabases.click();
	}
	
	public void clickEditButton() {
		logger.info("Please click on Edit Button");
		editButton.click();
		logger.info("already click on Edit Button");
	}
	
	public void clickDeleteButton() {
		logger.info("Please click on Delete Button");
		deleteButton.click();
		logger.info("already click on Delete Button");
	}
	
	public void clickconfirmedButton() {
		logger.info("Please click on confirmed Button");
		confirmedButton.click();
		logger.info("already click on confirmed Button");
	}
	
	public void clickDeleteBtn() {
		logger.info("Please click on DeleteBtn");
		deleteBtn.click();
		logger.info("already click on DeleteBtn");
	}
	
}
