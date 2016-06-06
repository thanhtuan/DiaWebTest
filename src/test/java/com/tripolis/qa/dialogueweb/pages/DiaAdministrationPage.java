package com.tripolis.qa.dialogueweb.pages;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.tripolis.qa.common.AbstractPage;

import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("/dialogue/administration.html")
public class DiaAdministrationPage extends AbstractPage {

	public DiaAdministrationPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
	}
	
	private static final Logger logger = LoggerFactory.getLogger(DiaAdministrationPage.class);
	
	public boolean getAdministrationUrl() {
		logger.info("Get administration URL");
		return driver.getCurrentUrl().contains("/dialogue/administration.html");
		
	}
}
