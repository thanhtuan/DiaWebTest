package com.tripolis.qa.pages;
import com.tripolis.qa.pages.ListContactDatabasesPage;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("/dialogue/administration.html")
public class DiaAdminPage extends PageObject {

	public WebDriver driver=null;
	Logger logger = LoggerFactory.getLogger(DiaAdminPage.class);
	
	public DiaAdminPage(WebDriver driver) {
		System.setProperty(org.slf4j.impl.SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "TRACE");
		this.driver = driver;
		// TODO Auto-generated constructor stub
	}
	
	public void navigateToHomePage() {
		DiaHomePage homepage = this.switchToPage(DiaHomePage.class);
		homepage.open();
	}
	
	public void navigateToListContactDatabasesPage() {
		ListContactDatabasesPage listContactDatabasesPage = this.switchToPage(ListContactDatabasesPage.class);
		listContactDatabasesPage.open();
	}

}
