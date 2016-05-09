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
	
	@FindBy(className="ui-dialog ui-widget ui-widget-content ui-corner-all ui-front ui-draggable")
	private WebElementFacade createDatabaseDialog;
	
	@FindBy(id="label")
	private WebElementFacade databaselabel;
	
	@FindBy(id="name")
	private WebElementFacade databasename;
	
	@FindBy(id="cancelButton")
	private WebElementFacade cancelButton;
	
	@FindBy(id="submitNext")
	private WebElementFacade nextButton;
	
	public void clickNewLink() {
		newLink.click();
		
    }
	
	public void clickCancelButton() {
		cancelButton.click();
	}
	
	public boolean isShowCreateDatabaseDialog() {
		try {
			createDatabaseDialog.isDisplayed();
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public void navigateToHomePage() {
		DiaHomePage homepage = this.switchToPage(DiaHomePage.class);
		homepage.open();
	}
	
	public void navigateToAdminPage() {
		DiaAdminPage adminpage = this.switchToPage(DiaAdminPage.class);
		adminpage.open();
	}

}
