package com.tripolis.qa.dialogueweb.pages;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.tripolis.qa.common.AbstractPage;

import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("/dialogue/contacts/dashboard.html")
public class DiaContactDashboardPage extends AbstractPage {

	public DiaContactDashboardPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	private static final Logger logger = LoggerFactory.getLogger(DiaContactDashboardPage.class);
	
	public boolean getContactDashboardUrl() {
		logger.info("Get Contact Dashboard URL");
		return driver.getCurrentUrl().contains("/dialogue/contacts/dashboard.html");
	}

}
