package com.tripolis.qa.dialogueweb.pages;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.tripolis.qa.common.AbstractPage;

import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("/dialogue/contacts/listContactGroups.html")
public class DiaListContactGroupsPage extends AbstractPage {

	public DiaListContactGroupsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	private static final Logger logger = LoggerFactory.getLogger(DiaListContactGroupsPage.class);
	
	public boolean getDiaListContactGroupsUrl() {
		logger.info("Get List Contact Groups URL");
		return driver.getCurrentUrl().contains("/dialogue/contacts/listContactGroups.html");
	}

}
